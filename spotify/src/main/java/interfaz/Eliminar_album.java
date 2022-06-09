package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaEliminar_album;

public class Eliminar_album extends VistaEliminar_album{
//	private Button _confirmar_eliminar_albumB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Button _cancelarB;
	public Album__Administrador_ _album__Administrador_;
	
	private basededatos.Album album;
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	public Eliminar_album(VerticalLayout cuerpo, Dialog popUp, basededatos.Album album) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.album = album;
		
		this.getLabel_atencion().setText("¡Atención! va a elimiar el álbum \" " + this.album.getNombre() + " \"");

		
		this.getButton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
		
		this.getButton_siEliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Confirmar_eliminar_album();
				popUp.close();
				GestorUsuarios.administrador();
			}
		});
	}

	public void Confirmar_eliminar_album() {
		_iAdministrador.eliminar_album(this.album.getId_Lista());
	}
}