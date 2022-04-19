package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_perfil_usuario;

public class Ver_perfil_usuario extends VistaVer_perfil_usuario{
//	private Button _seguir_usuarioB;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Image _imagenI;
//	private Label _listasL;
	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
	public Listas_del_usuario _listas_del_usuario;
	
	public Ver_perfil_usuario(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_listas_del_usuario = new Listas_del_usuario(cuerpo, minireproductor);
		this.getvL_listasDelUsuario().as(VerticalLayout.class).add(_listas_del_usuario);
		
		this.getButton_siguiendo().setVisible(false);
		
		this.getButton_seguir().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				getButton_seguir().setVisible(false);
				getButton_siguiendo().setVisible(true);
				
			}
		});
		
		
		this.getButton_siguiendo().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				getButton_siguiendo().setVisible(false);
				getButton_seguir().setVisible(true);
				
			}
		});
		
	}

	public void Seguir_usuario() {
		throw new UnsupportedOperationException();
	}
}