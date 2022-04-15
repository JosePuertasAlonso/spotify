package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Estilo;
import vistas.VistaEstilos;

public class Estilos extends VistaEstilos{
	public Dar_de_alta_artista _dar_de_alta_artista;
	public Modificar_artista _modificar_artista;
	public Vector<Estilo> _list_Estilo = new Vector<Estilo>();
	
	public Estilos() {
		cargarEstilos();
		
		for(int i = 0; i < _list_Estilo.size(); i++) {
			this.getvL_contendorEstilos().as(VerticalLayout.class).add(_list_Estilo.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	
	public void cargarEstilos() {
		
		Estilo e;
		
		for(int i = 0; i < 20; i++) {
			e = new Estilo();
			if(i != 0) {
				e.getStyle().set("margin-top", "var(--lumo-space-m)");
			}
			_list_Estilo.add(e);
		}
		
	}
	
}