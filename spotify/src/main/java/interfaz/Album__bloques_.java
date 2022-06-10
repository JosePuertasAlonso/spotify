package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAlbum_bloques;

public class Album__bloques_ extends VistaAlbum_bloques{
//	private Label _nombreL;
//	private Image _imagenI;
//	private Button _reproducirB;
	public Albumes_del_artista _albumes_del_artista;
	public Ver_album _ver_album;
	
	public Album__bloques_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Album album) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-right", "var(--lumo-space-m)");
		this.getStyle().set("max-width", "15.5%");
		this.getStyle().set("min-width", "213px");

		//Titulo cancion
		if(album.getNombre().length() > 13) {
			String labelTitulo = album.getNombre().substring(0, 12) + "...";
			this.getLabel_titulo().setText(labelTitulo);
		} else {
			this.getLabel_titulo().setText(album.getNombre());
		}
		//Artistas cancion
		basededatos.Artista[] artistasCancion = album.es_creado_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < artistasCancion.length; j++) {
			if(j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", "; 
			}
		}
		this.getLabel_artista().setText(cadenaArtistas);
		
		this.getImagen().setSrc(album.getImagen());
		
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_album = new Ver_album(cuerpo, minireproductor, album);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_album);
			}
		});
	}
	
}