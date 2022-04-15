package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaAnuncio;

/**
 * A Designer generated component for the vista-anuncios template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anuncios")
@JsModule("./src/vistas/vista-anuncios.ts")
public class VistaAnuncios extends LitTemplate {


	@Id("vL_contenedorAnuncios")
	private Element vL_contenedorAnuncios;
	
	

	public Element getvL_contenedorAnuncios() {
		return vL_contenedorAnuncios;
	}



	public void setvL_contenedorAnuncios(Element vL_contenedorAnuncios) {
		this.vL_contenedorAnuncios = vL_contenedorAnuncios;
	}



	/**
     * Creates a new VistaAnuncios.
     */
    public VistaAnuncios() {
        // You can initialise any data required for the connected UI components here.
    }

}
