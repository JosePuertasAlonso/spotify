package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_propia;

/**
 * A Designer generated component for the vista-lista_de_reproduccion_del_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_del_perfil")
@JsModule("./src/vistas/vista-lista_de_reproduccion_del_perfil.ts")
public class VistaLista_de_reproduccion_del_perfil extends LitTemplate {

   

	@Id("vL_contenedorListaReproduccionPropia")
	private Element vL_contenedorListaReproduccionPropia;

	
	
	
	public Element getvL_contenedorListaReproduccionPropia() {
		return vL_contenedorListaReproduccionPropia;
	}




	public void setvL_contenedorListaReproduccionPropia(Element vL_contenedorListaReproduccionPropia) {
		this.vL_contenedorListaReproduccionPropia = vL_contenedorListaReproduccionPropia;
	}





	/**
     * Creates a new VistaLista_de_reproduccion_del_perfil.
     */
    public VistaLista_de_reproduccion_del_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
