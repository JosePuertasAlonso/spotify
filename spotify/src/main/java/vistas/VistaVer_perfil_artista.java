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
import vistas.VistaLista_canciones;
import vistas.VistaAlbumes_del_artista;
import vistas.VistaArtistas_similares;
import vistas.VistaListas_de_reproduccion_del_artista;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_perfil_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil_artista")
@JsModule("./src/vistas/vista-ver_perfil_artista.ts")
public class VistaVer_perfil_artista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("hL_datosArtista")
	private HorizontalLayout hL_datosArtista;
	@Id("imagen")
	private Image imagen;
	@Id("vL_nombreEstilosBotones")
	private Element vL_nombreEstilosBotones;
	@Id("vL_nombreEstilos")
	private Element vL_nombreEstilos;
	@Id("label_nombre")
	private Label label_nombre;
	@Id("hL_estilos")
	private HorizontalLayout hL_estilos;
	@Id("label_estilos")
	private Label label_estilos;
	@Id("label_estilos1")
	private Label label_estilos1;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_seguir")
	private NativeButton button_seguir;
	@Id("button_siguiendo")
	private NativeButton button_siguiendo;
	@Id("vistaLista_canciones")
	private VistaLista_canciones vistaLista_canciones;
	@Id("label_albumes")
	private Label label_albumes;
	@Id("vistaAlbumes_del_artista")
	private VistaAlbumes_del_artista vistaAlbumes_del_artista;
	@Id("label_artistasSimilares")
	private Label label_artistasSimilares;
	@Id("vistaArtistas_similares")
	private VistaArtistas_similares vistaArtistas_similares;
	@Id("label_listasDelArtista")
	private Label label_listasDelArtista;
	@Id("vistaListas_de_reproduccion_del_artista")
	private VistaListas_de_reproduccion_del_artista vistaListas_de_reproduccion_del_artista;
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



	public HorizontalLayout gethL_datosArtista() {
		return hL_datosArtista;
	}



	public void sethL_datosArtista(HorizontalLayout hL_datosArtista) {
		this.hL_datosArtista = hL_datosArtista;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_nombreEstilosBotones() {
		return vL_nombreEstilosBotones;
	}



	public void setvL_nombreEstilosBotones(Element vL_nombreEstilosBotones) {
		this.vL_nombreEstilosBotones = vL_nombreEstilosBotones;
	}



	public Element getvL_nombreEstilos() {
		return vL_nombreEstilos;
	}



	public void setvL_nombreEstilos(Element vL_nombreEstilos) {
		this.vL_nombreEstilos = vL_nombreEstilos;
	}



	public Label getLabel_nombre() {
		return label_nombre;
	}



	public void setLabel_nombre(Label label_nombre) {
		this.label_nombre = label_nombre;
	}



	public HorizontalLayout gethL_estilos() {
		return hL_estilos;
	}



	public void sethL_estilos(HorizontalLayout hL_estilos) {
		this.hL_estilos = hL_estilos;
	}



	public Label getLabel_estilos() {
		return label_estilos;
	}



	public void setLabel_estilos(Label label_estilos) {
		this.label_estilos = label_estilos;
	}



	public Label getLabel_estilos1() {
		return label_estilos1;
	}



	public void setLabel_estilos1(Label label_estilos1) {
		this.label_estilos1 = label_estilos1;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_seguir() {
		return button_seguir;
	}



	public void setButton_seguir(NativeButton button_seguir) {
		this.button_seguir = button_seguir;
	}



	public NativeButton getButton_siguiendo() {
		return button_siguiendo;
	}



	public void setButton_siguiendo(NativeButton button_siguiendo) {
		this.button_siguiendo = button_siguiendo;
	}



	public VistaLista_canciones getVistaLista_canciones() {
		return vistaLista_canciones;
	}



	public void setVistaLista_canciones(VistaLista_canciones vistaLista_canciones) {
		this.vistaLista_canciones = vistaLista_canciones;
	}



	public Label getLabel_albumes() {
		return label_albumes;
	}



	public void setLabel_albumes(Label label_albumes) {
		this.label_albumes = label_albumes;
	}



	public VistaAlbumes_del_artista getVistaAlbumes_del_artista() {
		return vistaAlbumes_del_artista;
	}



	public void setVistaAlbumes_del_artista(VistaAlbumes_del_artista vistaAlbumes_del_artista) {
		this.vistaAlbumes_del_artista = vistaAlbumes_del_artista;
	}



	public Label getLabel_artistasSimilares() {
		return label_artistasSimilares;
	}



	public void setLabel_artistasSimilares(Label label_artistasSimilares) {
		this.label_artistasSimilares = label_artistasSimilares;
	}



	public VistaArtistas_similares getVistaArtistas_similares() {
		return vistaArtistas_similares;
	}



	public void setVistaArtistas_similares(VistaArtistas_similares vistaArtistas_similares) {
		this.vistaArtistas_similares = vistaArtistas_similares;
	}



	public Label getLabel_listasDelArtista() {
		return label_listasDelArtista;
	}



	public void setLabel_listasDelArtista(Label label_listasDelArtista) {
		this.label_listasDelArtista = label_listasDelArtista;
	}



	public VistaListas_de_reproduccion_del_artista getVistaListas_de_reproduccion_del_artista() {
		return vistaListas_de_reproduccion_del_artista;
	}



	public void setVistaListas_de_reproduccion_del_artista(
			VistaListas_de_reproduccion_del_artista vistaListas_de_reproduccion_del_artista) {
		this.vistaListas_de_reproduccion_del_artista = vistaListas_de_reproduccion_del_artista;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaVer_perfil_artista.
     */
    public VistaVer_perfil_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
