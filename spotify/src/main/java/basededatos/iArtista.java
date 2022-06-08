package basededatos;

public interface iArtista extends iComun {

	public void publicar_anuncio(String aLogin_artista, Anuncio aAnuncio);

	public void modificar_perfil_artista(String aLogin_artista, String aCorreo_nuevo, String aFoto);

	public boolean login_ya_registrado_modificacion_artista(String aLogin);
}