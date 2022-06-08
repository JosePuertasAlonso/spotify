package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Lista_de_reproduccion__lista_;
import vistas.VistaListas_de_reproduccion_buscadas;

public class Listas_de_reproduccion_buscadas extends VistaListas_de_reproduccion_buscadas{
	public Buscador _buscador;
	public Vector<Lista_de_reproduccion__lista_> _list_Lista_de_reproduccion__lista_ = new Vector<Lista_de_reproduccion__lista_>();

	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	private String cadena_busqueda;
	
	public basededatos.Lista_de_reproduccion[] listas_buscadas;
	
	iComun _iComun = new BDPrincipal();
	
	public Listas_de_reproduccion_buscadas(VerticalLayout cuerpo, HorizontalLayout minireproductor, String cadenaBusqueda) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		this.cadena_busqueda = cadenaBusqueda;
		
		buscar_listas();
		
		for(int i = 0; i < _list_Lista_de_reproduccion__lista_.size(); i++) {
			this.getvL_contenedorListaDeReproduccionLista().as(VerticalLayout.class).add(_list_Lista_de_reproduccion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_listas() {
		basededatos.Lista_de_reproduccion[] listas = _iComun.buscar_listas(cadena_busqueda);
		this.listas_buscadas = listas;
		
		Lista_de_reproduccion__lista_ l;
		
		for(int i = 0; i < listas.length; i++) {
			l = new Lista_de_reproduccion__lista_(cuerpo, minireproductor, listas[i]);
			_list_Lista_de_reproduccion__lista_.add(l);
		}
	}
}