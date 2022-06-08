package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_registrado;
import basededatos.iComun;
import spotify.GestorUsuarios;
import spotify.Imagen;

public class Cancion__bloque_con_opciones_ extends Cancion {
//	private Button _opcionesB;
	public Lista_canciones _lista_canciones;
	public Opciones_cancion__cancion_ _opciones_cancion__cancion_;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	
	iComun _iComun = new BDPrincipal();
	
	private basededatos.Cancion cancion;
	
	public Cancion__bloque_con_opciones_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion cancion) {
		super(cuerpo, minireproductor, cancion);
		this.cancion = cancion; 
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.reproducirCancion(cancion);
				Comun._reproductor_resumido__usuario_registrado_.getLabel_titulo().setText(cancion.getTitulo());
				Comun._reproductor_resumido__usuario_registrado_.getLabetl_artista().setText(GestorUsuarios.artistasCancion);
				Imagen img = new Imagen(cancion.getImagen());
				img.setMaxWidth("100%");
				Comun._reproductor_resumido__usuario_registrado_.gethL_imagen().removeAll();
				Comun._reproductor_resumido__usuario_registrado_.gethL_imagen().add(img);
				anadir_cancion_historial(); //Metodo BD
				
			}
		});
		
		this.getButton_opciones().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios._cancion = cancion;
				Dialog popUp = new Dialog();
				_opciones_cancion__cancion_ = new Opciones_cancion__cancion_(cuerpo, minireproductor, popUp, cancion);
				popUp.add(_opciones_cancion__cancion_);
				popUp.open();	
				
			}
		});
		
	}
	
	public void anadir_cancion_historial() {
		_iComun.anadir_cancion_historial(cancion.getId_Cancion(), GestorUsuarios._u.getLogin());
	}
}