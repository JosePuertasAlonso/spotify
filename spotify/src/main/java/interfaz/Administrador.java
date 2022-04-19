package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAdministrador;

//import basededatos.iAdministrador;

public class Administrador extends VistaAdministrador{
//	public iAdministrador _iAdministrador;
	public Buscador_administrador _buscador_administrador;
	public Anadir_nuevo_album _anadir_nuevo_album;
	public Dar_de_alta_artista _dar_de_alta_artista;
	public Crear_nuevo_estilo _crear_nuevo_estilo;
	public Anadir_nueva_cancion _anadir_nueva_cancion;
	public Cabecera _cabecera;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Administrador() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");

		VerticalLayout cuerpo = this.getvL_cuerpo().as(VerticalLayout.class);
		
		
//		_cabecera = new Cabecera();
//		_cabecera.gethL_fotoNombreUsuario().setVisible(false);
//		_cabecera.gethL_registrarseIniciarSesion().setVisible(false);
		
		/*CAMBIO*/
		_cabecera = new Cabecera_cibernauta_registrado(cuerpo, null);
		_cabecera.gethL_fotoNombreUsuario().setVisible(false);
		/*CAMBIO*/
		
		this.gethL_cabecera().add(_cabecera);
		
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_buscador_administrador = new Buscador_administrador(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_buscador_administrador);
			}
		});
		
		this.getButton_anadirEstilo().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_crear_nuevo_estilo = new Crear_nuevo_estilo(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_crear_nuevo_estilo);
			}
		});
		
		this.getButton_anadirCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_nueva_cancion = new Anadir_nueva_cancion(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_anadir_nueva_cancion);
			}
		});
		
		this.getButton_anadirAlbum().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_nuevo_album = new Anadir_nuevo_album(cuerpo);
				cuerpo.removeAll();
				cuerpo.add(_anadir_nuevo_album);
				
			}
		});
		
		this.getButton_anadirArtista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_dar_de_alta_artista = new Dar_de_alta_artista(cuerpo);
			cuerpo.removeAll();
			cuerpo.add(_dar_de_alta_artista);
				
			}
		});
	
		
		
	}
	
}