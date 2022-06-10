package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Interprete;
import vistas.VistaInterpretes;

public class Interpretes extends VistaInterpretes{
	public Ver_creditos_cancion _ver_creditos_cancion;
	public Vector<Interprete> _list_Interprete = new Vector<Interprete>();
	
	public Interpretes(String interpretes) {
		
		if (interpretes != null) {
			String[] arrayInterpretes = interpretes.split(",");
			Interprete in;

			for (int i = 0; i < arrayInterpretes.length; i++) {
				in = new Interprete(arrayInterpretes[i]);
				in.getStyle().set("margin-top", "var(--lumo-space-m)");
				_list_Interprete.add(in);
			}

			for (int i = 0; i < _list_Interprete.size(); i++) {
				this.getvL_contenedorInterpretes().as(VerticalLayout.class).add(_list_Interprete.get(i));
			}

		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
}