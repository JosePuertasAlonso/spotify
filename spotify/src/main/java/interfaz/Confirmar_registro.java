package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaConfirmar_registro;

public class Confirmar_registro extends VistaConfirmar_registro{
//	private Label _tituloL;
//	private Button _iniciar_SesionB;
//	private Label _registradoL;
//	private Label _email_EnviadoL;
	public Registrarse _registrarse;
	public Gestor_correo_electronico _gestor_correo_electronico;
	public Iniciar_sesion _iniciar_sesion;

	public Confirmar_registro(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
    	getStyle().set("margin", "0px");
    	getStyle().set("width", "100%");
    	getStyle().set("height", "100%");
    	
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
	}
	
	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}