package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Album__lista_administrador_ extends Album__Administrador_ {
	public Lista_de_albumes__ver_todo_administrador_ _lista_de_albumes__ver_todo_administrador_;
	
	public Album__lista_administrador_(VerticalLayout cuerpo, basededatos.Album album) {
		super(cuerpo, album);
	}
}