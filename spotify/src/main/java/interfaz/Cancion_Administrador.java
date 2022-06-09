package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaCancion_administrador;

public class Cancion_Administrador extends VistaCancion_administrador {
//	private CheckBox _establecer_ultimo_exitoCB;
//	private Button _eliminarB;
//	private Button _modificarB;
	public Modificar_cancion _modificar_cancion;
	public Eliminar_cancion _eliminar_cancion;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	private basededatos.Cancion cancion;
	
	public Cancion_Administrador(VerticalLayout cuerpo, basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getStyle().set("min-height", "60px");
		
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
		
		this.cancion = cancion;
		
		// Titulo cancion
		this.getLabel_cancion().setText(cancion.getTitulo());
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
		// Foto cancion
		this.getImagen().setSrc(cancion.getImagen());
		
		
		this.getButton_editar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_modificar_cancion = new Modificar_cancion(cuerpo, cancion);
				cuerpo.removeAll();
				cuerpo.add(_modificar_cancion);
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_cancion = new Eliminar_cancion(cuerpo, popUp, cancion);
				popUp.add(_eliminar_cancion);
				popUp.open();
			}
		});
		
		if(cancion.getUltimo_Exito()) {
			this.getInput_checkbox().getElement().setAttribute("checked", "true");
		} else {
			this.getInput_checkbox().getElement().removeAttribute("checked");
		}
		
		this.gethL_checkbox().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Establecer_ultimo_exito();
			}
		});
		
		
		
	}

	public void Establecer_ultimo_exito() {
		_iAdministrador.establecer_ultimo_exito(this.cancion.getId_Cancion());
	}
}