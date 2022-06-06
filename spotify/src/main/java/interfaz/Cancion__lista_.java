package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaCancion_lista;

public class Cancion__lista_ extends VistaCancion_lista {
	public Canciones_del_album _canciones_del_album;
	public Canciones_de_lista _canciones_de_lista;
	public Lista_de_canciones_buscadas _lista_de_canciones_buscadas;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	
	iComun _iComun = new BDPrincipal();
	
	private basededatos.Cancion cancion;
	
	public Cancion__lista_(basededatos.Cancion cancion) {
		this.cancion = cancion;
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		//Titulo cancion
		this.getLabel_titulo().setText(cancion.getTitulo());
		//Artistas cancion
		basededatos.Artista[] artistasCancion = cancion.realizada_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < artistasCancion.length; j++) {
			if(j == artistasCancion.length - 1) {
				cadenaArtistas += artistasCancion[j].getNick();
			} else {
				cadenaArtistas += artistasCancion[j].getNick() + ", "; 
			}
		}
		this.getLabel_artista().setText(cadenaArtistas);
		//Foto cancion
		this.getImagen().setSrc(cancion.getImagen());
		
		this.getButton_play().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
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
				
			}
		});

	}

	
	public void anadir_cancion_historial() {
		_iComun.anadir_cancion_historial(cancion.getId_Cancion(), GestorUsuarios._u.getLogin());
	}
	
}