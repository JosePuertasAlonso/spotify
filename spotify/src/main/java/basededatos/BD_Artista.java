package basededatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.orm.PersistentException;

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

	public boolean seguir_artista(String aLogin_usuario, String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_hits(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_artista(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistas_similares(String aLogin_artista) {
		throw new UnsupportedOperationException();
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

	public void modificar_perfil_artista(String aLogin_artista, String aCorreo_nuevo, String aFoto) {
		throw new UnsupportedOperationException();
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
			System.out.println("HAY UNO");
			return a[0];
		} else {
			return null;
		}
	}

	public void eliminar_perfil_artista(String aLogin) {
		throw new UnsupportedOperationException();
	}
}