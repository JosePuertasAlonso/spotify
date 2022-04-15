package interfaz;

public class Opciones_cancion__reproductor_ extends Opciones_cancion {
//	private Button _ver_ArtistaB;
//	private Button _ver_AlbumB;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Ver_album _ver_album;
	public Ver_perfil_artista _ver_perfil_artista;
	
	public Opciones_cancion__reproductor_() {
		super();
		this.getButton_verAlbum().setVisible(true);
		this.getButton_verArtista().setVisible(true);
	}
}