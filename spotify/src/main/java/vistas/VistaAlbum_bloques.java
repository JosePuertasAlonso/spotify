package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-album_bloques template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album_bloques")
@JsModule("./src/vistas/vista-album_bloques.ts")
public class VistaAlbum_bloques extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("imagen")
	private Image imagen;
	@Id("hL_tituloPlay")
	private HorizontalLayout hL_tituloPlay;
	@Id("vL_tituloArtista")
	private Element vL_tituloArtista;
	@Id("label_titulo")
	private Label label_titulo;
	@Id("label_artista")
	private Label label_artista;
	@Id("hL_botonPlay")
	private HorizontalLayout hL_botonPlay;
	@Id("button_play")
	private NativeButton button_play;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Image getImagen() {
		return imagen;
	}



	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}



	public HorizontalLayout gethL_tituloPlay() {
		return hL_tituloPlay;
	}



	public void sethL_tituloPlay(HorizontalLayout hL_tituloPlay) {
		this.hL_tituloPlay = hL_tituloPlay;
	}



	public Element getvL_tituloArtista() {
		return vL_tituloArtista;
	}



	public void setvL_tituloArtista(Element vL_tituloArtista) {
		this.vL_tituloArtista = vL_tituloArtista;
	}



	public Label getLabel_titulo() {
		return label_titulo;
	}



	public void setLabel_titulo(Label label_titulo) {
		this.label_titulo = label_titulo;
	}



	public Label getLabel_artista() {
		return label_artista;
	}



	public void setLabel_artista(Label label_artista) {
		this.label_artista = label_artista;
	}



	public HorizontalLayout gethL_botonPlay() {
		return hL_botonPlay;
	}



	public void sethL_botonPlay(HorizontalLayout hL_botonPlay) {
		this.hL_botonPlay = hL_botonPlay;
	}



	public NativeButton getButton_play() {
		return button_play;
	}



	public void setButton_play(NativeButton button_play) {
		this.button_play = button_play;
	}



	/**
     * Creates a new VistaAlbum_bloques.
     */
    public VistaAlbum_bloques() {
        // You can initialise any data required for the connected UI components here.
    }

}
