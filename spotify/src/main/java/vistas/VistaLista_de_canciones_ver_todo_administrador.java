package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_administrador;

/**
 * A Designer generated component for the vista-lista_de_canciones_ver_todo_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_canciones_ver_todo_administrador")
@JsModule("./src/vistas/vista-lista_de_canciones_ver_todo_administrador.ts")
public class VistaLista_de_canciones_ver_todo_administrador extends LitTemplate {

    @Id("vL_contenedorCancionAdministrador")
	private Element vL_contenedorCancionAdministrador;
	@Id("vistaCancion_administrador")
	private VistaCancion_administrador vistaCancion_administrador;
	@Id("vistaCancion_administrador1")
	private VistaCancion_administrador vistaCancion_administrador1;
	@Id("vistaCancion_administrador2")
	private VistaCancion_administrador vistaCancion_administrador2;
	@Id("vistaCancion_administrador3")
	private VistaCancion_administrador vistaCancion_administrador3;
	@Id("vistaCancion_administrador4")
	private VistaCancion_administrador vistaCancion_administrador4;
	
	

	public Element getvL_contenedorCancionAdministrador() {
		return vL_contenedorCancionAdministrador;
	}



	public void setvL_contenedorCancionAdministrador(Element vL_contenedorCancionAdministrador) {
		this.vL_contenedorCancionAdministrador = vL_contenedorCancionAdministrador;
	}



	public VistaCancion_administrador getVistaCancion_administrador() {
		return vistaCancion_administrador;
	}



	public void setVistaCancion_administrador(VistaCancion_administrador vistaCancion_administrador) {
		this.vistaCancion_administrador = vistaCancion_administrador;
	}



	public VistaCancion_administrador getVistaCancion_administrador1() {
		return vistaCancion_administrador1;
	}



	public void setVistaCancion_administrador1(VistaCancion_administrador vistaCancion_administrador1) {
		this.vistaCancion_administrador1 = vistaCancion_administrador1;
	}



	public VistaCancion_administrador getVistaCancion_administrador2() {
		return vistaCancion_administrador2;
	}



	public void setVistaCancion_administrador2(VistaCancion_administrador vistaCancion_administrador2) {
		this.vistaCancion_administrador2 = vistaCancion_administrador2;
	}



	public VistaCancion_administrador getVistaCancion_administrador3() {
		return vistaCancion_administrador3;
	}



	public void setVistaCancion_administrador3(VistaCancion_administrador vistaCancion_administrador3) {
		this.vistaCancion_administrador3 = vistaCancion_administrador3;
	}



	public VistaCancion_administrador getVistaCancion_administrador4() {
		return vistaCancion_administrador4;
	}



	public void setVistaCancion_administrador4(VistaCancion_administrador vistaCancion_administrador4) {
		this.vistaCancion_administrador4 = vistaCancion_administrador4;
	}



	/**
     * Creates a new VistaLista_de_canciones_ver_todo_administrador.
     */
    public VistaLista_de_canciones_ver_todo_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
