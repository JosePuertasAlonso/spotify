package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-interprete template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-interprete")
@JsModule("./src/vistas/vista-interprete.ts")
public class VistaInterprete extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_interprete")
	private Label label_interprete;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_interprete() {
		return label_interprete;
	}



	public void setLabel_interprete(Label label_interprete) {
		this.label_interprete = label_interprete;
	}



	/**
     * Creates a new VistaInterprete.
     */
    public VistaInterprete() {
        // You can initialise any data required for the connected UI components here.
    }

}
