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
 * A Designer generated component for the vista-restablecer_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-restablecer_contrasena")
@JsModule("./src/vistas/vista-restablecer_contrasena.ts")
public class VistaRestablecer_contrasena extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("label_restablecerContrasena")
	private Label label_restablecerContrasena;
	@Id("label_instrucciones")
	private Label label_instrucciones;
	@Id("label_errorContrasenaRequisitos")
	private Label label_errorContrasenaRequisitos;
	@Id("label_errorContrasenaCoincidir")
	private Label label_errorContrasenaCoincidir;
	@Id("label_contrasena")
	private Label label_contrasena;
	@Id("input_contrasena")
	private Input input_contrasena;
	@Id("label_confirmaContrasena")
	private Label label_confirmaContrasena;
	@Id("input_confirmaContrasena")
	private Input input_confirmaContrasena;
	@Id("button_restablecerContrasena")
	private NativeButton button_restablecerContrasena;
	
	

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



	public Label getLabel_restablecerContrasena() {
		return label_restablecerContrasena;
	}



	public void setLabel_restablecerContrasena(Label label_restablecerContrasena) {
		this.label_restablecerContrasena = label_restablecerContrasena;
	}



	public Label getLabel_instrucciones() {
		return label_instrucciones;
	}



	public void setLabel_instrucciones(Label label_instrucciones) {
		this.label_instrucciones = label_instrucciones;
	}



	public Label getLabel_errorContrasenaRequisitos() {
		return label_errorContrasenaRequisitos;
	}



	public void setLabel_errorContrasenaRequisitos(Label label_errorContrasenaRequisitos) {
		this.label_errorContrasenaRequisitos = label_errorContrasenaRequisitos;
	}



	public Label getLabel_errorContrasenaCoincidir() {
		return label_errorContrasenaCoincidir;
	}



	public void setLabel_errorContrasenaCoincidir(Label label_errorContrasenaCoincidir) {
		this.label_errorContrasenaCoincidir = label_errorContrasenaCoincidir;
	}



	public Label getLabel_contrasena() {
		return label_contrasena;
	}



	public void setLabel_contrasena(Label label_contrasena) {
		this.label_contrasena = label_contrasena;
	}



	public Input getInput_contrasena() {
		return input_contrasena;
	}



	public void setInput_contrasena(Input input_contrasena) {
		this.input_contrasena = input_contrasena;
	}



	public Label getLabel_confirmaContrasena() {
		return label_confirmaContrasena;
	}



	public void setLabel_confirmaContrasena(Label label_confirmaContrasena) {
		this.label_confirmaContrasena = label_confirmaContrasena;
	}



	public Input getInput_confirmaContrasena() {
		return input_confirmaContrasena;
	}



	public void setInput_confirmaContrasena(Input input_confirmaContrasena) {
		this.input_confirmaContrasena = input_confirmaContrasena;
	}



	public NativeButton getButton_restablecerContrasena() {
		return button_restablecerContrasena;
	}



	public void setButton_restablecerContrasena(NativeButton button_restablecerContrasena) {
		this.button_restablecerContrasena = button_restablecerContrasena;
	}



	/**
     * Creates a new VistaRestablecer_contrasena.
     */
    public VistaRestablecer_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
