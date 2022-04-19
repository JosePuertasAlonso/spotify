package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPerfil_administrador;

public class Perfil_administrador extends VistaPerfil_administrador{
//	private Label _nombreL;
//	private Image _imagenI;
//	private Button _eliminarB;
	public Eliminar_perfil _eliminar_perfil;
	
	public Perfil_administrador(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_perfil = new Eliminar_perfil(cuerpo, popUp);
				popUp.add(_eliminar_perfil);
				popUp.open();
			}
		});
	}
}