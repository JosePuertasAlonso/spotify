package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-cancion_de_lista_a_eliminar template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_de_lista_a_eliminar")
@JsModule("./src/vistas/vista-cancion_de_lista_a_eliminar.ts")
public class VistaCancion_de_lista_a_eliminar extends LitTemplate {

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
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_eliminar")
	private NativeButton button_eliminar;
	
	

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



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_eliminar() {
		return button_eliminar;
	}



	public void setButton_eliminar(NativeButton button_eliminar) {
		this.button_eliminar = button_eliminar;
	}



	/**
     * Creates a new VistaCancion_de_lista_a_eliminar.
     */
    public VistaCancion_de_lista_a_eliminar() {
        // You can initialise any data required for the connected UI components here.
    }

}
