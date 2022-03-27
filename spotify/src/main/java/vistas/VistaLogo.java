package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-logo template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-logo")
@JsModule("./src/vistas/vista-logo.ts")
public class VistaLogo extends LitTemplate {

	@Id("vL_fondo")
	private Element vL_fondo;
	@Id("button_logo")
	private NativeButton button_logo;
	@Id("imagen")
	private Image imagen;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public NativeButton getButton_logo() {
		return button_logo;
	}



	public void setButton_logo(NativeButton button_logo) {
		this.button_logo = button_logo;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	/**
     * Creates a new VistaLogo.
     */
    public VistaLogo() {
        // You can initialise any data required for the connected UI components here.
    }

}
