package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import vistas.VistaBarra_buscador;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;
import vistas.VistaLista_de_canciones_buscadas;
import vistas.VistaLista_de_artistas_buscados;
import vistas.VistaListas_de_reproduccion_buscadas;

/**
 * A Designer generated component for the vista-buscador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador")
@JsModule("./src/vistas/vista-buscador.ts")
public class VistaBuscador extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_resultadosPara")
	private Label label_resultadosPara;
	@Id("hL_cancionesArtistasListas")
	private HorizontalLayout hL_cancionesArtistasListas;
	@Id("vL_canciones")
	private Element vL_canciones;
	@Id("hL_cancionesVertodo")
	private HorizontalLayout hL_cancionesVertodo;
	@Id("label_canciones")
	private Label label_canciones;
	@Id("button_verTodoCanciones")
	private NativeButton button_verTodoCanciones;
	@Id("hL_listaDeCancionesBuscadas")
	private HorizontalLayout hL_listaDeCancionesBuscadas;
	@Id("vL_artistas")
	private Element vL_artistas;
	@Id("hL_artistasVertodo")
	private HorizontalLayout hL_artistasVertodo;
	@Id("label_artistas")
	private Label label_artistas;
	@Id("button_verTodoArtistas")
	private NativeButton button_verTodoArtistas;
	@Id("hL_listaDeArtistasBuscados")
	private HorizontalLayout hL_listaDeArtistasBuscados;
	@Id("vL_listasDeReproduccion")
	private Element vL_listasDeReproduccion;
	@Id("hL_listasVertodo")
	private HorizontalLayout hL_listasVertodo;
	@Id("label_listasDeReproduccion")
	private Label label_listasDeReproduccion;
	@Id("button_verTodoListas")
	private NativeButton button_verTodoListas;
	@Id("hL_listasDeReproduccionBuscadas")
	private HorizontalLayout hL_listasDeReproduccionBuscadas;
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




	public Label getLabel_resultadosPara() {
		return label_resultadosPara;
	}




	public void setLabel_resultadosPara(Label label_resultadosPara) {
		this.label_resultadosPara = label_resultadosPara;
	}




	public HorizontalLayout gethL_cancionesArtistasListas() {
		return hL_cancionesArtistasListas;
	}




	public void sethL_cancionesArtistasListas(HorizontalLayout hL_cancionesArtistasListas) {
		this.hL_cancionesArtistasListas = hL_cancionesArtistasListas;
	}




	public Element getvL_canciones() {
		return vL_canciones;
	}




	public void setvL_canciones(Element vL_canciones) {
		this.vL_canciones = vL_canciones;
	}




	public HorizontalLayout gethL_cancionesVertodo() {
		return hL_cancionesVertodo;
	}




	public void sethL_cancionesVertodo(HorizontalLayout hL_cancionesVertodo) {
		this.hL_cancionesVertodo = hL_cancionesVertodo;
	}




	public Label getLabel_canciones() {
		return label_canciones;
	}




	public void setLabel_canciones(Label label_canciones) {
		this.label_canciones = label_canciones;
	}




	public NativeButton getButton_verTodoCanciones() {
		return button_verTodoCanciones;
	}




	public void setButton_verTodoCanciones(NativeButton button_verTodoCanciones) {
		this.button_verTodoCanciones = button_verTodoCanciones;
	}




	public HorizontalLayout gethL_listaDeCancionesBuscadas() {
		return hL_listaDeCancionesBuscadas;
	}




	public void sethL_listaDeCancionesBuscadas(HorizontalLayout hL_listaDeCancionesBuscadas) {
		this.hL_listaDeCancionesBuscadas = hL_listaDeCancionesBuscadas;
	}




	public Element getvL_artistas() {
		return vL_artistas;
	}




	public void setvL_artistas(Element vL_artistas) {
		this.vL_artistas = vL_artistas;
	}




	public HorizontalLayout gethL_artistasVertodo() {
		return hL_artistasVertodo;
	}




	public void sethL_artistasVertodo(HorizontalLayout hL_artistasVertodo) {
		this.hL_artistasVertodo = hL_artistasVertodo;
	}




	public Label getLabel_artistas() {
		return label_artistas;
	}




	public void setLabel_artistas(Label label_artistas) {
		this.label_artistas = label_artistas;
	}




	public NativeButton getButton_verTodoArtistas() {
		return button_verTodoArtistas;
	}




	public void setButton_verTodoArtistas(NativeButton button_verTodoArtistas) {
		this.button_verTodoArtistas = button_verTodoArtistas;
	}




	public HorizontalLayout gethL_listaDeArtistasBuscados() {
		return hL_listaDeArtistasBuscados;
	}




	public void sethL_listaDeArtistasBuscados(HorizontalLayout hL_listaDeArtistasBuscados) {
		this.hL_listaDeArtistasBuscados = hL_listaDeArtistasBuscados;
	}




	public Element getvL_listasDeReproduccion() {
		return vL_listasDeReproduccion;
	}




	public void setvL_listasDeReproduccion(Element vL_listasDeReproduccion) {
		this.vL_listasDeReproduccion = vL_listasDeReproduccion;
	}




	public HorizontalLayout gethL_listasVertodo() {
		return hL_listasVertodo;
	}




	public void sethL_listasVertodo(HorizontalLayout hL_listasVertodo) {
		this.hL_listasVertodo = hL_listasVertodo;
	}




	public Label getLabel_listasDeReproduccion() {
		return label_listasDeReproduccion;
	}




	public void setLabel_listasDeReproduccion(Label label_listasDeReproduccion) {
		this.label_listasDeReproduccion = label_listasDeReproduccion;
	}




	public NativeButton getButton_verTodoListas() {
		return button_verTodoListas;
	}




	public void setButton_verTodoListas(NativeButton button_verTodoListas) {
		this.button_verTodoListas = button_verTodoListas;
	}




	public HorizontalLayout gethL_listasDeReproduccionBuscadas() {
		return hL_listasDeReproduccionBuscadas;
	}




	public void sethL_listasDeReproduccionBuscadas(HorizontalLayout hL_listasDeReproduccionBuscadas) {
		this.hL_listasDeReproduccionBuscadas = hL_listasDeReproduccionBuscadas;
	}

	



	public HorizontalLayout gethL_barraBuscador() {
		return hL_barraBuscador;
	}




	public void sethL_barraBuscador(HorizontalLayout hL_barraBuscador) {
		this.hL_barraBuscador = hL_barraBuscador;
	}




	/**
     * Creates a new VistaBuscador.
     */
    public VistaBuscador() {
        // You can initialise any data required for the connected UI components here.
    }

}
