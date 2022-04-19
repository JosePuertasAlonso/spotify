package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion__lista_;
import vistas.VistaListas_de_reproduccion_buscadas;

public class Listas_de_reproduccion_buscadas extends VistaListas_de_reproduccion_buscadas{
	public Buscador _buscador;
	public Vector<Lista_de_reproduccion__lista_> _list_Lista_de_reproduccion__lista_ = new Vector<Lista_de_reproduccion__lista_>();

	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	public Listas_de_reproduccion_buscadas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarListasBuscadas();
		
		for(int i = 0; i < _list_Lista_de_reproduccion__lista_.size(); i++) {
			this.getvL_contenedorListaDeReproduccionLista().as(VerticalLayout.class).add(_list_Lista_de_reproduccion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarListasBuscadas() {
		
		Lista_de_reproduccion__lista_ l;
		
		for(int i = 0; i < 6; i++) {
			l = new Lista_de_reproduccion__lista_(cuerpo, minireproductor);
			l.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Lista_de_reproduccion__lista_.add(l);
		}
		
	}

}