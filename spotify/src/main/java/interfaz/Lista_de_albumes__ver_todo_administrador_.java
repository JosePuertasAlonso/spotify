package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Album__lista_administrador_;
import vistas.VistaLista_de_albumes_ver_todo_administrador;

public class Lista_de_albumes__ver_todo_administrador_ extends VistaLista_de_albumes_ver_todo_administrador{
	public Ver_todos_los_albumes_buscados__administrador_ _ver_todos_los_albumes_buscados__administrador_;
	public Vector<Album__lista_administrador_> _list_Album__lista_administrador_ = new Vector<Album__lista_administrador_>();

	private VerticalLayout cuerpo;
	
	public Lista_de_albumes__ver_todo_administrador_(VerticalLayout cuerpo, basededatos.Album[] albumesBuscados) {
		
		this.cuerpo = cuerpo;
		
		Album__lista_administrador_ a;
		for(int i = 0; i < albumesBuscados.length; i++) {
			a = new Album__lista_administrador_(cuerpo, albumesBuscados[i]);
			_list_Album__lista_administrador_.add(a);
		}
		
		for(int i = 0; i < _list_Album__lista_administrador_.size(); i++) {
			this.getvL_contenedorAlbumesAdministrador().as(VerticalLayout.class).add(_list_Album__lista_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}


}