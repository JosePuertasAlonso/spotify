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
 * A Designer generated component for the vista-enviar_correo_de_modificacion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-enviar_correo_de_modificacion")
@JsModule("./src/vistas/vista-enviar_correo_de_modificacion.ts")
public class VistaEnviar_correo_de_modificacion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("label_perfilModificado")
	private Label label_perfilModificado;
	@Id("label_envioEmail")
	private Label label_envioEmail;
	@Id("label_revisarEmail")
	private Label label_revisarEmail;
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



	public Label getLabel_perfilModificado() {
		return label_perfilModificado;
	}



	public void setLabel_perfilModificado(Label label_perfilModificado) {
		this.label_perfilModificado = label_perfilModificado;
	}



	public Label getLabel_envioEmail() {
		return label_envioEmail;
	}



	public void setLabel_envioEmail(Label label_envioEmail) {
		this.label_envioEmail = label_envioEmail;
	}



	public Label getLabel_revisarEmail() {
		return label_revisarEmail;
	}



	public void setLabel_revisarEmail(Label label_revisarEmail) {
		this.label_revisarEmail = label_revisarEmail;
	}



	public NativeButton getButton_iniciarSesion() {
		return button_iniciarSesion;
	}



	public void setButton_iniciarSesion(NativeButton button_iniciarSesion) {
		this.button_iniciarSesion = button_iniciarSesion;
	}



	/**
     * Creates a new VistaEnviar_correo_de_modificacion.
     */
    public VistaEnviar_correo_de_modificacion() {
        // You can initialise any data required for the connected UI components here.
    }

}
