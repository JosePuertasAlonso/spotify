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
import vistas.VistaCanciones_de_lista;
import vistas.VistaCanciones_de_lista_a_eliminar;
import vistas.VistaReproductor_resumido;
import com.vaadin.flow.component.html.Input;
import vistas.VistaCanciones_del_album;

/**
 * A Designer generated component for the vista-lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista")
@JsModule("./src/vistas/vista-lista.ts")
public class VistaLista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("hL_imagenTituloBotones")
	private HorizontalLayout hL_imagenTituloBotones;
	@Id("imagen")
	private Image imagen;
	@Id("vL_tituloCreadorBotones")
	private Element vL_tituloCreadorBotones;
	@Id("vL_tituloCreador")
	private Element vL_tituloCreador;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("button_aceptar")
	private NativeButton button_aceptar;
	@Id("label_creador")
	private Label label_creador;
	@Id("hL_botones")
	private HorizontalLayout hL_botones;
	@Id("button_modificar")
	private NativeButton button_modificar;
	@Id("button_compartir")
	private NativeButton button_compartir;
	@Id("button_guardar")
	private NativeButton button_guardar;
	@Id("button_eliminar")
	private NativeButton button_eliminar;
	@Id("label_fechaPublicacion")
	private Label label_fechaPublicacion;
	@Id("hL_nCancionesAnadir")
	private HorizontalLayout hL_nCancionesAnadir;
	@Id("label_nCanciones")
	private Label label_nCanciones;
	@Id("button_anadirCancion")
	private NativeButton button_anadirCancion;
	@Id("vL_cancionesDeListaAlbumListaeliminar")
	private Element vL_cancionesDeListaAlbumListaeliminar;
	@Id("hL_tituloAceptar")
	private HorizontalLayout hL_tituloAceptar;
	@Id("input_titulo")
	private Input input_titulo;
	
	

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



	public HorizontalLayout gethL_imagenTituloBotones() {
		return hL_imagenTituloBotones;
	}



	public void sethL_imagenTituloBotones(HorizontalLayout hL_imagenTituloBotones) {
		this.hL_imagenTituloBotones = hL_imagenTituloBotones;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public Element getvL_tituloCreadorBotones() {
		return vL_tituloCreadorBotones;
	}



	public void setvL_tituloCreadorBotones(Element vL_tituloCreadorBotones) {
		this.vL_tituloCreadorBotones = vL_tituloCreadorBotones;
	}



	public Element getvL_tituloCreador() {
		return vL_tituloCreador;
	}



	public void setvL_tituloCreador(Element vL_tituloCreador) {
		this.vL_tituloCreador = vL_tituloCreador;
	}



	public Label getLabel_titulo() {
		return label_titulo;
	}



	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}



	public NativeButton getButton_aceptar() {
		return button_aceptar;
	}



	public void setButton_aceptar(NativeButton button_aceptar) {
		this.button_aceptar = button_aceptar;
	}



	public Label getLabel_creador() {
		return label_creador;
	}



	public void setLabel_creador(Label label_creador) {
		this.label_creador = label_creador;
	}



	public HorizontalLayout gethL_botones() {
		return hL_botones;
	}



	public void sethL_botones(HorizontalLayout hL_botones) {
		this.hL_botones = hL_botones;
	}



	public NativeButton getButton_modificar() {
		return button_modificar;
	}



	public void setButton_modificar(NativeButton button_modificar) {
		this.button_modificar = button_modificar;
	}



	public NativeButton getButton_compartir() {
		return button_compartir;
	}



	public void setButton_compartir(NativeButton button_compartir) {
		this.button_compartir = button_compartir;
	}



	public NativeButton getButton_guardar() {
		return button_guardar;
	}



	public void setButton_guardar(NativeButton button_guardar) {
		this.button_guardar = button_guardar;
	}



	public NativeButton getButton_eliminar() {
		return button_eliminar;
	}



	public void setButton_eliminar(NativeButton button_eliminar) {
		this.button_eliminar = button_eliminar;
	}



	public Label getLabel_fechaPublicacion() {
		return label_fechaPublicacion;
	}



	public void setLabel_fechaPublicacion(Label label_fechaPublicacion) {
		this.label_fechaPublicacion = label_fechaPublicacion;
	}



	public HorizontalLayout gethL_nCancionesAnadir() {
		return hL_nCancionesAnadir;
	}



	public void sethL_nCancionesAnadir(HorizontalLayout hL_nCancionesAnadir) {
		this.hL_nCancionesAnadir = hL_nCancionesAnadir;
	}



	public Label getLabel_nCanciones() {
		return label_nCanciones;
	}



	public void setLabel_nCanciones(Label label_nCanciones) {
		this.label_nCanciones = label_nCanciones;
	}



	public NativeButton getButton_anadirCancion() {
		return button_anadirCancion;
	}



	public void setButton_anadirCancion(NativeButton button_anadirCancion) {
		this.button_anadirCancion = button_anadirCancion;
	}



	public Element getvL_cancionesDeListaAlbumListaeliminar() {
		return vL_cancionesDeListaAlbumListaeliminar;
	}



	public void setvL_cancionesDeListaAlbumListaeliminar(Element vL_cancionesDeListaAlbumListaeliminar) {
		this.vL_cancionesDeListaAlbumListaeliminar = vL_cancionesDeListaAlbumListaeliminar;
	}
	


	public HorizontalLayout gethL_tituloAceptar() {
		return hL_tituloAceptar;
	}



	public void sethL_tituloAceptar(HorizontalLayout hL_tituloAceptar) {
		this.hL_tituloAceptar = hL_tituloAceptar;
	}



	public Input getInput_titulo() {
		return input_titulo;
	}



	public void setInput_titulo(Input input_titulo) {
		this.input_titulo = input_titulo;
	}




	/**
     * Creates a new VistaLista.
     */
    public VistaLista() {
        // You can initialise any data required for the connected UI components here.
    }

}
