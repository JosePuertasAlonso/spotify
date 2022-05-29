package interfaz;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario;
import basededatos.Usuario_registrado;
import basededatos.iCibernauta_no_registrado;
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
	
	iCibernauta_no_registrado _iCibernauta_no_registrado = new BDPrincipal();
	
	/*BORRAR*/
	VerticalLayout cuerpo;
	HorizontalLayout minireproductor;
	/*BORRAR*/

	
	public Registrarse(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		/*BORRAR*/
		this.cuerpo =  cuerpo;
		this.minireproductor = minireproductor;
		/*BORRAR*/
		
		
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
				registrarse();
			}
		});
	}
	
	public void registrarse() {
		this.getLabel_errorConfirmarContrasena().setVisible(false);
		this.getLabel_errorContrasena().setVisible(false);
		this.getLabel_errorCorreo().setVisible(false);
		this.getLabel_errorNombrePerfil().setVisible(false);
		
		boolean correcto = true;
		String nick = this.getInput_nombrePerfil().getValue();
		String login = this.getInput_correo().getValue();
		String password = this.getInput_contrasena().getValue();
		String password2 = this.getInput_confirmarContrasena().getValue();
		String ruta = this.getInput_file().getValue();
		
		if(nick.isBlank() || _iCibernauta_no_registrado.nick_ya_registrado(nick)) {
			this.getLabel_errorNombrePerfil().setVisible(true);
			correcto = false;
		}
		if(login.isBlank() || _iCibernauta_no_registrado.login_ya_registrado(login)) {
			this.getLabel_errorCorreo().setVisible(true);
			correcto = false;
		}
		if(password.equals(password.toLowerCase()) || password.equals(password.toUpperCase()) || !password.matches(".*[0-9].*")){
			this.getLabel_errorContrasena().setVisible(true);
			correcto = false;
		}
		if(!password.equals(password2) || password2.isBlank()) {
			this.getLabel_errorConfirmarContrasena().setVisible(true);
			correcto = false;
		}
		if(correcto) {
			Usuario_registrado u = new Usuario_registrado();
			u.setNick(nick);
			u.setLogin(login);
			u.setPassword(password);
			u.setSeguidores(0);
			if(ruta.isBlank()) {
				u.setFoto("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png");
			} else {
				File f = new File(ruta);
				String foto = f.getName();
		        Path origenPath = FileSystems.getDefault().getPath(ruta);
		        Path destinoPath = FileSystems.getDefault().getPath("C:\\Users\\migue\\git\\spotify\\spotify\\src\\main\\webapp\\img\\" + foto);

		        try {
		        	Files.move(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
		        } catch (IOException e) {
		        }
		        u.setFoto("/img/" + foto);

			}
			_iCibernauta_no_registrado.registrar_usuario(u);
			cuerpo.removeAll();
			cuerpo.getStyle().set("max-height", "90%");
			minireproductor.setVisible(false);
			cuerpo.add(_confirmar_registro);
		}
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