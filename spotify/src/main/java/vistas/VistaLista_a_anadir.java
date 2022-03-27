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
 * A Designer generated component for the vista-lista_a_anadir template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_a_anadir")
@JsModule("./src/vistas/vista-lista_a_anadir.ts")
public class VistaLista_a_anadir extends LitTemplate {

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
	@Id("hL_nCancionesAnadir")
	private HorizontalLayout hL_nCancionesAnadir;
	@Id("label_nCanciones")
	private Label label_nCanciones;
	@Id("button_anadir")
	private NativeButton button_anadir;
	
	

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



	public HorizontalLayout gethL_nCancionesAnadir() {
		return hL_nCancionesAnadir;
	}



	public void sethL_nCancionesAnadir(HorizontalLayout hL_nCancionesAnadir) {
		this.hL_nCancionesAnadir = hL_nCancionesAnadir;
	}



	public Label getLabel_nCanciones() {
		return label_nCanciones;
	}



	public void setLabel_nCanciones(Label label_nCanciones) {
		this.label_nCanciones = label_nCanciones;
	}



	public NativeButton getButton_anadir() {
		return button_anadir;
	}



	public void setButton_anadir(NativeButton button_anadir) {
		this.button_anadir = button_anadir;
	}



	/**
     * Creates a new VistaLista_a_anadir.
     */
    public VistaLista_a_anadir() {
        // You can initialise any data required for the connected UI components here.
    }

}
