package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion__bloque_;
import vistas.VistaLista_de_reproduccion_ver_todo;

public class Listas_de_reproduccion__ver_todo_ extends VistaLista_de_reproduccion_ver_todo{
	public Ver_todas_listas_buscadas _ver_todas_listas_buscadas;
	public Vector<Lista_de_reproduccion__bloque_> _list_Lista_de_reproduccion__bloque_ = new Vector<Lista_de_reproduccion__bloque_>();

	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;

	public Listas_de_reproduccion__ver_todo_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarListasVerTodo();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorListaReproduccionBloque();
		for(int i = 0; i < _list_Lista_de_reproduccion__bloque_.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_fondo().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Lista_de_reproduccion__bloque_.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarListasVerTodo() {
		Lista_de_reproduccion__bloque_ l;
		for(int i = 0; i < 25; i++) {
			l = new Lista_de_reproduccion__bloque_(cuerpo, minireproductor);
			l.getStyle().set("margin-right", "var(--lumo-space-m)");
			l.getStyle().set("max-width", "15.5%");
			_list_Lista_de_reproduccion__bloque_.add(l);
		}
	}


}