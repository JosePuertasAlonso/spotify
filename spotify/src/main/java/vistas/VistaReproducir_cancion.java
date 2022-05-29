package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-reproducir_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-reproducir_cancion")
@JsModule("./src/vistas/vista-reproducir_cancion.ts")
public class VistaReproducir_cancion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_creditosImagenOpciones")
	private HorizontalLayout hL_creditosImagenOpciones;
	@Id("hL_creditos")
	private HorizontalLayout hL_creditos;
	@Id("button_creditos")
	private NativeButton button_creditos;
	@Id("imagen")
	private Image imagen;
	@Id("button_opciones")
	private NativeButton button_opciones;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_reproductor")
	private HorizontalLayout hL_reproductor;
	@Id("hL_opciones")
	private HorizontalLayout hL_opciones;
	@Id("hL_imagen")
	private HorizontalLayout hL_imagen;
	
	

	public HorizontalLayout gethL_imagen() {
		return hL_imagen;
	}



	public void sethL_imagen(HorizontalLayout hL_imagen) {
		this.hL_imagen = hL_imagen;
	}



	public HorizontalLayout gethL_opciones() {
		return hL_opciones;
	}



	public void sethL_opciones(HorizontalLayout hL_opciones) {
		this.hL_opciones = hL_opciones;
	}



	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public HorizontalLayout gethL_creditosImagenOpciones() {
		return hL_creditosImagenOpciones;
	}



	public void sethL_creditosImagenOpciones(HorizontalLayout hL_creditosImagenOpciones) {
		this.hL_creditosImagenOpciones = hL_creditosImagenOpciones;
	}



	public HorizontalLayout gethL_creditos() {
		return hL_creditos;
	}



	public void sethL_creditos(HorizontalLayout hL_creditos) {
		this.hL_creditos = hL_creditos;
	}



	public NativeButton getButton_creditos() {
		return button_creditos;
	}



	public void setButton_creditos(NativeButton button_creditos) {
		this.button_creditos = button_creditos;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public NativeButton getButton_opciones() {
		return button_opciones;
	}



	public void setButton_opciones(NativeButton button_opciones) {
		this.button_opciones = button_opciones;
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



	public HorizontalLayout gethL_reproductor() {
		return hL_reproductor;
	}



	public void sethL_reproductor(HorizontalLayout hL_reproductor) {
		this.hL_reproductor = hL_reproductor;
	}



	/**
     * Creates a new VistaReproducir_cancion.
     */
    public VistaReproducir_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
