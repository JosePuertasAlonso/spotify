package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_canciones_a_lista extends Buscar_canciones_a_anadir {
	//private Label _tituloL;
	public Modificar_lista _modificar_lista;
	
	public Anadir_canciones_a_lista(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super();
		this.getLabel_anadeCancion().setVisible(true);
	}
	
}