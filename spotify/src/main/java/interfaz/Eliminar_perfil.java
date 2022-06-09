package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_registrado;
import basededatos.Usuario_registradoCriteria;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaEliminar_perfil;

public class Eliminar_perfil extends VistaEliminar_perfil{
//	private Button _confirmar_eliminar_perfilB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Label _desea_ContinuarL;
//	private Button _cancelarB;
	public Perfil_administrador _perfil_administrador;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	private basededatos.Usuario_registrado usuario;
	
	public Eliminar_perfil(VerticalLayout cuerpo, Dialog popUp, basededatos.Usuario_registrado usuario) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.usuario = usuario;
		
		this.getButton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
		
		this.getButton_siEliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Confirmar_eliminar_perfil();
				popUp.close();
				GestorUsuarios.administrador();
			}
		});
	}

	public void Confirmar_eliminar_perfil() {
		_iAdministrador.eliminar_perfil_administrador(this.usuario.getLogin());
	}
}