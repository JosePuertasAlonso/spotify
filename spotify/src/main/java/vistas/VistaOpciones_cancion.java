package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-opciones_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-opciones_cancion")
@JsModule("./src/vistas/vista-opciones_cancion.ts")
public class VistaOpciones_cancion extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_opciones")
	private Label label_opciones;
	@Id("hL_botonesImagen")
	private HorizontalLayout hL_botonesImagen;
	@Id("vL_botones")
	private Element vL_botones;
	@Id("button_reproducir")
	private NativeButton button_reproducir;
	@Id("button_anadirFavoritos")
	private NativeButton button_anadirFavoritos;
	@Id("button_anadirLista")
	private NativeButton button_anadirLista;
	@Id("button_verArtista")
	private NativeButton button_verArtista;
	@Id("button_verAlbum")
	private NativeButton button_verAlbum;
	@Id("vL_imagen")
	private Element vL_imagen;
	@Id("imagen")
	private Image imagen;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_opciones() {
		return label_opciones;
	}



	public void setLabel_opciones(Label label_opciones) {
		this.label_opciones = label_opciones;
	}



	public HorizontalLayout gethL_botonesImagen() {
		return hL_botonesImagen;
	}



	public void sethL_botonesImagen(HorizontalLayout hL_botonesImagen) {
		this.hL_botonesImagen = hL_botonesImagen;
	}



	public Element getvL_botones() {
		return vL_botones;
	}



	public void setvL_botones(Element vL_botones) {
		this.vL_botones = vL_botones;
	}



	public NativeButton getButton_reproducir() {
		return button_reproducir;
	}



	public void setButton_reproducir(NativeButton button_reproducir) {
		this.button_reproducir = button_reproducir;
	}



	public NativeButton getButton_anadirFavoritos() {
		return button_anadirFavoritos;
	}



	public void setButton_anadirFavoritos(NativeButton button_anadirFavoritos) {
		this.button_anadirFavoritos = button_anadirFavoritos;
	}



	public NativeButton getButton_anadirLista() {
		return button_anadirLista;
	}



	public void setButton_anadirLista(NativeButton button_anadirLista) {
		this.button_anadirLista = button_anadirLista;
	}



	public NativeButton getButton_verArtista() {
		return button_verArtista;
	}



	public void setButton_verArtista(NativeButton button_verArtista) {
		this.button_verArtista = button_verArtista;
	}



	public NativeButton getButton_verAlbum() {
		return button_verAlbum;
	}



	public void setButton_verAlbum(NativeButton button_verAlbum) {
		this.button_verAlbum = button_verAlbum;
	}



	public Element getvL_imagen() {
		return vL_imagen;
	}



	public void setvL_imagen(Element vL_imagen) {
		this.vL_imagen = vL_imagen;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	/**
     * Creates a new VistaOpciones_cancion.
     */
    public VistaOpciones_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

}
