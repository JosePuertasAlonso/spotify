package interfaz;

import spotify.AudioPlayer;
import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaReproductor_resumido;

public class Reproductor_resumido extends VistaReproductor_resumido{
//	private Button _pausar_cancionB;
//	private Button _reanudar_cancionB;
//	private Button _reproducir_siguienteB;
//	private Button _reproducir_anteriorB;
//	private Label _nombreL;
//	private Label _artistaL;
//	private Image _imagenI;
//	private Slider _barraS;
	
	public AudioPlayer _audioPlayer;
	
	public Reproductor_resumido() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this._audioPlayer = GestorUsuarios._audioPlayer;
		this.gethL_reproductor().add(_audioPlayer);
		this.getLabel_titulo().setText(GestorUsuarios._cancion.getTitulo());
		this.getLabetl_artista().setText(GestorUsuarios.artistasCancion);
		//Cancion del minireproductor:
		this.gethL_imagen().removeAll();
		Imagen img = new Imagen(GestorUsuarios._cancion.getImagen());
		img.setMaxWidth("100%");
		this.gethL_imagen().add(img);
	}

	public void Pausar_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Reanudar_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Reproducir_siguiente() {
		throw new UnsupportedOperationException();
	}

	public void Reproducir_anterior() {
		throw new UnsupportedOperationException();
	}
}