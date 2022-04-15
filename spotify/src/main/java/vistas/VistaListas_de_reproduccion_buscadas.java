package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_lista;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_buscadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_buscadas")
@JsModule("./src/vistas/vista-listas_de_reproduccion_buscadas.ts")
public class VistaListas_de_reproduccion_buscadas extends LitTemplate {

	
	@Id("vL_contenedorListaDeReproduccionLista")
	private Element vL_contenedorListaDeReproduccionLista;
	
	

	public Element getvL_contenedorListaDeReproduccionLista() {
		return vL_contenedorListaDeReproduccionLista;
	}



	public void setvL_contenedorListaDeReproduccionLista(Element vL_contenedorListaDeReproduccionLista) {
		this.vL_contenedorListaDeReproduccionLista = vL_contenedorListaDeReproduccionLista;
	}



	/**
     * Creates a new VistaListas_de_reproduccion_buscadas.
     */
    public VistaListas_de_reproduccion_buscadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
