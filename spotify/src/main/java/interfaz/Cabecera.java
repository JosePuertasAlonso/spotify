package interfaz;

import com.vaadin.flow.component.html.NativeButton;

import vistas.VistaCabecera;

public class Cabecera extends VistaCabecera{
	public Administrador _administrador;
	public Logo _logo;
	
	public Cabecera() {
		_logo = new Logo();
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.gethL_Logo().add(_logo);
	}
	
	
	
	
	
	
	
}