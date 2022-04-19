package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Hits extends Lista_canciones {
	public Ver_perfil_artista _ver_perfil_artista;
	
	public Hits(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Hits");
		
	}
}