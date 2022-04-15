package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_lista;

/**
 * A Designer generated component for the vista-listas_del_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_del_usuario")
@JsModule("./src/vistas/vista-listas_del_usuario.ts")
public class VistaListas_del_usuario extends LitTemplate {

    @Id("vL_contenedorListaReproduccionLista")
	private Element vL_contenedorListaReproduccionLista;
	
	

	public Element getvL_contenedorListaReproduccionLista() {
		return vL_contenedorListaReproduccionLista;
	}



	public void setvL_contenedorListaReproduccionLista(Element vL_contenedorListaReproduccionLista) {
		this.vL_contenedorListaReproduccionLista = vL_contenedorListaReproduccionLista;
	}


	/**
     * Creates a new VistaListas_del_usuario.
     */
    public VistaListas_del_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
