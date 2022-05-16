package basededatos;

import java.util.Vector;
import basededatos.Lista;

public class BD_Lista {
	public BDPrincipal _bd_prin_list;
	public Vector<Lista> _contiene_lista = new Vector<Lista>();

	public Lista_de_reproduccion[] buscar_listas(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}

	public void guardar_lista(Lista_de_reproduccion aLista, String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] cargar_listas_perfil(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void anadir_cancion_a_la_lista(String aLogin, int aId_Cancion, int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void crear_lista(String aLogin, String aNombre_lista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_album(int aId_album) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_lista(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_cancion_lista(int aId_Lista, int aId_Cancion) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_nombre_lista(int aId_Lista, String aNombre_nuevo_lista) {
		throw new UnsupportedOperationException();
	}

	public void anadir_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_album(int aId_Album) {
		throw new UnsupportedOperationException();
	}

	public void modificar_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] buscar_albumes_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}
}