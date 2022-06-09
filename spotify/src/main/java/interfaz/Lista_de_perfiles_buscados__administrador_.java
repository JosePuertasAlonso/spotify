package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Perfil__bloque_administrador_;
import vistas.VistaLista_de_perfiles_buscados_administrador;

public class Lista_de_perfiles_buscados__administrador_ extends VistaLista_de_perfiles_buscados_administrador{
	public Buscador_administrador _buscador_administrador;
	public Vector<Perfil__bloque_administrador_> _list_Perfil__bloque_administrador_ = new Vector<Perfil__bloque_administrador_>();

	private VerticalLayout cuerpo;
	private String cadena_busqueda;
	
	public basededatos.Usuario_registrado[] usuarios_buscados;

	iAdministrador _iAdministrador = new BDPrincipal();
	
	public Lista_de_perfiles_buscados__administrador_(VerticalLayout cuerpo, String cadenaBusqueda) {
		
		this.cuerpo = cuerpo;
		this.cadena_busqueda = cadenaBusqueda;
		
		buscar_perfiles_administrador();
		
		for(int i = 0; i < _list_Perfil__bloque_administrador_.size(); i++) {
			this.getvL_contenedorPerfilAdministrador().as(VerticalLayout.class).add(_list_Perfil__bloque_administrador_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void buscar_perfiles_administrador() {
		basededatos.Usuario_registrado[] usuarios = _iAdministrador.buscar_perfiles_administrador(cadena_busqueda);
		this.usuarios_buscados = usuarios;
		Perfil__bloque_administrador_ p;
		
		for(int i = 0; i < usuarios.length; i++) {
			if(usuarios[i] instanceof basededatos.Artista) {
				continue;
			} else {
				p = new Perfil__bloque_administrador_(cuerpo, usuarios[i]);
				_list_Perfil__bloque_administrador_.add(p);
			}
		}
		
	}

}