package spotify;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Usuario_registrado;
import basededatos.iAdministrador;
import basededatos.iCibernauta_no_registrado;
import basededatos.iCibernauta_registrado;
import interfaz.Administrador;
import interfaz.Artista;
import interfaz.Cibernauta_no_registrado;
import interfaz.Cibernauta_registrado;
import interfaz.Comun;

public class GestorUsuarios {
	
	private static VerticalLayout vl_principal;
	
	public static AudioPlayer _audioPlayer = new AudioPlayer();
	public static basededatos.Cancion _cancion = new Cancion();
	public static basededatos.Cancion _cancionReproduciendose = new Cancion();
	public static String artistasCancion = "-";
	public static Usuario_registrado _u;
	
	private static iCibernauta_no_registrado _iCibernauta_no_registrado = new BDPrincipal();
	public static String login_u;
	private static String pass_u;
	
	public static void incializar(VerticalLayout v) {
		vl_principal = v;
	}
	
	public static void cibernauta(boolean cambio) {
		if(cambio) {
			_audioPlayer = new AudioPlayer();
			_cancionReproduciendose.setTitulo("-");
			_cancionReproduciendose.setImagen("/img/song.png");
			artistasCancion = "-";
		}
		Cibernauta_no_registrado cibernauta = new Cibernauta_no_registrado();
		Cibernauta_no_registrado._reproductor_resumido__cibernauta_no_registrado_._audioPlayer = _audioPlayer;
		vl_principal.removeAll();
		vl_principal.add(cibernauta);
		
	}
	
	public static void usuario(boolean cambio) {
		if(cambio) {
			_audioPlayer = new AudioPlayer();
			_cancionReproduciendose.setTitulo("-");
			_cancionReproduciendose.setImagen("/img/song.png");
			artistasCancion = "-";
		}
		recargarUsuario();
		Cibernauta_registrado usuario = new Cibernauta_registrado();
		Comun._reproductor_resumido__usuario_registrado_._audioPlayer = _audioPlayer;
		vl_principal.removeAll();
		vl_principal.add(usuario);
	}
	
	public static void artista(boolean cambio) {
		if(cambio) {
			_audioPlayer = new AudioPlayer();
			_cancionReproduciendose.setTitulo("-");
			_cancionReproduciendose.setImagen("/img/song.png");
			artistasCancion = "-";
		}
		recargarUsuario();
		Artista artista = new Artista();
		Comun._reproductor_resumido__usuario_registrado_._audioPlayer = _audioPlayer;
		vl_principal.removeAll();
		vl_principal.add(artista);
	}
	
	public static void administrador() {
		_audioPlayer = new AudioPlayer();
		Administrador administrador = new Administrador();
		vl_principal.removeAll();
		vl_principal.add(administrador);
	}
	
	public static void reproducirCancion(basededatos.Cancion cancion) {
		_audioPlayer.setSource(cancion.getFichero_MP3());
		_audioPlayer.getElement().setAttribute("autoplay", true);
		_cancionReproduciendose = cancion;
		
		basededatos.Artista[] aux = cancion.realizada_por.toArray();
		String cadenaArtistas = "";
		for(int j = 0; j < aux.length; j++) {
			if(j == aux.length - 1) {
				cadenaArtistas += aux[j].getNick();
			} else {
				cadenaArtistas += aux[j].getNick() + ", "; 
			}
		}
		artistasCancion = cadenaArtistas;
	}
	
	public static void inicializarUsuario(Usuario_registrado u) {
		_u = u;
		login_u = u.getLogin();
		pass_u = u.getPassword();
	}
	
	public static void recargarUsuario() {
		Usuario_registrado u = new Usuario_registrado();
		u.setLogin(login_u);
		u.setPassword(pass_u);
		_u = _iCibernauta_no_registrado.existe_usuario(u);
	}

}
