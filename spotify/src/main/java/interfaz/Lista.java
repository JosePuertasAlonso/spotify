package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista;

public class Lista extends VistaLista{
//	private Label _nombreL;
//	private Image _imagenI;
//	private Label _numero_CancionesL;
	
	public Lista(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Lista lista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_titulo().setText(lista.getNombre());
		//this.getImagen().getStyle().set("min-width", "242px");
		this.getImagen().setSrc(lista.getImagen());
		if(lista instanceof basededatos.Lista_de_reproduccion) {
			this.getLabel_creador().setText(((basededatos.Lista_de_reproduccion)lista).getEs_gestionada_por().getNick());
		}
		this.getLabel_nCanciones().setText(lista.contiene.size() + " de 100 canciones");
	}
	
}