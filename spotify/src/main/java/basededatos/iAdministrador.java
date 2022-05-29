package basededatos;

public interface iAdministrador {

	public void anadir_estilo(String aEstilo);

	public void anadir_cancion(Cancion aCancion);

	public Cancion[] cargar_canciones_album_administrador(int aId_Album);

	public void anadir_album(Album aAlbum);

	public Estilo[] cargar_estilos();

	public void anadir_artista(Artista aArtista);

	public void eliminar_cancion(int aId_Cancion);

	public void modificar_cancion(int aId_Cancion, String aTitulo_cancion, String aArtistas, String aAlbum);

	public void establecer_ultimo_exito(int aId_Cancion);

	public void eliminar_album(int aId_album);

	public void modificar_album(Album aAlbum);

	public void eliminar_artista(String aLogin);

	public void modificar_artista_administrador(String aFoto, Estilo[] aEstilos);

	public void eliminar_perfil_administrador(String aLogin);

	public Cancion[] buscar_canciones_administrador(String aCadena_busqueda);

	public Album[] buscar_albumes_administrador(String aCadena_busqueda);

	public Artista[] buscar_artistas_administrador(String aCadena_busqueda);

	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda);
	
	public boolean existe_estilo(String aEstilo);
}