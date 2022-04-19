package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_lista_de_reproduccion_ajena extends Lista_de_reproduccion {
//	private Button _guardar_listaB;
	public Lista_de_reproduccion__lista_ _lista_de_reproduccion__lista_;
	public Lista_de_reproduccion__bloque_ _lista_de_reproduccion__bloque_;
	public Ver_perfil_usuario _ver_perfil_usuario;
	
	public Ver_lista_de_reproduccion_ajena(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getLabel_creador().getStyle().set("cursor", "pointer");
		this.getButton_guardar().setVisible(true);
		
		this.gethL_labelCreador().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				_ver_perfil_usuario = new Ver_perfil_usuario(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_perfil_usuario);
			}
		});
	}

	public void Guardar_lista() {
		throw new UnsupportedOperationException();
	}
}