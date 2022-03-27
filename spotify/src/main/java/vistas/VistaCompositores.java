package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCompositor;

/**
 * A Designer generated component for the vista-compositores template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compositores")
@JsModule("./src/vistas/vista-compositores.ts")
public class VistaCompositores extends LitTemplate {

    @Id("vL_contenedorCompositores")
	private Element vL_contenedorCompositores;
	@Id("vistaCompositor")
	private VistaCompositor vistaCompositor;
	@Id("vistaCompositor1")
	private VistaCompositor vistaCompositor1;
	@Id("vistaCompositor2")
	private VistaCompositor vistaCompositor2;
	
	

	public Element getvL_contenedorCompositores() {
		return vL_contenedorCompositores;
	}



	public void setvL_contenedorCompositores(Element vL_contenedorCompositores) {
		this.vL_contenedorCompositores = vL_contenedorCompositores;
	}



	public VistaCompositor getVistaCompositor() {
		return vistaCompositor;
	}



	public void setVistaCompositor(VistaCompositor vistaCompositor) {
		this.vistaCompositor = vistaCompositor;
	}



	public VistaCompositor getVistaCompositor1() {
		return vistaCompositor1;
	}



	public void setVistaCompositor1(VistaCompositor vistaCompositor1) {
		this.vistaCompositor1 = vistaCompositor1;
	}



	public VistaCompositor getVistaCompositor2() {
		return vistaCompositor2;
	}



	public void setVistaCompositor2(VistaCompositor vistaCompositor2) {
		this.vistaCompositor2 = vistaCompositor2;
	}



	/**
     * Creates a new VistaCompositores.
     */
    public VistaCompositores() {
        // You can initialise any data required for the connected UI components here.
    }

}
