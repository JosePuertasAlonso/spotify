package interfaz;

import spotify.GestorUsuarios;
import vistas.VistaCancion_de_lista_a_eliminar;

public class Cancion_de_lista_a_eliminar extends VistaCancion_de_lista_a_eliminar{
//	private Button _eliminar_cancion_de_listaB;
//	private Label _nombreL;
//	private Image _imagenI;
//	private Label _artista_s_L;
	public Canciones_de_lista_a_eliminar _canciones_de_lista_a_eliminar;
	
	public Cancion_de_lista_a_eliminar(basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		//Titulo cancion
		this.getLabel_titulo().setText(cancion.getTitulo());
		//Artistas cancion
		basededatos.Artista[] artistasCancion = cancion.realizada_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < artistasCancion.length; j++) {
			if(j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", "; 
			}
		}
		this.getLabel_artista().setText(cadenaArtistas);
		//Foto cancion
		this.getImagen().setSrc(cancion.getImagen());
		
	}

	public void Eliminar_cancion_de_lista() {
		throw new UnsupportedOperationException();
	}
}