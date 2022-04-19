package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Opciones_cancion__cancion_ extends Opciones_cancion {
//	private Button _reproducirB;
	public Cancion__bloque_con_opciones_ _cancion__bloque_con_opciones_;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	
	public Opciones_cancion__cancion_(VerticalLayout cuerpo, HorizontalLayout minireproductor, Dialog popUp) {
		super(cuerpo, minireproductor, popUp);
		this.getButton_anadirFavoritos().getStyle().set("margin-top", "16px");
		this.getButton_reproducir().getStyle().set("margin-top", "0px");
		this.getButton_reproducir().setVisible(true);
		
		
		this.getButton_reproducir().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_reproducir_cancion_cibernauta_registrado = new Reproducir_cancion_cibernauta_registrado(cuerpo, minireproductor);
				popUp.close();
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_reproducir_cancion_cibernauta_registrado);
			}
		});
	}
	
}