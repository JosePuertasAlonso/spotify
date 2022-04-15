package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaPerfil_administrador;

/**
 * A Designer generated component for the vista-lista_de_perfiles_ver_todo_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_perfiles_ver_todo_administrador")
@JsModule("./src/vistas/vista-lista_de_perfiles_ver_todo_administrador.ts")
public class VistaLista_de_perfiles_ver_todo_administrador extends LitTemplate {

    @Id("vL_contenedorPerfilAdministrador")
	private Element vL_contenedorPerfilAdministrador;
	
	

	public Element getvL_contenedorPerfilAdministrador() {
		return vL_contenedorPerfilAdministrador;
	}



	public void setvL_contenedorPerfilAdministrador(Element vL_contenedorPerfilAdministrador) {
		this.vL_contenedorPerfilAdministrador = vL_contenedorPerfilAdministrador;
	}



	/**
     * Creates a new VistaLista_de_perfiles_ver_todo_administrador.
     */
    public VistaLista_de_perfiles_ver_todo_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
