package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Perfil__lista_administrador_;
import vistas.VistaLista_de_perfiles_ver_todo_administrador;

public class Lista_de_perfiles__ver_todo_administrador_ extends VistaLista_de_perfiles_ver_todo_administrador{
	public Ver_todos_perfiles_buscados__administrador_ _ver_todos_perfiles_buscados__administrador_;
	public Vector<Perfil__lista_administrador_> _list_Perfil__lista_administrador_ = new Vector<Perfil__lista_administrador_>();

	private VerticalLayout cuerpo;
	
	public Lista_de_perfiles__ver_todo_administrador_(VerticalLayout cuerpo, basededatos.Usuario_registrado[] usuarios_buscados) {
		
		this.cuerpo = cuerpo;
		
		Perfil__lista_administrador_ p;
		for(int i = 0; i < usuarios_buscados.length; i++) {
			p = new Perfil__lista_administrador_(cuerpo, usuarios_buscados[i]);
			_list_Perfil__lista_administrador_.add(p);
		}
		
		for(int i = 0; i < _list_Perfil__lista_administrador_.size(); i++) {
			this.getvL_contenedorPerfilAdministrador().as(VerticalLayout.class).add(_list_Perfil__lista_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}

}