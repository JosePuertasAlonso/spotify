package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
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
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	iComun _iComun = new BDPrincipal();
	
	//Nuevos atributos:
	public Cancion__bloque_con_opciones_ _cancion_mas_escuchada;
	public Cancion__bloque_con_opciones_ _favorita;
	
	public Ver_estadisticas(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_nombreUsuario().setText(GestorUsuarios._u.getNick());
		this.getLabel_nSeguidores().setText(Integer.toString(GestorUsuarios._u.getSeguidores()));
		this.getImagen().setSrc(GestorUsuarios._u.getFoto());
		
		cargar_cancion_mas_escuchada();
		
		if(GestorUsuarios._u.marca_como_favorita.size() > 0) {
			_favorita = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, GestorUsuarios._u.marca_como_favorita.toArray()[0]);
			this.getvL_cancionMasEscuchada().getStyle().set("width", "100%");
			this.getvL_ultimaReproduccion().as(VerticalLayout.class).add(_favorita);
		}
		
		
		
	}
	
	public void cargar_cancion_mas_escuchada(){
		_cancion_mas_escuchada = new Cancion__bloque_con_opciones_(cuerpo, minireproductor, _iComun.cargar_cancion_mas_escuchada());
		this.getvL_cancionMasEscuchada().as(VerticalLayout.class).add(_cancion_mas_escuchada);

	}
	
}