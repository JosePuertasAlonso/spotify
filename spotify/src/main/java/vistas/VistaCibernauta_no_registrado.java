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
	@Id("vistaCabecera")
	private VistaCabecera vistaCabecera;
	@Id("hL_ultimosExitos")
	private HorizontalLayout hL_ultimosExitos;
	@Id("vistaUltimos_exitos")
	private VistaUltimos_exitos vistaUltimos_exitos;
	@Id("vistaReproductor_resumido")
	private VistaReproductor_resumido vistaReproductor_resumido;
	
	

	public Element getvL_fondo() {
		return vL_fondo;
	}



	public void setvL_fondo(Element vL_fondo) {
		this.vL_fondo = vL_fondo;
	}



	public VistaCabecera getVistaCabecera() {
		return vistaCabecera;
	}



	public void setVistaCabecera(VistaCabecera vistaCabecera) {
		this.vistaCabecera = vistaCabecera;
	}



	public HorizontalLayout gethL_ultimosExitos() {
		return hL_ultimosExitos;
	}



	public void sethL_ultimosExitos(HorizontalLayout hL_ultimosExitos) {
		this.hL_ultimosExitos = hL_ultimosExitos;
	}



	public VistaUltimos_exitos getVistaUltimos_exitos() {
		return vistaUltimos_exitos;
	}



	public void setVistaUltimos_exitos(VistaUltimos_exitos vistaUltimos_exitos) {
		this.vistaUltimos_exitos = vistaUltimos_exitos;
	}



	public VistaReproductor_resumido getVistaReproductor_resumido() {
		return vistaReproductor_resumido;
	}



	public void setVistaReproductor_resumido(VistaReproductor_resumido vistaReproductor_resumido) {
		this.vistaReproductor_resumido = vistaReproductor_resumido;
	}



	/**
     * Creates a new VistaCibernauta_no_registrado.
     */
    public VistaCibernauta_no_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
