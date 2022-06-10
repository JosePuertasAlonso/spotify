package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__lista_;
import vistas.VistaCanciones_de_lista;

public class Canciones_de_lista extends VistaCanciones_de_lista{
	public Vector<Cancion__lista_> _list_Cancion__lista_ = new Vector<Cancion__lista_>();
	
	private basededatos.Lista lista;
	
	public Canciones_de_lista(basededatos.Lista lista) {
		
		this.lista = lista;
		
		cargarCancionesLista();
		
		for(int i = 0; i < _list_Cancion__lista_.size(); i++) {
			this.getvL_contendorCancionesLista().as(VerticalLayout.class).add(_list_Cancion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesLista() {
		basededatos.Cancion[] canciones = lista.contiene.toArray();
		Cancion__lista_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__lista_(canciones[i]);
			_list_Cancion__lista_.add(c);
		}
		
	}
	
	
}