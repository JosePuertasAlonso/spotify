package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import vistas.VistaBarra_buscador;
import com.vaadin.flow.component.html.Label;
import vistas.VistaLista_canciones;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_todas_las_canciones_buscadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_todas_las_canciones_buscadas")
@JsModule("./src/vistas/vista-ver_todas_las_canciones_buscadas.ts")
public class VistaVer_todas_las_canciones_buscadas extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("vistaBarra_buscador")
	private VistaBarra_buscador vistaBarra_buscador;
	@Id("label_todasLasCancionesPara")
	private Label label_todasLasCancionesPara;
	@Id("vistaLista_canciones")
	private VistaLista_canciones vistaLista_canciones;
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



	public VistaBarra_buscador getVistaBarra_buscador() {
		return vistaBarra_buscador;
	}



	public void setVistaBarra_buscador(VistaBarra_buscador vistaBarra_buscador) {
		this.vistaBarra_buscador = vistaBarra_buscador;
	}



	public Label getLabel_todasLasCancionesPara() {
		return label_todasLasCancionesPara;
	}



	public void setLabel_todasLasCancionesPara(Label label_todasLasCancionesPara) {
		this.label_todasLasCancionesPara = label_todasLasCancionesPara;
	}



	public VistaLista_canciones getVistaLista_canciones() {
		return vistaLista_canciones;
	}



	public void setVistaLista_canciones(VistaLista_canciones vistaLista_canciones) {
		this.vistaLista_canciones = vistaLista_canciones;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaVer_todas_las_canciones_buscadas.
     */
    public VistaVer_todas_las_canciones_buscadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
