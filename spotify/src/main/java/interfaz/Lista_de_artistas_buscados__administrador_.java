package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Artista__bloque_administrador_;
import vistas.VistaLista_de_artistas_buscados_administrador;

public class Lista_de_artistas_buscados__administrador_ extends VistaLista_de_artistas_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Artista__bloque_administrador_> _list_Artista__bloque_administrador_ = new Vector<Artista__bloque_administrador_>();

	private VerticalLayout cuerpo;
	private String cadena_busqueda;
	
	public basededatos.Artista[] artistas_buscados;

	iAdministrador _iAdministrador = new BDPrincipal();
	
	public Lista_de_artistas_buscados__administrador_(VerticalLayout cuerpo, String cadena_busqueda) {
		
		this.cuerpo = cuerpo;
		this.cadena_busqueda = cadena_busqueda;
		
		buscar_artistas_administrador();
		
		for(int i = 0; i < _list_Artista__bloque_administrador_.size(); i++) {
			this.getvL_contenedorArtistasAdministrador().as(VerticalLayout.class).add(_list_Artista__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_artistas_administrador() {
		basededatos.Artista[] artistas = _iAdministrador.buscar_artistas_administrador(cadena_busqueda);
		this.artistas_buscados = artistas;
		Artista__bloque_administrador_ a;
		
		for(int i = 0; i < artistas.length; i++) {
			a = new Artista__bloque_administrador_(cuerpo, artistas[i]);
			_list_Artista__bloque_administrador_.add(a);
		}
		
	}

}