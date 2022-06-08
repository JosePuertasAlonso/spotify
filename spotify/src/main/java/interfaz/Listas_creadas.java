package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Lista_a_anadir;
import spotify.GestorUsuarios;
import vistas.VistaListas_creadas;

public class Listas_creadas extends VistaListas_creadas{
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	public Vector<Lista_a_anadir> _list_Lista_a_anadir = new Vector<Lista_a_anadir>();
	
	private basededatos.Cancion cancion;
	
	public Listas_creadas(basededatos.Cancion cancion) {
		
		this.cancion = cancion;
		
		cargarListasCreadas();
		
		for(int i = 0; i < _list_Lista_a_anadir.size(); i++) {
			this.getvL_contenedorListaAAnadir().as(VerticalLayout.class).add(_list_Lista_a_anadir.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarListasCreadas() {
		
		basededatos.Lista[] listas = GestorUsuarios._u.gestiona.toArray();
		Lista_a_anadir l;
		
		for(int i = 0; i < listas.length; i++) {
			l = new Lista_a_anadir(listas[i], cancion);
			_list_Lista_a_anadir.add(l);
		}
		
	}
}