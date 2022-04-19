package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todos_los_artistas_buscados;

public class Ver_todos_los_artistas_buscados extends VistaVer_todos_los_artistas_buscados {
//	private Label _artistasL;
	public Buscador _buscador;
	public Lista_de_artistas__ver_todo_ _lista_de_artistas__ver_todo_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todos_los_artistas_buscados(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		_lista_de_artistas__ver_todo_ = new Lista_de_artistas__ver_todo_(cuerpo, minireproductor);
		this.getvL_cuerpo().as(VerticalLayout.class).add(_lista_de_artistas__ver_todo_);
		
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_buscador = new Buscador(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_buscador);
			}
		});
		
	}
	
}