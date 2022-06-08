package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaLista_a_anadir;

public class Lista_a_anadir extends VistaLista_a_anadir {
//	private Button _anadir_cancion_a_la_listaB;
	public Listas_creadas _listas_creadas;
	
	private basededatos.Lista lista;
	private basededatos.Cancion cancion;
	
	iComun _iComun = new BDPrincipal();

	
	public Lista_a_anadir(basededatos.Lista lista, basededatos.Cancion cancion) {
		this.lista = lista;
		this.cancion = cancion;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		//No funciona lista.contiene.contains(cancion). Hay que hacerlo a mano
//		boolean contiene = false;
//		basededatos.Cancion[] cancionesAux = lista.contiene.toArray();
//		for (int i = 0; i < cancionesAux.length; i++) {
//			if(cancionesAux[i].getId_Cancion() == cancion.getId_Cancion()) {
//				contiene = true;
//				break;
//			}
//		}
		
		if(lista.contiene.contains(cancion)) {
			this.getButton_anadir().setText("QUITAR");
		} else {
			this.getButton_anadir().setText("AÑADIR");
		}
		
		//Titulo lista
		this.getLabel_titulo().setText(lista.getNombre());
		//Creador
		if(lista instanceof basededatos.Lista_de_reproduccion) {
			this.getLabel_creador().setText(((basededatos.Lista_de_reproduccion)lista).getEs_gestionada_por().getNick());
		}
		//Imagen
		this.getImagen().setSrc(lista.getImagen());
		//Numero de canciones
		this.getLabel_nCanciones().setText("(" + lista.contiene.size() + "/100)");
		
		this.getButton_anadir().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Anadir_cancion_a_la_lista();
				if(getButton_anadir().getText().equals("AÑADIR")) {
					getButton_anadir().setText("QUITAR");
				} else {
					getButton_anadir().setText("AÑADIR");
				}
			}
		});

	}

	public void Anadir_cancion_a_la_lista() {
		_iComun.anadir_cancion_a_la_lista(GestorUsuarios.login_u, cancion.getId_Cancion(), lista.getId_Lista());
	}
}