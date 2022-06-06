package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAnadir_nuevo_album;

public class Anadir_nuevo_album extends VistaAnadir_nuevo_album{
//	private Label _tituloL;
//	private Label _titulo_AlbumL;
//	private Label _titulo_Album_EtiquetaL;
//	private TextField _titulo_AlbumTF;
//	private Label _artista_s_L;
//	private Label _artista_s__EtiquetaL;
//	private TextField _artista_s_TF;
//	private Label _fecha_EdicionL;
//	private Label _fecha_Edicion_EtiquetaL;
//	private TextField _fecha_EdicionTF;
//	private Button _confirmar_albumB;
//	private Button _anadir_CancionesB;
//	private Label _cancionesL;
//	private Button _seleccionar_foto_perfilB;
	public Administrador _administrador;
	public Anadir_cancion_al_album _anadir_cancion_al_album;
	public Canciones_del_album__administrador_ _canciones_del_album__administrador_;
	
	public Anadir_nuevo_album(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_canciones_del_album__administrador_ = new Canciones_del_album__administrador_();
		this.gethL_cancionesDelAlbumAdministrador().add(_canciones_del_album__administrador_);
		
		this.getButton_anadirCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_cancion_al_album = new Anadir_cancion_al_album(cuerpo, null, null); //CAMBIAR;
				_anadir_cancion_al_album.getvL_cancionesBuscadasAAnadir().getStyle().set("max-height", "19%");
				cuerpo.removeAll();
				cuerpo.add(_anadir_cancion_al_album);
			}
		});
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_album() {
		throw new UnsupportedOperationException();
	}
}