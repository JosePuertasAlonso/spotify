package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.html.Label;
import vistas.VistaBarra_buscador;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.NativeButton;
import vistas.VistaLista_de_canciones_buscadas_administrador;
import vistas.VistaLista_de_albumes_buscados_administrador;
import vistas.VistaLista_de_artistas_buscados_administrador;
import vistas.VistaLista_de_perfiles_buscados_administrador;

/**
 * A Designer generated component for the vista-buscador_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-buscador_administrador")
@JsModule("./src/vistas/vista-buscador_administrador.ts")
public class VistaBuscador_administrador extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_buscaModificaElementos")
	private Label label_buscaModificaElementos;
	@Id("label_resultadosPara")
	private Label label_resultadosPara;
	@Id("hL_cancionesAlbumesArtistasPerfiles")
	private HorizontalLayout hL_cancionesAlbumesArtistasPerfiles;
	@Id("vL_canciones")
	private Element vL_canciones;
	@Id("hL_cancionesVertodo")
	private HorizontalLayout hL_cancionesVertodo;
	@Id("label_canciones")
	private Label label_canciones;
	@Id("button_verTodoCanciones")
	private NativeButton button_verTodoCanciones;
	@Id("hL_listaDeCancionesBuscadasAdmin")
	private HorizontalLayout hL_listaDeCancionesBuscadasAdmin;
	@Id("vL_albumes")
	private Element vL_albumes;
	@Id("hL_albumesVertodo")
	private HorizontalLayout hL_albumesVertodo;
	@Id("label_albumes")
	private Label label_albumes;
	@Id("button_verTodoAlbumes")
	private NativeButton button_verTodoAlbumes;
	@Id("hL_listaDeAlbumesBuscadosAdmin")
	private HorizontalLayout hL_listaDeAlbumesBuscadosAdmin;
	@Id("vL_artistasPerfiles")
	private Element vL_artistasPerfiles;
	@Id("vL_artistas")
	private Element vL_artistas;
	@Id("hL_artistasVertodo")
	private HorizontalLayout hL_artistasVertodo;
	@Id("label_artistas")
	private Label label_artistas;
	@Id("button_verTodoArtistas")
	private NativeButton button_verTodoArtistas;
	@Id("hL_listaDeArtistasBuscadosAdmin")
	private HorizontalLayout hL_listaDeArtistasBuscadosAdmin;
	@Id("vL_perfiles")
	private Element vL_perfiles;
	@Id("hL_perfilesVertodo")
	private HorizontalLayout hL_perfilesVertodo;
	@Id("label_perfiles")
	private Label label_perfiles;
	@Id("button_verTodoPerfiles")
	private NativeButton button_verTodoPerfiles;
	@Id("hL_listaDePerfilesBuscadosAdmin")
	private HorizontalLayout hL_listaDePerfilesBuscadosAdmin;
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




	public Label getLabel_buscaModificaElementos() {
		return label_buscaModificaElementos;
	}




	public void setLabel_buscaModificaElementos(Label label_buscaModificaElementos) {
		this.label_buscaModificaElementos = label_buscaModificaElementos;
	}




	public Label getLabel_resultadosPara() {
		return label_resultadosPara;
	}




	public void setLabel_resultadosPara(Label label_resultadosPara) {
		this.label_resultadosPara = label_resultadosPara;
	}




	public HorizontalLayout gethL_cancionesAlbumesArtistasPerfiles() {
		return hL_cancionesAlbumesArtistasPerfiles;
	}




	public void sethL_cancionesAlbumesArtistasPerfiles(HorizontalLayout hL_cancionesAlbumesArtistasPerfiles) {
		this.hL_cancionesAlbumesArtistasPerfiles = hL_cancionesAlbumesArtistasPerfiles;
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




	public HorizontalLayout gethL_listaDeCancionesBuscadasAdmin() {
		return hL_listaDeCancionesBuscadasAdmin;
	}




	public void sethL_listaDeCancionesBuscadasAdmin(HorizontalLayout hL_listaDeCancionesBuscadasAdmin) {
		this.hL_listaDeCancionesBuscadasAdmin = hL_listaDeCancionesBuscadasAdmin;
	}




	public Element getvL_albumes() {
		return vL_albumes;
	}




	public void setvL_albumes(Element vL_albumes) {
		this.vL_albumes = vL_albumes;
	}




	public HorizontalLayout gethL_albumesVertodo() {
		return hL_albumesVertodo;
	}




	public void sethL_albumesVertodo(HorizontalLayout hL_albumesVertodo) {
		this.hL_albumesVertodo = hL_albumesVertodo;
	}




	public Label getLabel_albumes() {
		return label_albumes;
	}




	public void setLabel_albumes(Label label_albumes) {
		this.label_albumes = label_albumes;
	}




	public NativeButton getButton_verTodoAlbumes() {
		return button_verTodoAlbumes;
	}




	public void setButton_verTodoAlbumes(NativeButton button_verTodoAlbumes) {
		this.button_verTodoAlbumes = button_verTodoAlbumes;
	}




	public HorizontalLayout gethL_listaDeAlbumesBuscadosAdmin() {
		return hL_listaDeAlbumesBuscadosAdmin;
	}




	public void sethL_listaDeAlbumesBuscadosAdmin(HorizontalLayout hL_listaDeAlbumesBuscadosAdmin) {
		this.hL_listaDeAlbumesBuscadosAdmin = hL_listaDeAlbumesBuscadosAdmin;
	}






	public Element getvL_artistasPerfiles() {
		return vL_artistasPerfiles;
	}




	public void setvL_artistasPerfiles(Element vL_artistasPerfiles) {
		this.vL_artistasPerfiles = vL_artistasPerfiles;
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




	public HorizontalLayout gethL_listaDeArtistasBuscadosAdmin() {
		return hL_listaDeArtistasBuscadosAdmin;
	}




	public void sethL_listaDeArtistasBuscadosAdmin(HorizontalLayout hL_listaDeArtistasBuscadosAdmin) {
		this.hL_listaDeArtistasBuscadosAdmin = hL_listaDeArtistasBuscadosAdmin;
	}




	public Element getvL_perfiles() {
		return vL_perfiles;
	}




	public void setvL_perfiles(Element vL_perfiles) {
		this.vL_perfiles = vL_perfiles;
	}




	public HorizontalLayout gethL_perfilesVertodo() {
		return hL_perfilesVertodo;
	}




	public void sethL_perfilesVertodo(HorizontalLayout hL_perfilesVertodo) {
		this.hL_perfilesVertodo = hL_perfilesVertodo;
	}




	public Label getLabel_perfiles() {
		return label_perfiles;
	}




	public void setLabel_perfiles(Label label_perfiles) {
		this.label_perfiles = label_perfiles;
	}




	public NativeButton getButton_verTodoPerfiles() {
		return button_verTodoPerfiles;
	}




	public void setButton_verTodoPerfiles(NativeButton button_verTodoPerfiles) {
		this.button_verTodoPerfiles = button_verTodoPerfiles;
	}




	public HorizontalLayout gethL_listaDePerfilesBuscadosAdmin() {
		return hL_listaDePerfilesBuscadosAdmin;
	}




	public void sethL_listaDePerfilesBuscadosAdmin(HorizontalLayout hL_listaDePerfilesBuscadosAdmin) {
		this.hL_listaDePerfilesBuscadosAdmin = hL_listaDePerfilesBuscadosAdmin;
	}




	public HorizontalLayout gethL_barraBuscador() {
		return hL_barraBuscador;
	}




	public void sethL_barraBuscador(HorizontalLayout hL_barraBuscador) {
		this.hL_barraBuscador = hL_barraBuscador;
	}




	/**
     * Creates a new VistaBuscador_administrador.
     */
    public VistaBuscador_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
