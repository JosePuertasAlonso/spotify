package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminar_lista;

public class Eliminar_lista extends VistaEliminar_lista{
//	private Label _tituloL;
//	private Label _atencionL;
//	private Button _cancelarB;
//	private Button _confirmar_eliminar_listaB;
	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
	public Modificar_lista _modificar_lista;
	
	public Eliminar_lista(VerticalLayout cuerpo, Dialog popUp) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButtonCancelar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				
			}
		});
		
	}

	public void Confirmar_eliminar_lista() {
		throw new UnsupportedOperationException();
	}
}