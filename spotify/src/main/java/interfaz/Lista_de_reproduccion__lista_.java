package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaLista_de_reproduccion_lista;

public class Lista_de_reproduccion__lista_ extends VistaLista_de_reproduccion_lista {
	public Listas_de_reproduccion_buscadas _listas_de_reproduccion_buscadas;
	public Listas_del_usuario _listas_del_usuario;
	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
	
	private basededatos.Lista_de_reproduccion lista;
	private iComun _iComun = new BDPrincipal();
	
	public Lista_de_reproduccion__lista_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Lista_de_reproduccion lista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		this.lista = lista;

		//Nombre lista
		this.getLabel_titulo().setText(lista.getNombre());
		//Creador lista
		this.getLabel_creador().setText(lista.getEs_gestionada_por().getNick());
		//Foto lista
		this.getImagen().setSrc(lista.getImagen());
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_lista_de_reproduccion_ajena = new Ver_lista_de_reproduccion_ajena(cuerpo, minireproductor, lista);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_lista_de_reproduccion_ajena);
				
			}
		});
		
		this.getButton_guardar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				guardar_lista();
			}
		});
	}
	
	public void guardar_lista() {
		_iComun.guardar_lista(lista, GestorUsuarios.login_u);
	}
}