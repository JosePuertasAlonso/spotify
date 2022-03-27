package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaProductor;

/**
 * A Designer generated component for the vista-productores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productores")
@JsModule("./src/vistas/vista-productores.ts")
public class VistaProductores extends LitTemplate {

    @Id("vL_contenedorProductores")
	private Element vL_contenedorProductores;
	@Id("vistaProductor")
	private VistaProductor vistaProductor;
	@Id("vistaProductor1")
	private VistaProductor vistaProductor1;
	@Id("vistaProductor2")
	private VistaProductor vistaProductor2;
	
	

	public Element getvL_contenedorProductores() {
		return vL_contenedorProductores;
	}



	public void setvL_contenedorProductores(Element vL_contenedorProductores) {
		this.vL_contenedorProductores = vL_contenedorProductores;
	}



	public VistaProductor getVistaProductor() {
		return vistaProductor;
	}



	public void setVistaProductor(VistaProductor vistaProductor) {
		this.vistaProductor = vistaProductor;
	}



	public VistaProductor getVistaProductor1() {
		return vistaProductor1;
	}



	public void setVistaProductor1(VistaProductor vistaProductor1) {
		this.vistaProductor1 = vistaProductor1;
	}



	public VistaProductor getVistaProductor2() {
		return vistaProductor2;
	}



	public void setVistaProductor2(VistaProductor vistaProductor2) {
		this.vistaProductor2 = vistaProductor2;
	}



	/**
     * Creates a new VistaProductores.
     */
    public VistaProductores() {
        // You can initialise any data required for the connected UI components here.
    }

}
