package interfaz;

import vistas.VistaLista_del_artista;

public class Lista_del_artista extends VistaLista_del_artista {
	public Listas_de_reproduccion_del_artista _lista_de_reproduccion_del_artista;
	
	public Lista_del_artista() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
}