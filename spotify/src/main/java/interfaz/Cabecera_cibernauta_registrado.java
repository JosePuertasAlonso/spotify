package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Cabecera_cibernauta_registrado extends Cabecera {
	public Cibernauta_registrado _cibernauta_registrado;
	public Ver_perfil_cibernauta_registrado _ver_perfil_cibernauta_registrado;
	public Ver_perfil _ver_perfil;
	
	public Cabecera_cibernauta_registrado(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super();
		this.gethL_registrarseIniciarSesion().setVisible(false);
		
		this.gethL_fotoNombreUsuario().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				_ver_perfil = new Ver_perfil(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_perfil);
			}
		});
		
		this.getButton_cerrarSesion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.cibernauta(true);
			}
		});
		
		this._logo.getButton_logo().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.usuario();
				
			}
		});
	}
}