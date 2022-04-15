package interfaz;

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
	
	public Iniciar_sesion() {
    	getStyle().set("margin", "0px");
    	this.getLabel_errorInicioSesion().setVisible(false);
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