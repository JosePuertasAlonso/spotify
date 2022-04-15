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
import vistas.VistaLista_de_albumes_ver_todo_administrador;

/**
 * A Designer generated component for the vista-ver_todos_los_albumes_buscados_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_todos_los_albumes_buscados_administrador")
@JsModule("./src/vistas/vista-ver_todos_los_albumes_buscados_administrador.ts")
public class VistaVer_todos_los_albumes_buscados_administrador extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_buscaModifica")
	private Label label_buscaModifica;
	@Id("label_todosAlbumesPara")
	private Label label_todosAlbumesPara;
	@Id("hL_listaDeAlbumesVerTodoAdmin")
	private HorizontalLayout hL_listaDeAlbumesVerTodoAdmin;
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



	public Label getLabel_buscaModifica() {
		return label_buscaModifica;
	}



	public void setLabel_buscaModifica(Label label_buscaModifica) {
		this.label_buscaModifica = label_buscaModifica;
	}



	public Label getLabel_todosAlbumesPara() {
		return label_todosAlbumesPara;
	}



	public void setLabel_todosAlbumesPara(Label label_todosAlbumesPara) {
		this.label_todosAlbumesPara = label_todosAlbumesPara;
	}



	public HorizontalLayout gethL_listaDeAlbumesVerTodoAdmin() {
		return hL_listaDeAlbumesVerTodoAdmin;
	}



	public void sethL_listaDeAlbumesVerTodoAdmin(HorizontalLayout hL_listaDeAlbumesVerTodoAdmin) {
		this.hL_listaDeAlbumesVerTodoAdmin = hL_listaDeAlbumesVerTodoAdmin;
	}
	


	public HorizontalLayout gethL_barraBuscador() {
		return hL_barraBuscador;
	}



	public void sethL_barraBuscador(HorizontalLayout hL_barraBuscador) {
		this.hL_barraBuscador = hL_barraBuscador;
	}



	/**
     * Creates a new VistaVer_todos_los_albumes_buscados_administrador.
     */
    public VistaVer_todos_los_albumes_buscados_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
