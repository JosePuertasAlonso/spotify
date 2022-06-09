package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Album__bloque_administrador_;
import vistas.VistaLista_de_albumes_buscados_administrador;

public class Lista_de_albumbes_buscados__administrador_ extends VistaLista_de_albumes_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Album__bloque_administrador_> _list_Album__bloque_administrador_ = new Vector<Album__bloque_administrador_>();

	private VerticalLayout cuerpo;
	private String cadena_busqueda;
	
	public basededatos.Album[] albumes_buscados;

	iAdministrador _iAdministrador = new BDPrincipal();
	
	public Lista_de_albumbes_buscados__administrador_(VerticalLayout cuerpo, String cadena_busqueda) {
		
		this.cuerpo = cuerpo;
		this.cadena_busqueda = cadena_busqueda;
		
		buscar_albumes();
		
		for(int i = 0; i < _list_Album__bloque_administrador_.size(); i++) {
			this.getvL_contenedorAlbumesAdministrador().as(VerticalLayout.class).add(_list_Album__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_albumes() {
		basededatos.Album[] albumes = _iAdministrador.buscar_albumes_administrador(cadena_busqueda);
		this.albumes_buscados = albumes;
		Album__bloque_administrador_ a;
		
		for(int i = 0; i < albumes.length; i++) {
			a = new Album__bloque_administrador_(cuerpo, albumes[i]);
			_list_Album__bloque_administrador_.add(a);
		}
		
	}

}