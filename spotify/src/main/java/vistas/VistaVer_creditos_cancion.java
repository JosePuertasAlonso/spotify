package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import vistas.VistaCompositores;
import vistas.VistaProductores;
import vistas.VistaInterpretes;

/**
 * A Designer generated component for the vista-ver_creditos_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_creditos_cancion")
@JsModule("./src/vistas/vista-ver_creditos_cancion.ts")
public class VistaVer_creditos_cancion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_titulo")
	private HorizontalLayout hL_titulo;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_titulo1")
	private Label label_titulo1;
	@Id("hL_album")
	private HorizontalLayout hL_album;
	@Id("label_album")
	private Label label_album;
	@Id("label_album1")
	private Label label_album1;
	@Id("hL_compositores")
	private HorizontalLayout hL_compositores;
	@Id("label_compositores")
	private Label label_compositores;
	@Id("vistaCompositores")
	private VistaCompositores vistaCompositores;
	@Id("hL_productores")
	private HorizontalLayout hL_productores;
	@Id("label_productores")
	private Label label_productores;
	@Id("vistaProductores")
	private VistaProductores vistaProductores;
	@Id("hL_interpretes")
	private HorizontalLayout hL_interpretes;
	@Id("label_interpretes")
	private Label label_interpretes;
	@Id("vistaInterpretes")
	private VistaInterpretes vistaInterpretes;
	
	
	public Element getvL_fondo() {
		return vL_fondo;
	}


	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}


	public HorizontalLayout gethL_titulo() {
		return hL_titulo;
	}


	public void sethL_titulo(HorizontalLayout hL_titulo) {
		this.hL_titulo = hL_titulo;
	}


	public Label getLabel_titulo() {
		return label_titulo;
	}


	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}


	public Label getLabel_titulo1() {
		return label_titulo1;
	}


	public void setLabel_titulo1(Label label_titulo1) {
		this.label_titulo1 = label_titulo1;
	}


	public HorizontalLayout gethL_album() {
		return hL_album;
	}


	public void sethL_album(HorizontalLayout hL_album) {
		this.hL_album = hL_album;
	}


	public Label getLabel_album() {
		return label_album;
	}


	public void setLabel_album(Label label_album) {
		this.label_album = label_album;
	}


	public Label getLabel_album1() {
		return label_album1;
	}


	public void setLabel_album1(Label label_album1) {
		this.label_album1 = label_album1;
	}


	public HorizontalLayout gethL_compositores() {
		return hL_compositores;
	}


	public void sethL_compositores(HorizontalLayout hL_compositores) {
		this.hL_compositores = hL_compositores;
	}


	public Label getLabel_compositores() {
		return label_compositores;
	}


	public void setLabel_compositores(Label label_compositores) {
		this.label_compositores = label_compositores;
	}


	public VistaCompositores getVistaCompositores() {
		return vistaCompositores;
	}


	public void setVistaCompositores(VistaCompositores vistaCompositores) {
		this.vistaCompositores = vistaCompositores;
	}


	public HorizontalLayout gethL_productores() {
		return hL_productores;
	}


	public void sethL_productores(HorizontalLayout hL_productores) {
		this.hL_productores = hL_productores;
	}


	public Label getLabel_productores() {
		return label_productores;
	}


	public void setLabel_productores(Label label_productores) {
		this.label_productores = label_productores;
	}


	public VistaProductores getVistaProductores() {
		return vistaProductores;
	}


	public void setVistaProductores(VistaProductores vistaProductores) {
		this.vistaProductores = vistaProductores;
	}


	public HorizontalLayout gethL_interpretes() {
		return hL_interpretes;
	}


	public void sethL_interpretes(HorizontalLayout hL_interpretes) {
		this.hL_interpretes = hL_interpretes;
	}


	public Label getLabel_interpretes() {
		return label_interpretes;
	}


	public void setLabel_interpretes(Label label_interpretes) {
		this.label_interpretes = label_interpretes;
	}


	public VistaInterpretes getVistaInterpretes() {
		return vistaInterpretes;
	}


	public void setVistaInterpretes(VistaInterpretes vistaInterpretes) {
		this.vistaInterpretes = vistaInterpretes;
	}


	/**
     * Creates a new VistaVer_creditos_cancion.
     */
    public VistaVer_creditos_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
