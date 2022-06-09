package basededatos;

import org.orm.PersistentException;

public interface iAdministrador {

	public void anadir_estilo(String aEstilo);

	public void anadir_cancion(Cancion aCancion);

	public void anadir_album(Album aAlbum);

	public Estilo[] cargar_estilos();

	public void anadir_artista(Artista aArtista);

	public void eliminar_cancion(int aId_Cancion);

	public void modificar_cancion(int aId_Cancion, Cancion aCancion, Artista[] nuevosArtistas);

	public void establecer_ultimo_exito(int aId_Cancion);

	public void eliminar_album(int aId_album);

	public void modificar_album(int aId_album, Album aAlbum, Artista[] artistas_album);

	public void modificar_artista_administrador(String login_artista, String aFoto);

	public void eliminar_perfil_administrador(String aLogin);

	public Cancion[] buscar_canciones_administrador(String aCadena_busqueda);

	public Album[] buscar_albumes_administrador(String aCadena_busqueda);

	public Artista[] buscar_artistas_administrador(String aCadena_busqueda);

	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda);
	
	public boolean existe_estilo(String aEstilo);
	
	public Artista[] existen_artistas(String[] aArtistas);
	
	public boolean nick_ya_registrado_administrador(String aNick);
	
	public boolean login_ya_registrado_administrador(String aLogin);
	
	public void anadir_cancion_al_album(int aId_cancion, int aId_album);
	
	public void asignar_estilo(basededatos.Estilo estilo, String login_artista);

}