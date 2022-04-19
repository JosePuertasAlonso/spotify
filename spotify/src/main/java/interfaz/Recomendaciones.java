package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Recomendaciones extends Lista_canciones {
	public Comun _comun;
	
	public Recomendaciones(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Recomendaciones");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
	
}