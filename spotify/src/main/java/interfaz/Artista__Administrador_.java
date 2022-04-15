package interfaz;

import vistas.VistaArtista_administrador;

public class Artista__Administrador_ extends VistaArtista_administrador {
//	private Button _eliminarB;
//	private Button _modificarB;
	public Eliminar_artista _eliminar_artista;
	public Modificar_artista _modificar_artista;
	
	public Artista__Administrador_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}