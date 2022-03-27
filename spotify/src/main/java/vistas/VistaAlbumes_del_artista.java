package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-albumes_del_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-albumes_del_artista")
@JsModule("./src/vistas/vista-albumes_del_artista.ts")
public class VistaAlbumes_del_artista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_contenedorAlbumes")
	private HorizontalLayout hL_contenedorAlbumes;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public HorizontalLayout gethL_contenedorAlbumes() {
		return hL_contenedorAlbumes;
	}



	public void sethL_contenedorAlbumes(HorizontalLayout hL_contenedorAlbumes) {
		this.hL_contenedorAlbumes = hL_contenedorAlbumes;
	}



	/**
     * Creates a new VistaAlbumes_del_artista.
     */
    public VistaAlbumes_del_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
