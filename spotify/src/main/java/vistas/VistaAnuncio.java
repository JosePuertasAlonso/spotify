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
 * A Designer generated component for the vista-anuncio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anuncio")
@JsModule("./src/vistas/vista-anuncio.ts")
public class VistaAnuncio extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("imagen")
	private Image imagen;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_descripcion")
	private HorizontalLayout hL_descripcion;
	@Id("label_descripcion")
	private Label label_descripcion;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
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



	public HorizontalLayout gethL_descripcion() {
		return hL_descripcion;
	}



	public void sethL_descripcion(HorizontalLayout hL_descripcion) {
		this.hL_descripcion = hL_descripcion;
	}



	public Label getLabel_descripcion() {
		return label_descripcion;
	}



	public void setLabel_descripcion(Label label_descripcion) {
		this.label_descripcion = label_descripcion;
	}



	/**
     * Creates a new VistaAnuncio.
     */
    public VistaAnuncio() {
        // You can initialise any data required for the connected UI components here.
    }

}
