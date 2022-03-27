package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-artista_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista_lista")
@JsModule("./src/vistas/vista-artista_lista.ts")
public class VistaArtista_lista extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("button_imagen")
	private NativeButton button_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("vL-nombreArtista")
	private Element vLNombreArtista;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("label_artista")
	private Label label_artista;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
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



	public Element getvLNombreArtista() {
		return vLNombreArtista;
	}



	public void setvLNombreArtista(Element vLNombreArtista) {
		this.vLNombreArtista = vLNombreArtista;
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
     * Creates a new VistaArtista_lista.
     */
    public VistaArtista_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
