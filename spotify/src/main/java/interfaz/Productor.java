package interfaz;

import vistas.VistaProductor;

public class Productor extends VistaProductor{
//	private Label _nombreL;
	public Productores _productores;
	
	public Productor(String productor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		if(productor == null) {
			this.getLabel_productor().setText("-");
		} else {
			this.getLabel_productor().setText(productor);
		}
	}
	
}