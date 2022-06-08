package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_de_reproduccion extends Lista {
//	private Button _compartir_enlace_de_listaB;
	public Canciones_de_lista _canciones_de_lista;
	
	public Lista_de_reproduccion(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Lista lista) {
		super(cuerpo, minireproductor, lista);
		_canciones_de_lista = new Canciones_de_lista(lista);
		this.getvL_cancionesDeListaAlbumListaeliminar().as(VerticalLayout.class).add(_canciones_de_lista);
		this.gethL_tituloAceptar().setVisible(false);
		this.getButton_modificar().setVisible(false);
		this.getButton_guardar().setVisible(false);
		this.getButton_eliminar().setVisible(false);
		this.getLabel_fechaPublicacion().setVisible(false);
		this.getButton_anadirCancion().setVisible(false);
	}

	public void compartir_enlace_de_lista() {
		throw new UnsupportedOperationException();
	}
}