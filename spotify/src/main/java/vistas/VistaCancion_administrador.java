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
import com.vaadin.flow.component.html.Input;

/**
 * A Designer generated component for the vista-cancion_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_administrador")
@JsModule("./src/vistas/vista-cancion_administrador.ts")
public class VistaCancion_administrador extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_imagenTitulo")
	private HorizontalLayout hL_imagenTitulo;
	@Id("imagen")
	private Image imagen;
	@Id("vL_cancionArtista")
	private Element vL_cancionArtista;
	@Id("label_cancion")
	private Label label_cancion;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_eliminar")
	private NativeButton button_eliminar;
	@Id("input_checkbox")
	private Input input_checkbox;
	@Id("label_exito")
	private Label label_exito;
	@Id("button_editar")
	private NativeButton button_editar;
	@Id("hL_checkbox")
	private HorizontalLayout hL_checkbox;
	
	

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



	public Element getvL_cancionArtista() {
		return vL_cancionArtista;
	}



	public void setvL_cancionArtista(Element vL_cancionArtista) {
		this.vL_cancionArtista = vL_cancionArtista;
	}



	public Label getLabel_cancion() {
		return label_cancion;
	}



	public void setLabel_cancion(Label label_cancion) {
		this.label_cancion = label_cancion;
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




	public Input getInput_checkbox() {
		return input_checkbox;
	}



	public void setInput_checkbox(Input input_checkbox) {
		this.input_checkbox = input_checkbox;
	}



	public Label getLabel_exito() {
		return label_exito;
	}



	public void setLabel_exito(Label label_exito) {
		this.label_exito = label_exito;
	}



	public NativeButton getButton_editar() {
		return button_editar;
	}



	public void setButton_editar(NativeButton button_editar) {
		this.button_editar = button_editar;
	}



	public HorizontalLayout gethL_checkbox() {
		return hL_checkbox;
	}



	public void sethL_checkbox(HorizontalLayout hL_checkbox) {
		this.hL_checkbox = hL_checkbox;
	}



	/**
     * Creates a new VistaCancion_administrador.
     */
    public VistaCancion_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
