package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Perfil__bloque_administrador_;
import vistas.VistaLista_de_perfiles_buscados_administrador;

public class Lista_de_perfiles_buscados__administrador_ extends VistaLista_de_perfiles_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Perfil__bloque_administrador_> _list_Perfil__bloque_administrador_ = new Vector<Perfil__bloque_administrador_>();

	public Lista_de_perfiles_buscados__administrador_() {
		
		cargarPerfilesBuscadosAdmin();
		
		for(int i = 0; i < _list_Perfil__bloque_administrador_.size(); i++) {
			this.getvL_contenedorPerfilAdministrador().as(VerticalLayout.class).add(_list_Perfil__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarPerfilesBuscadosAdmin() {
		
		Perfil__bloque_administrador_ p;
		
		for(int i = 0; i < 6; i++) {
			p = new Perfil__bloque_administrador_();
			p.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Perfil__bloque_administrador_.add(p);
		}
		
	}

}