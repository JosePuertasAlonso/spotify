package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_propia;
import vistas.VistaLista_de_reproduccion_del_perfil;

public class Listas_de_reproduccion_del_perfil extends VistaLista_de_reproduccion_del_perfil{
	public Ver_perfil _ver_perfil;
	public Vector<Lista_de_reproduccion_propia> _list_Lista_de_reproduccion_propia = new Vector<Lista_de_reproduccion_propia>();

	public Listas_de_reproduccion_del_perfil() {
		
		cargarListasPropias();
		
		for(int i = 0; i < _list_Lista_de_reproduccion_propia.size(); i++) {
			this.getvL_contenedorListaReproduccionPropia().as(VerticalLayout.class).add(_list_Lista_de_reproduccion_propia.get(i));	
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarListasPropias() {
		Lista_de_reproduccion_propia l;
		for(int i = 0; i < 10; i++) {
			l = new Lista_de_reproduccion_propia();
			l.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Lista_de_reproduccion_propia.add(l);
		}
	}

}