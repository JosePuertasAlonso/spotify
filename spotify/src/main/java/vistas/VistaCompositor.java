package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-compositor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-compositor")
@JsModule("./src/vistas/vista-compositor.ts")
public class VistaCompositor extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_compositor")
	private Label label_compositor;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_compositor() {
		return label_compositor;
	}



	public void setLabel_compositor(Label label_compositor) {
		this.label_compositor = label_compositor;
	}



	/**
     * Creates a new VistaCompositor.
     */
    public VistaCompositor() {
        // You can initialise any data required for the connected UI components here.
    }

}
