package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.AudioPlayer;
import spotify.GestorUsuarios;
import spotify.Imagen;
import vistas.VistaReproducir_cancion;

public class Reproducir_cancion extends VistaReproducir_cancion{
//	private Button _pausar_cancionB;
//	private Button _reanudar_cancionB;
//	private Button _reproducir_siguienteB;
//	private Button _reproducir_anteriorB;
//	private Slider _modificar_volumenS;
//	private Button _retroceder_10sB;
//	private Button _avanzar_10sB;
//	private Button _reproducir_en_bucleB;
//	private Image _anteriorI;
//	private Label _artista_s_L;
//	private Image _avanzar_10sI;
//	private Image _bucleI;
//	private Label _duracionL;
//	private Image _imagen_CancionI;
//	private Label _minuto_ActualL;
//	private Image _modificar_VolumenI;
//	private Label _nombre_CancionL;
//	private Image _pausar_CancionI;
//	private Image _reanudar_CancionI;
//	private Image _reproducir_AnteriorI;
//	private Image _reproducir_SiguienteI;
//	private Image _reproducir_BucleI;
//	private Slider _barraS;
//	private Image _volumenI;
//	private Image _retroceder_10sI;
//	private Button _creditosB;
	public Cancion__bloque_sin_opciones_ _cancion__bloque_sin_opciones_;
	public Reproductor_resumido__cibernauta_no_registrado_ _reproductor_resumido__cibernauta_no_registrado_;
	public Ver_creditos_cancion _ver_creditos_cancion;
	public AudioPlayer _audioPlayer;
	
	public Reproducir_cancion(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Cancion cancion) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		//this._audioPlayer = new AudioPlayer();
		this._audioPlayer = GestorUsuarios._audioPlayer;
		this.gethL_reproductor().add(_audioPlayer);
		this.getButton_opciones().setVisible(false);
		this.getLabel_titulo().setText(cancion.getTitulo());
		this.getLabel_artista().setText(GestorUsuarios.artistasCancion);
		
		Imagen img = new Imagen(cancion.getImagen());
		img.setMaxWidth("100%"); img.setMaxHeight("100%"); img.setHeight("100%");
		this.gethL_imagen().add(img);
		
		
		this.getButton_creditos().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				popUp.getElement().getStyle().set("widht", "100%");
				popUp.getElement().getStyle().set("border", "none");
				
				_ver_creditos_cancion = new Ver_creditos_cancion(cuerpo, popUp, cancion);
				
				popUp.add(_ver_creditos_cancion);
				popUp.open();
				
			}
		});
		
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

	public void Modificar_volumen() {
		throw new UnsupportedOperationException();
	}

	public void Retroceder_10s() {
		throw new UnsupportedOperationException();
	}

	public void Avanzar_10s() {
		throw new UnsupportedOperationException();
	}

	public void Reproducir_en_bucle() {
		throw new UnsupportedOperationException();
	}
}