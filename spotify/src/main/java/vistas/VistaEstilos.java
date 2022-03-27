package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaEstilo;

/**
 * A Designer generated component for the vista-estilos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilos")
@JsModule("./src/vistas/vista-estilos.ts")
public class VistaEstilos extends LitTemplate {

    @Id("vL_contendorEstilos")
	private Element vL_contendorEstilos;
	@Id("vistaEstilo")
	private VistaEstilo vistaEstilo;
	@Id("vistaEstilo1")
	private VistaEstilo vistaEstilo1;
	@Id("vistaEstilo2")
	private VistaEstilo vistaEstilo2;
	@Id("vistaEstilo3")
	private VistaEstilo vistaEstilo3;
	@Id("vistaEstilo4")
	private VistaEstilo vistaEstilo4;
	@Id("vistaEstilo5")
	private VistaEstilo vistaEstilo5;
	@Id("vistaEstilo6")
	private VistaEstilo vistaEstilo6;
	
	

	public Element getvL_contendorEstilos() {
		return vL_contendorEstilos;
	}



	public void setvL_contendorEstilos(Element vL_contendorEstilos) {
		this.vL_contendorEstilos = vL_contendorEstilos;
	}



	public VistaEstilo getVistaEstilo() {
		return vistaEstilo;
	}



	public void setVistaEstilo(VistaEstilo vistaEstilo) {
		this.vistaEstilo = vistaEstilo;
	}



	public VistaEstilo getVistaEstilo1() {
		return vistaEstilo1;
	}



	public void setVistaEstilo1(VistaEstilo vistaEstilo1) {
		this.vistaEstilo1 = vistaEstilo1;
	}



	public VistaEstilo getVistaEstilo2() {
		return vistaEstilo2;
	}



	public void setVistaEstilo2(VistaEstilo vistaEstilo2) {
		this.vistaEstilo2 = vistaEstilo2;
	}



	public VistaEstilo getVistaEstilo3() {
		return vistaEstilo3;
	}



	public void setVistaEstilo3(VistaEstilo vistaEstilo3) {
		this.vistaEstilo3 = vistaEstilo3;
	}



	public VistaEstilo getVistaEstilo4() {
		return vistaEstilo4;
	}



	public void setVistaEstilo4(VistaEstilo vistaEstilo4) {
		this.vistaEstilo4 = vistaEstilo4;
	}



	public VistaEstilo getVistaEstilo5() {
		return vistaEstilo5;
	}



	public void setVistaEstilo5(VistaEstilo vistaEstilo5) {
		this.vistaEstilo5 = vistaEstilo5;
	}



	public VistaEstilo getVistaEstilo6() {
		return vistaEstilo6;
	}



	public void setVistaEstilo6(VistaEstilo vistaEstilo6) {
		this.vistaEstilo6 = vistaEstilo6;
	}



	/**
     * Creates a new VistaEstilos.
     */
    public VistaEstilos() {
        // You can initialise any data required for the connected UI components here.
    }

}
