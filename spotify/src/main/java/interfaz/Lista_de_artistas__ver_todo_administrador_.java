package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Artista__lista_administrador_;
import vistas.VistaLista_de_artistas_ver_todo_administrador;

public class Lista_de_artistas__ver_todo_administrador_ extends VistaLista_de_artistas_ver_todo_administrador{
	public Ver_todos_los_artistas_buscados__administrador_ _ver_todos_los_artistas_buscados__administrador_;
	public Vector<Artista__lista_administrador_> _list_Artista__lista_administrador_ = new Vector<Artista__lista_administrador_>();

	private VerticalLayout cuerpo;
	
	public Lista_de_artistas__ver_todo_administrador_(VerticalLayout cuerpo, basededatos.Artista[] artistas_buscados) {
		
		this.cuerpo = cuerpo;
		
		Artista__lista_administrador_ a;
		for(int i = 0; i < artistas_buscados.length; i++) {
			a = new Artista__lista_administrador_(cuerpo, artistas_buscados[i]);
			a.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Artista__lista_administrador_.add(a);
		}
		
		for(int i = 0; i < _list_Artista__lista_administrador_.size(); i++) {
			this.getvL_contenedorArtistaAdministrador().as(VerticalLayout.class).add(_list_Artista__lista_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}


}