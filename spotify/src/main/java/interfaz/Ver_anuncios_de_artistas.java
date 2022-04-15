package interfaz;

import vistas.VistaVer_anuncios_de_artistas;

public class Ver_anuncios_de_artistas extends VistaVer_anuncios_de_artistas{
//	private Label _anuncios_ArtistasL;
//	private Label _anuncios_Sin_LeerL;
	public Ver_perfil_cibernauta_registrado _ver_perfil_cibernauta_registrado;
	public Ver_perfil _ver_perfil;
	public Anuncios _anuncios;
	
	public Ver_anuncios_de_artistas() {
		this.getStyle().set("margin", "0px");
		_anuncios = new Anuncios();
		Integer nAnuncios = _anuncios.getNumAnuncios();
		this.getLabel_nAnuncios().setText(nAnuncios.toString());
		this.gethL_contenedorAnuncios().add(_anuncios);
	}
}