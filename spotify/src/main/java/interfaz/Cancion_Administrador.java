package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion_administrador;

public class Cancion_Administrador extends VistaCancion_administrador {
//	private CheckBox _establecer_ultimo_exitoCB;
//	private Button _eliminarB;
//	private Button _modificarB;
	public Modificar_cancion _modificar_cancion;
	public Eliminar_cancion _eliminar_cancion;
	
	public Cancion_Administrador(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_editar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_cancion = new Modificar_cancion(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_modificar_cancion);
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_cancion = new Eliminar_cancion(cuerpo, popUp);
				popUp.add(_eliminar_cancion);
				popUp.open();
			}
		});
		
	}

	public void Establecer_ultimo_exito() {
		throw new UnsupportedOperationException();
	}
}