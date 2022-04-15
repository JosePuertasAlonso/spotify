package interfaz;

public class Anadir_cancion_al_album extends Buscar_canciones_a_anadir {
//	private Label _tituloL;
//	private Button _nueva_CancionB;
	public Anadir_nuevo_album _anadir_nuevo_album;
	public Anadir_nueva_cancion _anadir_nueva_cancion;
	
	public Anadir_cancion_al_album() {
		super();
		this.getLabel_anadeCancion().setText("Añade una canción al album \"nombre album\"");
		this.getLabel_anadeCancion().setVisible(true);
		this.getButton_nuevaCancion().setVisible(true);
		
	}
}