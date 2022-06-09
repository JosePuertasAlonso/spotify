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

public class Modificar_album extends Anadir_nuevo_album {
	public Album__Administrador_ _album__Administrador_;
	public Anadir_cancion_al_album _anadir_cancion_al_album;
	public Canciones_del_album__administrador_ _canciones_del_album__administrador_;

	private iAdministrador _iAdministrador = new BDPrincipal();
	basededatos.Album album;
	
	public Modificar_album(VerticalLayout cuerpo, basededatos.Album album) {
		super(cuerpo);
		this.getLabel_anadeNuevoAlbum().setText("Modifica el álbum");
		this.getButton_anadirAlbum().setText("MODIFICAR ÁLBUM");
		this.getvL_cancionesAlbum().setVisible(true);
		
		this.album = album;
		
		if(album != null) {
			//Titulo album
			if(album.getNombre() != null) {
				this.getInput_tituloAlbum().setValue(album.getNombre());
			}
			// Artistas cancion
			basededatos.Artista[] artistasAlbum = album.es_creado_por.toArray();
			String cadenaArtistas = "";
			for (int j = 0; j < artistasAlbum.length; j++) {
				if (j == artistasAlbum.length - 1) {
					cadenaArtistas += artistasAlbum[j].getNick();
				} else {
					cadenaArtistas += artistasAlbum[j].getNick() + ", ";
				}
			}
			if(cadenaArtistas != null) {
				this.getInput_tituloAlbum1().setValue(cadenaArtistas);
			}
			//Fecha de edicion
			if(album.getFecha_Edicion() != null) {
				this.getInput_fechaAlbum().setValue(album.getFecha_Edicion());
			}
			
			//Foto album
			if(album.getImagen() != null) {
				this.getImagen().setSrc(album.getImagen());
			}
			
		}

		
		this.getButton_anadirCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_cancion_al_album = new Anadir_cancion_al_album(cuerpo, "", album); 
				_anadir_cancion_al_album.getvL_cancionesBuscadasAAnadir().getStyle().set("max-height", "19%");
				cuerpo.removeAll();
				cuerpo.add(_anadir_cancion_al_album);
			}
		});
		
		_canciones_del_album__administrador_ = new Canciones_del_album__administrador_(album);
		this.gethL_cancionesDelAlbumAdministrador().add(_canciones_del_album__administrador_);
		
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
	

	@Override
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
				foto = this.album.getImagen();
			} else {
				File f = new File(foto);
				foto = "/img/" + f.getName();
			}
			a.setImagen(foto);
			_iAdministrador.modificar_album(this.album.getId_Lista(), a, artistasCancion);
			GestorUsuarios.administrador();

		}
		
		
	}
}