package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Anadir_cancion_al_album extends Buscar_canciones_a_anadir {
//	private Label _tituloL;
//	private Button _nueva_CancionB;
	public Anadir_nuevo_album _anadir_nuevo_album;
	public Anadir_nueva_cancion _anadir_nueva_cancion;
	
	public Anadir_cancion_al_album(VerticalLayout cuerpo, String cadenaBusqueda, basededatos.Lista lista) {
		super(cadenaBusqueda, lista);
		this.getLabel_anadeCancion().setText("Añade una canción al album \"nombre album\"");
		this.getLabel_anadeCancion().setVisible(true);
		this.getButton_nuevaCancion().setVisible(true);
		
		this.getButton_nuevaCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_nueva_cancion = new Anadir_nueva_cancion(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_anadir_nueva_cancion);
			}
		});
		
	}
}