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
import vistas.VistaBarra_buscador;

/**
 * A Designer generated component for the vista-administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administrador")
@JsModule("./src/vistas/vista-administrador.ts")
public class VistaAdministrador extends LitTemplate {



	@Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anadeElementos")
	private Label label_anadeElementos;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_anadirEstilo")
	private NativeButton button_anadirEstilo;
	@Id("button_anadirCancion")
	private NativeButton button_anadirCancion;
	@Id("button_anadirAlbum")
	private NativeButton button_anadirAlbum;
	@Id("button_anadirArtista")
	private NativeButton button_anadirArtista;
	@Id("label_buscaElementos")
	private Label label_buscaElementos;
	@Id("vistaBarra_buscador")
	private VistaBarra_buscador vistaBarra_buscador;
	
	

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



	public Label getLabel_anadeElementos() {
		return label_anadeElementos;
	}



	public void setLabel_anadeElementos(Label label_anadeElementos) {
		this.label_anadeElementos = label_anadeElementos;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_anadirEstilo() {
		return button_anadirEstilo;
	}



	public void setButton_anadirEstilo(NativeButton button_anadirEstilo) {
		this.button_anadirEstilo = button_anadirEstilo;
	}



	public NativeButton getButton_anadirCancion() {
		return button_anadirCancion;
	}



	public void setButton_anadirCancion(NativeButton button_anadirCancion) {
		this.button_anadirCancion = button_anadirCancion;
	}



	public NativeButton getButton_anadirAlbum() {
		return button_anadirAlbum;
	}



	public void setButton_anadirAlbum(NativeButton button_anadirAlbum) {
		this.button_anadirAlbum = button_anadirAlbum;
	}



	public NativeButton getButton_anadirArtista() {
		return button_anadirArtista;
	}



	public void setButton_anadirArtista(NativeButton button_anadirArtista) {
		this.button_anadirArtista = button_anadirArtista;
	}



	public Label getLabel_buscaElementos() {
		return label_buscaElementos;
	}



	public void setLabel_buscaElementos(Label label_buscaElementos) {
		this.label_buscaElementos = label_buscaElementos;
	}



	public VistaBarra_buscador getVistaBarra_buscador() {
		return vistaBarra_buscador;
	}



	public void setVistaBarra_buscador(VistaBarra_buscador vistaBarra_buscador) {
		this.vistaBarra_buscador = vistaBarra_buscador;
	}



	/**
     * Creates a new VistaAdministrador.
     */
    public VistaAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
