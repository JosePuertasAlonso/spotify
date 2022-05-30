package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Reproductor_resumido__usuario_registrado_ extends Reproductor_resumido {
	public Comun _comun;
	public Cancion__lista_ _cancion__lista_;
	public Cancion__bloque_con_opciones_ _cancion__bloque_con_opciones_;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	
	public Reproductor_resumido__usuario_registrado_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super();
		this.gethL_imagen().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				_reproducir_cancion_cibernauta_registrado = new Reproducir_cancion_cibernauta_registrado(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_reproducir_cancion_cibernauta_registrado);
			}
		});
	}
	
}