package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlbum_administrador;

//public class Album__Administrador_ extends Lista {
public class Album__Administrador_ extends VistaAlbum_administrador {
//	private Button _modificarB;
//	private Button _eliminarB;
	public Modificar_album _modificar_album;
	public Eliminar_album _eliminar_album;
	
	public Album__Administrador_(VerticalLayout cuerpo, basededatos.Album album) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		this.getStyle().set("min-height", "60px");
		
		//Foto album
		this.getImagen().setSrc(album.getImagen());
		//Nombre album
		this.getLabel_titulo().setText(album.getNombre());
		// Artistas album
		basededatos.Artista[] artistasCancion = album.es_creado_por.toArray();
		String cadenaArtistas = "";
		for (int j = 0; j < artistasCancion.length; j++) {
			if (j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", ";
			}
		}
		this.getLabel_artista().setText(cadenaArtistas);
		

		
		this.getButton_editar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_album = new Modificar_album(cuerpo, album);
				cuerpo.removeAll();
				cuerpo.add(_modificar_album);
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_album = new Eliminar_album(cuerpo, popUp, album);
				popUp.add(_eliminar_album);
				popUp.open();
			}
		});
	}
}