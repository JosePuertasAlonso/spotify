package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLogo;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cabecera template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera")
@JsModule("./src/vistas/vista-cabecera.ts")
public class VistaCabecera extends LitTemplate {


	@Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("logo")
	private VistaLogo logo;
	@Id("hL_usuarioCerrarSesion")
	private HorizontalLayout hL_usuarioCerrarSesion;
	@Id("hL_fotoNombreUsuario")
	private HorizontalLayout hL_fotoNombreUsuario;
	@Id("foto")
	private Image foto;
	@Id("label_nombreUsuario")
	private Label label_nombreUsuario;
	@Id("button_cerrarSesion")
	private NativeButton button_cerrarSesion;
	@Id("hL_registrarseIniciarSesion")
	private HorizontalLayout hL_registrarseIniciarSesion;
	@Id("button_registrarse")
	private NativeButton button_registrarse;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public VistaLogo getLogo() {
		return logo;
	}



	public void setLogo(VistaLogo logo) {
		this.logo = logo;
	}



	public HorizontalLayout gethL_usuarioCerrarSesion() {
		return hL_usuarioCerrarSesion;
	}



	public void sethL_usuarioCerrarSesion(HorizontalLayout hL_usuarioCerrarSesion) {
		this.hL_usuarioCerrarSesion = hL_usuarioCerrarSesion;
	}



	public HorizontalLayout gethL_fotoNombreUsuario() {
		return hL_fotoNombreUsuario;
	}



	public void sethL_fotoNombreUsuario(HorizontalLayout hL_fotoNombreUsuario) {
		this.hL_fotoNombreUsuario = hL_fotoNombreUsuario;
	}



	public Image getFoto() {
		return foto;
	}



	public void setFoto(Image foto) {
		this.foto = foto;
	}



	public Label getLabel_nombreUsuario() {
		return label_nombreUsuario;
	}



	public void setLabel_nombreUsuario(Label label_nombreUsuario) {
		this.label_nombreUsuario = label_nombreUsuario;
	}



	public NativeButton getButton_cerrarSesion() {
		return button_cerrarSesion;
	}



	public void setButton_cerrarSesion(NativeButton button_cerrarSesion) {
		this.button_cerrarSesion = button_cerrarSesion;
	}



	public HorizontalLayout gethL_registrarseIniciarSesion() {
		return hL_registrarseIniciarSesion;
	}



	public void sethL_registrarseIniciarSesion(HorizontalLayout hL_registrarseIniciarSesion) {
		this.hL_registrarseIniciarSesion = hL_registrarseIniciarSesion;
	}



	public NativeButton getButton_registrarse() {
		return button_registrarse;
	}



	public void setButton_registrarse(NativeButton button_registrarse) {
		this.button_registrarse = button_registrarse;
	}



	/**
     * Creates a new VistaCabecera.
     */
    public VistaCabecera() {
        // You can initialise any data required for the connected UI components here.
    }

}
