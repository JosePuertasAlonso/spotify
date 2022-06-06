package interfaz;

import java.util.Iterator;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaCancion_a_anadir;

public class Cancion_a_anadir extends VistaCancion_a_anadir {
//	private CheckBox _anadir_cancionCB;
	public Canciones_buscadas_a_anadir _canciones_buscadas_a_anadir;
	
	private iComun _iComun = new BDPrincipal();
	private basededatos.Cancion cancion;
	private basededatos.Lista lista;
	
	public Cancion_a_anadir(basededatos.Cancion cancion, basededatos.Lista lista) {
		this.cancion = cancion;
		this.lista = lista;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		// Titulo cancion
		this.getLabel_titulo().setText(cancion.getTitulo());
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
		this.getLabel_artista().setText(cadenaArtistas);
		//Foto cancion
		this.getImagen().setSrc(cancion.getImagen());
		
		//No funciona lista.contiene.contains(cancion) -> seguramente por el ID
		//Se hace manualmente comprobando el nombre
		boolean contiene = false;
		basededatos.Cancion[] cancionesAux = lista.contiene.toArray();
		for (int i = 0; i < cancionesAux.length; i++) {
			if(cancionesAux[i].getId_Cancion() == cancion.getId_Cancion()) {
				contiene = true;
				break;
			}
		}
		
		if(contiene) {
			this.getInput_checkbox().getElement().setAttribute("checked", "true");
		}else {
			this.getInput_checkbox().getElement().removeAttribute("checked");
		}
		
		this.gethL_inputAnadir().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Anadir_cancion();
			}
		});
		
	}

	public void Anadir_cancion() {
		_iComun.anadir_cancion_a_la_lista(GestorUsuarios.login_u, cancion.getId_Cancion(), lista.getId_Lista());
	}
}