package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import spotify.Imagen;

public class Cabecera_cibernauta extends Cabecera {
//	private Label _informacion_ContactoL;
//	private Button _iniciar_SesionB;
//	private Button _registrarseB;
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Registrarse _registrarse;
	public Iniciar_sesion _iniciar_sesion;

	public Cabecera_cibernauta(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.gethL_usuarioCerrarSesion().setVisible(false);
		

		_iniciar_sesion = new Iniciar_sesion(cuerpo, minireproductor);
		this.getButton_iniciarSesion().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_iniciar_sesion);
			}
		});
		

		_registrarse = new Registrarse(cuerpo, minireproductor);
		this.getButton_registrarse().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_registrarse);
			}
		});
		
		this._logo.getButton_logo().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.cibernauta(false);
				//Cancion del minireproductor:
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.gethL_imagen().removeAll();
				Imagen img = new Imagen(GestorUsuarios._cancion.getImagen());
				img.setMaxWidth("100%");
				Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_.gethL_imagen().add(img);				
			}
		});
	}

}

