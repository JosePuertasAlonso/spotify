package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-dar_de_baja_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-dar_de_baja_perfil")
@JsModule("./src/vistas/vista-dar_de_baja_perfil.ts")
public class VistaDar_de_baja_perfil extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_eliminarPerfil")
	private Label label_eliminarPerfil;
	@Id("label_atencion")
	private Label label_atencion;
	@Id("label_continuar")
	private Label label_continuar;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_siEliminar")
	private NativeButton button_siEliminar;
	@Id("button_noVolver")
	private NativeButton button_noVolver;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_eliminarPerfil() {
		return label_eliminarPerfil;
	}



	public void setLabel_eliminarPerfil(Label label_eliminarPerfil) {
		this.label_eliminarPerfil = label_eliminarPerfil;
	}



	public Label getLabel_atencion() {
		return label_atencion;
	}



	public void setLabel_atencion(Label label_atencion) {
		this.label_atencion = label_atencion;
	}



	public Label getLabel_continuar() {
		return label_continuar;
	}



	public void setLabel_continuar(Label label_continuar) {
		this.label_continuar = label_continuar;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_siEliminar() {
		return button_siEliminar;
	}



	public void setButton_siEliminar(NativeButton button_siEliminar) {
		this.button_siEliminar = button_siEliminar;
	}



	public NativeButton getButton_noVolver() {
		return button_noVolver;
	}



	public void setButton_noVolver(NativeButton button_noVolver) {
		this.button_noVolver = button_noVolver;
	}



	/**
     * Creates a new VistaDar_de_baja_perfil.
     */
    public VistaDar_de_baja_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
