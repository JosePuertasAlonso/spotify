package interfaz;

import vistas.VistaAlbum_administrador;

//public class Album__Administrador_ extends Lista {
public class Album__Administrador_ extends VistaAlbum_administrador {
//	private Button _modificarB;
//	private Button _eliminarB;
	public Modificar_album _modificar_album;
	public Eliminar_album _eliminar_album;
	
	public Album__Administrador_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}