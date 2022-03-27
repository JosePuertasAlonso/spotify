package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaAlbum_administrador;

/**
 * A Designer generated component for the vista-lista_de_albumes_buscados_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_albumes_buscados_administrador")
@JsModule("./src/vistas/vista-lista_de_albumes_buscados_administrador.ts")
public class VistaLista_de_albumes_buscados_administrador extends LitTemplate {

    @Id("vL_contenedorAlbumesAdministrador")
	private Element vL_contenedorAlbumesAdministrador;
	@Id("vistaAlbum_administrador")
	private VistaAlbum_administrador vistaAlbum_administrador;
	@Id("vistaAlbum_administrador2")
	private VistaAlbum_administrador vistaAlbum_administrador2;
	@Id("vistaAlbum_administrador3")
	private VistaAlbum_administrador vistaAlbum_administrador3;
	@Id("vistaAlbum_administrador4")
	private VistaAlbum_administrador vistaAlbum_administrador4;
	@Id("vistaAlbum_administrador1")
	private VistaAlbum_administrador vistaAlbum_administrador1;
	
	
	public Element getvL_contenedorAlbumesAdministrador() {
		return vL_contenedorAlbumesAdministrador;
	}


	public void setvL_contenedorAlbumesAdministrador(Element vL_contenedorAlbumesAdministrador) {
		this.vL_contenedorAlbumesAdministrador = vL_contenedorAlbumesAdministrador;
	}


	public VistaAlbum_administrador getVistaAlbum_administrador() {
		return vistaAlbum_administrador;
	}


	public void setVistaAlbum_administrador(VistaAlbum_administrador vistaAlbum_administrador) {
		this.vistaAlbum_administrador = vistaAlbum_administrador;
	}


	public VistaAlbum_administrador getVistaAlbum_administrador2() {
		return vistaAlbum_administrador2;
	}


	public void setVistaAlbum_administrador2(VistaAlbum_administrador vistaAlbum_administrador2) {
		this.vistaAlbum_administrador2 = vistaAlbum_administrador2;
	}


	public VistaAlbum_administrador getVistaAlbum_administrador3() {
		return vistaAlbum_administrador3;
	}


	public void setVistaAlbum_administrador3(VistaAlbum_administrador vistaAlbum_administrador3) {
		this.vistaAlbum_administrador3 = vistaAlbum_administrador3;
	}


	public VistaAlbum_administrador getVistaAlbum_administrador4() {
		return vistaAlbum_administrador4;
	}


	public void setVistaAlbum_administrador4(VistaAlbum_administrador vistaAlbum_administrador4) {
		this.vistaAlbum_administrador4 = vistaAlbum_administrador4;
	}


	public VistaAlbum_administrador getVistaAlbum_administrador1() {
		return vistaAlbum_administrador1;
	}


	public void setVistaAlbum_administrador1(VistaAlbum_administrador vistaAlbum_administrador1) {
		this.vistaAlbum_administrador1 = vistaAlbum_administrador1;
	}


	/**
     * Creates a new VistaLista_de_albumes_buscados_administrador.
     */
    public VistaLista_de_albumes_buscados_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
