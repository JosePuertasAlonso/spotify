package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import spotify.Imagen;

public class Cancion__bloque_sin_opciones_ extends Cancion {
//	private Button _reproducirB;
	public Ultimos_exitos _ultimos_exitos;
	public Reproducir_cancion _reproducir_cancion;
	
	public Cancion__bloque_sin_opciones_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion cancion) {
		super(cuerpo, minireproductor);
		this.getButton_opciones().setVisible(false);
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
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.reproducirCancion(cancion);
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.getLabel_titulo().setText(cancion.getTitulo());
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.getLabetl_artista().setText(GestorUsuarios.artistasCancion);
				Imagen img = new Imagen(cancion.getImagen());
				img.setMaxWidth("100%");
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.gethL_imagen().removeAll();
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.gethL_imagen().add(img);

			}
		});
		
	}
	
}

