package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_album extends Anadir_nuevo_album {
	public Album__Administrador_ _album__Administrador_;
	
	public Modificar_album(VerticalLayout cuerpo) {
		super(cuerpo);
		this.getLabel_anadeNuevoAlbum().setText("Modifica el álbum");
		this.getButton_anadirAlbum().setText("MODIFICAR ÁLBUM");
	}
}