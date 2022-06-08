package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Cancion__lista_;
import vistas.VistaLista_de_canciones_buscadas;

public class Lista_de_canciones_buscadas extends VistaLista_de_canciones_buscadas{
	public Buscador _buscador;
	public Vector<Cancion__lista_> _list_Cancion__lista_ = new Vector<Cancion__lista_>();
	
	private String cadena_busqueda; 
	
	public basededatos.Cancion[] canciones_buscadas;
	
	iComun _iComun = new BDPrincipal();
	
	public Lista_de_canciones_buscadas(String cadena_busqueda) {
				
		this.cadena_busqueda = cadena_busqueda;
		buscar_canciones();
		
		for(int i = 0; i < _list_Cancion__lista_.size(); i++) {
			this.getvL_contenedorCancionLista().as(VerticalLayout.class).add(_list_Cancion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		
	}
	
	public void buscar_canciones() {
		basededatos.Cancion[] canciones = _iComun.buscar_canciones(cadena_busqueda);
		this.canciones_buscadas = canciones;
		Cancion__lista_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__lista_(canciones[i]);
			_list_Cancion__lista_.add(c);
		}
	}
}