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
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-recuperar_contrasena template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recuperar_contrasena")
@JsModule("./src/vistas/vista-recuperar_contrasena.ts")
public class VistaRecuperar_contrasena extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_nuevaContrasena")
	private Label label_nuevaContrasena;
	@Id("label_instrucciones")
	private Label label_instrucciones;
	@Id("label_errorCorreo")
	private Label label_errorCorreo;
	@Id("label_correo")
	private Label label_correo;
	@Id("input_correo")
	private Input input_correo;
	@Id("button_enviarCorreo")
	private NativeButton button_enviarCorreo;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_nuevaContrasena() {
		return label_nuevaContrasena;
	}



	public void setLabel_nuevaContrasena(Label label_nuevaContrasena) {
		this.label_nuevaContrasena = label_nuevaContrasena;
	}



	public Label getLabel_instrucciones() {
		return label_instrucciones;
	}



	public void setLabel_instrucciones(Label label_instrucciones) {
		this.label_instrucciones = label_instrucciones;
	}



	public Label getLabel_errorCorreo() {
		return label_errorCorreo;
	}



	public void setLabel_errorCorreo(Label label_errorCorreo) {
		this.label_errorCorreo = label_errorCorreo;
	}



	public Label getLabel_correo() {
		return label_correo;
	}



	public void setLabel_correo(Label label_correo) {
		this.label_correo = label_correo;
	}



	public Input getInput_correo() {
		return input_correo;
	}



	public void setInput_correo(Input input_correo) {
		this.input_correo = input_correo;
	}



	public NativeButton getButton_enviarCorreo() {
		return button_enviarCorreo;
	}



	public void setButton_enviarCorreo(NativeButton button_enviarCorreo) {
		this.button_enviarCorreo = button_enviarCorreo;
	}



	/**
     * Creates a new VistaRecuperar_contrasena.
     */
    public VistaRecuperar_contrasena() {
        // You can initialise any data required for the connected UI components here.
    }

}
