package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Reproducir_cancion_cibernauta_registrado extends Reproducir_cancion {
//	private Button _opcionesB;
	public Opciones_cancion__cancion_ _opciones_cancion__cancion_;
	public Ver_estadisticas _ver_estadisticas;
	public Cancion__lista_ _cancion__lista_;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	public Cancion__bloque_con_opciones_ _cancion__bloque_con_opciones_;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	
	public Reproducir_cancion_cibernauta_registrado(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion cancion) {
		super(cuerpo, minireproductor, cancion);
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getButton_opciones().setVisible(true);
		
		
		this.getButton_opciones().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_opciones_cancion__reproductor_ = new Opciones_cancion__reproductor_(cuerpo, minireproductor, popUp, cancion);
				popUp.add(_opciones_cancion__reproductor_);
				popUp.open();	
				
			}
		});
	}
}