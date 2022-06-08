package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Hits extends Lista_canciones {
	public Ver_perfil_artista _ver_perfil_artista;
	
	private basededatos.Artista artista;
	
	public Hits(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		super(cuerpo, minireproductor);
		this.artista = artista;
		this.getLabel_titulo().setText("Hits");
		
		cargar_hits();
		
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
	
	public void cargar_hits() {
		basededatos.Cancion[] canciones = artista.realiza.toArray();
		Cancion__bloque_con_opciones_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, canciones[i]);
			_list_Cancion__bloque_con_opciones_.add(c);
		}
	}
	
	public void recargar_artista() {
		
	}
}