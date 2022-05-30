package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_estadisticas;

public class Ver_estadisticas extends VistaVer_estadisticas{
//	private Label _tituloL;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Label _actividadL;
//	private Image _actividadI;
//	private Label _mas_EscuchadaL;
//	private Label _ultima_ReproducionL;
	public Ver_perfil _ver_perfil;
	public Reproducir_cancion_cibernauta_registrado _reproducir_cancion_cibernauta_registrado;
	
	//Nuevos atributos:
	public Cancion__bloque_con_opciones_ _cancion_mas_escuchada;
	public Cancion__bloque_con_opciones_ _ultima_reproduccion;
	
	public Ver_estadisticas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_cancion_mas_escuchada = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, null);
		_ultima_reproduccion = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, null);
		
		this.getvL_cancionMasEscuchada().as(VerticalLayout.class).add(_cancion_mas_escuchada);
		this.getvL_ultimaReproduccion().as(VerticalLayout.class).add(_ultima_reproduccion);
		
	}
	
}