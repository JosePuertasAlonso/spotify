package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_lista;

/**
 * A Designer generated component for the vista-lista_de_canciones_buscadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones_buscadas")
@JsModule("./src/vistas/vista-lista_de_canciones_buscadas.ts")
public class VistaLista_de_canciones_buscadas extends LitTemplate {

    @Id("vL_contenedorCancionLista")
	private Element vL_contenedorCancionLista;
	
	

	public Element getvL_contenedorCancionLista() {
		return vL_contenedorCancionLista;
	}



	public void setvL_contenedorCancionLista(Element vL_contenedorCancionLista) {
		this.vL_contenedorCancionLista = vL_contenedorCancionLista;
	}



	/**
     * Creates a new VistaLista_de_canciones_buscadas.
     */
    public VistaLista_de_canciones_buscadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
