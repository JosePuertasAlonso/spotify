package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion__bloque_administrador_;
import vistas.VistaLista_de_canciones_buscadas_administrador;

public class Lista_de_canciones_buscadas__administrador_ extends VistaLista_de_canciones_buscadas_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Cancion__bloque_administrador_> _list_Cancion__bloque_administrador_ = new Vector<Cancion__bloque_administrador_>();

	private VerticalLayout cuerpo;
	
	public Lista_de_canciones_buscadas__administrador_(VerticalLayout cuerpo) {
		
		this.cuerpo = cuerpo;
		
		cargarCancionesBuscadasAdmin();
		
		for(int i = 0; i < _list_Cancion__bloque_administrador_.size(); i++) {
			this.getvL_contenedorCancionAdministrador().as(VerticalLayout.class).add(_list_Cancion__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarCancionesBuscadasAdmin() {
		
		Cancion__bloque_administrador_ c;
		
		for(int i = 0; i < 6; i++) {
			c = new Cancion__bloque_administrador_(cuerpo);
			c.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Cancion__bloque_administrador_.add(c);
		}
		
	}


}