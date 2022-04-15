package interfaz;

public class Opciones_cancion__cancion_ extends Opciones_cancion {
//	private Button _reproducirB;
	public Cancion__bloque_con_opciones_ _cancion__bloque_con_opciones_;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	
	public Opciones_cancion__cancion_() {
		super();
		this.getButton_anadirFavoritos().getStyle().set("margin-top", "16px");
		this.getButton_reproducir().getStyle().set("margin-top", "0px");
		this.getButton_reproducir().setVisible(true);
	}
	
}