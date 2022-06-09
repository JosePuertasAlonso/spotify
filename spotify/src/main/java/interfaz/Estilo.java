package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import vistas.VistaEstilo;

public class Estilo extends VistaEstilo{
//	private Button _seleccionar_estiloB;
//	private Label _estiloL;
	public Estilos _estilos;
	
	private basededatos.Artista artista;
	private basededatos.Estilo estilo;
	private iAdministrador _iAdministrador = new BDPrincipal();
	
	public Estilo(basededatos.Estilo estilo, basededatos.Artista artista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.artista = artista;
		this.estilo = estilo;
		
		//Nombre del estilo
		this.getLabel_estilo().setText(estilo.getNombre());
		
		boolean contiene = false;
		basededatos.Estilo[] estilosArtista = artista.es_identificado_por.toArray();
		for(basededatos.Estilo e : estilosArtista) {
			if(e.getID() == estilo.getID()) {
				contiene = true;
				break;
			}
		}
		
		if(contiene) {
			this.getInput_checkbox().getElement().setAttribute("checked", "true");
		} else {
			this.getInput_checkbox().getElement().removeAttribute("checked");
		}
		
		this.gethL_estilo().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				Seleccionar_estilo();
			}
		});
	}

	public void Seleccionar_estilo() {
		_iAdministrador.asignar_estilo(this.estilo, this.artista.getLogin());
	}
}