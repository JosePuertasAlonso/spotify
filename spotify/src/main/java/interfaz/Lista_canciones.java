package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__bloque_con_opciones_;
import vistas.VistaLista_canciones;

public class Lista_canciones extends VistaLista_canciones{
//	private Label _tituloL;
	public Vector<Cancion__bloque_con_opciones_> _list_Cancion__bloque_con_opciones_ = new Vector<Cancion__bloque_con_opciones_>();

	protected VerticalLayout cuerpo;
	protected HorizontalLayout minireproductor;
	
	
	public Lista_canciones(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
//		cargarCanciones();
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
//	public void cargarCanciones() {
//		Cancion__bloque_con_opciones_ c;
//		for(int i = 0; i < 6; i++) {
//			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor);
//			c.getStyle().set("margin-right", "var(--lumo-space-m)");
//			c.getStyle().set("max-width", "15.5%");
//			_list_Cancion__bloque_con_opciones_.add(c);
//		}
//	}

}