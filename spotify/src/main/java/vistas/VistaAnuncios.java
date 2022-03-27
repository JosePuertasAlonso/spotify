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
	@Id("vistaAnuncio")
	private VistaAnuncio vistaAnuncio;
	@Id("vistaAnuncio1")
	private VistaAnuncio vistaAnuncio1;
	@Id("vistaAnuncio2")
	private VistaAnuncio vistaAnuncio2;
	@Id("vistaAnuncio3")
	private VistaAnuncio vistaAnuncio3;
	
	

	public Element getvL_contenedorAnuncios() {
		return vL_contenedorAnuncios;
	}



	public void setvL_contenedorAnuncios(Element vL_contenedorAnuncios) {
		this.vL_contenedorAnuncios = vL_contenedorAnuncios;
	}



	public VistaAnuncio getVistaAnuncio() {
		return vistaAnuncio;
	}



	public void setVistaAnuncio(VistaAnuncio vistaAnuncio) {
		this.vistaAnuncio = vistaAnuncio;
	}



	public VistaAnuncio getVistaAnuncio1() {
		return vistaAnuncio1;
	}



	public void setVistaAnuncio1(VistaAnuncio vistaAnuncio1) {
		this.vistaAnuncio1 = vistaAnuncio1;
	}



	public VistaAnuncio getVistaAnuncio2() {
		return vistaAnuncio2;
	}



	public void setVistaAnuncio2(VistaAnuncio vistaAnuncio2) {
		this.vistaAnuncio2 = vistaAnuncio2;
	}



	public VistaAnuncio getVistaAnuncio3() {
		return vistaAnuncio3;
	}



	public void setVistaAnuncio3(VistaAnuncio vistaAnuncio3) {
		this.vistaAnuncio3 = vistaAnuncio3;
	}



	/**
     * Creates a new VistaAnuncios.
     */
    public VistaAnuncios() {
        // You can initialise any data required for the connected UI components here.
    }

}
