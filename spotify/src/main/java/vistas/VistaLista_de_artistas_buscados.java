package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaArtista_lista;

/**
 * A Designer generated component for the vista-lista_de_artistas_buscados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_artistas_buscados")
@JsModule("./src/vistas/vista-lista_de_artistas_buscados.ts")
public class VistaLista_de_artistas_buscados extends LitTemplate {

    @Id("vL_contenedorArtistaLista")
	private Element vL_contenedorArtistaLista;
	
	

	public Element getvL_contenedorArtistaLista() {
		return vL_contenedorArtistaLista;
	}



	public void setvL_contenedorArtistaLista(Element vL_contenedorArtistaLista) {
		this.vL_contenedorArtistaLista = vL_contenedorArtistaLista;
	}


	/**
     * Creates a new VistaLista_de_artistas_buscados.
     */
    public VistaLista_de_artistas_buscados() {
        // You can initialise any data required for the connected UI components here.
    }

}
