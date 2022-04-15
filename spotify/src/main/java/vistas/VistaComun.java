package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import vistas.VistaBarra_buscador;
import vistas.VistaLista_canciones;
import vistas.VistaReproductor_resumido;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-comun template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-comun")
@JsModule("./src/vistas/vista-comun.ts")
public class VistaComun extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_contendorListasCanciones")
	private Element vL_contendorListasCanciones;
	@Id("hL_cabecera")
	private HorizontalLayout hL_cabecera;
	@Id("hL_minireproductor")
	private HorizontalLayout hL_minireproductor;
	@Id("hL_buscador")
	private HorizontalLayout hL_buscador;
	
	public HorizontalLayout gethL_cabecera() {
		return hL_cabecera;
	}



	public void sethL_cabecera(HorizontalLayout hL_cabecera) {
		this.hL_cabecera = hL_cabecera;
	}



	public HorizontalLayout gethL_minireproductor() {
		return hL_minireproductor;
	}



	public void sethL_minireproductor(HorizontalLayout hL_minireproductor) {
		this.hL_minireproductor = hL_minireproductor;
	}



	public HorizontalLayout gethL_buscador() {
		return hL_buscador;
	}



	public void sethL_buscador(HorizontalLayout hL_buscador) {
		this.hL_buscador = hL_buscador;
	}
	
	
	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Element getvL_contendorListasCanciones() {
		return vL_contendorListasCanciones;
	}



	public void setvL_contendorListasCanciones(Element vL_contendorListasCanciones) {
		this.vL_contendorListasCanciones = vL_contendorListasCanciones;
	}




	/**
     * Creates a new VistaComun.
     */
    public VistaComun() {
        // You can initialise any data required for the connected UI components here.
    }

}
