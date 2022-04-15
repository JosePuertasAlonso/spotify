package interfaz;

public class Cabecera_artista_registrado extends Cabecera {
	public Artista _artista;
	public Ver_perfil_artista_registrado _ver_perfil_artista_registrado;
	
	public Cabecera_artista_registrado() {
		this.gethL_registrarseIniciarSesion().setVisible(false);
	}	
	
}

