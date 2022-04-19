package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion{
//	private Button _crear_listaB;
//	private Label _tituloL;
//	private Label _nombre_ListaL;
//	private TextField _nombre_ListaTF;
//	private Label _ponle_TituloL;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	public Ver_perfil _ver_perfil;
	
	public Crear_lista_de_reproduccion(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}

	public void Crear_lista() {
		throw new UnsupportedOperationException();
	}
}