package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaUltimos_exitos;
import vistas.VistaReproductor_resumido;

/**
 * A Designer generated component for the vista-cibernauta_no_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cibernauta_no_registrado")
@JsModule("./src/vistas/vista-cibernauta_no_registrado.ts")
public class VistaCibernauta_no_registrado extends LitTemplate {

    @Id("vL_fondo")
	private Element vL_fondo;
	@Id("hL_ultimosExitos")
	private HorizontalLayout hL_ultimosExitos;
	@Id("hL_cabecera")
	private HorizontalLayout hL_cabecera;
	@Id("hL_minireproductor")
	private HorizontalLayout hL_minireproductor;
	@Id("vL_cuerpo")
	private Element vL_cuerpo;
	
	

	public HorizontalLayout gethL_cabecera() {
		return hL_cabecera;
	}



	public void sethL_cabecera(HorizontalLayout hL_cabecera) {
		this.hL_cabecera = hL_cabecera;
	}



	public HorizontalLayout gethL_minireproductor() {
		return hL_minireproductor;
	}



	public void sethL_minireproductor(HorizontalLayout hL_minireproductor) {
		this.hL_minireproductor = hL_minireproductor;
	}



	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}

	

	public HorizontalLayout gethL_ultimosExitos() {
		return hL_ultimosExitos;
	}



	public void sethL_ultimosExitos(HorizontalLayout hL_ultimosExitos) {
		this.hL_ultimosExitos = hL_ultimosExitos;
	}
	



	public Element getvL_cuerpo() {
		return vL_cuerpo;
	}



	public void setvL_cuerpo(Element vL_cuerpo) {
		this.vL_cuerpo = vL_cuerpo;
	}



	/**
     * Creates a new VistaCibernauta_no_registrado.
     */
    public VistaCibernauta_no_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
