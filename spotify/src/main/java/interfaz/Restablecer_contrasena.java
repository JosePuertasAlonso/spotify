package interfaz;

import vistas.VistaRestablecer_contrasena;

public class Restablecer_contrasena extends VistaRestablecer_contrasena{
//	private Label _tituloL;
//	private Label _nueva_ContrasenaL;
//	private TextField _nueva_ContrasenaTF;
//	private Label _repetirL;
//	private TextField _repetirTF;
//	private Button _enviarB;
	public Cibernauta_sin_contrasena _cibernauta_sin_contrasena;
	
	public Restablecer_contrasena() {
		getVistaCabecera().setVisible(false);
    	getStyle().set("margin", "0px");
    	this.getLabel_errorContrasenaCoincidir().setVisible(false);
    	this.getLabel_errorContrasenaRequisitos().setVisible(false);
    	this.gethL_cabecera().add(new Cabecera_cibernauta());
	}

	public void Validar_contrasena() {
		throw new UnsupportedOperationException();
	}
}