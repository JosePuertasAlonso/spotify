package interfaz;

import com.vaadin.flow.component.html.NativeButton;

import vistas.VistaCabecera;

public class Cabecera extends VistaCabecera{
	public Administrador _administrador;
	public Logo _logo;
	
	public Cabecera() {
		_logo = new Logo();
    	getStyle().set("margin", "0px");
		this.gethL_Logo().add(_logo);
	}
	
	
	
	
	
	
	
}