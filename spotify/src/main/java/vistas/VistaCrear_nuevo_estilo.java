package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-crear_nuevo_estilo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_nuevo_estilo")
@JsModule("./src/vistas/vista-crear_nuevo_estilo.ts")
public class VistaCrear_nuevo_estilo extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anadeEstilo")
	private Label label_anadeEstilo;
	@Id("label_nombreEstilo")
	private Label label_nombreEstilo;
	@Id("input_nombreEstilo")
	private Input input_nombreEstilo;
	@Id("button_andirEstilo")
	private NativeButton button_andirEstilo;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}



	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}



	public Label getLabel_anadeEstilo() {
		return label_anadeEstilo;
	}



	public void setLabel_anadeEstilo(Label label_anadeEstilo) {
		this.label_anadeEstilo = label_anadeEstilo;
	}



	public Label getLabel_nombreEstilo() {
		return label_nombreEstilo;
	}



	public void setLabel_nombreEstilo(Label label_nombreEstilo) {
		this.label_nombreEstilo = label_nombreEstilo;
	}



	public Input getInput_nombreEstilo() {
		return input_nombreEstilo;
	}



	public void setInput_nombreEstilo(Input input_nombreEstilo) {
		this.input_nombreEstilo = input_nombreEstilo;
	}



	public NativeButton getButton_andirEstilo() {
		return button_andirEstilo;
	}



	public void setButton_andirEstilo(NativeButton button_andirEstilo) {
		this.button_andirEstilo = button_andirEstilo;
	}



	/**
     * Creates a new VistaCrear_nuevo_estilo.
     */
    public VistaCrear_nuevo_estilo() {
        // You can initialise any data required for the connected UI components here.
    }

}
