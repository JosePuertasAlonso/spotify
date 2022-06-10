package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Anadir_canciones_a_lista extends Buscar_canciones_a_anadir {
	//private Label _tituloL;
	public Modificar_lista _modificar_lista;
	public Anadir_canciones_a_lista _anadir_canciones_a_lista;
	
	public Anadir_canciones_a_lista(VerticalLayout cuerpo, HorizontalLayout minireproductor, String cadenaBusqueda ,basededatos.Lista lista) {
		super(cadenaBusqueda, lista);
		this.getLabel_anadeCancion().setVisible(true);
		this.getLabel_anadeCancion().setText("Añade una canción a la lista  \" " + lista.getNombre() + " \"");
		this.getLabel_todasCancionesPara().setText("Todas las canciones para  \" \"");
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_canciones_a_lista = new Anadir_canciones_a_lista(cuerpo, minireproductor, _barra_buscador.getInput_buscar().getValue(), lista);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_anadir_canciones_a_lista);
			}
		});
		
		this.getButton_volver().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				if(GestorUsuarios._u instanceof basededatos.Artista) {
					GestorUsuarios.artista(false);
				} else {
					GestorUsuarios.usuario(false);
				}
			}
		});
	}
	
}