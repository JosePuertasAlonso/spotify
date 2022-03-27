package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-eliminar_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-eliminar_lista")
@JsModule("./src/vistas/vista-eliminar_lista.ts")
public class VistaEliminar_lista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_eliminar")
	private Label label_eliminar;
	@Id("label_atencion")
	private Label label_atencion;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_siEliminar")
	private NativeButton button_siEliminar;
	@Id("buttonCancelar")
	private NativeButton buttonCancelar;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_eliminar() {
		return label_eliminar;
	}



	public void setLabel_eliminar(Label label_eliminar) {
		this.label_eliminar = label_eliminar;
	}



	public Label getLabel_atencion() {
		return label_atencion;
	}



	public void setLabel_atencion(Label label_atencion) {
		this.label_atencion = label_atencion;
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



	public NativeButton getButtonCancelar() {
		return buttonCancelar;
	}



	public void setButtonCancelar(NativeButton buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}



	/**
     * Creates a new VistaEliminar_lista.
     */
    public VistaEliminar_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
