package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cancion__bloque_con_opciones_ extends Cancion {
//	private Button _opcionesB;
	public Lista_canciones _lista_canciones;
	public Opciones_cancion__cancion_ _opciones_cancion__cancion_;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	
	public Cancion__bloque_con_opciones_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		
		
		this.getButton_opciones().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_opciones_cancion__cancion_ = new Opciones_cancion__cancion_(cuerpo, minireproductor, popUp);
				popUp.add(_opciones_cancion__cancion_);
				popUp.open();	
				
			}
		});
		
	}
}