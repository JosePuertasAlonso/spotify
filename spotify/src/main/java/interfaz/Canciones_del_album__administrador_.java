package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_album;
import vistas.VistaCanciones_del_album_administrador;

public class Canciones_del_album__administrador_ extends VistaCanciones_del_album_administrador{
	public Anadir_nuevo_album _anadir_nuevo_album;
	public Vector<Cancion_album> _list_Cancion_album = new Vector<Cancion_album>();
	
	public Canciones_del_album__administrador_() {
		
		cargarCancionesAlbum();
		
		for(int i = 0; i < _list_Cancion_album.size(); i++) {
			this.getvL_contenedorCancionesAlbum().as(VerticalLayout.class).add(_list_Cancion_album.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesAlbum() {
		
		Cancion_album c;
		
		for(int i = 0; i < 6; i++) {
			c = new Cancion_album();
			c.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Cancion_album.add(c);
		}
		
	}
}