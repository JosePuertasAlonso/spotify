package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_administrador;

/**
 * A Designer generated component for the vista-lista_de_canciones_buscadas_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones_buscadas_administrador")
@JsModule("./src/vistas/vista-lista_de_canciones_buscadas_administrador.ts")
public class VistaLista_de_canciones_buscadas_administrador extends LitTemplate {

    @Id("vL_contenedorCancionAdministrador")
	private Element vL_contenedorCancionAdministrador;
	
	

	public Element getvL_contenedorCancionAdministrador() {
		return vL_contenedorCancionAdministrador;
	}



	public void setvL_contenedorCancionAdministrador(Element vL_contenedorCancionAdministrador) {
		this.vL_contenedorCancionAdministrador = vL_contenedorCancionAdministrador;
	}



	/**
     * Creates a new VistaLista_de_canciones_buscadas_administrador.
     */
    public VistaLista_de_canciones_buscadas_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
