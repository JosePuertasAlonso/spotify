package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_lista;

/**
 * A Designer generated component for the vista-canciones_del_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_del_album")
@JsModule("./src/vistas/vista-canciones_del_album.ts")
public class VistaCanciones_del_album extends LitTemplate {

    @Id("vL_contenedorCancionesLista")
	private Element vL_contenedorCancionesLista;
	
	

	public Element getvL_contenedorCancionesLista() {
		return vL_contenedorCancionesLista;
	}



	public void setvL_contenedorCancionesLista(Element vL_contenedorCancionesLista) {
		this.vL_contenedorCancionesLista = vL_contenedorCancionesLista;
	}



	/**
     * Creates a new VistaCanciones_del_album.
     */
    public VistaCanciones_del_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
