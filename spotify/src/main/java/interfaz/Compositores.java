package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Compositor;
import vistas.VistaCompositores;

public class Compositores extends VistaCompositores{
	public Ver_creditos_cancion _ver_creditos_cancion;
	public Vector<Compositor> _list_Compositor = new Vector<Compositor>();
	
	
	public Compositores(String compositores) {
		
		if (compositores != null) {

			String[] arrayCompositores = compositores.split(",");
			Compositor c;
			
			for(int i = 0; i < arrayCompositores.length; i++) {
				c = new Compositor(arrayCompositores[i]);
				c.getStyle().set("margin-top", "var(--lumo-space-m)");
				_list_Compositor.add(c);
			}

			for (int i = 0; i < _list_Compositor.size(); i++) {
				this.getvL_contenedorCompositores().as(VerticalLayout.class).add(_list_Compositor.get(i));
			}

		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}