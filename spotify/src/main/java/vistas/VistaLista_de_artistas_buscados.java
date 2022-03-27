package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaArtista_lista;

/**
 * A Designer generated component for the vista-lista_de_artistas_buscados template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_de_artistas_buscados")
@JsModule("./src/vistas/vista-lista_de_artistas_buscados.ts")
public class VistaLista_de_artistas_buscados extends LitTemplate {

    @Id("vL_contenedorArtistaLista")
	private Element vL_contenedorArtistaLista;
	@Id("vistaArtista_lista")
	private VistaArtista_lista vistaArtista_lista;
	@Id("vistaArtista_lista1")
	private VistaArtista_lista vistaArtista_lista1;
	@Id("vistaArtista_lista2")
	private VistaArtista_lista vistaArtista_lista2;
	@Id("vistaArtista_lista3")
	private VistaArtista_lista vistaArtista_lista3;
	@Id("vistaArtista_lista4")
	private VistaArtista_lista vistaArtista_lista4;
	
	

	public Element getvL_contenedorArtistaLista() {
		return vL_contenedorArtistaLista;
	}



	public void setvL_contenedorArtistaLista(Element vL_contenedorArtistaLista) {
		this.vL_contenedorArtistaLista = vL_contenedorArtistaLista;
	}



	public VistaArtista_lista getVistaArtista_lista() {
		return vistaArtista_lista;
	}



	public void setVistaArtista_lista(VistaArtista_lista vistaArtista_lista) {
		this.vistaArtista_lista = vistaArtista_lista;
	}



	public VistaArtista_lista getVistaArtista_lista1() {
		return vistaArtista_lista1;
	}



	public void setVistaArtista_lista1(VistaArtista_lista vistaArtista_lista1) {
		this.vistaArtista_lista1 = vistaArtista_lista1;
	}



	public VistaArtista_lista getVistaArtista_lista2() {
		return vistaArtista_lista2;
	}



	public void setVistaArtista_lista2(VistaArtista_lista vistaArtista_lista2) {
		this.vistaArtista_lista2 = vistaArtista_lista2;
	}



	public VistaArtista_lista getVistaArtista_lista3() {
		return vistaArtista_lista3;
	}



	public void setVistaArtista_lista3(VistaArtista_lista vistaArtista_lista3) {
		this.vistaArtista_lista3 = vistaArtista_lista3;
	}



	public VistaArtista_lista getVistaArtista_lista4() {
		return vistaArtista_lista4;
	}



	public void setVistaArtista_lista4(VistaArtista_lista vistaArtista_lista4) {
		this.vistaArtista_lista4 = vistaArtista_lista4;
	}



	/**
     * Creates a new VistaLista_de_artistas_buscados.
     */
    public VistaLista_de_artistas_buscados() {
        // You can initialise any data required for the connected UI components here.
    }

}
