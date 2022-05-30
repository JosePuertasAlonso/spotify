package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaCancion;

public class Cancion extends VistaCancion{
//	private Label _nombreL;
//	private Label _artista_s_L;
//	private Image _imagenI;
	
	//Anadido a Mano
	public Opciones_cancion _opciones_cancion;
	public Imagen _img;
	
	public Cancion(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-right", "var(--lumo-space-m)");
		this.getStyle().set("max-width", "15.5%");
		//this.getStyle().set("max-width", "30%");
		//Titulo cancion
		this.getLabel_titulo().setText(cancion.getTitulo());
		//Artistas cancion
		basededatos.Artista[] artistasCancion = cancion.realizada_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < artistasCancion.length; j++) {
			if(j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", "; 
			}
		}
		GestorUsuarios.artistasCancion = cadenaArtistas;
		this.getLabel_artista().setText(cadenaArtistas);
		
		//Foto cancion
		//border-radius: 0.7rem; max-height: 80%; max-width: 100%;
		Imagen img = new Imagen(cancion.getImagen());
		img.setMaxHeight("80%");
		img.setMaxWidth("100%");
		img.setRadius("0.7rem");
		this.gethL_imagen().add(img);
	}
}