package interfaz;

import vistas.VistaAnuncio;

public class Anuncio extends VistaAnuncio{
//	private Label _tituloL;
//	private Label _artistaL;
//	private Image _imagenI;
//	private Label _mensajeL;
	public Anuncios _anuncios;
	
	public Anuncio(basededatos.Anuncio anuncio) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		this.getLabel_artista().setText(anuncio.getAnunciado().getNick());
		this.getLabel_titulo().setText(anuncio.getTitulo());
		this.getLabel_descripcion().setText(anuncio.getDescripcion());
		this.getImagen().setSrc(anuncio.getAnunciado().getFoto());
	}

}