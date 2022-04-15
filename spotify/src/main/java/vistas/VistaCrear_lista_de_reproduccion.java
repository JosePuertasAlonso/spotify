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
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-crear_lista_de_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_lista_de_reproduccion")
@JsModule("./src/vistas/vista-crear_lista_de_reproduccion.ts")
public class VistaCrear_lista_de_reproduccion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_creaLista")
	private Label label_creaLista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("input_titulo")
	private Input input_titulo;
	@Id("button_crearLista")
	private NativeButton button_crearLista;
	
	

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



	public Label getLabel_creaLista() {
		return label_creaLista;
	}



	public void setLabel_creaLista(Label label_creaLista) {
		this.label_creaLista = label_creaLista;
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



	public NativeButton getButton_crearLista() {
		return button_crearLista;
	}



	public void setButton_crearLista(NativeButton button_crearLista) {
		this.button_crearLista = button_crearLista;
	}



	/**
     * Creates a new VistaCrear_lista_de_reproduccion.
     */
    public VistaCrear_lista_de_reproduccion() {
        // You can initialise any data required for the connected UI components here.
    }

}
