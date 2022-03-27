package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCancion_album;

/**
 * A Designer generated component for the vista-canciones_del_album_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-canciones_del_album_administrador")
@JsModule("./src/vistas/vista-canciones_del_album_administrador.ts")
public class VistaCanciones_del_album_administrador extends LitTemplate {

    @Id("vL_contenedorCancionesAlbum")
	private Element vL_contenedorCancionesAlbum;
	@Id("vistaCancion_album")
	private VistaCancion_album vistaCancion_album;
	@Id("vistaCancion_album1")
	private VistaCancion_album vistaCancion_album1;
	@Id("vistaCancion_album2")
	private VistaCancion_album vistaCancion_album2;
	@Id("vistaCancion_album3")
	private VistaCancion_album vistaCancion_album3;
	@Id("vistaCancion_album4")
	private VistaCancion_album vistaCancion_album4;
	
	

	public Element getvL_contenedorCancionesAlbum() {
		return vL_contenedorCancionesAlbum;
	}



	public void setvL_contenedorCancionesAlbum(Element vL_contenedorCancionesAlbum) {
		this.vL_contenedorCancionesAlbum = vL_contenedorCancionesAlbum;
	}



	public VistaCancion_album getVistaCancion_album() {
		return vistaCancion_album;
	}



	public void setVistaCancion_album(VistaCancion_album vistaCancion_album) {
		this.vistaCancion_album = vistaCancion_album;
	}



	public VistaCancion_album getVistaCancion_album1() {
		return vistaCancion_album1;
	}



	public void setVistaCancion_album1(VistaCancion_album vistaCancion_album1) {
		this.vistaCancion_album1 = vistaCancion_album1;
	}



	public VistaCancion_album getVistaCancion_album2() {
		return vistaCancion_album2;
	}



	public void setVistaCancion_album2(VistaCancion_album vistaCancion_album2) {
		this.vistaCancion_album2 = vistaCancion_album2;
	}



	public VistaCancion_album getVistaCancion_album3() {
		return vistaCancion_album3;
	}



	public void setVistaCancion_album3(VistaCancion_album vistaCancion_album3) {
		this.vistaCancion_album3 = vistaCancion_album3;
	}



	public VistaCancion_album getVistaCancion_album4() {
		return vistaCancion_album4;
	}



	public void setVistaCancion_album4(VistaCancion_album vistaCancion_album4) {
		this.vistaCancion_album4 = vistaCancion_album4;
	}



	/**
     * Creates a new VistaCanciones_del_album_administrador.
     */
    public VistaCanciones_del_album_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
