package interfaz;

import vistas.VistaBuscador_administrador;

public class Buscador_administrador extends VistaBuscador_administrador {
//	private Label _buscar_ModificarL;
//	private Label _resultadosL;
//	private Label _cancionesL;
//	private Label _albumesL;
//	private Label _artistasL;
//	private Label _perfilesL;
//	private Button _ver_Todas_CancionesB;
//	private Button _ver_Todos_AlbumesB;
//	private Button _ver_Todo_ArtistasB;
//	private Button _ver_Todo_PerfilesB;
	public Administrador _administrador;
	public Lista_de_canciones_buscadas__administrador_ _lista_de_canciones_buscadas__administrador_;
	public Ver_todas_canciones_buscadas__administrador_ _ver_todas_canciones_buscadas__administrador_;
	public Lista_de_perfiles_buscados__administrador_ _lista_de_perfiles_buscados__administrador_;
	public Ver_todos_perfiles_buscados__administrador_ _ver_todos_perfiles_buscados__administrador_;
	public Lista_de_albumbes_buscados__administrador_ _lista_de_albumbes_buscados__administrador_;
	public Ver_todos_los_albumes_buscados__administrador_ _ver_todos_los_albumes_buscados__administrador_;
	public Lista_de_artistas_buscados__administrador_ _lista_de_artistas_buscados__administrador_;
	public Ver_todos_los_artistas_buscados__administrador_ _ver_todos_los_artistas_buscados__administrador_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Buscador_administrador() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		_lista_de_canciones_buscadas__administrador_ = new Lista_de_canciones_buscadas__administrador_();
		this.gethL_listaDeCancionesBuscadasAdmin().add(_lista_de_canciones_buscadas__administrador_);
		
		_lista_de_albumbes_buscados__administrador_ = new Lista_de_albumbes_buscados__administrador_();
		this.gethL_listaDeAlbumesBuscadosAdmin().add(_lista_de_albumbes_buscados__administrador_);
		
		_lista_de_artistas_buscados__administrador_ = new Lista_de_artistas_buscados__administrador_();
		this.gethL_listaDeArtistasBuscadosAdmin().add(_lista_de_artistas_buscados__administrador_);
		
		_lista_de_perfiles_buscados__administrador_ = new Lista_de_perfiles_buscados__administrador_();
		this.gethL_listaDePerfilesBuscadosAdmin().add(_lista_de_perfiles_buscados__administrador_);
		
	}
}