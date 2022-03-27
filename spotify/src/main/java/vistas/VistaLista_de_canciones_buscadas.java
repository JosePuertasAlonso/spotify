package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_lista;

/**
 * A Designer generated component for the vista-lista_de_canciones_buscadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones_buscadas")
@JsModule("./src/vistas/vista-lista_de_canciones_buscadas.ts")
public class VistaLista_de_canciones_buscadas extends LitTemplate {

    @Id("vL_contenedorCancionLista")
	private Element vL_contenedorCancionLista;
	@Id("vistaCancion_lista")
	private VistaCancion_lista vistaCancion_lista;
	@Id("vistaCancion_lista1")
	private VistaCancion_lista vistaCancion_lista1;
	@Id("vistaCancion_lista2")
	private VistaCancion_lista vistaCancion_lista2;
	@Id("vistaCancion_lista3")
	private VistaCancion_lista vistaCancion_lista3;
	@Id("vistaCancion_lista4")
	private VistaCancion_lista vistaCancion_lista4;
	@Id("vistaCancion_lista5")
	private VistaCancion_lista vistaCancion_lista5;
	
	

	public Element getvL_contenedorCancionLista() {
		return vL_contenedorCancionLista;
	}



	public void setvL_contenedorCancionLista(Element vL_contenedorCancionLista) {
		this.vL_contenedorCancionLista = vL_contenedorCancionLista;
	}



	public VistaCancion_lista getVistaCancion_lista() {
		return vistaCancion_lista;
	}



	public void setVistaCancion_lista(VistaCancion_lista vistaCancion_lista) {
		this.vistaCancion_lista = vistaCancion_lista;
	}



	public VistaCancion_lista getVistaCancion_lista1() {
		return vistaCancion_lista1;
	}



	public void setVistaCancion_lista1(VistaCancion_lista vistaCancion_lista1) {
		this.vistaCancion_lista1 = vistaCancion_lista1;
	}



	public VistaCancion_lista getVistaCancion_lista2() {
		return vistaCancion_lista2;
	}



	public void setVistaCancion_lista2(VistaCancion_lista vistaCancion_lista2) {
		this.vistaCancion_lista2 = vistaCancion_lista2;
	}



	public VistaCancion_lista getVistaCancion_lista3() {
		return vistaCancion_lista3;
	}



	public void setVistaCancion_lista3(VistaCancion_lista vistaCancion_lista3) {
		this.vistaCancion_lista3 = vistaCancion_lista3;
	}



	public VistaCancion_lista getVistaCancion_lista4() {
		return vistaCancion_lista4;
	}



	public void setVistaCancion_lista4(VistaCancion_lista vistaCancion_lista4) {
		this.vistaCancion_lista4 = vistaCancion_lista4;
	}



	public VistaCancion_lista getVistaCancion_lista5() {
		return vistaCancion_lista5;
	}



	public void setVistaCancion_lista5(VistaCancion_lista vistaCancion_lista5) {
		this.vistaCancion_lista5 = vistaCancion_lista5;
	}



	/**
     * Creates a new VistaLista_de_canciones_buscadas.
     */
    public VistaLista_de_canciones_buscadas() {
        // You can initialise any data required for the connected UI components here.
    }

}
