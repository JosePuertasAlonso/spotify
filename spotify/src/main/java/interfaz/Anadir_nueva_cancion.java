package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;

public class Anadir_nueva_cancion extends Modificar_cancion {
//	private Label _archivo_CancionL;
//	private Label _archivos_PermitidosL;
//	private Image _imagenI;
//	private Button _seleccionar_archivoB;
	public Administrador _administrador;
	public Anadir_cancion_al_album _anadir_cancion_al_album;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	
	public Anadir_nueva_cancion(VerticalLayout cuerpo) {
		super(cuerpo, null);
		this.getLabel_anadeNuevaCancion().setText("Añade una nueva canción");
		this.getvL_cancion1().as(VerticalLayout.class).setVisible(true);
		this.getButton_modificarCancion().setText("AÑADIR CANCIÓN");
		this.getButton_modificarCancion().setVisible(false);
		this.getButton_anadirCancion().setVisible(true);
		
		this.getImagen().setSrc("/img/song.png");
		
		this.getButton_anadirCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				getLabel_errorArtistas().setVisible(false);
				getLabel_errorTitulo().setVisible(false);
				getLabel_errorFicheroCancion().setVisible(false);
				
				String titulo = getInput_titulo().getValue();
				String artistas = getInput_artista().getValue();
				String cancion = getInput_audio().getValue();
				
				boolean correcto = true;
				if(titulo == null || titulo.isBlank()) {
					getLabel_errorTitulo().setVisible(true);
					correcto = false;
				}
				if(artistas == null || artistas.isBlank()) {
					getLabel_errorArtistas().setVisible(true);
					correcto = false;
				}
				if(cancion == null || cancion.isBlank()) {
					getLabel_errorFicheroCancion().setVisible(true);
					correcto = false;
				}
				if(correcto) {
					anadir_cancion();
				}
				
			}
		});
		
		
	}
	
	public void anadir_cancion() {
		String[] aux = this.getInput_artista().getValue().split(",");
		basededatos.Artista[] artistasCancion = _iAdministrador.existen_artistas(aux);
		if(artistasCancion == null) {
			getLabel_errorArtistas().setVisible(true);
		} else {
			basededatos.Cancion c = new Cancion();
			c.setTitulo(this.getInput_titulo().getValue());
			c.setCompositor(this.getInput_compositores().getValue());
			c.setInterprete(this.getInput_interpretes().getValue());
			c.setProductor(this.getInput_productores().getValue());
			String foto = this.getInput_file().getValue();
			if(foto == null || foto.isBlank()) {
				foto = "/img/song.png";
			} else {
				File f = new File(foto);
				foto = "/img/" + f.getName();
			}
			c.setImagen(foto);
			String cancion = this.getInput_audio().getValue();
			File f2 = new File(cancion);
			cancion = "/audio/" + f2.getName();
			c.setFichero_MP3(cancion);
			for (basededatos.Artista artista : artistasCancion) {
				c.realizada_por.add(artista);
			}
			_iAdministrador.anadir_cancion(c);
			GestorUsuarios.administrador();
		}
	}

	public void Seleccionar_archivo() {
		throw new UnsupportedOperationException();
	}
}