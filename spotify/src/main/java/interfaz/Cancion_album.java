package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCancion_album;

public class Cancion_album extends VistaCancion_album{
//	private Button _eliminar_cancion_del_albumB;
//	private Label _nombreL;
	public Canciones_del_album__administrador_ _canciones_del_album__administrador_;
	
	private basededatos.Cancion cancion;
	private basededatos.Album album;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	public Cancion_album(basededatos.Cancion cancion, basededatos.Album album) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		this.album = album;
		this.cancion = cancion;
		
		//Titulo cancion
		this.getLabel_titulo().setText(cancion.getTitulo());
		// Artistas cancion
		basededatos.Artista[] artistasCancion = cancion.realizada_por.toArray();
		String cadenaArtistas = "";
		for (int j = 0; j < artistasCancion.length; j++) {
			if (j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", ";
			}
		}
		this.getLabel_artista().setText(cadenaArtistas);
		
		boolean contiene = false;
		basededatos.Cancion[] cancionesAlbum = album.contiene.toArray();
		for(basededatos.Cancion c : cancionesAlbum) {
			if(c.getId_Cancion() == cancion.getId_Cancion()) {
				contiene = true;
				break;
			}
		}
		if(contiene) {
			this.getInput_checkbox().getElement().setAttribute("checked", "true");
		} else {
			this.getInput_checkbox().getElement().removeAttribute("checked");
		}
		
		this.gethL_checkbox().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				anadir_cancion_al_album();
			}
		});
		
	}

	public void anadir_cancion_al_album() {
		_iAdministrador.anadir_cancion_al_album(this.cancion.getId_Cancion(), this.album.getId_Lista());
	}
}