package interfaz;

import vistas.VistaCancion_administrador;

public class Cancion_Administrador extends VistaCancion_administrador {
//	private CheckBox _establecer_ultimo_exitoCB;
//	private Button _eliminarB;
//	private Button _modificarB;
	public Modificar_cancion _modificar_cancion;
	public Eliminar_cancion _eliminar_cancion;
	
	public Cancion_Administrador() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Establecer_ultimo_exito() {
		throw new UnsupportedOperationException();
	}
}