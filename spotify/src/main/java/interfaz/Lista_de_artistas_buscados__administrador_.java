package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Artista__bloque_administrador_;
import vistas.VistaLista_de_artistas_buscados_administrador;

public class Lista_de_artistas_buscados__administrador_ extends VistaLista_de_artistas_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Artista__bloque_administrador_> _list_Artista__bloque_administrador_ = new Vector<Artista__bloque_administrador_>();

	public Lista_de_artistas_buscados__administrador_() {
		
		cargarArtistasBuscadosAdmin();
		
		for(int i = 0; i < _list_Artista__bloque_administrador_.size(); i++) {
			this.getvL_contenedorArtistasAdministrador().as(VerticalLayout.class).add(_list_Artista__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarArtistasBuscadosAdmin() {
		
		Artista__bloque_administrador_ a;
		
		for(int i = 0; i < 6; i++) {
			a = new Artista__bloque_administrador_();
			a.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Artista__bloque_administrador_.add(a);
		}
		
	}

}