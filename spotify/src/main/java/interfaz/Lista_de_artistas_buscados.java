package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Artista__lista_;
import vistas.VistaLista_de_artistas_buscados;

public class Lista_de_artistas_buscados extends VistaLista_de_artistas_buscados{
	public Buscador _buscador;
	public Vector<Artista__lista_> _list_Artista__lista_ = new Vector<Artista__lista_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	private String cadena_busqueda;
	
	public basededatos.Artista[] artistas_buscados;
	
	iComun _iComun = new BDPrincipal();
	
	public Lista_de_artistas_buscados(VerticalLayout cuerpo, HorizontalLayout minireproductor, String cadena_busqueda) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		this.cadena_busqueda = cadena_busqueda;
		
		buscar_artistas();
		
		for(int i = 0; i < _list_Artista__lista_.size(); i++) {
			this.getvL_contenedorArtistaLista().as(VerticalLayout.class).add(_list_Artista__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_artistas() {
		basededatos.Artista[] artistas = _iComun.buscar_artistas(cadena_busqueda);
		this.artistas_buscados = artistas;
		Artista__lista_ a;
		
		for(int i = 0; i < artistas.length; i++) {
			a = new Artista__lista_(cuerpo, minireproductor, artistas[i]);
			_list_Artista__lista_.add(a);
		}
		
	}
}