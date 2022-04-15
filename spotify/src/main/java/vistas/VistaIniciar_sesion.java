package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vistas/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_iniciarSesion")
	private Label label_iniciarSesion;
	@Id("vL_datosInicioSesion")
	private Element vL_datosInicioSesion;
	@Id("label_errorInicioSesion")
	private Label label_errorInicioSesion;
	@Id("label_correoElectronico")
	private Label label_correoElectronico;
	@Id("input_correoElectronico")
	private Input input_correoElectronico;
	@Id("label_contrasena")
	private Label label_contrasena;
	@Id("input_contrasena")
	private Input input_contrasena;
	@Id("button_recordarContrasena")
	private NativeButton button_recordarContrasena;
	@Id("button_iniciarSesion")
	private NativeButton button_iniciarSesion;
	@Id("label_o")
	private Label label_o;
	@Id("hL_GoogleAppleFacebook")
	private HorizontalLayout hL_GoogleAppleFacebook;
	@Id("button_Google")
	private NativeButton button_Google;
	@Id("img")
	private Image img;
	@Id("button_Apple")
	private NativeButton button_Apple;
	@Id("img1")
	private Image img1;
	@Id("button_Facebook")
	private NativeButton button_Facebook;
	@Id("img2")
	private Image img2;
	@Id("hL_miembroSuscribete")
	private HorizontalLayout hL_miembroSuscribete;
	@Id("label_noMiembro")
	private Label label_noMiembro;
	@Id("button_suscribete")
	private NativeButton button_suscribete;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_iniciarSesion() {
		return label_iniciarSesion;
	}



	public void setLabel_iniciarSesion(Label label_iniciarSesion) {
		this.label_iniciarSesion = label_iniciarSesion;
	}



	public Element getvL_datosInicioSesion() {
		return vL_datosInicioSesion;
	}



	public void setvL_datosInicioSesion(Element vL_datosInicioSesion) {
		this.vL_datosInicioSesion = vL_datosInicioSesion;
	}



	public Label getLabel_errorInicioSesion() {
		return label_errorInicioSesion;
	}



	public void setLabel_errorInicioSesion(Label label_errorInicioSesion) {
		this.label_errorInicioSesion = label_errorInicioSesion;
	}



	public Label getLabel_correoElectronico() {
		return label_correoElectronico;
	}



	public void setLabel_correoElectronico(Label label_correoElectronico) {
		this.label_correoElectronico = label_correoElectronico;
	}



	public Input getInput_correoElectronico() {
		return input_correoElectronico;
	}



	public void setInput_correoElectronico(Input input_correoElectronico) {
		this.input_correoElectronico = input_correoElectronico;
	}



	public Label getLabel_contrasena() {
		return label_contrasena;
	}



	public void setLabel_contrasena(Label label_contrasena) {
		this.label_contrasena = label_contrasena;
	}



	public Input getInput_contrasena() {
		return input_contrasena;
	}



	public void setInput_contrasena(Input input_contrasena) {
		this.input_contrasena = input_contrasena;
	}



	public NativeButton getButton_recordarContrasena() {
		return button_recordarContrasena;
	}



	public void setButton_recordarContrasena(NativeButton button_recordarContrasena) {
		this.button_recordarContrasena = button_recordarContrasena;
	}



	public NativeButton getButton_iniciarSesion() {
		return button_iniciarSesion;
	}



	public void setButton_iniciarSesion(NativeButton button_iniciarSesion) {
		this.button_iniciarSesion = button_iniciarSesion;
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



	public Image getImg() {
		return img;
	}



	public void setImg(Image img) {
		this.img = img;
	}



	public NativeButton getButton_Apple() {
		return button_Apple;
	}



	public void setButton_Apple(NativeButton button_Apple) {
		this.button_Apple = button_Apple;
	}



	public Image getImg1() {
		return img1;
	}



	public void setImg1(Image img1) {
		this.img1 = img1;
	}



	public NativeButton getButton_Facebook() {
		return button_Facebook;
	}



	public void setButton_Facebook(NativeButton button_Facebook) {
		this.button_Facebook = button_Facebook;
	}



	public Image getImg2() {
		return img2;
	}



	public void setImg2(Image img2) {
		this.img2 = img2;
	}



	public HorizontalLayout gethL_miembroSuscribete() {
		return hL_miembroSuscribete;
	}



	public void sethL_miembroSuscribete(HorizontalLayout hL_miembroSuscribete) {
		this.hL_miembroSuscribete = hL_miembroSuscribete;
	}



	public Label getLabel_noMiembro() {
		return label_noMiembro;
	}



	public void setLabel_noMiembro(Label label_noMiembro) {
		this.label_noMiembro = label_noMiembro;
	}



	public NativeButton getButton_suscribete() {
		return button_suscribete;
	}



	public void setButton_suscribete(NativeButton button_suscribete) {
		this.button_suscribete = button_suscribete;
	}



	/**
     * Creates a new VistaIniciar_sesion.
     */
    public VistaIniciar_sesion() {
        // You can initialise any data required for the connected UI components here.
    }


}
