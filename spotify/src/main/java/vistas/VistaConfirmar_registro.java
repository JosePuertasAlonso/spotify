package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-confirmar_registro template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-confirmar_registro")
@JsModule("./src/vistas/vista-confirmar_registro.ts")
public class VistaConfirmar_registro extends LitTemplate {


	@Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("label_graciasPorRegistrarte")
	private Label label_graciasPorRegistrarte;
	@Id("label_envioEmail")
	private Label label_envioEmail;
	@Id("label_revisaEmail")
	private Label label_revisaEmail;
	@Id("button_iniciarSesion")
	private NativeButton button_iniciarSesion;
	
	


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




	public Label getLabel_graciasPorRegistrarte() {
		return label_graciasPorRegistrarte;
	}




	public void setLabel_graciasPorRegistrarte(Label label_graciasPorRegistrarte) {
		this.label_graciasPorRegistrarte = label_graciasPorRegistrarte;
	}




	public Label getLabel_envioEmail() {
		return label_envioEmail;
	}




	public void setLabel_envioEmail(Label label_envioEmail) {
		this.label_envioEmail = label_envioEmail;
	}




	public Label getLabel_revisaEmail() {
		return label_revisaEmail;
	}




	public void setLabel_revisaEmail(Label label_revisaEmail) {
		this.label_revisaEmail = label_revisaEmail;
	}




	public NativeButton getButton_iniciarSesion() {
		return button_iniciarSesion;
	}




	public void setButton_iniciarSesion(NativeButton button_iniciarSesion) {
		this.button_iniciarSesion = button_iniciarSesion;
	}




	/**
     * Creates a new VistaConfirmar_registro.
     */
    public VistaConfirmar_registro() {
        // You can initialise any data required for the connected UI components here.
    }

}
