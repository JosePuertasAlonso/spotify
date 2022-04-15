package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-enviar_correo_de_recuperacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-enviar_correo_de_recuperacion")
@JsModule("./src/vistas/vista-enviar_correo_de_recuperacion.ts")
public class VistaEnviar_correo_de_recuperacion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_restablecerContrasena")
	private Label label_restablecerContrasena;
	@Id("label_envioEmail")
	private Label label_envioEmail;
	@Id("button_aceptar")
	private NativeButton button_aceptar;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}




	public Label getLabel_restablecerContrasena() {
		return label_restablecerContrasena;
	}



	public void setLabel_restablecerContrasena(Label label_restablecerContrasena) {
		this.label_restablecerContrasena = label_restablecerContrasena;
	}



	public Label getLabel_envioEmail() {
		return label_envioEmail;
	}



	public void setLabel_envioEmail(Label label_envioEmail) {
		this.label_envioEmail = label_envioEmail;
	}



	public NativeButton getButton_aceptar() {
		return button_aceptar;
	}



	public void setButton_aceptar(NativeButton button_aceptar) {
		this.button_aceptar = button_aceptar;
	}



	/**
     * Creates a new VistaEnviar_correo_de_recuperacion.
     */
    public VistaEnviar_correo_de_recuperacion() {
        // You can initialise any data required for the connected UI components here.
    }


}
