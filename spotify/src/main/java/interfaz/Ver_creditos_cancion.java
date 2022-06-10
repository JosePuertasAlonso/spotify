package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaVer_creditos_cancion;

public class Ver_creditos_cancion extends VistaVer_creditos_cancion{
//	private Label _tituloL;
//	private Label _albumL;
//	private Label _nombre_CancionL;
//	private Label _nombre_AlbumL;
//	private Label _interpretesL;
//	private Label _compositoresL;
//	private Label _productoresL;
	public Reproducir_cancion _reproducir_cancion;
	public Compositores _compositores;
	public Productores _productores;
	public Interpretes _interpretes;
	
	iComun _iComun = new BDPrincipal();
	private basededatos.Cancion cancion;
	
	public Ver_creditos_cancion(VerticalLayout cuerpo, Dialog popup, basededatos.Cancion cancion) {
		this.cancion = cancion;
		recargar_cancion();
		
		if(cancion.getCompositor() == null) {
			_compositores = new Compositores(null);
		} else {
			_compositores = new Compositores(cancion.getCompositor());
		}
		
		if(cancion.getProductor() == null) {
			_productores = new Productores(null);
		} else {
			_productores = new Productores(cancion.getProductor());
		}
		
		if(cancion.getInterprete() == null) {
			_interpretes = new Interpretes(null);
		} else {
			_interpretes = new Interpretes(cancion.getInterprete());
		}
		
		basededatos.Lista[] l_aux = this.cancion.esta_en.toArray();
		basededatos.Album a = null;
		for(int i = 0; i < l_aux.length; i++) {
			if(l_aux[i] instanceof basededatos.Album) {
				a = (basededatos.Album) l_aux[i];
				break;
			}
		}
		if(a != null) {
			this.getLabel_album1().setText(a.getNombre());
		} else {
			this.getLabel_album().setText("");
		}
		
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_titulo1().setText(GestorUsuarios._cancionReproduciendose.getTitulo());
		
		this.gethL_compositores().add(_compositores);
		this.gethL_productores().add(_productores);
		this.gethL_interpretes().add(_interpretes);
		
	}
	
	public void recargar_cancion() {
		this.cancion = _iComun.recargar_cancion(cancion.getId_Cancion());
	}
}