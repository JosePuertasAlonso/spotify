package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{
//	private Button _iniciar_sesion_con_GoogleB;
//	private Button _iniciar_sesion_con_AppleB;
//	private Button _iniciar_sesion_con_FacebookB;
//	private Label _tituloL;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private Button _iniciar_sesionB;
//	private Button _olvide_ContrasenaB;
//	private Label _no_MiembroL;
//	private Button _registrarseB;
	public Google _google;
	public Cabecera_cibernauta _cabecera_cibernauta;
	public Registrarse _registrarse;
	public Confirmar_registro _confirmar_registro;
	public Enviar_correo_de_modificacion _enviar_correo_de_modificacion;
	public Apple _apple;
	public Facebook _facebook;
	public Recuperar_contrasena _recuperar_contrasena;
	
	public Iniciar_sesion(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
    	getStyle().set("margin", "0px");
    	getStyle().set("padding", "0px");
    	getStyle().set("width", "100%");
    	getStyle().set("height", "100%");
    	
    	this.getLabel_errorInicioSesion().setVisible(false);

		this.getButton_iniciarSesion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				String email = getInput_correoElectronico().getValue();
				String contrasena = getInput_contrasena().getValue();
					switch (email) {
						case "usuario":
							GestorUsuarios.usuario();
							break;
						case "artista":
							GestorUsuarios.artista();
							break;
						case "administrador":
							GestorUsuarios.administrador();
							break;

						default:
							getLabel_errorInicioSesion().setVisible(true);
					}
			}
		});
    	
		this.getButton_suscribete().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				_registrarse = new Registrarse(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_registrarse);
			}
		});	
		

		_recuperar_contrasena = new Recuperar_contrasena(cuerpo, minireproductor);
		this.getButton_recordarContrasena().addClickListener(new ComponentEventListener() {
			@Override
			public void onComponentEvent(ComponentEvent event) {
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "90%");
				minireproductor.setVisible(false);
				cuerpo.add(_recuperar_contrasena);
			}
		});
		
	
	}

	public void Iniciar_sesion_con_Google() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_sesion_con_Apple() {
		throw new UnsupportedOperationException();
	}

	public void Iniciar_sesion_con_Facebook() {
		throw new UnsupportedOperationException();
	}

	public void Validar_iniciar_sesion() {
		throw new UnsupportedOperationException();
	}
	
}