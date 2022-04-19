package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_de_reproduccion_propia;

public class Lista_de_reproduccion_propia extends VistaLista_de_reproduccion_propia{
//	private Button _eliminar_listaB;
//	private Button _modificarB;
//	private Button _verB;
//	private Label _nombreL;
//	private Image _imagenI;
	public Listas_de_reproduccion_del_perfil _listas_de_reproduccion_del_perfil;
	public Modificar_lista _modificar_lista;
	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	public Eliminar_lista _eliminar_lista;
	
	public Lista_de_reproduccion_propia(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_editar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_lista = new Modificar_lista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_modificar_lista);
			}
		});
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_lista_de_reproduccion_propia);
				
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_lista = new Eliminar_lista(cuerpo, popUp);
				popUp.add(_eliminar_lista);
				popUp.open();				
			}
		});

	}
	
}