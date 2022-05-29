package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;

public class Esuchadas_recientemente extends Lista_canciones {
	public Comun _comun;
	
	iComun _iComun = new BDPrincipal();
	
	public Esuchadas_recientemente(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_titulo().setText("Escuchadas recientemente");
		this.getStyle().set("margin-top", "var(--lumo-space-m)"); 
		
		cargar_escuchadas_recientemente();
		
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
	
	public void cargar_escuchadas_recientemente() {
		basededatos.Cancion[] canciones = _iComun.cargar_escuchadas_recientemente(GestorUsuarios._u.getLogin()); //CAMBIAR LOGIN
		Cancion__bloque_con_opciones_ c;
		
		for(int i = 0; i < canciones.length; i++) {
			c = new Cancion__bloque_con_opciones_(cuerpo, minireproductor);
			c.getStyle().set("margin-right", "var(--lumo-space-m)");
			c.getStyle().set("max-width", "15.5%");
			
			//Titulo cancion
			c.getLabel_titulo().setText(canciones[i].getTitulo());
			//Artistas cancion
			basededatos.Artista[] artistasCancion = canciones[i].realizada_por.toArray();
			String cadenaArtistas = "";
			for(int j = 0; j < artistasCancion.length; j++) {
				if(j == artistasCancion.length-1) {
					cadenaArtistas += artistasCancion[i].getNick();
				} else {
					cadenaArtistas += artistasCancion[i].getNick() + ", ";
				}
			}
			c.getLabel_artista().setText(cadenaArtistas);
			//Foto cancion
			c.getImagen().setSrc(canciones[i].getImagen());
			
			_list_Cancion__bloque_con_opciones_.add(c);
		}
	}
}