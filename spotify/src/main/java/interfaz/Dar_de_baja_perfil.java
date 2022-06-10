package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaDar_de_baja_perfil;

public class Dar_de_baja_perfil extends VistaDar_de_baja_perfil{
//	private Button _confirmar_dar_de_baja_perfilB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Label _desea_ContinuarL;
//	private Label _cancelarL;
	public Ver_perfil _ver_perfil;
	
	private iComun _iComun = new BDPrincipal();
	
	public Dar_de_baja_perfil(VerticalLayout cuerpo, Dialog popUp) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_noVolver().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
		
		this.getButton_siEliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				Confirmar_dar_de_baja_perfil();
				GestorUsuarios.cibernauta(true);
			}
		});
	}

	public void Confirmar_dar_de_baja_perfil() {
		_iComun.eliminar_perfil(GestorUsuarios.login_u);
	}
}