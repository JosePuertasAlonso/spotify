package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__bloque_con_opciones_;
import vistas.VistaLista_canciones;

public class Lista_canciones extends VistaLista_canciones{
//	private Label _tituloL;
	public Vector<Cancion__bloque_con_opciones_> _list_Cancion__bloque_con_opciones_ = new Vector<Cancion__bloque_con_opciones_>();

	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	
	public Lista_canciones(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarCanciones();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorCanciones();
		for(int i = 0; i < _list_Cancion__bloque_con_opciones_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_filaCanciones().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Cancion__bloque_con_opciones_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCanciones() {
		Cancion__bloque_con_opciones_ c;
		for(int i = 0; i < 6; i++) {
			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor);
			c.getStyle().set("margin-right", "var(--lumo-space-m)");
			c.getStyle().set("max-width", "15.5%");
			_list_Cancion__bloque_con_opciones_.add(c);
		}
	}

}