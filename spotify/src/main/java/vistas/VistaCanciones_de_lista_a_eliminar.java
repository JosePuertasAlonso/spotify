package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_de_lista_a_eliminar;

/**
 * A Designer generated component for the vista-canciones_de_lista_a_eliminar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_de_lista_a_eliminar")
@JsModule("./src/vistas/vista-canciones_de_lista_a_eliminar.ts")
public class VistaCanciones_de_lista_a_eliminar extends LitTemplate {

    @Id("vL_contendorCancionesEliminar")
	private Element vL_contendorCancionesEliminar;
	
	

	public Element getvL_contendorCancionesEliminar() {
		return vL_contendorCancionesEliminar;
	}



	public void setvL_contendorCancionesEliminar(Element vL_contendorCancionesEliminar) {
		this.vL_contendorCancionesEliminar = vL_contendorCancionesEliminar;
	}



	/**
     * Creates a new VistaCanciones_de_lista_a_eliminar.
     */
    public VistaCanciones_de_lista_a_eliminar() {
        // You can initialise any data required for the connected UI components here.
    }

}
