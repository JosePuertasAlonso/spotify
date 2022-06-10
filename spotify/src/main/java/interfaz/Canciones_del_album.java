package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Cancion__lista_;
import vistas.VistaCanciones_del_album;

public class Canciones_del_album extends VistaCanciones_del_album{
	public Ver_album _ver_album;
	public Vector<Cancion__lista_> _list_Cancion__lista_ = new Vector<Cancion__lista_>();
	
	private basededatos.Album album;
	private iComun _iComun = new BDPrincipal();
	
	public Canciones_del_album(basededatos.Album album) {
		
		this.album = album;
		recargar_album();
		
		basededatos.Cancion[] cancionesAlbum = this.album.contiene.toArray();
		Cancion__lista_ c;
		for(int i = 0; i < cancionesAlbum.length; i++) {
			c = new Cancion__lista_(cancionesAlbum[i]);
			_list_Cancion__lista_.add(c);
		}
		
		for(int i = 0; i < _list_Cancion__lista_.size(); i++) {
			this.getvL_contenedorCancionesLista().as(VerticalLayout.class).add(_list_Cancion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void recargar_album() {
		this.album = (basededatos.Album)_iComun.recargar_lista(this.album.getId_Lista());
	}
	
}