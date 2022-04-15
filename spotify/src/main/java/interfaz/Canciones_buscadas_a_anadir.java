package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_a_anadir;
import vistas.VistaCanciones_buscadas_a_anadir;

public class Canciones_buscadas_a_anadir extends VistaCanciones_buscadas_a_anadir{
	public Buscar_canciones_a_anadir _buscar_canciones_a_anadir;
	public Vector<Cancion_a_anadir> _list_Cancion_a_anadir = new Vector<Cancion_a_anadir>();
	
	public Canciones_buscadas_a_anadir() {
		
		cargarCancionesAAnadir();
		
		for(int i = 0; i < _list_Cancion_a_anadir.size(); i++) {
			this.getvL_contenedorCancionesAAnadir().as(VerticalLayout.class).add(_list_Cancion_a_anadir.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesAAnadir() {
		
		Cancion_a_anadir c;
		
		for(int i = 0; i < 6; i++) {
			c = new Cancion_a_anadir();
			c.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Cancion_a_anadir.add(c);
		}
		
	}
	
}