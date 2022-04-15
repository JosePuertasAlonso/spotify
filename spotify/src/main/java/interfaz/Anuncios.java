package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Anuncio;
import vistas.VistaAnuncios;

public class Anuncios extends VistaAnuncios{
	public Ver_anuncios_de_artistas _ver_anuncios_de_artistas;
	public Vector<Anuncio> _list_Anuncio = new Vector<Anuncio>();
	
	
	public Anuncios() {
		cargarAnuncios();
		
		for(int i = 0; i < _list_Anuncio.size(); i++) {
			this.getvL_contenedorAnuncios().as(VerticalLayout.class).add(_list_Anuncio.get(i));	
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	public void cargarAnuncios() {
		
		Anuncio a;
		
		for(int i = 0; i < 10; i++) {
			a = new Anuncio();
			a.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Anuncio.add(a);
		}
		
	}
	
	public int getNumAnuncios() {
		return this._list_Anuncio.size();
	}
	
}