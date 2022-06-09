package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Cancion__bloque_administrador_;
import vistas.VistaLista_de_canciones_buscadas_administrador;

public class Lista_de_canciones_buscadas__administrador_ extends VistaLista_de_canciones_buscadas_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Cancion__bloque_administrador_> _list_Cancion__bloque_administrador_ = new Vector<Cancion__bloque_administrador_>();

	private VerticalLayout cuerpo;
	private String cadena_busqueda;
	
	public basededatos.Cancion[] canciones_buscadas;
	
	iAdministrador _iAdministrador = new BDPrincipal();
	
	public Lista_de_canciones_buscadas__administrador_(VerticalLayout cuerpo, String cadenaBusqueda) {
		
		this.cuerpo = cuerpo;
		this.cadena_busqueda = cadenaBusqueda;
		
		buscar_canciones_administrador();
		
		for(int i = 0; i < _list_Cancion__bloque_administrador_.size(); i++) {
			this.getvL_contenedorCancionAdministrador().as(VerticalLayout.class).add(_list_Cancion__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_canciones_administrador() {
		basededatos.Cancion[] canciones = _iAdministrador.buscar_canciones_administrador(cadena_busqueda);
		this.canciones_buscadas = canciones;
		Cancion__bloque_administrador_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__bloque_administrador_(cuerpo, canciones[i]);
			_list_Cancion__bloque_administrador_.add(c);
		}
		
	}


}