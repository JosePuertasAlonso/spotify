package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Favoritas extends Lista_canciones {
	public Comun _comun;
	
	public Favoritas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Favoritas");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
}