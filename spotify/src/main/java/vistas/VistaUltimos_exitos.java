package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion;

/**
 * A Designer generated component for the vista-ultimos_exitos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimos_exitos")
@JsModule("./src/vistas/vista-ultimos_exitos.ts")
public class VistaUltimos_exitos extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_ultimosExitos")
	private Label label_ultimosExitos;
	@Id("vL_filasCanciones")
	private VerticalLayout vL_filasCanciones;
	@Id("hL_contenedorCanciones")
	private HorizontalLayout hL_contenedorCanciones;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_ultimosExitos() {
		return label_ultimosExitos;
	}



	public void setLabel_ultimosExitos(Label label_ultimosExitos) {
		this.label_ultimosExitos = label_ultimosExitos;
	}



	public VerticalLayout getvL_filasCanciones() {
		return vL_filasCanciones;
	}



	public void setvL_filasCanciones(VerticalLayout vL_filasCanciones) {
		this.vL_filasCanciones = vL_filasCanciones;
	}



	public HorizontalLayout gethL_contenedorCanciones() {
		return hL_contenedorCanciones;
	}



	public void sethL_contenedorCanciones(HorizontalLayout hL_contenedorCanciones) {
		this.hL_contenedorCanciones = hL_contenedorCanciones;
	}



	/**
     * Creates a new VistaUltimos_exitos.
     */
    public VistaUltimos_exitos() {
        // You can initialise any data required for the connected UI components here.
    }

}
