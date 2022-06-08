package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import interfaz.Artista__bloque_;
import vistas.VistaArtistas_similares;

public class Artistas_similares extends VistaArtistas_similares{
	public Ver_perfil_artista _ver_perfil_artista;
	public Vector<Artista__bloque_> _list_Artista__bloque_ = new Vector<Artista__bloque_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	private basededatos.Artista artista;
	
	private iComun _iComun = new BDPrincipal();
	
	public Artistas_similares(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		this.artista = artista;
		
		cargarArtistasSimilares();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorArtistas();
		for(int i = 0; i < _list_Artista__bloque_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_fondo().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Artista__bloque_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarArtistasSimilares() {
		basededatos.Artista[] artistasSimilares = _iComun.cargar_artistas_similares(artista.getLogin());
		if(artistasSimilares != null) {
			Artista__bloque_ a;
			for(int i = 0; i < artistasSimilares.length; i++) {
				a = new Artista__bloque_(cuerpo, minireproductor, artistasSimilares[i]);
				_list_Artista__bloque_.add(a);
			}
		}
	}
		
	
}