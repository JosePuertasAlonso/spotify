package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaProductor;

/**
 * A Designer generated component for the vista-productores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productores")
@JsModule("./src/vistas/vista-productores.ts")
public class VistaProductores extends LitTemplate {

    @Id("vL_contenedorProductores")
	private Element vL_contenedorProductores;
	
	

	public Element getvL_contenedorProductores() {
		return vL_contenedorProductores;
	}



	public void setvL_contenedorProductores(Element vL_contenedorProductores) {
		this.vL_contenedorProductores = vL_contenedorProductores;
	}



	/**
     * Creates a new VistaProductores.
     */
    public VistaProductores() {
        // You can initialise any data required for the connected UI components here.
    }

}
