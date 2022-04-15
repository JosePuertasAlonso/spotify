package interfaz;

public class Reproducir_cancion_cibernauta_registrado extends Reproducir_cancion {
//	private Button _opcionesB;
	public Opciones_cancion__cancion_ _opciones_cancion__cancion_;
	public Ver_estadisticas _ver_estadisticas;
	public Cancion__lista_ _cancion__lista_;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	public Cancion__bloque_con_opciones_ _cancion__bloque_con_opciones_;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	
	public Reproducir_cancion_cibernauta_registrado() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getButton_opciones().setVisible(true);
	}
}