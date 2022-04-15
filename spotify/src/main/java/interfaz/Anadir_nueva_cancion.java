package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_nueva_cancion extends Modificar_cancion {
//	private Label _archivo_CancionL;
//	private Label _archivos_PermitidosL;
//	private Image _imagenI;
//	private Button _seleccionar_archivoB;
	public Administrador _administrador;
	public Anadir_cancion_al_album _anadir_cancion_al_album;
	
	public Anadir_nueva_cancion() {
		super();
		this.getLabel_anadeNuevaCancion().setText("Añade una nueva canción");
		this.getvL_cancion1().as(VerticalLayout.class).setVisible(true);
		this.getButton_modificarCancion().setText("AÑADIR CANCIÓN");
	}

	public void Seleccionar_archivo() {
		throw new UnsupportedOperationException();
	}
}