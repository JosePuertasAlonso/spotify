package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Reproductor_resumido__cibernauta_no_registrado_ extends Reproductor_resumido {
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Reproducir_cancion _reproducir_cancion;
	
	public Reproductor_resumido__cibernauta_no_registrado_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super();
		this.gethL_imagen().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				_reproducir_cancion = new Reproducir_cancion(cuerpo, minireproductor, GestorUsuarios._cancionReproduciendose);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_reproducir_cancion);
			}
		});
	}
}