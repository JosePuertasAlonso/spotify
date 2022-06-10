package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Usuario_registrado;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_prin_us_reg;
	public Vector<Usuario_registrado> _contiene_usuario_registrado = new Vector<Usuario_registrado>();

	public void registrar_usuario(Usuario_registrado aUsuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public boolean nick_ya_registrado(String aNick) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.nick.eq(aNick);
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean login_ya_registrado(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return true;
		}else {
			return false;
		}
	}


	public Usuario_registrado existe_usuario(Usuario_registrado aUsuario) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aUsuario.getLogin());
		c.password.eq(aUsuario.getPassword());
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return u[0];
		} else {
			return null;
		}
	}

	public Cancion[] cargar_escuchadas_recientemente(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		return u.reproduce.toArray();
	}

	public Cancion[] cargar_favoritas(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		return u.marca_como_favorita.toArray();
	}

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin_usuario);
		Usuario_registrado usuario = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
		
		Usuario_registradoCriteria criteria2 = new Usuario_registradoCriteria();
		criteria2.login.eq(aLogin_usuario_a_seguir);
		Usuario_registrado usuario_a_seguir = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria2);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(usuario.sigue.contains(usuario_a_seguir)) {
				usuario.sigue.remove(usuario_a_seguir);
				usuario_a_seguir.setSeguidores(usuario_a_seguir.getSeguidores() - 1);
			} else {
				usuario.sigue.add(usuario_a_seguir);
				usuario_a_seguir.setSeguidores(usuario_a_seguir.getSeguidores() + 1);
			}
			Usuario_registradoDAO.save(usuario);
			t.commit();
			MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
			return true;
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		return false;
		
	}

	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			u.setLogin(aCorreo_nuevo);
			Usuario_registradoDAO.save(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void eliminar_perfil(String aLogin) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado usuario = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(usuario instanceof basededatos.Artista) {
				Anuncio[] AnunciosDelArtista = ((basededatos.Artista) usuario).anuncia.toArray();
				for(Anuncio a : AnunciosDelArtista) {
					((basededatos.Artista) usuario).anuncia.remove(a);
					AnuncioDAO.delete(a);
				}
				
				Album[] albumesDelArtista = ((basededatos.Artista) usuario).es_autor_de.toArray();
				for(Album a : albumesDelArtista) {
					a.es_creado_por.remove((basededatos.Artista) usuario);
					AlbumDAO.save(a);
					if(a.es_creado_por.size() == 0) {
						AlbumDAO.delete(a);
					}
				}
				
				Artista[] artistasSimilaresDelArtista = ((basededatos.Artista) usuario).es_similar_a.toArray();
				for(Artista a : artistasSimilaresDelArtista) {
					a.es_similar_de.remove((basededatos.Artista) usuario);
					ArtistaDAO.save(a);
				}
				
				Artista[] artistasSimilaresAlArtista = ((basededatos.Artista) usuario).es_similar_de.toArray();
				for(Artista a : artistasSimilaresAlArtista) {
					a.es_similar_a.remove((basededatos.Artista) usuario);
					ArtistaDAO.save(a);
				}
				
				Estilo[] estilosDelArtista = ((basededatos.Artista) usuario).es_identificado_por.toArray();
				for(Estilo e : estilosDelArtista) {
					((basededatos.Artista) usuario).es_identificado_por.remove(e);
					e.identifica_a.remove((basededatos.Artista) usuario);
					EstiloDAO.save(e);
				}
				
				Cancion[] cancionesDelArtista = ((basededatos.Artista) usuario).realiza.toArray();
				for(Cancion c : cancionesDelArtista) {
					if(c.realizada_por.size() <= 1) {
						Artista[] artistasConLaCancion = c.realizada_por.toArray();
						for(Artista a : artistasConLaCancion) {
							a.realiza.remove(c);
							ArtistaDAO.save(a);
						}
						Lista[] listasConLaCancion = c.esta_en.toArray();
						for(Lista l : listasConLaCancion) {
							l.contiene.remove(c);
							ListaDAO.save(l);
						}
						Usuario_registrado[] usuariosConLaCancion = c.es_marcada_como_favorita_por.toArray();
						for(Usuario_registrado u : usuariosConLaCancion) {
							u.marca_como_favorita.remove(c);
							Usuario_registradoDAO.save(u);
						}
						Usuario_registrado[] usuariosConLaCancion2 = c.es_historial_de.toArray();
						for(Usuario_registrado u : usuariosConLaCancion2) {
							u.reproduce.remove(c);
							Usuario_registradoDAO.save(u);
						}
						CancionDAO.delete(c);
					} else {
						c.realizada_por.remove((basededatos.Artista) usuario);
					}

				}
			}
			
			Usuario_registrado[] usuariosSeguidos = usuario.sigue.toArray();
			for(Usuario_registrado u : usuariosSeguidos) {
				u.es_seguido_por.remove(usuario);
				Usuario_registradoDAO.save(u);
			}
			
			Usuario_registrado[] usuariosSeguidores = usuario.es_seguido_por.toArray();
			for(Usuario_registrado u : usuariosSeguidores) {
				u.sigue.remove(usuario);
				Usuario_registradoDAO.save(u);
			}
			
			Lista_de_reproduccion[] listasDelUsuario = usuario.gestiona.toArray();
			for(Lista_de_reproduccion l : listasDelUsuario) {
				usuario.gestiona.remove(l);
				ListaDAO.delete(l);
			}
			
			Lista_de_reproduccion[] listasGuardadas = usuario.guarda.toArray();
			for(Lista_de_reproduccion l : listasGuardadas) {
				usuario.guarda.remove(l);
				ListaDAO.delete(l);
			}
			if(usuario instanceof basededatos.Artista) {
				ArtistaDAO.delete((basededatos.Artista)usuario);
			}
			Usuario_registradoDAO.delete(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}


	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.nick.like("%" + aCadena_busqueda + "%");
		Usuario_registrado[] result = Usuario_registradoDAO.listUsuario_registradoByCriteria(criteria);
		return result;
	}

	public Usuario_registrado recargar_usuario(String login_u) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(login_u);
		return Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
	}
}