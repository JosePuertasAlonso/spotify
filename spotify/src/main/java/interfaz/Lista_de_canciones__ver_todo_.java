package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Lista_de_canciones__ver_todo_ extends Lista_canciones {
	public Ver_todas_las_canciones_buscadas _ver_todas_las_canciones_buscadas;
	
	public Lista_de_canciones__ver_todo_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setVisible(false);
	
	}
}