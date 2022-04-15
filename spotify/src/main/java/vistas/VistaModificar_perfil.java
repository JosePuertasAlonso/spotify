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
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-modificar_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_perfil")
@JsModule("./src/vistas/vista-modificar_perfil.ts")
public class VistaModificar_perfil extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_modificarPerfil")
	private Label label_modificarPerfil;
	@Id("label_nombreUsuario")
	private Label label_nombreUsuario;
	@Id("hL_datosImagen")
	private HorizontalLayout hL_datosImagen;
	@Id("vL_datos")
	private Element vL_datos;
	@Id("label_correoActual")
	private Label label_correoActual;
	@Id("label_errorCorreoActual")
	private Label label_errorCorreoActual;
	@Id("input_correoActual")
	private Input input_correoActual;
	@Id("label_correoNuevo")
	private Label label_correoNuevo;
	@Id("label_errorNuevoCorreo")
	private Label label_errorNuevoCorreo;
	@Id("input_correoNuevo")
	private Input input_correoNuevo;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("file")
	private Input file;
	@Id("botonLabel_elegirFoto")
	private Label botonLabel_elegirFoto;
	@Id("button_modificarPerfil")
	private NativeButton button_modificarPerfil;
	
	

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



	public Label getLabel_modificarPerfil() {
		return label_modificarPerfil;
	}



	public void setLabel_modificarPerfil(Label label_modificarPerfil) {
		this.label_modificarPerfil = label_modificarPerfil;
	}



	public Label getLabel_nombreUsuario() {
		return label_nombreUsuario;
	}



	public void setLabel_nombreUsuario(Label label_nombreUsuario) {
		this.label_nombreUsuario = label_nombreUsuario;
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



	public Label getLabel_correoActual() {
		return label_correoActual;
	}



	public void setLabel_correoActual(Label label_correoActual) {
		this.label_correoActual = label_correoActual;
	}



	public Label getLabel_errorCorreoActual() {
		return label_errorCorreoActual;
	}



	public void setLabel_errorCorreoActual(Label label_errorCorreoActual) {
		this.label_errorCorreoActual = label_errorCorreoActual;
	}



	public Input getInput_correoActual() {
		return input_correoActual;
	}



	public void setInput_correoActual(Input input_correoActual) {
		this.input_correoActual = input_correoActual;
	}



	public Label getLabel_correoNuevo() {
		return label_correoNuevo;
	}



	public void setLabel_correoNuevo(Label label_correoNuevo) {
		this.label_correoNuevo = label_correoNuevo;
	}



	public Label getLabel_errorNuevoCorreo() {
		return label_errorNuevoCorreo;
	}



	public void setLabel_errorNuevoCorreo(Label label_errorNuevoCorreo) {
		this.label_errorNuevoCorreo = label_errorNuevoCorreo;
	}



	public Input getInput_correoNuevo() {
		return input_correoNuevo;
	}



	public void setInput_correoNuevo(Input input_correoNuevo) {
		this.input_correoNuevo = input_correoNuevo;
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



	public Input getFile() {
		return file;
	}



	public void setFile(Input file) {
		this.file = file;
	}



	public Label getBotonLabel_elegirFoto() {
		return botonLabel_elegirFoto;
	}



	public void setBotonLabel_elegirFoto(Label botonLabel_elegirFoto) {
		this.botonLabel_elegirFoto = botonLabel_elegirFoto;
	}



	public NativeButton getButton_modificarPerfil() {
		return button_modificarPerfil;
	}



	public void setButton_modificarPerfil(NativeButton button_modificarPerfil) {
		this.button_modificarPerfil = button_modificarPerfil;
	}



	/**
     * Creates a new VistaModificar_perfil.
     */
    public VistaModificar_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
