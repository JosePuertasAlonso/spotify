package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Span;

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
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anadeNuevaCancion")
	private Label label_anadeNuevaCancion;
	@Id("hL_datosCancion")
	private HorizontalLayout hL_datosCancion;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("span")
	private Span span;
	@Id("input_file")
	private Input input_file;
	@Id("labelinput_file")
	private Label labelinput_file;
	@Id("span1")
	private Span span1;
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
	@Id("label_compositores")
	private Label label_compositores;
	@Id("input_compositores")
	private Input input_compositores;
	@Id("label_interpretes")
	private Label label_interpretes;
	@Id("input_interpretes")
	private Input input_interpretes;
	@Id("label_productores")
	private Label label_productores;
	@Id("input_productores")
	private Input input_productores;
	@Id("vL_cancion1")
	private Element vL_cancion1;
	@Id("span_audio")
	private Span span_audio;
	@Id("input_audio")
	private Input input_audio;
	@Id("labelinput_audio")
	private Label labelinput_audio;
	@Id("button_modificarCancion")
	private NativeButton button_modificarCancion;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label_errorArtistas")
	private Label label_errorArtistas;
	@Id("label_errorFicheroCancion")
	private Label label_errorFicheroCancion;
	@Id("label_errorTitulo")
	private Label label_errorTitulo;
	@Id("button_anadirCancion")
	private NativeButton button_anadirCancion;
	
	
	
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



	public Element getvL_imagen() {
		return vL_imagen;
	}



	public void setvL_imagen(Element vL_imagen) {
		this.vL_imagen = vL_imagen;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Span getSpan() {
		return span;
	}



	public NativeButton getButton_anadirCancion() {
		return button_anadirCancion;
	}



	public void setButton_anadirCancion(NativeButton button_anadirCancion) {
		this.button_anadirCancion = button_anadirCancion;
	}



	public void setSpan(Span span) {
		this.span = span;
	}



	public Input getInput_file() {
		return input_file;
	}



	public void setInput_file(Input input_file) {
		this.input_file = input_file;
	}



	public Label getLabelinput_file() {
		return labelinput_file;
	}



	public void setLabelinput_file(Label labelinput_file) {
		this.labelinput_file = labelinput_file;
	}



	public Span getSpan1() {
		return span1;
	}



	public void setSpan1(Span span1) {
		this.span1 = span1;
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



	public Label getLabel_compositores() {
		return label_compositores;
	}



	public void setLabel_compositores(Label label_compositores) {
		this.label_compositores = label_compositores;
	}



	public Input getInput_compositores() {
		return input_compositores;
	}



	public void setInput_compositores(Input input_compositores) {
		this.input_compositores = input_compositores;
	}



	public Label getLabel_interpretes() {
		return label_interpretes;
	}



	public void setLabel_interpretes(Label label_interpretes) {
		this.label_interpretes = label_interpretes;
	}



	public Input getInput_interpretes() {
		return input_interpretes;
	}



	public void setInput_interpretes(Input input_interpretes) {
		this.input_interpretes = input_interpretes;
	}



	public Label getLabel_productores() {
		return label_productores;
	}



	public void setLabel_productores(Label label_productores) {
		this.label_productores = label_productores;
	}



	public Input getInput_productores() {
		return input_productores;
	}



	public void setInput_productores(Input input_productores) {
		this.input_productores = input_productores;
	}



	public Element getvL_cancion1() {
		return vL_cancion1;
	}



	public void setvL_cancion1(Element vL_cancion1) {
		this.vL_cancion1 = vL_cancion1;
	}



	public Span getSpan_audio() {
		return span_audio;
	}



	public void setSpan_audio(Span span_audio) {
		this.span_audio = span_audio;
	}



	public Input getInput_audio() {
		return input_audio;
	}



	public void setInput_audio(Input input_audio) {
		this.input_audio = input_audio;
	}



	public Label getLabelinput_audio() {
		return labelinput_audio;
	}



	public void setLabelinput_audio(Label labelinput_audio) {
		this.labelinput_audio = labelinput_audio;
	}



	public NativeButton getButton_modificarCancion() {
		return button_modificarCancion;
	}



	public void setButton_modificarCancion(NativeButton button_modificarCancion) {
		this.button_modificarCancion = button_modificarCancion;
	}



	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}



	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}



	public Label getLabel_errorArtistas() {
		return label_errorArtistas;
	}



	public void setLabel_errorArtistas(Label label_errorArtistas) {
		this.label_errorArtistas = label_errorArtistas;
	}



	public Label getLabel_errorFicheroCancion() {
		return label_errorFicheroCancion;
	}



	public Label getLabel_errorTitulo() {
		return label_errorTitulo;
	}



	public void setLabel_errorTitulo(Label label_errorTitulo) {
		this.label_errorTitulo = label_errorTitulo;
	}



	public void setLabel_errorFicheroCancion(Label label_errorFicheroCancion) {
		this.label_errorFicheroCancion = label_errorFicheroCancion;
	}



	/**
     * Creates a new VistaModificar_cancion.
     */
    public VistaModificar_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
