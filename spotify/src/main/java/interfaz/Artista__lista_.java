package interfaz;

import vistas.VistaArtista_lista;

public class Artista__lista_ extends VistaArtista_lista {
	public Lista_de_artistas_buscados _lista_de_artistas_buscados;
	public Ver_perfil_artista _ver_perfil_artista;
	
	public Artista__lista_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
}