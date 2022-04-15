package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Productor;
import vistas.VistaProductores;

public class Productores extends VistaProductores{
	public Ver_creditos_cancion _ver_creditos_cancion;
	public Vector<Productor> _list_Productor = new Vector<Productor>();
	
	
	public Productores() {
		cargarProductores();
		
		for(int i = 0; i < _list_Productor.size(); i++) {
			this.getvL_contenedorProductores().as(VerticalLayout.class).add(_list_Productor.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	
	public void cargarProductores() {
		
		Productor p;
		
		for(int i = 0; i < 4; i++) {
			p = new Productor();
			p.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Productor.add(p);
		}
		
	}
	
}