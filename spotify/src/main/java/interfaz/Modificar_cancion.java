package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificar_cancion;

public class Modificar_cancion extends VistaModificar_cancion{
//	private Button _confirmar_cancionB;
//	private Label _tituloL;
//	private Label _titulo_CancionL;
//	private Label _titulo_Cancion_EtiquetaL;
//	private TextField _titulo_CancionTF;
//	private Label _artista_s_L;
//	private Label _artista_s__EtiquetaL;
//	private TextField _artista_s_TF;
//	private Label _albumL;
//	private Label _album_EtiquetaL;
//	private TextField _albumTF;
	public Cancion_Administrador _cancion_Administrador;
	
	public Modificar_cancion(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLabel_anadeNuevaCancion().setText("Modifica una canción");
		this.getvL_cancion1().as(VerticalLayout.class).setVisible(false);
	}

	public void Confirmar_cancion() {
		throw new UnsupportedOperationException();
	}
}