package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaAnuncios;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_anuncios_de_artistas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_anuncios_de_artistas")
@JsModule("./src/vistas/vista-ver_anuncios_de_artistas.ts")
public class VistaVer_anuncios_de_artistas extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_anunciosArtistas")
	private Label label_anunciosArtistas;
	@Id("hL_anunciosSinLeerNumero")
	private HorizontalLayout hL_anunciosSinLeerNumero;
	@Id("label_anunciosSinLeer")
	private Label label_anunciosSinLeer;
	@Id("label_nAnuncios")
	private Label label_nAnuncios;
	@Id("hL_contenedorAnuncios")
	private HorizontalLayout hL_contenedorAnuncios;
	
	

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



	public Label getLabel_anunciosArtistas() {
		return label_anunciosArtistas;
	}



	public void setLabel_anunciosArtistas(Label label_anunciosArtistas) {
		this.label_anunciosArtistas = label_anunciosArtistas;
	}



	public HorizontalLayout gethL_anunciosSinLeerNumero() {
		return hL_anunciosSinLeerNumero;
	}



	public void sethL_anunciosSinLeerNumero(HorizontalLayout hL_anunciosSinLeerNumero) {
		this.hL_anunciosSinLeerNumero = hL_anunciosSinLeerNumero;
	}



	public Label getLabel_anunciosSinLeer() {
		return label_anunciosSinLeer;
	}



	public void setLabel_anunciosSinLeer(Label label_anunciosSinLeer) {
		this.label_anunciosSinLeer = label_anunciosSinLeer;
	}



	public Label getLabel_nAnuncios() {
		return label_nAnuncios;
	}



	public void setLabel_nAnuncios(Label label_nAnuncios) {
		this.label_nAnuncios = label_nAnuncios;
	}
	
	public HorizontalLayout gethL_contenedorAnuncios() {
		return hL_contenedorAnuncios;
	}



	public void sethL_contenedorAnuncios(HorizontalLayout hL_contenedorAnuncios) {
		this.hL_contenedorAnuncios = hL_contenedorAnuncios;
	}



	/**
     * Creates a new VistaVer_anuncios_de_artistas.
     */
    public VistaVer_anuncios_de_artistas() {
        // You can initialise any data required for the connected UI components here.
    }

}
