package interfaz;

import vistas.VistaCompositor;

public class Compositor extends VistaCompositor{
//	private Label _nombreL;
	public Compositores _compositores;
	
	public Compositor() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}
	
}