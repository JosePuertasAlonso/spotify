package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion")
@JsModule("./src/vistas/vista-cancion.ts")
public class VistaCancion extends LitTemplate {



	@Id("vL_fondo")
	private Element vL_fondo;
	@Id("button_opciones")
	private NativeButton button_opciones;
	@Id("imagen")
	private Image imagen;
	@Id("hL_tituloBotones")
	private HorizontalLayout hL_tituloBotones;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_play")
	private NativeButton button_play;
	
	
	public Element getvL_fondo() {
		return vL_fondo;
	}


	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}


	public NativeButton getButton_opciones() {
		return button_opciones;
	}


	public void setButton_opciones(NativeButton button_opciones) {
		this.button_opciones = button_opciones;
	}


	public Image getImagen() {
		return imagen;
	}


	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}


	public HorizontalLayout gethL_tituloBotones() {
		return hL_tituloBotones;
	}


	public void sethL_tituloBotones(HorizontalLayout hL_tituloBotones) {
		this.hL_tituloBotones = hL_tituloBotones;
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


	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}


	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}


	public NativeButton getButton_play() {
		return button_play;
	}


	public void setButton_play(NativeButton button_play) {
		this.button_play = button_play;
	}


	/**
     * Creates a new VistaCancion.
     */
    public VistaCancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
