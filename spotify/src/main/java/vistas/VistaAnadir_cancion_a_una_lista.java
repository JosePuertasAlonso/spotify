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
import vistas.VistaListas_creadas;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-anadir_cancion_a_una_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-anadir_cancion_a_una_lista")
@JsModule("./src/vistas/vista-anadir_cancion_a_una_lista.ts")
public class VistaAnadir_cancion_a_una_lista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anadeCancionLista")
	private Label label_anadeCancionLista;
	@Id("hL_labelBoton")
	private HorizontalLayout hL_labelBoton;
	@Id("label_tusListas")
	private Label label_tusListas;
	@Id("button_crearLista")
	private NativeButton button_crearLista;
	@Id("hL_listasCreadas")
	private HorizontalLayout hL_listasCreadas;
	@Id("vistaListas_creadas")
	private VistaListas_creadas vistaListas_creadas;
	@Id("vistaReproductor_resumido")
	private VistaReproductor_resumido vistaReproductor_resumido;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public VistaCabecera getVistaCabecera() {
		return vistaCabecera;
	}



	public void setVistaCabecera(VistaCabecera vistaCabecera) {
		this.vistaCabecera = vistaCabecera;
	}



	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}



	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}



	public Label getLabel_anadeCancionLista() {
		return label_anadeCancionLista;
	}



	public void setLabel_anadeCancionLista(Label label_anadeCancionLista) {
		this.label_anadeCancionLista = label_anadeCancionLista;
	}



	public HorizontalLayout gethL_labelBoton() {
		return hL_labelBoton;
	}



	public void sethL_labelBoton(HorizontalLayout hL_labelBoton) {
		this.hL_labelBoton = hL_labelBoton;
	}



	public Label getLabel_tusListas() {
		return label_tusListas;
	}



	public void setLabel_tusListas(Label label_tusListas) {
		this.label_tusListas = label_tusListas;
	}



	public NativeButton getButton_crearLista() {
		return button_crearLista;
	}



	public void setButton_crearLista(NativeButton button_crearLista) {
		this.button_crearLista = button_crearLista;
	}



	public HorizontalLayout gethL_listasCreadas() {
		return hL_listasCreadas;
	}



	public void sethL_listasCreadas(HorizontalLayout hL_listasCreadas) {
		this.hL_listasCreadas = hL_listasCreadas;
	}



	public VistaListas_creadas getVistaListas_creadas() {
		return vistaListas_creadas;
	}



	public void setVistaListas_creadas(VistaListas_creadas vistaListas_creadas) {
		this.vistaListas_creadas = vistaListas_creadas;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaAnadir_cancion_a_una_lista.
     */
    public VistaAnadir_cancion_a_una_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
