package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaEliminar_artista;

public class Eliminar_artista extends VistaEliminar_artista{
//	private event _confirmar_eliminar_artistaB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Label _desea_ContinualL;
//	private Button _cancelarB;
	public Artista__Administrador_ _artista__Administrador_;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	private basededatos.Artista artista;
	
	public Eliminar_artista(VerticalLayout cuerpo, Dialog popUp, basededatos.Artista artista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.artista = artista;
		
		this.getButton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
		
		this.getButton_siEliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Confirmar_eliminar_artista();
				popUp.close();
				GestorUsuarios.administrador();
			}
		});
	}

	public void Confirmar_eliminar_artista() {
		_iAdministrador.eliminar_perfil_administrador(this.artista.getLogin());
	}
}