package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iCibernauta_registrado;

public class Cibernauta_registrado extends Comun {
//	public iCibernauta_registrado _iCibernauta_registrado;
	public Cabecera_cibernauta_registrado _cabecera_cibernauta_registrado;
	
	
	public Cibernauta_registrado() {
		super();
		VerticalLayout cuerpo = this.getvL_cuerpo().as(VerticalLayout.class);
		HorizontalLayout minireproductor = this.gethL_minireproductor();
		_cabecera_cibernauta_registrado = new Cabecera_cibernauta_registrado(cuerpo, minireproductor);
		this.gethL_cabecera().add(_cabecera_cibernauta_registrado);
	}
	
	
	
}