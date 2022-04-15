package interfaz;

import vistas.VistaCrear_nuevo_estilo;

public class Crear_nuevo_estilo extends VistaCrear_nuevo_estilo{
//	private Label _tituloL;
//	private Label _nombreL;
//	private TextField _nombreTF;
//	private Label _ponle_NombreL;
//	private Button _anadir_estiloB;
	public Administrador _administrador;
	
	public Crear_nuevo_estilo() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Anadir_estilo() {
		throw new UnsupportedOperationException();
	}
}