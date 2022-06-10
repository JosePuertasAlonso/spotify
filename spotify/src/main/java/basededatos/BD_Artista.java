package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Artista;

public class BD_Artista {
	public BDPrincipal _bd_prin_art;
	public Vector<Artista> _contiene_artista = new Vector<Artista>();

	public basededatos.Artista[] buscar_artistas(String aCadena_busqueda) throws PersistentException {
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.nick.like("%" + aCadena_busqueda + "%");
		Artista[] result = ArtistaDAO.listArtistaByCriteria(criteria);
		return result;
	}

	public Artista[] cargar_artistas_similares(String aLogin_artista) throws PersistentException {
		ArrayList<Artista> aux = new ArrayList<Artista>();
		
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(aLogin_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		Estilo[] estilos = a.es_identificado_por.toArray();
		for(int i = 0; i < estilos.length; i++) {
			Artista[] artistasEstilo = estilos[i].identifica_a.toArray();
			for(int j = 0; j < artistasEstilo.length; j++) {
				if(!aux.contains(artistasEstilo[j]) && artistasEstilo[j].getID() != a.getID()) {
					aux.add(artistasEstilo[j]);
				}
			}
		}
		
		Artista[] result = new Artista[aux.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = aux.get(i);
		}		
		return result;
	}

	public Anuncio[] cargar_anuncios(String aLogin) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado u = Usuario_registradoDAO.listUsuario_registradoByCriteria(criteria)[0];
		Usuario_registrado[] usuarios = u.sigue.toArray();
		ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i] instanceof basededatos.Artista) {
				Artista aux = (basededatos.Artista) usuarios[i];
				anuncios.addAll(Arrays.asList(aux.anuncia.toArray()));
			}
		}
		Anuncio[] result = new Anuncio[anuncios.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = anuncios.get(i);
		}
		return result;
	}

	public void modificar_perfil_artista(String aLogin_artista, String aCorreo_nuevo, String aFoto) throws PersistentException {
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(aLogin_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			a.setLogin(aCorreo_nuevo);
			a.setFoto(aFoto);
			Usuario_registradoDAO.save(a);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void anadir_artista(Artista aArtista) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			ArtistaDAO.save(aArtista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();

		
	}


	public void modificar_artista_administrador(String login_artista, String aFoto) throws PersistentException {
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(login_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			a.setFoto(aFoto);
			ArtistaDAO.save(a);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		
	}

	public Artista existe_usuario(Usuario_registrado aUsuario) throws PersistentException {
		ArtistaCriteria c = new ArtistaCriteria();
		c.login.eq(aUsuario.getLogin());
		c.password.eq(aUsuario.getPassword());
		Artista[] a = c.listArtista();
		if(a.length > 0) {
			return a[0];
		} else {
			return null;
		}
	}
	
	public basededatos.Artista recargar_artista(String aLogin) throws PersistentException {
		ArtistaCriteria c = new ArtistaCriteria();
		c.login.eq(aLogin);
		Artista a = ArtistaDAO.loadArtistaByCriteria(c);
		return a;
	}
	
	public Artista[] existen_artistas(String[] artistas) throws PersistentException {
		ArrayList<Artista> aux = new ArrayList<Artista>();
		for(String nick_artista : artistas) {
			ArtistaCriteria criteria = new ArtistaCriteria();
			criteria.nick.eq(nick_artista.trim());
			Artista[] a = ArtistaDAO.listArtistaByCriteria(criteria);
			if(a.length <= 0) {
				return null;
			} else {
				aux.add(a[0]);
			}
		}
		
		Artista[] result = new Artista[aux.size()];
		for(int i = 0; i < result.length; i++) {
			result[i] = aux.get(i);
		}
		return result;
	}


	
	public void asignar_estilo(basededatos.Estilo estilo, String login_artista) throws PersistentException{
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(login_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		EstiloCriteria criteria2 = new EstiloCriteria();
		criteria2.ID.eq(estilo.getID());
		Estilo est = EstiloDAO.loadEstiloByCriteria(criteria2);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(a.es_identificado_por.contains(est)) {
				a.es_identificado_por.remove(est);
			} else {
				a.es_identificado_por.add(est);
			}
			ArtistaDAO.save(a);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		
	}
}