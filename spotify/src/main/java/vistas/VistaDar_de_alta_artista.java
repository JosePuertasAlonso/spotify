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
import vistas.VistaEstilos;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-dar_de_alta_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_alta_artista")
@JsModule("./src/vistas/vista-dar_de_alta_artista.ts")
public class VistaDar_de_alta_artista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_anadeArtista")
	private Label label_anadeArtista;
	@Id("hL_datosImagen")
	private HorizontalLayout hL_datosImagen;
	@Id("vL_datos")
	private Element vL_datos;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("label_errorNombre")
	private Label label_errorNombre;
	@Id("input_nombre")
	private Input input_nombre;
	@Id("label_correo")
	private Label label_correo;
	@Id("label_errorCorreo")
	private Label label_errorCorreo;
	@Id("input_correo")
	private Input input_correo;
	@Id("label_contrasena")
	private Label label_contrasena;
	@Id("label_errorContrasena")
	private Label label_errorContrasena;
	@Id("input_contrasena")
	private Input input_contrasena;
	@Id("label_estilos")
	private Label label_estilos;
	@Id("hL_estilos")
	private HorizontalLayout hL_estilos;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("button_anadirArtista")
	private NativeButton button_anadirArtista;
	@Id("input_file")
	private Input input_file;
	@Id("labelinput_file")
	private Label labelinput_file;
	
	

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



	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_anadeArtista() {
		return label_anadeArtista;
	}



	public void setLabel_anadeArtista(Label label_anadeArtista) {
		this.label_anadeArtista = label_anadeArtista;
	}



	public HorizontalLayout gethL_datosImagen() {
		return hL_datosImagen;
	}



	public void sethL_datosImagen(HorizontalLayout hL_datosImagen) {
		this.hL_datosImagen = hL_datosImagen;
	}



	public Element getvL_datos() {
		return vL_datos;
	}



	public void setvL_datos(Element vL_datos) {
		this.vL_datos = vL_datos;
	}



	public Label getLabel_nombre() {
		return label_nombre;
	}



	public void setLabel_nombre(Label label_nombre) {
		this.label_nombre = label_nombre;
	}



	public Label getLabel_errorNombre() {
		return label_errorNombre;
	}



	public void setLabel_errorNombre(Label label_errorNombre) {
		this.label_errorNombre = label_errorNombre;
	}



	public Input getInput_nombre() {
		return input_nombre;
	}



	public void setInput_nombre(Input input_nombre) {
		this.input_nombre = input_nombre;
	}



	public Label getLabel_correo() {
		return label_correo;
	}



	public void setLabel_correo(Label label_correo) {
		this.label_correo = label_correo;
	}



	public Label getLabel_errorCorreo() {
		return label_errorCorreo;
	}



	public void setLabel_errorCorreo(Label label_errorCorreo) {
		this.label_errorCorreo = label_errorCorreo;
	}



	public Input getInput_correo() {
		return input_correo;
	}



	public void setInput_correo(Input input_correo) {
		this.input_correo = input_correo;
	}



	public Label getLabel_contrasena() {
		return label_contrasena;
	}



	public void setLabel_contrasena(Label label_contrasena) {
		this.label_contrasena = label_contrasena;
	}



	public Label getLabel_errorContrasena() {
		return label_errorContrasena;
	}



	public void setLabel_errorContrasena(Label label_errorContrasena) {
		this.label_errorContrasena = label_errorContrasena;
	}



	public Input getInput_contrasena() {
		return input_contrasena;
	}



	public void setInput_contrasena(Input input_contrasena) {
		this.input_contrasena = input_contrasena;
	}



	public Label getLabel_estilos() {
		return label_estilos;
	}



	public void setLabel_estilos(Label label_estilos) {
		this.label_estilos = label_estilos;
	}



	public HorizontalLayout gethL_estilos() {
		return hL_estilos;
	}



	public void sethL_estilos(HorizontalLayout hL_estilos) {
		this.hL_estilos = hL_estilos;
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



	public NativeButton getButton_anadirArtista() {
		return button_anadirArtista;
	}



	public void setButton_anadirArtista(NativeButton button_anadirArtista) {
		this.button_anadirArtista = button_anadirArtista;
	}



	/**
     * Creates a new VistaDar_de_alta_artista.
     */
    public VistaDar_de_alta_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
