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
import vistas.VistaModificar_cancion;

public class Modificar_cancion extends VistaModificar_cancion{
//	private Button _confirmar_cancionB;
//	private Label _tituloL;
//	private Label _titulo_CancionL;
//	private Label _titulo_Cancion_EtiquetaL;
//	private TextField _titulo_CancionTF;
//	private Label _artista_s_L;
//	private Label _artista_s__EtiquetaL;
//	private TextField _artista_s_TF;
//	private Label _albumL;
//	private Label _album_EtiquetaL;
//	private TextField _albumTF;
	public Cancion_Administrador _cancion_Administrador;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	private basededatos.Cancion cancion;

	
	public Modificar_cancion(VerticalLayout cuerpo, basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLabel_anadeNuevaCancion().setText("Modifica una canción");
		this.getvL_cancion1().as(VerticalLayout.class).setVisible(false);
		this.getLabel_errorArtistas().setVisible(false);
		this.getLabel_errorTitulo().setVisible(false);
		this.getLabel_errorFicheroCancion().setVisible(false);
		this.getButton_modificarCancion().setVisible(true);
		this.getButton_anadirCancion().setVisible(false);
		
		this.cancion = cancion;
		
		if(cancion != null) {
			//Titulo cancion
			this.getInput_titulo().setValue(cancion.getTitulo());
			// Artistas cancion
			basededatos.Artista[] artistasCancion = cancion.realizada_por.toArray();
			String cadenaArtistas = "";
			for (int j = 0; j < artistasCancion.length; j++) {
				if (j == artistasCancion.length - 1) {
					cadenaArtistas += artistasCancion[j].getNick();
				} else {
					cadenaArtistas += artistasCancion[j].getNick() + ", ";
				}
			}
			if(cadenaArtistas != null) {
				this.getInput_artista().setValue(cadenaArtistas);
			}
			
			//Compositores
			if(cancion.getCompositor() != null) {
				this.getInput_compositores().setValue(cancion.getCompositor());
			}
			
			//Interprete
			if(cancion.getInterprete() != null) {
				this.getInput_interpretes().setValue(cancion.getInterprete());
			}
			
			//Productores
			if(cancion.getProductor() != null) {
				this.getInput_productores().setValue(cancion.getProductor());
			}
			
			//Foto cancion
			if(cancion.getImagen() != null) {
				this.getImagen().setSrc(cancion.getImagen());
			}
		}
		
		this.getButton_modificarCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				String titulo = getInput_titulo().getValue();
				String artistas = getInput_artista().getValue();
				
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
					Confirmar_cancion();
				}
			}
		});
		
	}

	public void Confirmar_cancion() {
		this.getLabel_errorArtistas().setVisible(false);
		this.getLabel_errorTitulo().setVisible(false);
		this.getLabel_errorFicheroCancion().setVisible(false);
		
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
				foto = this.cancion.getImagen();
			} else {
				File f = new File(foto);
				foto = "/img/" + f.getName();
			}
			c.setImagen(foto);
			_iAdministrador.modificar_cancion(this.cancion.getId_Cancion(), c, artistasCancion);
			GestorUsuarios.administrador();
		}
	}
}