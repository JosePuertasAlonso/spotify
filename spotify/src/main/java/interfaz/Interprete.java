package interfaz;

import vistas.VistaInterprete;

public class Interprete extends VistaInterprete{
//	private Label _nombreL;
	public Interpretes _interpretes;
	
	public Interprete(String interprete) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		if(interprete == null) {
			this.getLabel_interprete().setText("-");
		} else {
			this.getLabel_interprete().setText(interprete);
		}
	}
	
}