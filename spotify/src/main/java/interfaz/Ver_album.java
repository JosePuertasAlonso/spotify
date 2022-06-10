package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_album extends Lista {
//	private Label _fecha_PublicacionL;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	public Album__bloques_ _album__bloques_;
	public Canciones_del_album _canciones_del_album;
	
	public Ver_album(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Album alb) {
		super(cuerpo, minireproductor, alb);
		_canciones_del_album = new Canciones_del_album(alb);
		this.getvL_cancionesDeListaAlbumListaeliminar().as(VerticalLayout.class).add(_canciones_del_album);
		this.gethL_tituloAceptar().setVisible(false);
		this.getButton_modificar().setVisible(false);
		this.getButton_guardar().setVisible(false);
		this.getButton_eliminar().setVisible(false);
		this.getLabel_fechaPublicacion().setVisible(false);
		this.getButton_anadirCancion().setVisible(false);
		this.getButton_compartir().setVisible(false);
		
		//Artistas cancion
		basededatos.Artista[] artistasCancion = ((basededatos.Album) this.lista).es_creado_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < artistasCancion.length; j++) {
			if(j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", "; 
			}
		}
		this.getLabel_creador().setText(cadenaArtistas);
	}
}