package interfaz;

import vistas.VistaEliminar_lista;

public class Eliminar_lista extends VistaEliminar_lista{
//	private Label _tituloL;
//	private Label _atencionL;
//	private Button _cancelarB;
//	private Button _confirmar_eliminar_listaB;
	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
	public Modificar_lista _modificar_lista;
	
	public Eliminar_lista() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Confirmar_eliminar_lista() {
		throw new UnsupportedOperationException();
	}
}