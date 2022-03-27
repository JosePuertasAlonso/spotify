package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-estilo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estilo")
@JsModule("./src/vistas/vista-estilo.ts")
public class VistaEstilo extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("input_checkbox")
	private Input input_checkbox;
	@Id("label_estilo")
	private Label label_estilo;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public Input getInput_checkbox() {
		return input_checkbox;
	}



	public void setInput_checkbox(Input input_checkbox) {
		this.input_checkbox = input_checkbox;
	}



	public Label getLabel_estilo() {
		return label_estilo;
	}



	public void setLabel_estilo(Label label_estilo) {
		this.label_estilo = label_estilo;
	}



	/**
     * Creates a new VistaEstilo.
     */
    public VistaEstilo() {
        // You can initialise any data required for the connected UI components here.
    }

}
