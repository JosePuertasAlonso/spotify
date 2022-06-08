package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_de_lista_a_eliminar;
import vistas.VistaCanciones_de_lista_a_eliminar;

public class Canciones_de_lista_a_eliminar extends VistaCanciones_de_lista_a_eliminar{
	public Modificar_lista _modificar_lista;
	public Vector<Cancion_de_lista_a_eliminar> _list_Cancion_de_lista_a_eliminar = new Vector<Cancion_de_lista_a_eliminar>();

	private basededatos.Lista lista;
	
	public Canciones_de_lista_a_eliminar(basededatos.Lista lista) {
		
		this.lista = lista;
		
		cargarCancionesListaEliminar();
		
		for(int i = 0; i < _list_Cancion_de_lista_a_eliminar.size(); i++) {
			this.getvL_contendorCancionesEliminar().as(VerticalLayout.class).add(_list_Cancion_de_lista_a_eliminar.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesListaEliminar() {
		basededatos.Cancion[] canciones = lista.contiene.toArray();
		Cancion_de_lista_a_eliminar c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion_de_lista_a_eliminar(canciones[i], lista);
			_list_Cancion_de_lista_a_eliminar.add(c);
		}
		
	}

}