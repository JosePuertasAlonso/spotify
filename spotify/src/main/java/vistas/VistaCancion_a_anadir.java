package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-cancion_a_anadir template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_a_anadir")
@JsModule("./src/vistas/vista-cancion_a_anadir.ts")
public class VistaCancion_a_anadir extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_imagenTitulo")
	private HorizontalLayout hL_imagenTitulo;
	@Id("imagen")
	private Image imagen;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_inputAnadir")
	private HorizontalLayout hL_inputAnadir;
	@Id("input_checkbox")
	private Input input_checkbox;
	@Id("label_anadirCancion")
	private Label label_anadirCancion;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public HorizontalLayout gethL_imagenTitulo() {
		return hL_imagenTitulo;
	}



	public void sethL_imagenTitulo(HorizontalLayout hL_imagenTitulo) {
		this.hL_imagenTitulo = hL_imagenTitulo;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_tituloArtista() {
		return vL_tituloArtista;
	}



	public void setvL_tituloArtista(Element vL_tituloArtista) {
		this.vL_tituloArtista = vL_tituloArtista;
	}



	public Label getLabel_titulo() {
		return label_titulo;
	}



	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	public HorizontalLayout gethL_inputAnadir() {
		return hL_inputAnadir;
	}



	public void sethL_inputAnadir(HorizontalLayout hL_inputAnadir) {
		this.hL_inputAnadir = hL_inputAnadir;
	}



	public Input getInput_checkbox() {
		return input_checkbox;
	}



	public void setInput_checkbox(Input input_checkbox) {
		this.input_checkbox = input_checkbox;
	}



	public Label getLabel_anadirCancion() {
		return label_anadirCancion;
	}



	public void setLabel_anadirCancion(Label label_anadirCancion) {
		this.label_anadirCancion = label_anadirCancion;
	}



	/**
     * Creates a new VistaCancion_a_anadir.
     */
    public VistaCancion_a_anadir() {
        // You can initialise any data required for the connected UI components here.
    }

}
