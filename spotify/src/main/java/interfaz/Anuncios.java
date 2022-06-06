package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Anuncio;
import spotify.GestorUsuarios;
import vistas.VistaAnuncios;

public class Anuncios extends VistaAnuncios{
	public Ver_anuncios_de_artistas _ver_anuncios_de_artistas;
	public Vector<Anuncio> _list_Anuncio = new Vector<Anuncio>();
	
	iComun _iComun = new BDPrincipal();
	
	public Anuncios() {
		cargar_anuncios();
		
		for(int i = 0; i < _list_Anuncio.size(); i++) {
			this.getvL_contenedorAnuncios().as(VerticalLayout.class).add(_list_Anuncio.get(i));	
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
	public void cargar_anuncios() {
		basededatos.Anuncio[] anuncios = _iComun.cargar_anuncios(GestorUsuarios.login_u);
		Anuncio a;
		
		for(int i = 0; i < anuncios.length; i++) {
			a = new Anuncio(anuncios[i]);
			_list_Anuncio.add(a);
		}
		
	}
	
	public int getNumAnuncios() {
		return this._list_Anuncio.size();
	}
	
}