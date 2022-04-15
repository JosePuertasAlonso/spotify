package interfaz;

public class Ver_perfil_artista_registrado extends Ver_perfil {
//	private Button _crear_AnuncioB;
	public Cabecera_artista_registrado _cabecera_artista_registrado;
	public Crear_anuncio _crear_anuncio;
	public Modificar_perfil__artista_ _modificar_perfil__artista_;
	
	public Ver_perfil_artista_registrado() {
		this.getButton_crearAnuncio().setVisible(true);
	}
	
}