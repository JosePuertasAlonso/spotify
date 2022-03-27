package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_lista;

/**
 * A Designer generated component for the vista-canciones_de_lista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_de_lista")
@JsModule("./src/vistas/vista-canciones_de_lista.ts")
public class VistaCanciones_de_lista extends LitTemplate {

    @Id("vL_contendorCancionesLista")
	private Element vL_contendorCancionesLista;
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
	
	

	public Element getvL_contendorCancionesLista() {
		return vL_contendorCancionesLista;
	}



	public void setvL_contendorCancionesLista(Element vL_contendorCancionesLista) {
		this.vL_contendorCancionesLista = vL_contendorCancionesLista;
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



	/**
     * Creates a new VistaCanciones_de_lista.
     */
    public VistaCanciones_de_lista() {
        // You can initialise any data required for the connected UI components here.
    }

}
