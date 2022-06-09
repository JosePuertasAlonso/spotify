package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Artista__lista_administrador_ extends Artista__Administrador_ {
	public Lista_de_artistas__ver_todo_administrador_ _lista_de_artistas__ver_todo_administrador_;
	
	public Artista__lista_administrador_(VerticalLayout cuerpo, basededatos.Artista artista) {
		super(cuerpo, artista);
	}
}