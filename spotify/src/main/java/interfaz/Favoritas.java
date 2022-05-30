package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;

public class Favoritas extends Lista_canciones {
	public Comun _comun;
	
	iComun _iComun = new BDPrincipal();
	
	public Favoritas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Favoritas");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		cargar_favoritas();
		
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
	
	public void cargar_favoritas() {
		basededatos.Cancion[] canciones = _iComun.cargar_favoritas(GestorUsuarios._u.getLogin()); 		Cancion__bloque_con_opciones_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, canciones[i]);
			_list_Cancion__bloque_con_opciones_.add(c);
		}
	}
}