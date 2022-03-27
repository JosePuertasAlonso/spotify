package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-productor template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-productor")
@JsModule("./src/vistas/vista-productor.ts")
public class VistaProductor extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_productor")
	private Label label_productor;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_productor() {
		return label_productor;
	}



	public void setLabel_productor(Label label_productor) {
		this.label_productor = label_productor;
	}



	/**
     * Creates a new VistaProductor.
     */
    public VistaProductor() {
        // You can initialise any data required for the connected UI components here.
    }

}
