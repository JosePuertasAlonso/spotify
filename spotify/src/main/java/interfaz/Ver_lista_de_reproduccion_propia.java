package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_lista_de_reproduccion_propia extends Lista_de_reproduccion {
//	private Button _modificar_listaB;
	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
	public Modificar_lista _modificar_lista;
	
	public Ver_lista_de_reproduccion_propia(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getButton_modificar().setVisible(true);
		
		this.getButton_modificar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_lista = new Modificar_lista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_modificar_lista);
			}
		});
	}
	
}