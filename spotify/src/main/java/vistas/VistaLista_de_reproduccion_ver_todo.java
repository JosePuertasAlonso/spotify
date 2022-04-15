package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_de_reproduccion_bloque;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_ver_todo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_ver_todo")
@JsModule("./src/vistas/vista-lista_de_reproduccion_ver_todo.ts")
public class VistaLista_de_reproduccion_ver_todo extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_contenedorListaReproduccionBloque")
	private HorizontalLayout hL_contenedorListaReproduccionBloque;

	
	public Element getvL_fondo() {
		return vL_fondo;
	}




	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}




	public HorizontalLayout gethL_contenedorListaReproduccionBloque() {
		return hL_contenedorListaReproduccionBloque;
	}




	public void sethL_contenedorListaReproduccionBloque(HorizontalLayout hL_contenedorListaReproduccionBloque) {
		this.hL_contenedorListaReproduccionBloque = hL_contenedorListaReproduccionBloque;
	}



	/**
     * Creates a new VistaLista_de_reproduccion_ver_todo.
     */
    public VistaLista_de_reproduccion_ver_todo() {
        // You can initialise any data required for the connected UI components here.
    }

}
