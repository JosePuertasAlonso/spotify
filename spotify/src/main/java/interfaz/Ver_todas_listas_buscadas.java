package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_todas_listas_buscadas;

public class Ver_todas_listas_buscadas extends VistaVer_todas_listas_buscadas {
//	private Label _listasL;
	public Buscador _buscador;
	public Listas_de_reproduccion__ver_todo_ _listas_de_reproduccion__ver_todo_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todas_listas_buscadas(VerticalLayout cuerpo, HorizontalLayout minireproductor, String cadenaBusqueda, basededatos.Lista_de_reproduccion[] listasBuscadas) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		_listas_de_reproduccion__ver_todo_ = new Listas_de_reproduccion__ver_todo_(cuerpo, minireproductor, listasBuscadas);
		this.getvL_cuerpo().as(VerticalLayout.class).add(_listas_de_reproduccion__ver_todo_);
		
		this.getLabel_todasLasListasPara().setText("Todas las listas para:  \" " + cadenaBusqueda + " \"");
		
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_buscador = new Buscador(cuerpo, minireproductor, _barra_buscador.getInput_buscar().getValue());
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_buscador);
			}
		});
		
	}
	
}