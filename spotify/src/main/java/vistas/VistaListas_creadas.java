package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_a_anadir;

/**
 * A Designer generated component for the vista-listas_creadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_creadas")
@JsModule("./src/vistas/vista-listas_creadas.ts")
public class VistaListas_creadas extends LitTemplate {

    @Id("vL_contenedorListaAAnadir")
	private Element vL_contenedorListaAAnadir;
	
	

	public Element getvL_contenedorListaAAnadir() {
		return vL_contenedorListaAAnadir;
	}



	public void setvL_contenedorListaAAnadir(Element vL_contenedorListaAAnadir) {
		this.vL_contenedorListaAAnadir = vL_contenedorListaAAnadir;
	}


	/**
     * Creates a new VistaListas_creadas.
     */
    public VistaListas_creadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
