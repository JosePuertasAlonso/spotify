package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_a_anadir;
import vistas.VistaListas_creadas;

public class Listas_creadas extends VistaListas_creadas{
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	public Vector<Lista_a_anadir> _list_Lista_a_anadir = new Vector<Lista_a_anadir>();
	
	public Listas_creadas() {
		
		cargarListasCreadas();
		
		for(int i = 0; i < _list_Lista_a_anadir.size(); i++) {
			this.getvL_contenedorListaAAnadir().as(VerticalLayout.class).add(_list_Lista_a_anadir.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarListasCreadas() {
		
		Lista_a_anadir l;
		
		for(int i = 0; i < 6; i++) {
			l = new Lista_a_anadir();
			l.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Lista_a_anadir.add(l);
		}
		
	}
}