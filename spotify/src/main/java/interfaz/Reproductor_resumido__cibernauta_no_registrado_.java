package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Reproductor_resumido__cibernauta_no_registrado_ extends Reproductor_resumido {
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Reproducir_cancion _reproducir_cancion;
	
	public Reproductor_resumido__cibernauta_no_registrado_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super();
		this.getImagen().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				_reproducir_cancion = new Reproducir_cancion(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_reproducir_cancion);
			}
		});
	}
}