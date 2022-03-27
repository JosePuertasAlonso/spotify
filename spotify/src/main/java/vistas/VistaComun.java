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
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_contendorListasCanciones")
	private Element vL_contendorListasCanciones;
	@Id("vistaBarra_buscador")
	private VistaBarra_buscador vistaBarra_buscador;
	@Id("vistaLista_canciones")
	private VistaLista_canciones vistaLista_canciones;
	@Id("vistaLista_canciones1")
	private VistaLista_canciones vistaLista_canciones1;
	@Id("vistaLista_canciones2")
	private VistaLista_canciones vistaLista_canciones2;
	@Id("vistaReproductor_resumido")
	private VistaReproductor_resumido vistaReproductor_resumido;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public VistaCabecera getVistaCabecera() {
		return vistaCabecera;
	}



	public void setVistaCabecera(VistaCabecera vistaCabecera) {
		this.vistaCabecera = vistaCabecera;
	}



	public Element getvL_contendorListasCanciones() {
		return vL_contendorListasCanciones;
	}



	public void setvL_contendorListasCanciones(Element vL_contendorListasCanciones) {
		this.vL_contendorListasCanciones = vL_contendorListasCanciones;
	}



	public VistaBarra_buscador getVistaBarra_buscador() {
		return vistaBarra_buscador;
	}



	public void setVistaBarra_buscador(VistaBarra_buscador vistaBarra_buscador) {
		this.vistaBarra_buscador = vistaBarra_buscador;
	}



	public VistaLista_canciones getVistaLista_canciones() {
		return vistaLista_canciones;
	}



	public void setVistaLista_canciones(VistaLista_canciones vistaLista_canciones) {
		this.vistaLista_canciones = vistaLista_canciones;
	}



	public VistaLista_canciones getVistaLista_canciones1() {
		return vistaLista_canciones1;
	}



	public void setVistaLista_canciones1(VistaLista_canciones vistaLista_canciones1) {
		this.vistaLista_canciones1 = vistaLista_canciones1;
	}



	public VistaLista_canciones getVistaLista_canciones2() {
		return vistaLista_canciones2;
	}



	public void setVistaLista_canciones2(VistaLista_canciones vistaLista_canciones2) {
		this.vistaLista_canciones2 = vistaLista_canciones2;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaComun.
     */
    public VistaComun() {
        // You can initialise any data required for the connected UI components here.
    }

}
