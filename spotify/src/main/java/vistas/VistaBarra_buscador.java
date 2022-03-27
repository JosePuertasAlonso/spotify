package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-barra_buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-barra_buscador")
@JsModule("./src/vistas/vista-barra_buscador.ts")
public class VistaBarra_buscador extends LitTemplate {

    @Id("hL_fondo")
	private HorizontalLayout hL_fondo;
	@Id("hL_iconoInput")
	private HorizontalLayout hL_iconoInput;
	@Id("input_buscar")
	private Input input_buscar;
	@Id("button_buscar")
	private NativeButton button_buscar;
	
	

	public HorizontalLayout gethL_fondo() {
		return hL_fondo;
	}



	public void sethL_fondo(HorizontalLayout hL_fondo) {
		this.hL_fondo = hL_fondo;
	}



	public HorizontalLayout gethL_iconoInput() {
		return hL_iconoInput;
	}



	public void sethL_iconoInput(HorizontalLayout hL_iconoInput) {
		this.hL_iconoInput = hL_iconoInput;
	}



	public Input getInput_buscar() {
		return input_buscar;
	}



	public void setInput_buscar(Input input_buscar) {
		this.input_buscar = input_buscar;
	}



	public NativeButton getButton_buscar() {
		return button_buscar;
	}



	public void setButton_buscar(NativeButton button_buscar) {
		this.button_buscar = button_buscar;
	}



	/**
     * Creates a new VistaBarra_buscador.
     */
    public VistaBarra_buscador() {
        // You can initialise any data required for the connected UI components here.
    }

}
