package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaEliminar_cancion;

public class Eliminar_cancion extends VistaEliminar_cancion{
//	private Button _confirmar_eliminar_cancionB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Label _desea_ContinualL;
//	private Button _cancelarB;
	public Cancion_Administrador _cancion_Administrador;
	
	private basededatos.Cancion cancion;
	private iAdministrador _iADAdministrador = new BDPrincipal();
	
	public Eliminar_cancion(VerticalLayout cuerpo, Dialog popUp, basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.cancion = cancion;
		
		this.getLabel_atencion().setText("¡Atención! va a elimiar la canción \" " + this.cancion.getTitulo() + " \"");
		
		this.getButton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
			}
		});
		
		this.getButton_siEliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Confirmar_eliminar_cancion();
				popUp.close();
				GestorUsuarios.administrador();
			}
		});
	}

	public void Confirmar_eliminar_cancion() {
		_iADAdministrador.eliminar_cancion(cancion.getId_Cancion());
	}
}