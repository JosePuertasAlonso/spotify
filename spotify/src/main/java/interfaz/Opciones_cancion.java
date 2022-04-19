package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaOpciones_cancion;

public class Opciones_cancion extends VistaOpciones_cancion {
//	private Button _anadir_a_favoritosB;
//	private Button _anadir_A_ListaB;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	
	public Opciones_cancion(VerticalLayout cuerpo, HorizontalLayout minireproductor, Dialog popUp) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_reproducir().setVisible(false);
		this.getButton_verAlbum().setVisible(false);
		this.getButton_verArtista().setVisible(false);
		
		this.getButton_anadirFavoritos().getStyle().set("margin-top", "0px");
		
		this.getButton_anadirLista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				_anadir_cancion_a_una_lista = new Anadir_cancion_a_una_lista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_anadir_cancion_a_una_lista);
				
			}
		});
	}
	

	public void Anadir_a_favoritos() {
		throw new UnsupportedOperationException();
	}
}