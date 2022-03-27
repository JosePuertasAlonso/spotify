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
 * A Designer generated component for the vista-cibernauta_sin_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta_sin_contrasena")
@JsModule("./src/vistas/vista-cibernauta_sin_contrasena.ts")
public class VistaCibernauta_sin_contrasena extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("label_restablecerContraseña")
	private Label label_restablecerContraseña;
	@Id("label_introduceContraseña")
	private Label label_introduceContraseña;
	@Id("label_ErrorContrasenaRequisitos")
	private Label label_ErrorContrasenaRequisitos;
	@Id("label_errorContraseñasCoinciden")
	private Label label_errorContraseñasCoinciden;
	@Id("label_creaNuevaContrasena")
	private Label label_creaNuevaContrasena;
	@Id("input_creaNuevaContrasena")
	private Input input_creaNuevaContrasena;
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



	public Label getLabel_restablecerContraseña() {
		return label_restablecerContraseña;
	}



	public void setLabel_restablecerContraseña(Label label_restablecerContraseña) {
		this.label_restablecerContraseña = label_restablecerContraseña;
	}



	public Label getLabel_introduceContraseña() {
		return label_introduceContraseña;
	}



	public void setLabel_introduceContraseña(Label label_introduceContraseña) {
		this.label_introduceContraseña = label_introduceContraseña;
	}



	public Label getLabel_ErrorContrasenaRequisitos() {
		return label_ErrorContrasenaRequisitos;
	}



	public void setLabel_ErrorContrasenaRequisitos(Label label_ErrorContrasenaRequisitos) {
		this.label_ErrorContrasenaRequisitos = label_ErrorContrasenaRequisitos;
	}



	public Label getLabel_errorContraseñasCoinciden() {
		return label_errorContraseñasCoinciden;
	}



	public void setLabel_errorContraseñasCoinciden(Label label_errorContraseñasCoinciden) {
		this.label_errorContraseñasCoinciden = label_errorContraseñasCoinciden;
	}



	public Label getLabel_creaNuevaContrasena() {
		return label_creaNuevaContrasena;
	}



	public void setLabel_creaNuevaContrasena(Label label_creaNuevaContrasena) {
		this.label_creaNuevaContrasena = label_creaNuevaContrasena;
	}



	public Input getInput_creaNuevaContrasena() {
		return input_creaNuevaContrasena;
	}



	public void setInput_creaNuevaContrasena(Input input_creaNuevaContrasena) {
		this.input_creaNuevaContrasena = input_creaNuevaContrasena;
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
     * Creates a new VistaCibernauta_sin_contrasena.
     */
    public VistaCibernauta_sin_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
