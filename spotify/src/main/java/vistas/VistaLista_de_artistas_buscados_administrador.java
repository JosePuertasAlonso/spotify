package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaArtista_administrador;

/**
 * A Designer generated component for the vista-lista_de_artistas_buscados_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_artistas_buscados_administrador")
@JsModule("./src/vistas/vista-lista_de_artistas_buscados_administrador.ts")
public class VistaLista_de_artistas_buscados_administrador extends LitTemplate {

    @Id("vL_contenedorArtistasAdministrador")
	private Element vL_contenedorArtistasAdministrador;
	
	

	public Element getvL_contenedorArtistasAdministrador() {
		return vL_contenedorArtistasAdministrador;
	}



	public void setvL_contenedorArtistasAdministrador(Element vL_contenedorArtistasAdministrador) {
		this.vL_contenedorArtistasAdministrador = vL_contenedorArtistasAdministrador;
	}



	/**
     * Creates a new VistaLista_de_artistas_buscados_administrador.
     */
    public VistaLista_de_artistas_buscados_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
