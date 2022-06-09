package basededatos;

import java.util.Vector;

import org.hibernate.criterion.Order;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cancion;

public class BD_Cancion {
	public BDPrincipal _bd_prin_can;
	public Vector<Cancion> _contiene_cancion = new Vector<Cancion>();

	public Cancion[] cargar_ultimos_exitos() throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.ultimo_Exito.eq(true);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}
	
	public Cancion[] cargar_recomendaciones() throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.ultimo_Exito.eq(true);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}

	public Cancion[] buscar_canciones(String aCadena_busqueda) throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.titulo.like("%" + aCadena_busqueda + "%");
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}

	public void anadir_cancion_historial(int aId_Cancion, String aLogin) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado u = Usuario_registradoDAO.listUsuario_registradoByCriteria(criteria)[0];
		CancionCriteria criteria2 = new CancionCriteria();
		criteria2.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.listCancionByCriteria(criteria2)[0];
		c.setReproducciones(c.getReproducciones() + 1);
		if(u.reproduce.contains(c)) {
			u.reproduce.remove(c);
		}
		u.reproduce.add(c);
		t.commit();
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public boolean anadir_a_favoritos(int aId_Cancion, String aLogin) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado u = Usuario_registradoDAO.listUsuario_registradoByCriteria(criteria)[0];
		CancionCriteria criteria2 = new CancionCriteria();
		criteria2.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.listCancionByCriteria(criteria2)[0];
		
		if (u.marca_como_favorita.contains(c)) {
			try {
				u.marca_como_favorita.remove(c);
				Usuario_registradoDAO.save(u);
				t.commit();
				MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
				return true;
			} catch (Exception e) {
				t.rollback();
			}
		} else {
			try {
				u.marca_como_favorita.add(c);
				Usuario_registradoDAO.save(u);
				t.commit();
				MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
				return true;
			} catch (Exception e) {
				t.rollback();
			}
		}
		
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		
		return false;
	}

	public Cancion cargar_cancion_mas_escuchada() throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.reproducciones.order(false);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		if(result.length > 0) {
			return result[0];
		}
		return null;
	}


	public void anadir_cancion(Cancion aCancion) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			CancionDAO.save(aCancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void eliminar_cancion(int aId_Cancion) throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.loadCancionByCriteria(criteria);
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
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
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void modificar_cancion(int aId_Cancion, Cancion aCancion, Artista[] nuevosArtistas) throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.loadCancionByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			c.setCompositor(aCancion.getCompositor());
			c.setProductor(aCancion.getProductor());
			c.setInterprete(aCancion.getInterprete());
			c.setImagen(aCancion.getImagen());
			c.setTitulo(aCancion.getTitulo());
			Artista[] artistasActuales = c.realizada_por.toArray();
			for(int i = 0; i < artistasActuales.length; i++) {
				c.realizada_por.remove(artistasActuales[i]);
			}
			for(int i = 0; i < nuevosArtistas.length; i++) {
				c.realizada_por.add(nuevosArtistas[i]);
			}
			CancionDAO.save(c);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		
	}

	public void establecer_ultimo_exito(int aId_Cancion) throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.loadCancionByCriteria(criteria);
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(c.getUltimo_Exito()) {
				c.setUltimo_Exito(false);
			}else {
				c.setUltimo_Exito(true);
			}
			CancionDAO.save(c);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}
}