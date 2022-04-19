package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminar_album;

public class Eliminar_album extends VistaEliminar_album{
//	private Button _confirmar_eliminar_albumB;
//	private Label _tituloL;
//	private Label _atencionL;
//	private Button _cancelarB;
	public Album__Administrador_ _album__Administrador_;
	
	public Eliminar_album(VerticalLayout cuerpo, Dialog popUp) {
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

	public void Confirmar_eliminar_album() {
		throw new UnsupportedOperationException();
	}
}