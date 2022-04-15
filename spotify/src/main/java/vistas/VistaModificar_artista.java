package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaEstilos;
import com.vaadin.flow.component.html.NativeButton;

/**
 * A Designer generated component for the vista-modificar_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-modificar_artista")
@JsModule("./src/vistas/vista-modificar_artista.ts")
public class VistaModificar_artista extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("label_modificarArtista")
	private Label label_modificarArtista;
	@Id("vL_fotoBoton")
	private Element vL_fotoBoton;
	@Id("foto")
	private Image foto;
	@Id("file")
	private Input file;
	@Id("labelBoton_elegirFoto")
	private Label labelBoton_elegirFoto;
	@Id("vL_estilosArtista")
	private Element vL_estilosArtista;
	@Id("label_estilosArtista")
	private Label label_estilosArtista;
	@Id("hL_estilos")
	private HorizontalLayout hL_estilos;
	@Id("button_modificarArtista")
	private NativeButton button_modificarArtista;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public Label getLabel_modificarArtista() {
		return label_modificarArtista;
	}



	public void setLabel_modificarArtista(Label label_modificarArtista) {
		this.label_modificarArtista = label_modificarArtista;
	}



	public Element getvL_fotoBoton() {
		return vL_fotoBoton;
	}



	public void setvL_fotoBoton(Element vL_fotoBoton) {
		this.vL_fotoBoton = vL_fotoBoton;
	}



	public Image getFoto() {
		return foto;
	}



	public void setFoto(Image foto) {
		this.foto = foto;
	}



	public Input getFile() {
		return file;
	}



	public void setFile(Input file) {
		this.file = file;
	}



	public Label getLabelBoton_elegirFoto() {
		return labelBoton_elegirFoto;
	}



	public void setLabelBoton_elegirFoto(Label labelBoton_elegirFoto) {
		this.labelBoton_elegirFoto = labelBoton_elegirFoto;
	}



	public Element getvL_estilosArtista() {
		return vL_estilosArtista;
	}



	public void setvL_estilosArtista(Element vL_estilosArtista) {
		this.vL_estilosArtista = vL_estilosArtista;
	}



	public Label getLabel_estilosArtista() {
		return label_estilosArtista;
	}



	public void setLabel_estilosArtista(Label label_estilosArtista) {
		this.label_estilosArtista = label_estilosArtista;
	}



	public HorizontalLayout gethL_estilos() {
		return hL_estilos;
	}



	public void sethL_estilos(HorizontalLayout hL_estilos) {
		this.hL_estilos = hL_estilos;
	}



	public NativeButton getButton_modificarArtista() {
		return button_modificarArtista;
	}



	public void setButton_modificarArtista(NativeButton button_modificarArtista) {
		this.button_modificarArtista = button_modificarArtista;
	}



	/**
     * Creates a new VistaModificar_artista.
     */
    public VistaModificar_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
