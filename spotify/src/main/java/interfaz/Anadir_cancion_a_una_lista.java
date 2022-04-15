package interfaz;

import vistas.VistaAnadir_cancion_a_una_lista;

public class Anadir_cancion_a_una_lista extends VistaAnadir_cancion_a_una_lista{
//	private Label _tituloL;
//	private Button _crear_ListaB;
	public Opciones_cancion _opciones_cancion;
	public Listas_creadas _listas_creadas;
	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	
	public Anadir_cancion_a_una_lista() {
		_listas_creadas = new Listas_creadas();
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.gethL_listasCreadas().add(_listas_creadas);
	}
}