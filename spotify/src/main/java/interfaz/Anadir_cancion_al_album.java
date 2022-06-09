package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;

public class Anadir_cancion_al_album extends Buscar_canciones_a_anadir {
//	private Label _tituloL;
//	private Button _nueva_CancionB;
	public Anadir_nuevo_album _anadir_nuevo_album;
	public Anadir_nueva_cancion _anadir_nueva_cancion;
	public Anadir_cancion_al_album _anadir_cancion_al_album;
	
	public Anadir_cancion_al_album(VerticalLayout cuerpo, String cadenaBusqueda, basededatos.Lista lista) {
		super(cadenaBusqueda, lista);
		String nombreAlbum = lista.getNombre();
		this.getLabel_anadeCancion().setText("Añade una canción al album \" "+ nombreAlbum + " \"");
		this.getLabel_todasCancionesPara().setText("Todas las canciones para  \" \"");
		this.getLabel_anadeCancion().setVisible(true);
		this.getButton_nuevaCancion().setVisible(true);
		
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_cancion_al_album = new Anadir_cancion_al_album(cuerpo, _barra_buscador.getInput_buscar().getValue(), lista);
				cuerpo.removeAll();
				cuerpo.add(_anadir_cancion_al_album);
			}
		});
		
		this.getButton_volver().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.administrador();
			}
		});
		
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