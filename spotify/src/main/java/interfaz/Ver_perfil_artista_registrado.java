package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_artista_registrado extends Ver_perfil {
//	private Button _crear_AnuncioB;
	public Cabecera_artista_registrado _cabecera_artista_registrado;
	public Crear_anuncio _crear_anuncio;
	public Modificar_perfil__artista_ _modificar_perfil__artista_;
	
	public Ver_perfil_artista_registrado(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getButton_crearAnuncio().setVisible(true);
		
		this.getButton_modificarPerfil().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_perfil__artista_ = new Modificar_perfil__artista_(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_modificar_perfil__artista_);
			}
		});
		
		this.getButton_crearAnuncio().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_crear_anuncio = new Crear_anuncio(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_crear_anuncio);
			}
		});
		
	}
	
}