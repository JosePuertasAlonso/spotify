package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-modificar_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_cancion")
@JsModule("./src/vistas/vista-modificar_cancion.ts")
public class VistaModificar_cancion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anadeNuevaCancion")
	private Label label_anadeNuevaCancion;
	@Id("hL_datosCancion")
	private HorizontalLayout hL_datosCancion;
	@Id("vL_cancion")
	private Element vL_cancion;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("input_titulo")
	private Input input_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("input_artista")
	private Input input_artista;
	@Id("label_album")
	private Label label_album;
	@Id("input_album")
	private Input input_album;
	@Id("vL_cancion1")
	private Element vL_cancion1;
	@Id("label_cancion")
	private Label label_cancion;
	@Id("file")
	private Input file;
	@Id("botonLabel_elegirCancion")
	private Label botonLabel_elegirCancion;
	@Id("button_modificarCancion")
	private NativeButton button_modificarCancion;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public VistaCabecera getVistaCabecera() {
		return vistaCabecera;
	}



	public void setVistaCabecera(VistaCabecera vistaCabecera) {
		this.vistaCabecera = vistaCabecera;
	}



	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}



	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}



	public Label getLabel_anadeNuevaCancion() {
		return label_anadeNuevaCancion;
	}



	public void setLabel_anadeNuevaCancion(Label label_anadeNuevaCancion) {
		this.label_anadeNuevaCancion = label_anadeNuevaCancion;
	}



	public HorizontalLayout gethL_datosCancion() {
		return hL_datosCancion;
	}



	public void sethL_datosCancion(HorizontalLayout hL_datosCancion) {
		this.hL_datosCancion = hL_datosCancion;
	}



	public Element getvL_cancion() {
		return vL_cancion;
	}



	public void setvL_cancion(Element vL_cancion) {
		this.vL_cancion = vL_cancion;
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



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	public Input getInput_artista() {
		return input_artista;
	}



	public void setInput_artista(Input input_artista) {
		this.input_artista = input_artista;
	}



	public Label getLabel_album() {
		return label_album;
	}



	public void setLabel_album(Label label_album) {
		this.label_album = label_album;
	}



	public Input getInput_album() {
		return input_album;
	}



	public void setInput_album(Input input_album) {
		this.input_album = input_album;
	}



	public Element getvL_cancion1() {
		return vL_cancion1;
	}



	public void setvL_cancion1(Element vL_cancion1) {
		this.vL_cancion1 = vL_cancion1;
	}



	public Label getLabel_cancion() {
		return label_cancion;
	}



	public void setLabel_cancion(Label label_cancion) {
		this.label_cancion = label_cancion;
	}



	public Input getFile() {
		return file;
	}



	public void setFile(Input file) {
		this.file = file;
	}



	public Label getBotonLabel_elegirCancion() {
		return botonLabel_elegirCancion;
	}



	public void setBotonLabel_elegirCancion(Label botonLabel_elegirCancion) {
		this.botonLabel_elegirCancion = botonLabel_elegirCancion;
	}



	public NativeButton getButton_modificarCancion() {
		return button_modificarCancion;
	}



	public void setButton_modificarCancion(NativeButton button_modificarCancion) {
		this.button_modificarCancion = button_modificarCancion;
	}



	/**
     * Creates a new VistaModificar_cancion.
     */
    public VistaModificar_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
