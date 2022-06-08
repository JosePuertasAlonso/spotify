package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.iCibernauta_no_registrado;
import basededatos.iCibernauta_registrado;
import basededatos.iComun;
import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaOpciones_cancion;

public class Opciones_cancion extends VistaOpciones_cancion {
//	private Button _anadir_a_favoritosB;
//	private Button _anadir_A_ListaB;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	
	iComun _iComun = new BDPrincipal();
	
	private basededatos.Cancion cancion;

	
	public Opciones_cancion(VerticalLayout cuerpo, HorizontalLayout minireproductor, Dialog popUp, basededatos.Cancion cancion) {
		this.cancion = cancion;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_reproducir().setVisible(false);
		this.getButton_verAlbum().setVisible(false);
		this.getButton_verArtista().setVisible(false);
		Imagen img = new Imagen(cancion.getImagen());
		img.setRadius("0.7rem");
		img.setMaxWidth("100%");
		img.alinearVerticalmente();
		this.getvL_imagen().as(VerticalLayout.class).add(img);
		GestorUsuarios.recargarUsuario();
		
		boolean contiene = false;
		Cancion[] aux = GestorUsuarios._u.marca_como_favorita.toArray();
		for(int i = 0; i < aux.length; i++) {
			if(aux[i].getId_Cancion() == cancion.getDuracion()) {
				contiene = true;
				break;
			}
		}
		
		if(contiene) {
			this.getButton_anadirFavoritos().setText("QUITAR DE FAVORITOS");
		} else {
			this.getButton_anadirFavoritos().setText("AÑADIR A FAVORITOS");
		}
		this.getButton_anadirFavoritos().getStyle().set("margin-top", "0px");
		
		this.getButton_anadirFavoritos().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				if(getButton_anadirFavoritos().getText().equals("AÑADIR A FAVORITOS")) {
					getButton_anadirFavoritos().setText("QUITAR DE FAVORITOS");
				} else {
					getButton_anadirFavoritos().setText("AÑADIR A FAVORITOS");
				}
				Anadir_a_favoritos(); //Metodo BD
				popUp.close();
				
			}
		});
		
		this.getButton_anadirLista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				_anadir_cancion_a_una_lista = new Anadir_cancion_a_una_lista(cuerpo, minireproductor, cancion);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_anadir_cancion_a_una_lista);
				
			}
		});
		
		this.getButton_reproducir().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				GestorUsuarios.reproducirCancion(cancion);
				Comun._reproductor_resumido__usuario_registrado_.getLabel_titulo().setText(cancion.getTitulo());
				Comun._reproductor_resumido__usuario_registrado_.getLabetl_artista().setText(GestorUsuarios.artistasCancion);
				Imagen img = new Imagen(cancion.getImagen());
				img.setMaxWidth("100%");
				Comun._reproductor_resumido__usuario_registrado_.gethL_imagen().removeAll();
				Comun._reproductor_resumido__usuario_registrado_.gethL_imagen().add(img);
				anadir_cancion_historial(); //Metodo BD
				popUp.close();
			}
		});
	}
	

	public void Anadir_a_favoritos() {
		_iComun.anadir_a_favoritos(cancion.getId_Cancion(), GestorUsuarios.login_u);
	}
	
	public void anadir_cancion_historial() {
		_iComun.anadir_cancion_historial(cancion.getId_Cancion(), GestorUsuarios.login_u);
	}
}