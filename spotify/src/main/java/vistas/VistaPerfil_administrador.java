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
 * A Designer generated component for the vista-perfil_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_administrador")
@JsModule("./src/vistas/vista-perfil_administrador.ts")
public class VistaPerfil_administrador extends LitTemplate {

    @Id("vL_fondo")
	private HorizontalLayout vL_fondo;
	@Id("hL_imagenUsuario")
	private HorizontalLayout hL_imagenUsuario;
	@Id("imagen")
	private Image imagen;
	@Id("vL_nombrePerfil")
	private Element vL_nombrePerfil;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("label_perfil")
	private Label label_perfil;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_eliminar")
	private NativeButton button_eliminar;
	
	

	public HorizontalLayout getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(HorizontalLayout vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public HorizontalLayout gethL_imagenUsuario() {
		return hL_imagenUsuario;
	}



	public void sethL_imagenUsuario(HorizontalLayout hL_imagenUsuario) {
		this.hL_imagenUsuario = hL_imagenUsuario;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_nombrePerfil() {
		return vL_nombrePerfil;
	}



	public void setvL_nombrePerfil(Element vL_nombrePerfil) {
		this.vL_nombrePerfil = vL_nombrePerfil;
	}



	public Label getLabel_nombre() {
		return label_nombre;
	}



	public void setLabel_nombre(Label label_nombre) {
		this.label_nombre = label_nombre;
	}



	public Label getLabel_perfil() {
		return label_perfil;
	}



	public void setLabel_perfil(Label label_perfil) {
		this.label_perfil = label_perfil;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_eliminar() {
		return button_eliminar;
	}



	public void setButton_eliminar(NativeButton button_eliminar) {
		this.button_eliminar = button_eliminar;
	}



	/**
     * Creates a new VistaPerfil_administrador.
     */
    public VistaPerfil_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
