package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;
import vistas.VistaBarra_buscador;
import vistas.VistaCanciones_buscadas_a_anadir;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-buscar_canciones_a_anadir template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscar_canciones_a_anadir")
@JsModule("./src/vistas/vista-buscar_canciones_a_anadir.ts")
public class VistaBuscar_canciones_a_anadir extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("hL_anadeCancionVolver")
	private HorizontalLayout hL_anadeCancionVolver;
	@Id("label_anadeCancion")
	private Label label_anadeCancion;
	@Id("button_volver")
	private NativeButton button_volver;
	@Id("hL_todasCancionesNuevaCancion")
	private HorizontalLayout hL_todasCancionesNuevaCancion;
	@Id("label_todasCancionesPara")
	private Label label_todasCancionesPara;
	@Id("button_nuevaCancion")
	private NativeButton button_nuevaCancion;
	@Id("vL_cancionesBuscadasAAnadir")
	private Element vL_cancionesBuscadasAAnadir;
	@Id("hL_barraBuscador")
	private HorizontalLayout hL_barraBuscador;
	
	

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



	public HorizontalLayout gethL_anadeCancionVolver() {
		return hL_anadeCancionVolver;
	}



	public void sethL_anadeCancionVolver(HorizontalLayout hL_anadeCancionVolver) {
		this.hL_anadeCancionVolver = hL_anadeCancionVolver;
	}



	public Label getLabel_anadeCancion() {
		return label_anadeCancion;
	}



	public void setLabel_anadeCancion(Label label_anadeCancion) {
		this.label_anadeCancion = label_anadeCancion;
	}



	public NativeButton getButton_volver() {
		return button_volver;
	}



	public void setButton_volver(NativeButton button_volver) {
		this.button_volver = button_volver;
	}



	public HorizontalLayout gethL_todasCancionesNuevaCancion() {
		return hL_todasCancionesNuevaCancion;
	}



	public void sethL_todasCancionesNuevaCancion(HorizontalLayout hL_todasCancionesNuevaCancion) {
		this.hL_todasCancionesNuevaCancion = hL_todasCancionesNuevaCancion;
	}



	public Label getLabel_todasCancionesPara() {
		return label_todasCancionesPara;
	}



	public void setLabel_todasCancionesPara(Label label_todasCancionesPara) {
		this.label_todasCancionesPara = label_todasCancionesPara;
	}



	public NativeButton getButton_nuevaCancion() {
		return button_nuevaCancion;
	}



	public void setButton_nuevaCancion(NativeButton button_nuevaCancion) {
		this.button_nuevaCancion = button_nuevaCancion;
	}



	public Element getvL_cancionesBuscadasAAnadir() {
		return vL_cancionesBuscadasAAnadir;
	}



	public void setvL_cancionesBuscadasAAnadir(Element vL_cancionesBuscadasAAnadir) {
		this.vL_cancionesBuscadasAAnadir = vL_cancionesBuscadasAAnadir;
	}
	
	

	public HorizontalLayout gethL_barraBuscador() {
		return hL_barraBuscador;
	}



	public void sethL_barraBuscador(HorizontalLayout hL_barraBuscador) {
		this.hL_barraBuscador = hL_barraBuscador;
	}



	/**
     * Creates a new VistaBuscar_canciones_a_anadir.
     */
    public VistaBuscar_canciones_a_anadir() {
        // You can initialise any data required for the connected UI components here.
    }

}
