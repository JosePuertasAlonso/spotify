package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_perfil__artista_ extends Modificar_perfil {
//	private Button _seleccionar_foto_perfilB;
//	private Image _imagenI;
	public Ver_perfil_artista_registrado _ver_perfil_artista_registrado;
	
	public Modificar_perfil__artista_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getvL_imagen().setVisible(true);
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}
}