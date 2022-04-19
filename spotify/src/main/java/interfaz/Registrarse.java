package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
//	private Button _registrarse_con_GoogleB;
//	private Button _registrarse_con_AppleB;
//	private Button _registrarse_con_FacebookB;
//	private Button _seleccionar_foto_perfilB;
//	private Label _tituloL;
//	private Label _usernameL;
//	private TextField _usernameTF;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private Label _repetir_ContrasenaL;
//	private TextField _repetir_ContrasenaTF;
//	private Button _registrarseB;
//	private Button _iniciar_SesionB;
//	private Label _iniciar_SesionL;
	public Cabecera_cibernauta _cabecera_cibernauta;
	public Iniciar_sesion _iniciar_sesion;
	public Google _google;
	public Apple _apple;
	public Facebook _facebook;
	public Confirmar_registro _confirmar_registro;
	
	public Registrarse(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
    	getStyle().set("margin", "0px");
    	getStyle().set("height", "100%");
    	getStyle().set("width", "100%");
    	
		this.getLabel_errorConfirmarContrasena().setVisible(false);
		this.getLabel_errorContrasena().setVisible(false);
		this.getLabel_errorCorreo().setVisible(false);
		this.getLabel_errorNombrePerfil().setVisible(false);

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
		

		_confirmar_registro = new Confirmar_registro(cuerpo, minireproductor);
		this.getButton_registrarse().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_confirmar_registro);
			}
		});
	}

	public void Registrarse_con_Google() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse_con_Apple() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse_con_Facebook() {
		throw new UnsupportedOperationException();
	}

	public void Validar_registro() {
		throw new UnsupportedOperationException();
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}
}