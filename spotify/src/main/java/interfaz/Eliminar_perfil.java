package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminar_perfil;

public class Eliminar_perfil extends VistaEliminar_perfil{
//	private Button _confirmar_eliminar_perfilB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Label _desea_ContinuarL;
//	private Button _cancelarB;
	public Perfil_administrador _perfil_administrador;
	
	public Eliminar_perfil(VerticalLayout cuerpo, Dialog popUp) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_cancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
	}

	public void Confirmar_eliminar_perfil() {
		throw new UnsupportedOperationException();
	}
}