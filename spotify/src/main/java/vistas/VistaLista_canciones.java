package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-lista_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_canciones")
@JsModule("./src/vistas/vista-lista_canciones.ts")
public class VistaLista_canciones extends LitTemplate {

	@Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("vL_filaCanciones")
	private Element vL_filaCanciones;
	@Id("hL_contenedorCanciones")
	private HorizontalLayout hL_contenedorCanciones;


	public Element getvL_fondo() {
		return vL_fondo;
	}


	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}


	public Label getLabel_titulo() {
		return label_titulo;
	}


	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}


	public Element getvL_filaCanciones() {
		return vL_filaCanciones;
	}


	public void setvL_filaCanciones(Element vL_filaCanciones) {
		this.vL_filaCanciones = vL_filaCanciones;
	}


	public HorizontalLayout gethL_contenedorCanciones() {
		return hL_contenedorCanciones;
	}


	public void sethL_contenedorCanciones(HorizontalLayout hL_contenedorCanciones) {
		this.hL_contenedorCanciones = hL_contenedorCanciones;
	}


	/**
     * Creates a new VistaLista_canciones.
     */
    public VistaLista_canciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
