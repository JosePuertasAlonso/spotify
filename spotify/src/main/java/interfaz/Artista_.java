package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtista;

public class Artista_ extends VistaArtista{
//	private Label _nombreL;
//	private Image _imagenI;
	
	public Artista_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_nombre().setText(artista.getNick());
		this.getImagen().setSrc(artista.getFoto());
	}
}