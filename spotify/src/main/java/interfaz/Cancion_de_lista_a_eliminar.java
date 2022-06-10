package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaCancion_de_lista_a_eliminar;

public class Cancion_de_lista_a_eliminar extends VistaCancion_de_lista_a_eliminar{
//	private Button _eliminar_cancion_de_listaB;
//	private Label _nombreL;
//	private Image _imagenI;
//	private Label _artista_s_L;
	public Canciones_de_lista_a_eliminar _canciones_de_lista_a_eliminar;
	
	private iComun _iComun = new BDPrincipal();
	private basededatos.Lista lista;
	private basededatos.Cancion cancion;
	
	public Cancion_de_lista_a_eliminar(basededatos.Cancion cancion, basededatos.Lista lista) {
		this.cancion = cancion;
		this.lista = lista;
		
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
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Eliminar_cancion_de_lista();
				if(GestorUsuarios._u instanceof basededatos.Artista) {
					GestorUsuarios.artista(false);
				} else {
					GestorUsuarios.usuario(false);
				}
				
			}
		});
		
	}

	public void Eliminar_cancion_de_lista() {
		_iComun.eliminar_cancion_lista(lista.getId_Lista(), cancion.getId_Cancion());
	}
}