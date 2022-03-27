package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-reproductor_resumido template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reproductor_resumido")
@JsModule("./src/vistas/vista-reproductor_resumido.ts")
public class VistaReproductor_resumido extends LitTemplate {

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
	@Id("labetl_artista")
	private Label labetl_artista;
	@Id("hL_reproductor")
	private HorizontalLayout hL_reproductor;
	
	

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



	public Label getLabetl_artista() {
		return labetl_artista;
	}



	public void setLabetl_artista(Label labetl_artista) {
		this.labetl_artista = labetl_artista;
	}



	public HorizontalLayout gethL_reproductor() {
		return hL_reproductor;
	}



	public void sethL_reproductor(HorizontalLayout hL_reproductor) {
		this.hL_reproductor = hL_reproductor;
	}



	/**
     * Creates a new VistaReproductor_resumido.
     */
    public VistaReproductor_resumido() {
        // You can initialise any data required for the connected UI components here.
    }

}
