package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-cancion_album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_album")
@JsModule("./src/vistas/vista-cancion_album.ts")
public class VistaCancion_album extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_tituloArtista")
	private HorizontalLayout hL_tituloArtista;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_checkbox")
	private HorizontalLayout hL_checkbox;
	@Id("input_checkbox")
	private Input input_checkbox;
	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public HorizontalLayout gethL_tituloArtista() {
		return hL_tituloArtista;
	}



	public void sethL_tituloArtista(HorizontalLayout hL_tituloArtista) {
		this.hL_tituloArtista = hL_tituloArtista;
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



	public HorizontalLayout gethL_checkbox() {
		return hL_checkbox;
	}



	public void sethL_checkbox(HorizontalLayout hL_checkbox) {
		this.hL_checkbox = hL_checkbox;
	}



	public Input getInput_checkbox() {
		return input_checkbox;
	}



	public void setInput_checkbox(Input input_checkbox) {
		this.input_checkbox = input_checkbox;
	}



	/**
     * Creates a new VistaCancion_album.
     */
    public VistaCancion_album() {
        // You can initialise any data required for the connected UI components here.
    }

}
