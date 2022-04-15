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
 * A Designer generated component for the vista-enviar_correo_anadir_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-enviar_correo_anadir_artista")
@JsModule("./src/vistas/vista-enviar_correo_anadir_artista.ts")
public class VistaEnviar_correo_anadir_artista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_artistaAnadido")
	private Label label_artistaAnadido;
	@Id("label_envioEmail")
	private Label label_envioEmail;
	@Id("label_revisarEmail")
	private Label label_revisarEmail;
	@Id("button_aceptar")
	private NativeButton button_aceptar;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_artistaAnadido() {
		return label_artistaAnadido;
	}



	public void setLabel_artistaAnadido(Label label_artistaAnadido) {
		this.label_artistaAnadido = label_artistaAnadido;
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



	public NativeButton getButton_aceptar() {
		return button_aceptar;
	}



	public void setButton_aceptar(NativeButton button_aceptar) {
		this.button_aceptar = button_aceptar;
	}



	/**
     * Creates a new VistaEnviar_correo_anadir_artista.
     */
    public VistaEnviar_correo_anadir_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
