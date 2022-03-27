package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaArtista;

/**
 * A Designer generated component for the vista-artistas_similares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_similares")
@JsModule("./src/vistas/vista-artistas_similares.ts")
public class VistaArtistas_similares extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_contenedorArtistas")
	private HorizontalLayout hL_contenedorArtistas;
	@Id("vistaArtista")
	private VistaArtista vistaArtista;
	@Id("vistaArtista1")
	private VistaArtista vistaArtista1;
	@Id("vistaArtista2")
	private VistaArtista vistaArtista2;
	@Id("vistaArtista3")
	private VistaArtista vistaArtista3;
	@Id("vistaArtista4")
	private VistaArtista vistaArtista4;
	@Id("vistaArtista5")
	private VistaArtista vistaArtista5;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public HorizontalLayout gethL_contenedorArtistas() {
		return hL_contenedorArtistas;
	}



	public void sethL_contenedorArtistas(HorizontalLayout hL_contenedorArtistas) {
		this.hL_contenedorArtistas = hL_contenedorArtistas;
	}



	public VistaArtista getVistaArtista() {
		return vistaArtista;
	}



	public void setVistaArtista(VistaArtista vistaArtista) {
		this.vistaArtista = vistaArtista;
	}



	public VistaArtista getVistaArtista1() {
		return vistaArtista1;
	}



	public void setVistaArtista1(VistaArtista vistaArtista1) {
		this.vistaArtista1 = vistaArtista1;
	}



	public VistaArtista getVistaArtista2() {
		return vistaArtista2;
	}



	public void setVistaArtista2(VistaArtista vistaArtista2) {
		this.vistaArtista2 = vistaArtista2;
	}



	public VistaArtista getVistaArtista3() {
		return vistaArtista3;
	}



	public void setVistaArtista3(VistaArtista vistaArtista3) {
		this.vistaArtista3 = vistaArtista3;
	}



	public VistaArtista getVistaArtista4() {
		return vistaArtista4;
	}



	public void setVistaArtista4(VistaArtista vistaArtista4) {
		this.vistaArtista4 = vistaArtista4;
	}



	public VistaArtista getVistaArtista5() {
		return vistaArtista5;
	}



	public void setVistaArtista5(VistaArtista vistaArtista5) {
		this.vistaArtista5 = vistaArtista5;
	}



	/**
     * Creates a new VistaArtistas_similares.
     */
    public VistaArtistas_similares() {
        // You can initialise any data required for the connected UI components here.
    }

}
