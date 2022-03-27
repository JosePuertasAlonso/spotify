package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import vistas.VistaBarra_buscador;
import com.vaadin.flow.component.html.Label;
import vistas.VistaLista_de_artistas_ver_todo;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-ver_todos_los_artistas_buscados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ver_todos_los_artistas_buscados")
@JsModule("./src/vistas/vista-ver_todos_los_artistas_buscados.ts")
public class VistaVer_todos_los_artistas_buscados extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("vistaBarra_buscador")
	private VistaBarra_buscador vistaBarra_buscador;
	@Id("label_todosArtistasPara")
	private Label label_todosArtistasPara;
	@Id("vistaLista_de_artistas_ver_todo")
	private VistaLista_de_artistas_ver_todo vistaLista_de_artistas_ver_todo;
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



	public Label getLabel_todosArtistasPara() {
		return label_todosArtistasPara;
	}



	public void setLabel_todosArtistasPara(Label label_todosArtistasPara) {
		this.label_todosArtistasPara = label_todosArtistasPara;
	}



	public VistaLista_de_artistas_ver_todo getVistaLista_de_artistas_ver_todo() {
		return vistaLista_de_artistas_ver_todo;
	}



	public void setVistaLista_de_artistas_ver_todo(VistaLista_de_artistas_ver_todo vistaLista_de_artistas_ver_todo) {
		this.vistaLista_de_artistas_ver_todo = vistaLista_de_artistas_ver_todo;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaVer_todos_los_artistas_buscados.
     */
    public VistaVer_todos_los_artistas_buscados() {
        // You can initialise any data required for the connected UI components here.
    }

}
