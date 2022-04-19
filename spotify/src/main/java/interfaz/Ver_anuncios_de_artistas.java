package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_anuncios_de_artistas;

public class Ver_anuncios_de_artistas extends VistaVer_anuncios_de_artistas{
//	private Label _anuncios_ArtistasL;
//	private Label _anuncios_Sin_LeerL;
	public Ver_perfil_cibernauta_registrado _ver_perfil_cibernauta_registrado;
	public Ver_perfil _ver_perfil;
	public Anuncios _anuncios;
	
	public Ver_anuncios_de_artistas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		_anuncios = new Anuncios();
		Integer nAnuncios = _anuncios.getNumAnuncios();
		this.getLabel_nAnuncios().setText(nAnuncios.toString());
		this.gethL_contenedorAnuncios().add(_anuncios);
	}
}