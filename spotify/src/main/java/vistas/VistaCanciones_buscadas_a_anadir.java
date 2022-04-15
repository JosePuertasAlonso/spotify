package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_a_anadir;

/**
 * A Designer generated component for the vista-canciones_buscadas_a_anadir template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_buscadas_a_anadir")
@JsModule("./src/vistas/vista-canciones_buscadas_a_anadir.ts")
public class VistaCanciones_buscadas_a_anadir extends LitTemplate {

    @Id("vL_contenedorCancionesAAnadir")
	private Element vL_contenedorCancionesAAnadir;
	
	

	public Element getvL_contenedorCancionesAAnadir() {
		return vL_contenedorCancionesAAnadir;
	}



	public void setvL_contenedorCancionesAAnadir(Element vL_contenedorCancionesAAnadir) {
		this.vL_contenedorCancionesAAnadir = vL_contenedorCancionesAAnadir;
	}



	/**
     * Creates a new VistaCanciones_buscadas_a_anadir.
     */
    public VistaCanciones_buscadas_a_anadir() {
        // You can initialise any data required for the connected UI components here.
    }

}
