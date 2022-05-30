package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_no_registrado;
import basededatos.iCibernauta_registrado;
import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaOpciones_cancion;

public class Opciones_cancion extends VistaOpciones_cancion {
//	private Button _anadir_a_favoritosB;
//	private Button _anadir_A_ListaB;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	
	iCibernauta_registrado _iCibernauta_registrado = new BDPrincipal();

	
	public Opciones_cancion(VerticalLayout cuerpo, HorizontalLayout minireproductor, Dialog popUp) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_reproducir().setVisible(false);
		this.getButton_verAlbum().setVisible(false);
		this.getButton_verArtista().setVisible(false);
		Imagen img = new Imagen(GestorUsuarios._cancion.getImagen());
		img.setRadius("0.7rem");
		img.setMaxWidth("100%");
		img.alinearVerticalmente();
		this.getvL_imagen().as(VerticalLayout.class).add(img);
		
		
		if(GestorUsuarios._u.marca_como_favorita.contains(GestorUsuarios._cancion)) {
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
				Anadir_a_favoritos();
				
			}
		});
		
		this.getButton_anadirLista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				popUp.close();
				_anadir_cancion_a_una_lista = new Anadir_cancion_a_una_lista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_anadir_cancion_a_una_lista);
				
			}
		});
	}
	

	public void Anadir_a_favoritos() {
		_iCibernauta_registrado.anadir_a_favoritos(GestorUsuarios._cancion.getId_Cancion(), GestorUsuarios._u.getLogin());
	}
}