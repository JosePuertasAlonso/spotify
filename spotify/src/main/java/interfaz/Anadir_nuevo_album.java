package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Album;
import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
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
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	public Anadir_nuevo_album(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getImagen().setSrc("/img/song.png");
		
		this.getvL_cancionesAlbum().setVisible(false);
		this.getLabel_errorArtistas().setVisible(false);
		this.getLabel_errorTitulo().setVisible(false);
		
		this.getButton_anadirAlbum().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				String titulo = getInput_tituloAlbum().getValue();
				String artistas = getInput_tituloAlbum1().getValue();
				boolean correcto = true;
				if(titulo == null || titulo.isBlank()) {
					getLabel_errorTitulo().setVisible(true);
					correcto = false;
				}
				if(artistas == null || artistas.isBlank()) {
					getLabel_errorArtistas().setVisible(true);
					correcto = false;
				}
				
				if(correcto) {
					Confirmar_album();
				}
			}
		});

	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_album() {
		this.getLabel_errorArtistas().setVisible(false);
		this.getLabel_errorTitulo().setVisible(false);
		String[] aux = this.getInput_tituloAlbum1().getValue().split(",");
		basededatos.Artista[] artistasCancion = _iAdministrador.existen_artistas(aux);
		if(artistasCancion == null) {
			getLabel_errorArtistas().setVisible(true);
		} else {
			basededatos.Album a = new Album();
			a.setNombre(this.getInput_tituloAlbum().getValue());
			a.setFecha_Edicion(this.getInput_fechaAlbum().getValue());
			String foto = this.getInput_file().getValue();
			if(foto == null || foto.isBlank()) {
				foto = "/img/song.png";
			} else {
				File f = new File(foto);
				foto = "/img/" + f.getName();
			}
			a.setImagen(foto);
			for(basededatos.Artista artista : artistasCancion) {
				a.es_creado_por.add(artista);
			}
			_iAdministrador.anadir_album(a);
			GestorUsuarios.administrador();
		}
	}
}