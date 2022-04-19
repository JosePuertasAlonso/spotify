package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Opciones_cancion__reproductor_ extends Opciones_cancion {
//	private Button _ver_ArtistaB;
//	private Button _ver_AlbumB;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Ver_album _ver_album;
	public Ver_perfil_artista _ver_perfil_artista;
	
	public Opciones_cancion__reproductor_(VerticalLayout cuerpo, HorizontalLayout minireproductor, Dialog popUp) {
		super(cuerpo, minireproductor, popUp);
		this.getButton_verAlbum().setVisible(true);
		this.getButton_verArtista().setVisible(true);
		
		this.getButton_verAlbum().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				_ver_album = new Ver_album(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_album);
				
			}
		});
		
		
		this.getButton_verArtista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				_ver_perfil_artista = new Ver_perfil_artista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_perfil_artista);
				
			}
		});
		
	}
}