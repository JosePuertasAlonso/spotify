package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Esuchadas_recientemente extends Lista_canciones {
	public Comun _comun;
	
	public Esuchadas_recientemente(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Escuchadas recientemente");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
}