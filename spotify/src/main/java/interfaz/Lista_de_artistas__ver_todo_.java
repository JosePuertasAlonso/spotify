package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Artista__bloque_;
import vistas.VistaLista_de_artistas_ver_todo;

public class Lista_de_artistas__ver_todo_ extends VistaLista_de_artistas_ver_todo{
	public Ver_todos_los_artistas_buscados _ver_todos_los_artistas_buscados;
	public Vector<Artista__bloque_> _list_Artista__bloque_ = new Vector<Artista__bloque_>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	public Lista_de_artistas__ver_todo_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarArtistasVerTodo();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorArtista();
		for(int i = 0; i < _list_Artista__bloque_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_filas().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Artista__bloque_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarArtistasVerTodo() {
		Artista__bloque_ a;
		for(int i = 0; i < 25; i++) {
			a = new Artista__bloque_(cuerpo, minireproductor);
			a.getStyle().set("margin-right", "var(--lumo-space-m)");
			a.getStyle().set("max-width", "15.5%");
			_list_Artista__bloque_.add(a);
		}
	}
	
}