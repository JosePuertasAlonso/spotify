package spotify;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.Usuario;
import interfaz.Administrador;
import interfaz.Artista;
import interfaz.Cibernauta_no_registrado;
import interfaz.Cibernauta_registrado;

public class GestorUsuarios {
	
	private static VerticalLayout vl_principal;
	
	public static AudioPlayer _audioPlayer = new AudioPlayer();
	public static basededatos.Cancion _cancion = new Cancion();
	public static String artistasCancion = "-";
	public static Usuario _u;
	
	public static void incializar(VerticalLayout v) {
		vl_principal = v;
	}
	
	public static void cibernauta(boolean cambio) {
		if(cambio) {
			_audioPlayer = new AudioPlayer();
			_cancion.setTitulo("-");
			_cancion.setImagen("/img/song.png");
		}
		Cibernauta_no_registrado cibernauta = new Cibernauta_no_registrado();
		Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_._audioPlayer = _audioPlayer;
		vl_principal.removeAll();
		vl_principal.add(cibernauta);
		
	}
	
	public static void usuario() {
		Cibernauta_registrado usuario = new Cibernauta_registrado();
		vl_principal.removeAll();
		vl_principal.add(usuario);
	}
	
	public static void artista() {
		Artista artista = new Artista();
		vl_principal.removeAll();
		vl_principal.add(artista);
	}
	
	public static void administrador() {
		Administrador administrador = new Administrador();
		vl_principal.removeAll();
		vl_principal.add(administrador);
	}
	
	public static void reproducirCancion(basededatos.Cancion cancion) {
		_audioPlayer.setSource(cancion.getFichero_MP3());
		_audioPlayer.getElement().setAttribute("autoplay", true);
		_cancion = cancion;
	}
	
	public static void inicializarUsuario(Usuario u) {
		_u = u;
	}

}
