package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Artista__lista_;
import vistas.VistaLista_de_artistas_buscados;

public class Lista_de_artistas_buscados extends VistaLista_de_artistas_buscados{
	public Buscador _buscador;
	public Vector<Artista__lista_> _list_Artista__lista_ = new Vector<Artista__lista_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	public Lista_de_artistas_buscados(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarArtistasBuscados();
		
		for(int i = 0; i < _list_Artista__lista_.size(); i++) {
			this.getvL_contenedorArtistaLista().as(VerticalLayout.class).add(_list_Artista__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarArtistasBuscados() {
		
		Artista__lista_ a;
		
		for(int i = 0; i < 6; i++) {
			a = new Artista__lista_(cuerpo, minireproductor);
			a.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Artista__lista_.add(a);
		}
		
	}
}