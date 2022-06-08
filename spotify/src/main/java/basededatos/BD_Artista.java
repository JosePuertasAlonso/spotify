package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Artista;

public class BD_Artista {
	public BDPrincipal _bd_prin_art;
	public Vector<Artista> _contiene_artista = new Vector<Artista>();

	public Artista[] buscar_artistas(String aCadena_busqueda) throws PersistentException {
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.nick.like("%" + aCadena_busqueda + "%");
		Artista[] result = ArtistaDAO.listArtistaByCriteria(criteria);
		return result;
	}

	public Cancion[] cargar_hits(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_artista(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_similares(String aLogin_artista) throws PersistentException {
		ArrayList<Artista> aux = new ArrayList<Artista>();
		
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(aLogin_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		System.out.println("Login del artista a buscar: " + aLogin_artista);
		
		Estilo[] estilos = a.es_identificado_por.toArray();
		for(int i = 0; i < estilos.length; i++) {
			Artista[] artistasEstilo = estilos[i].identifica_a.toArray();
			System.out.println("Artistas con ese mismo estilo: " + artistasEstilo.length);
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
		
		System.out.println("Resultado de artistas similares: " + result.length);
		
		return result;
	}

	public Lista_de_reproduccion[] cargar_listas_artista(String aLogin_artista) {
		throw new UnsupportedOperationException();
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

	public void anadir_artista(Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_artista(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void modificar_artista_administrador(String aFoto, Estilo[] aEstilos) {
		throw new UnsupportedOperationException();
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
	
	public boolean login_ya_registrado_modificacion_artista(String aLogin) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado[] a = criteria.listUsuario_registrado();
		if(a.length > 0) {
			return true;
		}else {
			return false;
		}
	}


	public void eliminar_perfil_artista(String aLogin) {
		throw new UnsupportedOperationException();
	}
}