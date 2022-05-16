package basededatos;

import java.util.Vector;
import basededatos.Artista;

public class BD_Artista {
	public BDPrincipal _bd_prin_art;
	public Vector<Artista> _contiene_artista = new Vector<Artista>();

	public Artista[] buscar_artistas(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
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

	public Anuncio[] cargar_anuncios(String aLogin) {
		throw new UnsupportedOperationException();
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

	public boolean existe_usuario(Usuario aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_perfil_artista(String aLogin) {
		throw new UnsupportedOperationException();
	}
}