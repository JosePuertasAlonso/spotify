package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_del_artista;

/**
 * A Designer generated component for the vista-listas_de_reproduccion_del_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_de_reproduccion_del_artista")
@JsModule("./src/vistas/vista-listas_de_reproduccion_del_artista.ts")
public class VistaListas_de_reproduccion_del_artista extends LitTemplate {

    @Id("vL_listaFilas")
	private Element vL_listaFilas;
	@Id("hL_contenedorListaDelArtista")
	private HorizontalLayout hL_contenedorListaDelArtista;
	
	

	public Element getvL_listaFilas() {
		return vL_listaFilas;
	}



	public void setvL_listaFilas(Element vL_listaFilas) {
		this.vL_listaFilas = vL_listaFilas;
	}



	public HorizontalLayout gethL_contenedorListaDelArtista() {
		return hL_contenedorListaDelArtista;
	}



	public void sethL_contenedorListaDelArtista(HorizontalLayout hL_contenedorListaDelArtista) {
		this.hL_contenedorListaDelArtista = hL_contenedorListaDelArtista;
	}



	/**
     * Creates a new VistaListas_de_reproduccion_del_artista.
     */
    public VistaListas_de_reproduccion_del_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
