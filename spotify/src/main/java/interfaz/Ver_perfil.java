package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import vistas.VistaVer_perfil;

public class Ver_perfil extends VistaVer_perfil{
//	private Button _recuperar_perfilB;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Image _imagenI;
//	private Label _crear_ListaL;
//	private Button _estadisticasB;
//	private Button _modificar_PerfilB;
//	private Button _eliminar_PerfilB;
//	private Label _mis_ListasL;
//	private Label _numero_ListasL;
//	private Button _consultar_AnunciosB;
	public Cabecera_cibernauta_registrado _cabecera_cibernauta_registrado;
	public Dar_de_baja_perfil _dar_de_baja_perfil;
	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	public Ver_estadisticas _ver_estadisticas;
	public Listas_de_reproduccion_del_perfil _listas_de_reproduccion_del_perfil;
	public Ver_anuncios_de_artistas _ver_anuncios_de_artistas;
	public Modificar_perfil _modificar_perfil;
	
	public Ver_perfil(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		GestorUsuarios.recargarUsuario();
		_listas_de_reproduccion_del_perfil = new Listas_de_reproduccion_del_perfil(cuerpo, minireproductor);
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getvL_lisaDeReproduccionDelPerfil().as(VerticalLayout.class).add(_listas_de_reproduccion_del_perfil);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");

		this.getButton_crearAnuncio().setVisible(false);
		this.getButton_recuperarPerfil().setVisible(false);
		
		this.getLabel_nombreUsuario().setText(GestorUsuarios._u.getNick());
		this.getImagen().setSrc(GestorUsuarios._u.getFoto());
		this.getLabel_nSeguidores().setText(Integer.toString(GestorUsuarios._u.es_seguido_por.toArray().length));
		this.getLabel_nListas().setText(GestorUsuarios._u.gestiona.size() + " de 100 listas");
		
		this.getButton_verAnuncios().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_anuncios_de_artistas = new Ver_anuncios_de_artistas(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_anuncios_de_artistas);
				
			}
		});
		
		this.getButton_modificarPerfil().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_perfil = new Modificar_perfil(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_modificar_perfil);
			}
		});
		
		this.getButton_estadisticas().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_estadisticas = new Ver_estadisticas(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_estadisticas);
				
			}
		});
		
		this.getButton_eliminarPerfil().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				//
				Dialog popUp = new Dialog();
				_dar_de_baja_perfil = new Dar_de_baja_perfil(cuerpo, popUp);
				popUp.add(_dar_de_baja_perfil);
				popUp.open();
				
			}
		});
		
		this.getButton_crearLista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_crear_lista_de_reproduccion);
				
			}
		});
	}

	public void Recuperar_perfil() {
		throw new UnsupportedOperationException();
	}
	
}