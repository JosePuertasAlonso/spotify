package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Album__bloques_;
import vistas.VistaAlbumes_del_artista;

public class Albumes_del_artista extends VistaAlbumes_del_artista{
	public Ver_perfil_artista _ver_perfil_artista;
	public Vector<Album__bloques_> _list_Album__bloques_ = new Vector<Album__bloques_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	private basededatos.Artista artista;
	
	public Albumes_del_artista(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		this.artista = artista;
		
		cargarAlbumesArtista();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorAlbumes();
		for(int i = 0; i < _list_Album__bloques_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_fondo().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Album__bloques_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarAlbumesArtista() {
		basededatos.Album[] albumes = artista.es_autor_de.toArray();
		Album__bloques_ a;
		for(int i = 0; i < albumes.length; i++) {
			a = new Album__bloques_(cuerpo, minireproductor, albumes[i]);
			_list_Album__bloques_.add(a);
		}
	}
	
}