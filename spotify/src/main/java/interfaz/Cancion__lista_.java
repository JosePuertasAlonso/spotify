package interfaz;

import vistas.VistaCancion_lista;

public class Cancion__lista_ extends VistaCancion_lista {
	public Canciones_del_album _canciones_del_album;
	public Canciones_de_lista _canciones_de_lista;
	public Lista_de_canciones_buscadas _lista_de_canciones_buscadas;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	
	public Cancion__lista_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}