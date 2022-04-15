package interfaz;

public class Cabecera_cibernauta extends Cabecera {
//	private Label _informacion_ContactoL;
//	private Button _iniciar_SesionB;
//	private Button _registrarseB;
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Registrarse _registrarse;
	public Iniciar_sesion _iniciar_sesion;

	public Cabecera_cibernauta() {
		this.gethL_usuarioCerrarSesion().setVisible(false);
	}

}

