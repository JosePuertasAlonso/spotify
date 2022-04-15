package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion__lista_;
import vistas.VistaListas_del_usuario;

public class Listas_del_usuario extends VistaListas_del_usuario{
	public Ver_perfil_usuario _ver_perfil_usuario;
	public Vector<Lista_de_reproduccion__lista_> _list_Lista_de_reproduccion__lista_ = new Vector<Lista_de_reproduccion__lista_>();


	public Listas_del_usuario() {
		
		cargarListasUsuario();
		
		for(int i = 0; i < _list_Lista_de_reproduccion__lista_.size(); i++) {
			this.getvL_contenedorListaReproduccionLista().as(VerticalLayout.class).add(_list_Lista_de_reproduccion__lista_.get(i));
		}
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
	}
	
	public void cargarListasUsuario() {
		
		Lista_de_reproduccion__lista_ l;
		
		for(int i = 0; i < 6; i++) {
			l = new Lista_de_reproduccion__lista_();
			l.getStyle().set("margin-top", "var(--lumo-space-m)");
			_list_Lista_de_reproduccion__lista_.add(l);
		}
		
	}

}