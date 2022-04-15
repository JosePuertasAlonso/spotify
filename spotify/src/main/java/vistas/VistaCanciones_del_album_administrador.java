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
	
	

	public Element getvL_contenedorCancionesAlbum() {
		return vL_contenedorCancionesAlbum;
	}



	public void setvL_contenedorCancionesAlbum(Element vL_contenedorCancionesAlbum) {
		this.vL_contenedorCancionesAlbum = vL_contenedorCancionesAlbum;
	}




	/**
     * Creates a new VistaCanciones_del_album_administrador.
     */
    public VistaCanciones_del_album_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

}
