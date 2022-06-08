package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Lista_de_canciones__ver_todo_ extends Lista_canciones {
	public Ver_todas_las_canciones_buscadas _ver_todas_las_canciones_buscadas;
	
	public Lista_de_canciones__ver_todo_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion[] cancionesBuscadas) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setVisible(false);
		
		Cancion__bloque_con_opciones_ c;
		for(int i = 0; i < cancionesBuscadas.length; i++) {
			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, cancionesBuscadas[i]);
			_list_Cancion__bloque_con_opciones_.add(c);
		}
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorCanciones();
		for(int i = 0; i < _list_Cancion__bloque_con_opciones_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_filaCanciones().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Cancion__bloque_con_opciones_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
	
	}
}