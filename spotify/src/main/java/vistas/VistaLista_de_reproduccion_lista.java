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
 * A Designer generated component for the vista-lista_de_reproduccion_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_reproduccion_lista")
@JsModule("./src/vistas/vista-lista_de_reproduccion_lista.ts")
public class VistaLista_de_reproduccion_lista extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_imagenTitulo")
	private HorizontalLayout hL_imagenTitulo;
	@Id("imagen")
	private Image imagen;
	@Id("vL_tituloCreador")
	private Element vL_tituloCreador;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_creador")
	private Label label_creador;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_guardar")
	private NativeButton button_guardar;
	@Id("button_play")
	private NativeButton button_play;
	
	

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



	public Element getvL_tituloCreador() {
		return vL_tituloCreador;
	}



	public void setvL_tituloCreador(Element vL_tituloCreador) {
		this.vL_tituloCreador = vL_tituloCreador;
	}



	public Label getLabel_titulo() {
		return label_titulo;
	}



	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}



	public Label getLabel_creador() {
		return label_creador;
	}



	public void setLabel_creador(Label label_creador) {
		this.label_creador = label_creador;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_guardar() {
		return button_guardar;
	}



	public void setButton_guardar(NativeButton button_guardar) {
		this.button_guardar = button_guardar;
	}



	public NativeButton getButton_play() {
		return button_play;
	}



	public void setButton_play(NativeButton button_play) {
		this.button_play = button_play;
	}



	/**
     * Creates a new VistaLista_de_reproduccion_lista.
     */
    public VistaLista_de_reproduccion_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
