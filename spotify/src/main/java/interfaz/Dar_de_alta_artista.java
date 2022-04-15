package interfaz;

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
	public Estilos _estilos;
	public Enviar_correo_anadir_artista _enviar_correo_anadir_artista;
	
	public Dar_de_alta_artista() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_estilos = new Estilos();
		this.gethL_estilos().add(_estilos);
		
		this.getLabel_errorCorreo().setVisible(false);
		this.getLabel_errorContrasena().setVisible(false);
		this.getLabel_errorNombre().setVisible(false);
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}
}