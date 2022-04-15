package interfaz;

public class Modificar_album extends Anadir_nuevo_album {
	public Album__Administrador_ _album__Administrador_;
	
	public Modificar_album() {
		super();
		this.getLabel_anadeNuevoAlbum().setText("Modifica el álbum");
		this.getButton_anadirAlbum().setText("MODIFICAR ÁLBUM");
	}
}