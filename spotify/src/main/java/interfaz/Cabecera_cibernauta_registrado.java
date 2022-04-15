package interfaz;

public class Cabecera_cibernauta_registrado extends Cabecera {
	public Cibernauta_registrado _cibernauta_registrado;
	public Ver_perfil_cibernauta_registrado _ver_perfil_cibernauta_registrado;
	public Ver_perfil _ver_perfil;
	
	public Cabecera_cibernauta_registrado() {
		this.gethL_registrarseIniciarSesion().setVisible(false);
	}
}