package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaDar_de_alta_artista;

public class Dar_de_alta_artista extends VistaDar_de_alta_artista{
//	private Button _seleccionar_foto_perfilB;
//	private Label _tituloL;
//	private Label _usuarioL;
//	private TextField _usuarioTF;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private Label _estilosL;
//	private Button _anadirB;
	public Administrador _administrador;
	public Enviar_correo_anadir_artista _enviar_correo_anadir_artista;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	private VerticalLayout cuerpo;
	
	public Dar_de_alta_artista(VerticalLayout cuerpo) {
		
		this.cuerpo = cuerpo;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_errorCorreo().setVisible(false);
		this.getLabel_errorContrasena().setVisible(false);
		this.getLabel_errorNombre().setVisible(false);
		this.getLabel_estilos().setVisible(false);
		this.gethL_estilos().setVisible(false);
		
		
		this.getButton_anadirArtista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				dar_de_alta_artista();
				
			}
		});
	}
	
	public void dar_de_alta_artista() {
		this.getLabel_errorContrasena().setVisible(false);
		this.getLabel_errorCorreo().setVisible(false);
		this.getLabel_errorNombre().setVisible(false);
		
		
		boolean correcto = true;
		String nick = this.getInput_nombre().getValue();
		String login = this.getInput_correo().getValue();
		String password = this.getInput_contrasena().getValue();
		String ruta = this.getInput_file().getValue();
		
		if(nick == null || nick.isBlank() || _iAdministrador.nick_ya_registrado_administrador(nick)) {
			this.getLabel_errorNombre().setVisible(true);
			correcto = false;
		}
		if(login == null || login.isBlank() || _iAdministrador.login_ya_registrado_administrador(login)) {
			this.getLabel_correo().setVisible(true);
			correcto = false;
		}
		if(password.equals(password.toLowerCase()) || password.equals(password.toUpperCase()) || !password.matches(".*[0-9].*")){
			this.getLabel_errorContrasena().setVisible(true);
			correcto = false;
		}
		if(correcto) {
			basededatos.Artista a = new Artista();
			a.setNick(nick);
			a.setLogin(login);
			a.setPassword(password);
			a.setSeguidores(0);
			if(ruta.isBlank()) {
				a.setFoto("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png");
			} else {
				File f = new File(ruta);
				String foto = f.getName();
				a.setFoto("/img/" + foto);
			}
			_iAdministrador.anadir_artista(a);
			_enviar_correo_anadir_artista = new Enviar_correo_anadir_artista(cuerpo);
			cuerpo.removeAll();
			cuerpo.add(_enviar_correo_anadir_artista);
		}
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}
}