package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_del_artista;

public class Lista_del_artista extends VistaLista_del_artista {
	public Listas_de_reproduccion_del_artista _lista_de_reproduccion_del_artista;
	
	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena; //ANADIDO A MANO
	
	public Lista_del_artista(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Lista lista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-right", "var(--lumo-space-m)");
		this.getStyle().set("min-width", "213px");
		this.getStyle().set("max-width", "15.5%");
		
		//Nombre de la lista
		this.getLabel_titulo().setText(lista.getNombre());
		
		//Creador de la lista de reproduccion
		if(lista instanceof basededatos.Lista_de_reproduccion) {
			this.getLabel_creador().setText(((basededatos.Lista_de_reproduccion)lista).getEs_gestionada_por().getNick());
		}
		
		//Imagen de la lista
		this.getImagen().setSrc(lista.getImagen());
		
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_lista_de_reproduccion_ajena = new Ver_lista_de_reproduccion_ajena(cuerpo, minireproductor, lista);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_lista_de_reproduccion_ajena);
			}
		});
	}
}