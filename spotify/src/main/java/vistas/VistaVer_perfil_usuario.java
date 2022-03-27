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
import vistas.VistaListas_del_usuario;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_perfil_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_perfil_usuario")
@JsModule("./src/vistas/vista-ver_perfil_usuario.ts")
public class VistaVer_perfil_usuario extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("hL_datosUsuario")
	private HorizontalLayout hL_datosUsuario;
	@Id("imagen")
	private Image imagen;
	@Id("vL_datosBotones")
	private Element vL_datosBotones;
	@Id("vL_nombreSeguidores")
	private Element vL_nombreSeguidores;
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
	@Id("button_seguir")
	private NativeButton button_seguir;
	@Id("button_siguiendo")
	private NativeButton button_siguiendo;
	@Id("label_listasDeReproduccionUsuario")
	private Label label_listasDeReproduccionUsuario;
	@Id("vL_listasDelUsuario")
	private Element vL_listasDelUsuario;
	@Id("vistaListas_del_usuario")
	private VistaListas_del_usuario vistaListas_del_usuario;
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



	public Element getvL_nombreSeguidores() {
		return vL_nombreSeguidores;
	}



	public void setvL_nombreSeguidores(Element vL_nombreSeguidores) {
		this.vL_nombreSeguidores = vL_nombreSeguidores;
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



	public Label getLabel_listasDeReproduccionUsuario() {
		return label_listasDeReproduccionUsuario;
	}



	public void setLabel_listasDeReproduccionUsuario(Label label_listasDeReproduccionUsuario) {
		this.label_listasDeReproduccionUsuario = label_listasDeReproduccionUsuario;
	}



	public Element getvL_listasDelUsuario() {
		return vL_listasDelUsuario;
	}



	public void setvL_listasDelUsuario(Element vL_listasDelUsuario) {
		this.vL_listasDelUsuario = vL_listasDelUsuario;
	}



	public VistaListas_del_usuario getVistaListas_del_usuario() {
		return vistaListas_del_usuario;
	}



	public void setVistaListas_del_usuario(VistaListas_del_usuario vistaListas_del_usuario) {
		this.vistaListas_del_usuario = vistaListas_del_usuario;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaVer_perfil_usuario.
     */
    public VistaVer_perfil_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
