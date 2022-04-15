package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaArtista;

/**
 * A Designer generated component for the vista-lista_de_artistas_ver_todo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_artistas_ver_todo")
@JsModule("./src/vistas/vista-lista_de_artistas_ver_todo.ts")
public class VistaLista_de_artistas_ver_todo extends LitTemplate {

    @Id("vL_filas")
	private Element vL_filas;
	@Id("hL_contenedorArtista")
	private HorizontalLayout hL_contenedorArtista;
	
	

	public Element getvL_filas() {
		return vL_filas;
	}



	public void setvL_filas(Element vL_filas) {
		this.vL_filas = vL_filas;
	}



	public HorizontalLayout gethL_contenedorArtista() {
		return hL_contenedorArtista;
	}



	public void sethL_contenedorArtista(HorizontalLayout hL_contenedorArtista) {
		this.hL_contenedorArtista = hL_contenedorArtista;
	}


	/**
     * Creates a new VistaLista_de_artistas_ver_todo.
     */
    public VistaLista_de_artistas_ver_todo() {
        // You can initialise any data required for the connected UI components here.
    }

}
