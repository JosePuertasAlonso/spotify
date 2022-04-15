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
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

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
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	@Id("label_todosArtistasPara")
	private Label label_todosArtistasPara;
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



	public Label getLabel_todosArtistasPara() {
		return label_todosArtistasPara;
	}



	public void setLabel_todosArtistasPara(Label label_todosArtistasPara) {
		this.label_todosArtistasPara = label_todosArtistasPara;
	}




	public HorizontalLayout gethL_barraBuscador() {
		return hL_barraBuscador;
	}



	public void sethL_barraBuscador(HorizontalLayout hL_barraBuscador) {
		this.hL_barraBuscador = hL_barraBuscador;
	}



	/**
     * Creates a new VistaVer_todos_los_artistas_buscados.
     */
    public VistaVer_todos_los_artistas_buscados() {
        // You can initialise any data required for the connected UI components here.
    }

}
