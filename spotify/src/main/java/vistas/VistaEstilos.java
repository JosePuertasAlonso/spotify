package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaEstilo;

/**
 * A Designer generated component for the vista-estilos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilos")
@JsModule("./src/vistas/vista-estilos.ts")
public class VistaEstilos extends LitTemplate {

    @Id("vL_contendorEstilos")
	private Element vL_contendorEstilos;
	
	

	public Element getvL_contendorEstilos() {
		return vL_contendorEstilos;
	}



	public void setvL_contendorEstilos(Element vL_contendorEstilos) {
		this.vL_contendorEstilos = vL_contendorEstilos;
	}


	/**
     * Creates a new VistaEstilos.
     */
    public VistaEstilos() {
        // You can initialise any data required for the connected UI components here.
    }

}
