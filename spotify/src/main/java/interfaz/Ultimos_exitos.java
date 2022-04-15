package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Style;

import interfaz.Cancion__bloque_sin_opciones_;
import vistas.VistaUltimos_exitos;

public class Ultimos_exitos extends VistaUltimos_exitos{
//	private Label _tituloL;
	public Cibernauta_no_registrado _cibernauta_no_registrado;
	public Vector<Cancion__bloque_sin_opciones_> _list_Cancion__bloque_sin_opciones_ = new Vector<Cancion__bloque_sin_opciones_>();
	
	public Ultimos_exitos() {
		
		cargarUltimos_exitos();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorCanciones();
		for(int i = 0; i < _list_Cancion__bloque_sin_opciones_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_filasCanciones().add(layout);
				cont = 0;
			}
			
			layout.add(_list_Cancion__bloque_sin_opciones_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarUltimos_exitos() {
		Cancion__bloque_sin_opciones_ c;
		for(int i = 0; i < 25; i++) {
			c = new Cancion__bloque_sin_opciones_();
			c.getStyle().set("margin-right", "var(--lumo-space-m)");
			c.getStyle().set("max-width", "15.5%");
			_list_Cancion__bloque_sin_opciones_.add(c);
		}
	}
	
}