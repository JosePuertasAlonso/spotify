package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCancion;
import com.vaadin.flow.component.html.Image;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_estadisticas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_estadisticas")
@JsModule("./src/vistas/vista-ver_estadisticas.ts")
public class VistaVer_estadisticas extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_misEstadisticas")
	private Label label_misEstadisticas;
	@Id("hL_estadisticas")
	private HorizontalLayout hL_estadisticas;
	@Id("vL_cancionMasEscuchada")
	private Element vL_cancionMasEscuchada;
	@Id("label_cancionMasEscuchada")
	private Label label_cancionMasEscuchada;
	@Id("vistaCancion")
	private VistaCancion vistaCancion;
	@Id("vL_datosUsuario")
	private Element vL_datosUsuario;
	@Id("label_nombreUsuario")
	private Label label_nombreUsuario;
	@Id("imagen")
	private Image imagen;
	@Id("hL_seguidores")
	private HorizontalLayout hL_seguidores;
	@Id("label_seguidores")
	private Label label_seguidores;
	@Id("label_nSeguidores")
	private Label label_nSeguidores;
	@Id("vL_ultimaReproduccion")
	private Element vL_ultimaReproduccion;
	@Id("label_ultimaReproduccion")
	private Label label_ultimaReproduccion;
	@Id("vistaCancion1")
	private VistaCancion vistaCancion1;
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



	public Label getLabel_misEstadisticas() {
		return label_misEstadisticas;
	}



	public void setLabel_misEstadisticas(Label label_misEstadisticas) {
		this.label_misEstadisticas = label_misEstadisticas;
	}



	public HorizontalLayout gethL_estadisticas() {
		return hL_estadisticas;
	}



	public void sethL_estadisticas(HorizontalLayout hL_estadisticas) {
		this.hL_estadisticas = hL_estadisticas;
	}



	public Element getvL_cancionMasEscuchada() {
		return vL_cancionMasEscuchada;
	}



	public void setvL_cancionMasEscuchada(Element vL_cancionMasEscuchada) {
		this.vL_cancionMasEscuchada = vL_cancionMasEscuchada;
	}



	public Label getLabel_cancionMasEscuchada() {
		return label_cancionMasEscuchada;
	}



	public void setLabel_cancionMasEscuchada(Label label_cancionMasEscuchada) {
		this.label_cancionMasEscuchada = label_cancionMasEscuchada;
	}



	public VistaCancion getVistaCancion() {
		return vistaCancion;
	}



	public void setVistaCancion(VistaCancion vistaCancion) {
		this.vistaCancion = vistaCancion;
	}



	public Element getvL_datosUsuario() {
		return vL_datosUsuario;
	}



	public void setvL_datosUsuario(Element vL_datosUsuario) {
		this.vL_datosUsuario = vL_datosUsuario;
	}



	public Label getLabel_nombreUsuario() {
		return label_nombreUsuario;
	}



	public void setLabel_nombreUsuario(Label label_nombreUsuario) {
		this.label_nombreUsuario = label_nombreUsuario;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public HorizontalLayout gethL_seguidores() {
		return hL_seguidores;
	}



	public void sethL_seguidores(HorizontalLayout hL_seguidores) {
		this.hL_seguidores = hL_seguidores;
	}



	public Label getLabel_seguidores() {
		return label_seguidores;
	}



	public void setLabel_seguidores(Label label_seguidores) {
		this.label_seguidores = label_seguidores;
	}



	public Label getLabel_nSeguidores() {
		return label_nSeguidores;
	}



	public void setLabel_nSeguidores(Label label_nSeguidores) {
		this.label_nSeguidores = label_nSeguidores;
	}



	public Element getvL_ultimaReproduccion() {
		return vL_ultimaReproduccion;
	}



	public void setvL_ultimaReproduccion(Element vL_ultimaReproduccion) {
		this.vL_ultimaReproduccion = vL_ultimaReproduccion;
	}



	public Label getLabel_ultimaReproduccion() {
		return label_ultimaReproduccion;
	}



	public void setLabel_ultimaReproduccion(Label label_ultimaReproduccion) {
		this.label_ultimaReproduccion = label_ultimaReproduccion;
	}



	public VistaCancion getVistaCancion1() {
		return vistaCancion1;
	}



	public void setVistaCancion1(VistaCancion vistaCancion1) {
		this.vistaCancion1 = vistaCancion1;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaVer_estadisticas.
     */
    public VistaVer_estadisticas() {
        // You can initialise any data required for the connected UI components here.
    }

}
