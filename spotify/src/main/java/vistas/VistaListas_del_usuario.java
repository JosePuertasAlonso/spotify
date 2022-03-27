package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_reproduccion_lista;

/**
 * A Designer generated component for the vista-listas_del_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-listas_del_usuario")
@JsModule("./src/vistas/vista-listas_del_usuario.ts")
public class VistaListas_del_usuario extends LitTemplate {

    @Id("vL_contenedorListaReproduccionLista")
	private Element vL_contenedorListaReproduccionLista;
	@Id("vistaLista_de_reproduccion_lista")
	private VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista;
	@Id("vistaLista_de_reproduccion_lista1")
	private VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista1;
	@Id("vistaLista_de_reproduccion_lista2")
	private VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista2;
	@Id("vistaLista_de_reproduccion_lista3")
	private VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista3;
	
	

	public Element getvL_contenedorListaReproduccionLista() {
		return vL_contenedorListaReproduccionLista;
	}



	public void setvL_contenedorListaReproduccionLista(Element vL_contenedorListaReproduccionLista) {
		this.vL_contenedorListaReproduccionLista = vL_contenedorListaReproduccionLista;
	}



	public VistaLista_de_reproduccion_lista getVistaLista_de_reproduccion_lista() {
		return vistaLista_de_reproduccion_lista;
	}



	public void setVistaLista_de_reproduccion_lista(VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista) {
		this.vistaLista_de_reproduccion_lista = vistaLista_de_reproduccion_lista;
	}



	public VistaLista_de_reproduccion_lista getVistaLista_de_reproduccion_lista1() {
		return vistaLista_de_reproduccion_lista1;
	}



	public void setVistaLista_de_reproduccion_lista1(VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista1) {
		this.vistaLista_de_reproduccion_lista1 = vistaLista_de_reproduccion_lista1;
	}



	public VistaLista_de_reproduccion_lista getVistaLista_de_reproduccion_lista2() {
		return vistaLista_de_reproduccion_lista2;
	}



	public void setVistaLista_de_reproduccion_lista2(VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista2) {
		this.vistaLista_de_reproduccion_lista2 = vistaLista_de_reproduccion_lista2;
	}



	public VistaLista_de_reproduccion_lista getVistaLista_de_reproduccion_lista3() {
		return vistaLista_de_reproduccion_lista3;
	}



	public void setVistaLista_de_reproduccion_lista3(VistaLista_de_reproduccion_lista vistaLista_de_reproduccion_lista3) {
		this.vistaLista_de_reproduccion_lista3 = vistaLista_de_reproduccion_lista3;
	}



	/**
     * Creates a new VistaListas_del_usuario.
     */
    public VistaListas_del_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
