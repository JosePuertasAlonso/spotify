package interfaz;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public Ver_creditos_cancion(VerticalLayout cuerpo, Dialog popup) {
		_compositores = new Compositores();
		_productores = new Productores();
		_interpretes = new Interpretes();
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_titulo1().setText(GestorUsuarios._cancion.getTitulo());
		
		this.gethL_compositores().add(_compositores);
		this.gethL_productores().add(_productores);
		this.gethL_interpretes().add(_interpretes);
		
	}
}