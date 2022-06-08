package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Artista__bloque_ extends Artista_ {
	public Lista_de_artistas__ver_todo_ _lista_de_artistas__ver_todo_;
	public Artistas_similares _artistas_similares;
	public Ver_perfil_artista _ver_perfil_artista;
	
	public Artista__bloque_(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		super(cuerpo, minireproductor, artista);
		
		this.getStyle().set("margin-right", "var(--lumo-space-m)");
		this.getStyle().set("min-width", "213px");
		this.getStyle().set("max-width", "15.5%");
		
		this.getButton_imagen().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_perfil_artista = new Ver_perfil_artista(cuerpo, minireproductor, artista);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_perfil_artista);
				
			}
		});
	}
}