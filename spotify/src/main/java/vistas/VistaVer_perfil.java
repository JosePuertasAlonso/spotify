package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import vistas.VistaLista_de_reproduccion_del_perfil;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_perfil template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil")
@JsModule("./src/vistas/vista-ver_perfil.ts")
public class VistaVer_perfil extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("hL_datosUsuario")
	private HorizontalLayout hL_datosUsuario;
	@Id("imagen")
	private Image imagen;
	@Id("vL_datosBotones")
	private Element vL_datosBotones;
	@Id("label_nombreUsuario")
	private Label label_nombreUsuario;
	@Id("hL_seguidores")
	private HorizontalLayout hL_seguidores;
	@Id("label_seguidores")
	private Label label_seguidores;
	@Id("label_nSeguidores")
	private Label label_nSeguidores;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_estadisticas")
	private NativeButton button_estadisticas;
	@Id("button_modificarPerfil")
	private NativeButton button_modificarPerfil;
	@Id("vL_botonesVerAnunciosEliminarRecuperar")
	private Element vL_botonesVerAnunciosEliminarRecuperar;
	@Id("button_verAnuncios")
	private NativeButton button_verAnuncios;
	@Id("button_eliminarPerfil")
	private NativeButton button_eliminarPerfil;
	@Id("button_recuperarPerfil")
	private NativeButton button_recuperarPerfil;
	@Id("vL_botonCrearAnuncio")
	private Element vL_botonCrearAnuncio;
	@Id("button_crearAnuncio")
	private NativeButton button_crearAnuncio;
	@Id("hL_misListasCrearLista")
	private HorizontalLayout hL_misListasCrearLista;
	@Id("vL_misListasnListas")
	private Element vL_misListasnListas;
	@Id("label_misListas")
	private Label label_misListas;
	@Id("label_nListas")
	private Label label_nListas;
	@Id("button_crearLista")
	private NativeButton button_crearLista;
	@Id("vL_lisaDeReproduccionDelPerfil")
	private Element vL_lisaDeReproduccionDelPerfil;
	@Id("bL_botonesEstadisticasModificar")
	private Element bL_botonesEstadisticasModificar;
	
	

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



	public HorizontalLayout gethL_datosUsuario() {
		return hL_datosUsuario;
	}



	public void sethL_datosUsuario(HorizontalLayout hL_datosUsuario) {
		this.hL_datosUsuario = hL_datosUsuario;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_datosBotones() {
		return vL_datosBotones;
	}



	public void setvL_datosBotones(Element vL_datosBotones) {
		this.vL_datosBotones = vL_datosBotones;
	}



	public Label getLabel_nombreUsuario() {
		return label_nombreUsuario;
	}



	public void setLabel_nombreUsuario(Label label_nombreUsuario) {
		this.label_nombreUsuario = label_nombreUsuario;
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



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public Element getbL_botonesEstadisticasModificar() {
		return bL_botonesEstadisticasModificar;
	}



	public void setbL_botonesEstadisticasModificar(Element bL_botonesEstadisticasModificar) {
		this.bL_botonesEstadisticasModificar = bL_botonesEstadisticasModificar;
	}



	public NativeButton getButton_estadisticas() {
		return button_estadisticas;
	}



	public void setButton_estadisticas(NativeButton button_estadisticas) {
		this.button_estadisticas = button_estadisticas;
	}



	public NativeButton getButton_modificarPerfil() {
		return button_modificarPerfil;
	}



	public void setButton_modificarPerfil(NativeButton button_modificarPerfil) {
		this.button_modificarPerfil = button_modificarPerfil;
	}



	public Element getvL_botonesVerAnunciosEliminarRecuperar() {
		return vL_botonesVerAnunciosEliminarRecuperar;
	}



	public void setvL_botonesVerAnunciosEliminarRecuperar(Element vL_botonesVerAnunciosEliminarRecuperar) {
		this.vL_botonesVerAnunciosEliminarRecuperar = vL_botonesVerAnunciosEliminarRecuperar;
	}



	public NativeButton getButton_verAnuncios() {
		return button_verAnuncios;
	}



	public void setButton_verAnuncios(NativeButton button_verAnuncios) {
		this.button_verAnuncios = button_verAnuncios;
	}



	public NativeButton getButton_eliminarPerfil() {
		return button_eliminarPerfil;
	}



	public void setButton_eliminarPerfil(NativeButton button_eliminarPerfil) {
		this.button_eliminarPerfil = button_eliminarPerfil;
	}



	public NativeButton getButton_recuperarPerfil() {
		return button_recuperarPerfil;
	}



	public void setButton_recuperarPerfil(NativeButton button_recuperarPerfil) {
		this.button_recuperarPerfil = button_recuperarPerfil;
	}



	public Element getvL_botonCrearAnuncio() {
		return vL_botonCrearAnuncio;
	}



	public void setvL_botonCrearAnuncio(Element vL_botonCrearAnuncio) {
		this.vL_botonCrearAnuncio = vL_botonCrearAnuncio;
	}



	public NativeButton getButton_crearAnuncio() {
		return button_crearAnuncio;
	}



	public void setButton_crearAnuncio(NativeButton button_crearAnuncio) {
		this.button_crearAnuncio = button_crearAnuncio;
	}



	public HorizontalLayout gethL_misListasCrearLista() {
		return hL_misListasCrearLista;
	}



	public void sethL_misListasCrearLista(HorizontalLayout hL_misListasCrearLista) {
		this.hL_misListasCrearLista = hL_misListasCrearLista;
	}



	public Element getvL_misListasnListas() {
		return vL_misListasnListas;
	}



	public void setvL_misListasnListas(Element vL_misListasnListas) {
		this.vL_misListasnListas = vL_misListasnListas;
	}



	public Label getLabel_misListas() {
		return label_misListas;
	}



	public void setLabel_misListas(Label label_misListas) {
		this.label_misListas = label_misListas;
	}



	public Label getLabel_nListas() {
		return label_nListas;
	}



	public void setLabel_nListas(Label label_nListas) {
		this.label_nListas = label_nListas;
	}



	public NativeButton getButton_crearLista() {
		return button_crearLista;
	}



	public void setButton_crearLista(NativeButton button_crearLista) {
		this.button_crearLista = button_crearLista;
	}



	public Element getvL_lisaDeReproduccionDelPerfil() {
		return vL_lisaDeReproduccionDelPerfil;
	}



	public void setvL_lisaDeReproduccionDelPerfil(Element vL_lisaDeReproduccionDelPerfil) {
		this.vL_lisaDeReproduccionDelPerfil = vL_lisaDeReproduccionDelPerfil;
	}




	/**
     * Creates a new VistaVer_perfil.
     */
    public VistaVer_perfil() {
        // You can initialise any data required for the connected UI components here.
    }

}
