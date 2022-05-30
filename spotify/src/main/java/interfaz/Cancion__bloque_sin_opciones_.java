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
		super(cuerpo, minireproductor, cancion);
		this.getButton_opciones().setVisible(false);
		
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

