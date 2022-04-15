package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_album extends Lista {
//	private Label _fecha_PublicacionL;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	public Album__bloques_ _album__bloques_;
	public Canciones_del_album _canciones_del_album;
	
	public Ver_album() {
		_canciones_del_album = new Canciones_del_album();
		this.getvL_cancionesDeListaAlbumListaeliminar().as(VerticalLayout.class).add(_canciones_del_album);
		this.gethL_tituloAceptar().setVisible(false);
		this.getButton_modificar().setVisible(false);
		this.getButton_guardar().setVisible(false);
		this.getButton_eliminar().setVisible(false);
		this.getLabel_fechaPublicacion().setVisible(false);
		this.getButton_anadirCancion().setVisible(false);
		this.getButton_compartir().setVisible(false);
	}
}