package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;
import vistas.VistaReproductor_resumido;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-crear_anuncio template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_anuncio")
@JsModule("./src/vistas/vista-crear_anuncio.ts")
public class VistaCrear_anuncio extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_creaNuevoAnuncio")
	private Label label_creaNuevoAnuncio;
	@Id("vL_tituloDescripcion")
	private Element vL_tituloDescripcion;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("input_titulo")
	private Input input_titulo;
	@Id("label_descripcion")
	private Label label_descripcion;
	@Id("button_publicarAnuncio")
	private NativeButton button_publicarAnuncio;
	@Id("hL_textarea")
	private HorizontalLayout hL_textarea;
	@Id("label_errorTitulo")
	private Label label_errorTitulo;
	
	
	
	public Label getLabel_errorTitulo() {
		return label_errorTitulo;
	}


	public void setLabel_errorTitulo(Label label_errorTitulo) {
		this.label_errorTitulo = label_errorTitulo;
	}


	public Element getvL_fondo() {
		return vL_fondo;
	}


	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}


	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}


	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}


	public Label getLabel_creaNuevoAnuncio() {
		return label_creaNuevoAnuncio;
	}


	public void setLabel_creaNuevoAnuncio(Label label_creaNuevoAnuncio) {
		this.label_creaNuevoAnuncio = label_creaNuevoAnuncio;
	}


	public Element getvL_tituloDescripcion() {
		return vL_tituloDescripcion;
	}


	public void setvL_tituloDescripcion(Element vL_tituloDescripcion) {
		this.vL_tituloDescripcion = vL_tituloDescripcion;
	}


	public Label getLabel_titulo() {
		return label_titulo;
	}


	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}


	public Input getInput_titulo() {
		return input_titulo;
	}


	public void setInput_titulo(Input input_titulo) {
		this.input_titulo = input_titulo;
	}


	public Label getLabel_descripcion() {
		return label_descripcion;
	}


	public void setLabel_descripcion(Label label_descripcion) {
		this.label_descripcion = label_descripcion;
	}


	public NativeButton getButton_publicarAnuncio() {
		return button_publicarAnuncio;
	}


	public void setButton_publicarAnuncio(NativeButton button_publicarAnuncio) {
		this.button_publicarAnuncio = button_publicarAnuncio;
	}

	
	

	public HorizontalLayout gethL_textarea() {
		return hL_textarea;
	}


	public void sethL_textarea(HorizontalLayout hL_textarea) {
		this.hL_textarea = hL_textarea;
	}


	/**
     * Creates a new VistaCrear_anuncio.
     */
    public VistaCrear_anuncio() {
        // You can initialise any data required for the connected UI components here.
    }

}
