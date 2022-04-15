package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaInterprete;

/**
 * A Designer generated component for the vista-interpretes template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-interpretes")
@JsModule("./src/vistas/vista-interpretes.ts")
public class VistaInterpretes extends LitTemplate {

    @Id("vL_contenedorInterpretes")
	private Element vL_contenedorInterpretes;
	
	

	public Element getvL_contenedorInterpretes() {
		return vL_contenedorInterpretes;
	}



	public void setvL_contenedorInterpretes(Element vL_contenedorInterpretes) {
		this.vL_contenedorInterpretes = vL_contenedorInterpretes;
	}


	/**
     * Creates a new VistaInterpretes.
     */
    public VistaInterpretes() {
        // You can initialise any data required for the connected UI components here.
    }

}
