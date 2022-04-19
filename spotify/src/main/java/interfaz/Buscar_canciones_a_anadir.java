package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscar_canciones_a_anadir;

public class Buscar_canciones_a_anadir extends VistaBuscar_canciones_a_anadir {
//	private Button _volverB;
//	private Button _buscarB;
//	private Label _todas_CancionesL;
	public Canciones_buscadas_a_anadir _canciones_buscadas_a_anadir;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Buscar_canciones_a_anadir() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		_canciones_buscadas_a_anadir = new Canciones_buscadas_a_anadir();
		this.getvL_cancionesBuscadasAAnadir().as(VerticalLayout.class).add(_canciones_buscadas_a_anadir);
		
		this.getLabel_anadeCancion().setVisible(false);
		this.getButton_nuevaCancion().setVisible(false);
	}
}