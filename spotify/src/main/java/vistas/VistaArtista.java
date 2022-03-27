package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista")
@JsModule("./src/vistas/vista-artista.ts")
public class VistaArtista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("button_imagen")
	private NativeButton button_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("vL_nombreArtista")
	private Element vL_nombreArtista;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("label_artista")
	private Label label_artista;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public NativeButton getButton_imagen() {
		return button_imagen;
	}



	public void setButton_imagen(NativeButton button_imagen) {
		this.button_imagen = button_imagen;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_nombreArtista() {
		return vL_nombreArtista;
	}



	public void setvL_nombreArtista(Element vL_nombreArtista) {
		this.vL_nombreArtista = vL_nombreArtista;
	}



	public Label getLabel_nombre() {
		return label_nombre;
	}



	public void setLabel_nombre(Label label_nombre) {
		this.label_nombre = label_nombre;
	}



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	/**
     * Creates a new VistaArtista.
     */
    public VistaArtista() {
        // You can initialise any data required for the connected UI components here.
    }

}
