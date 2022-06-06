package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import vistas.VistaEnviar_correo_de_modificacion;

public class Enviar_correo_de_modificacion extends VistaEnviar_correo_de_modificacion{
//	private Label _tituloL;
//	private Label _correo_EnviadoL;
//	private Button _iniciar_SesionB;
	public Gestor_correo_electronico _gestor_correo_electronico;
	public Modificar_perfil _modificar_perfil;
	public Iniciar_sesion _iniciar_sesion;
	
	public Enviar_correo_de_modificacion(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_iniciarSesion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.cibernauta(true);
			}
		});
	}
	

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}