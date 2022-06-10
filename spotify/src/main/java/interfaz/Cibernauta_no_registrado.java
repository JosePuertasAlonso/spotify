package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorUsuarios;
import vistas.VistaCibernauta_no_registrado;

//import basededatos.iCibernauta_no_registrado;

public class Cibernauta_no_registrado extends VistaCibernauta_no_registrado{
//	public iCibernauta_no_registrado _iCibernauta_no_registrado;
	public Cabecera_cibernauta _cabecera_cibernauta;
	public static Reproductor_resumido__cibernauta_no_registrado_ _reproductor_resumido__cibernauta_no_registrado_;
	public Ultimos_exitos _ultimos_exitos;
	
	public Cibernauta_no_registrado() {
		VerticalLayout cuerpo = this.getvL_cuerpo().as(VerticalLayout.class);
		HorizontalLayout minireproductor = this.gethL_minireproductor();
		_cabecera_cibernauta = new Cabecera_cibernauta(cuerpo, minireproductor);
		_reproductor_resumido__cibernauta_no_registrado_ = new Reproductor_resumido__cibernauta_no_registrado_(cuerpo, minireproductor);
		_ultimos_exitos = new Ultimos_exitos(cuerpo, minireproductor);
		
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("height", "100%");
		this.getStyle().set("width", "100%");
		
		
		this.gethL_cabecera().add(_cabecera_cibernauta);
		this.gethL_ultimosExitos().add(_ultimos_exitos);
		this.gethL_minireproductor().add(_reproductor_resumido__cibernauta_no_registrado_);
		
	}
	
}