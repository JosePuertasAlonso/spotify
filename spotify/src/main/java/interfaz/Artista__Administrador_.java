package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtista_administrador;

public class Artista__Administrador_ extends VistaArtista_administrador {
//	private Button _eliminarB;
//	private Button _modificarB;
	public Eliminar_artista _eliminar_artista;
	public Modificar_artista _modificar_artista;
	
	public Artista__Administrador_(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_editar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_artista = new Modificar_artista(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_modificar_artista);
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_artista = new Eliminar_artista(cuerpo, popUp);
				popUp.add(_eliminar_artista);
				popUp.open();
			}
		});
	}
}