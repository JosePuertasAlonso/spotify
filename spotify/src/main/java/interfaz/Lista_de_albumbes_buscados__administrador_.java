package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Album__bloque_administrador_;
import vistas.VistaLista_de_albumes_buscados_administrador;

public class Lista_de_albumbes_buscados__administrador_ extends VistaLista_de_albumes_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Album__bloque_administrador_> _list_Album__bloque_administrador_ = new Vector<Album__bloque_administrador_>();

	public Lista_de_albumbes_buscados__administrador_() {
		
		cargarAlbumesBuscadosAdmin();
		
		for(int i = 0; i < _list_Album__bloque_administrador_.size(); i++) {
			this.getvL_contenedorAlbumesAdministrador().as(VerticalLayout.class).add(_list_Album__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarAlbumesBuscadosAdmin() {
		
		Album__bloque_administrador_ a;
		
		for(int i = 0; i < 6; i++) {
			a = new Album__bloque_administrador_();
			a.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Album__bloque_administrador_.add(a);
		}
		
	}

}