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
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("label_creaCuenta")
	private Label label_creaCuenta;
	@Id("hL_datosImagen")
	private HorizontalLayout hL_datosImagen;
	@Id("vL_datos")
	private Element vL_datos;
	@Id("label_nombrePerfil")
	private Label label_nombrePerfil;
	@Id("label_errorNombrePerfil")
	private Label label_errorNombrePerfil;
	@Id("input_nombrePerfil")
	private Input input_nombrePerfil;
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
	@Id("label_confirmarContrasena")
	private Label label_confirmarContrasena;
	@Id("label_errorConfirmarContrasena")
	private Label label_errorConfirmarContrasena;
	@Id("input_confirmarContrasena")
	private Input input_confirmarContrasena;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	@Id("file")
	private Input file;
	@Id("ButtonLabel_elegirFoto")
	private Label buttonLabel_elegirFoto;
	@Id("button_registrarse")
	private NativeButton button_registrarse;
	@Id("label_o")
	private Label label_o;
	@Id("hL_GoogleAppleFacebook")
	private HorizontalLayout hL_GoogleAppleFacebook;
	@Id("button_Google")
	private NativeButton button_Google;
	@Id("button_Apple")
	private NativeButton button_Apple;
	@Id("button_Facebook")
	private NativeButton button_Facebook;
	@Id("hL_cuentaIniciar")
	private HorizontalLayout hL_cuentaIniciar;
	@Id("label_tienesCuenta")
	private Label label_tienesCuenta;
	@Id("button_iniciarSesion")
	private NativeButton button_iniciarSesion;
	
	

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}



	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}



	public Label getLabel_creaCuenta() {
		return label_creaCuenta;
	}



	public void setLabel_creaCuenta(Label label_creaCuenta) {
		this.label_creaCuenta = label_creaCuenta;
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



	public Label getLabel_nombrePerfil() {
		return label_nombrePerfil;
	}



	public void setLabel_nombrePerfil(Label label_nombrePerfil) {
		this.label_nombrePerfil = label_nombrePerfil;
	}



	public Label getLabel_errorNombrePerfil() {
		return label_errorNombrePerfil;
	}



	public void setLabel_errorNombrePerfil(Label label_errorNombrePerfil) {
		this.label_errorNombrePerfil = label_errorNombrePerfil;
	}



	public Input getInput_nombrePerfil() {
		return input_nombrePerfil;
	}



	public void setInput_nombrePerfil(Input input_nombrePerfil) {
		this.input_nombrePerfil = input_nombrePerfil;
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



	public Label getLabel_confirmarContrasena() {
		return label_confirmarContrasena;
	}



	public void setLabel_confirmarContrasena(Label label_confirmarContrasena) {
		this.label_confirmarContrasena = label_confirmarContrasena;
	}



	public Label getLabel_errorConfirmarContrasena() {
		return label_errorConfirmarContrasena;
	}



	public void setLabel_errorConfirmarContrasena(Label label_errorConfirmarContrasena) {
		this.label_errorConfirmarContrasena = label_errorConfirmarContrasena;
	}



	public Input getInput_confirmarContrasena() {
		return input_confirmarContrasena;
	}



	public void setInput_confirmarContrasena(Input input_confirmarContrasena) {
		this.input_confirmarContrasena = input_confirmarContrasena;
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



	public Label getButtonLabel_elegirFoto() {
		return buttonLabel_elegirFoto;
	}



	public void setButtonLabel_elegirFoto(Label buttonLabel_elegirFoto) {
		this.buttonLabel_elegirFoto = buttonLabel_elegirFoto;
	}



	public NativeButton getButton_registrarse() {
		return button_registrarse;
	}



	public void setButton_registrarse(NativeButton button_registrarse) {
		this.button_registrarse = button_registrarse;
	}



	public Label getLabel_o() {
		return label_o;
	}



	public void setLabel_o(Label label_o) {
		this.label_o = label_o;
	}



	public HorizontalLayout gethL_GoogleAppleFacebook() {
		return hL_GoogleAppleFacebook;
	}



	public void sethL_GoogleAppleFacebook(HorizontalLayout hL_GoogleAppleFacebook) {
		this.hL_GoogleAppleFacebook = hL_GoogleAppleFacebook;
	}



	public NativeButton getButton_Google() {
		return button_Google;
	}



	public void setButton_Google(NativeButton button_Google) {
		this.button_Google = button_Google;
	}



	public NativeButton getButton_Apple() {
		return button_Apple;
	}



	public void setButton_Apple(NativeButton button_Apple) {
		this.button_Apple = button_Apple;
	}



	public NativeButton getButton_Facebook() {
		return button_Facebook;
	}



	public void setButton_Facebook(NativeButton button_Facebook) {
		this.button_Facebook = button_Facebook;
	}



	public HorizontalLayout gethL_cuentaIniciar() {
		return hL_cuentaIniciar;
	}



	public void sethL_cuentaIniciar(HorizontalLayout hL_cuentaIniciar) {
		this.hL_cuentaIniciar = hL_cuentaIniciar;
	}



	public Label getLabel_tienesCuenta() {
		return label_tienesCuenta;
	}



	public void setLabel_tienesCuenta(Label label_tienesCuenta) {
		this.label_tienesCuenta = label_tienesCuenta;
	}



	public NativeButton getButton_iniciarSesion() {
		return button_iniciarSesion;
	}



	public void setButton_iniciarSesion(NativeButton button_iniciarSesion) {
		this.button_iniciarSesion = button_iniciarSesion;
	}



	/**
     * Creates a new VistaRegistrarse.
     */
    public VistaRegistrarse() {
        // You can initialise any data required for the connected UI components here.
    }

}
