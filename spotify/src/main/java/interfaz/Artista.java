package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iArtista;

public class Artista extends Comun {
//	public iArtista _iArtista;
	public Cabecera_artista_registrado _cabecera_artista_registrado;
	
	public Artista() {
		super();
		VerticalLayout cuerpo = this.getvL_cuerpo().as(VerticalLayout.class);
		HorizontalLayout minireproductor = this.gethL_minireproductor();
		_cabecera_artista_registrado = new Cabecera_artista_registrado(cuerpo, minireproductor);
		this.gethL_cabecera().add(_cabecera_artista_registrado);
	}
	
}