package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;

public class Ver_lista_de_reproduccion_ajena extends Lista_de_reproduccion {
//	private Button _guardar_listaB;
	public Lista_de_reproduccion__lista_ _lista_de_reproduccion__lista_;
	public Lista_de_reproduccion__bloque_ _lista_de_reproduccion__bloque_;
	public Ver_perfil_usuario _ver_perfil_usuario;
	
	private iComun _iComun = new BDPrincipal();
	private basededatos.Lista lista;
	
	public Ver_lista_de_reproduccion_ajena(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Lista lista) {
		super(cuerpo, minireproductor, lista);
		this.lista = lista;
		this.getLabel_creador().getStyle().set("cursor", "pointer");
		this.getButton_guardar().setVisible(true);
		
		this.gethL_labelCreador().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				_ver_perfil_usuario = new Ver_perfil_usuario(cuerpo, minireproductor, ((basededatos.Lista_de_reproduccion)lista).getEs_gestionada_por());
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_perfil_usuario);
			}
		});
		
		this.getButton_guardar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				if(lista instanceof basededatos.Lista_de_reproduccion) {
					Guardar_lista();
				}
			}
		});
	}

	public void Guardar_lista() {
		_iComun.guardar_lista((basededatos.Lista_de_reproduccion)this.lista, GestorUsuarios.login_u);
	}
}