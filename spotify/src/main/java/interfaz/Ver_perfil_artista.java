package interfaz;

import vistas.VistaVer_perfil_artista;

public class Ver_perfil_artista extends VistaVer_perfil_artista{
//	private Button _seguir_artista;
//	private Button _ver_listas_con_vista_en_listaB;
//	private Button _ver_lista_con_vista_en_bloquesB;
//	private Label _nombreL;
//	private Label _estilosL;
//	private Label _artistas_SimilaresL;
//	private Label _albumesL;
//	private Image _vista_Bloque_I;
//	private Image _vista_ListaI;
	public Artista__bloque_ _artista__bloque_;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	public Artista__lista_ _artista__lista_;
	public Artistas_similares _artistas_similares;
	public Hits _hits;
	public Albumes_del_artista _albumes_del_artista;
	public Listas_de_reproduccion_del_artista _listas_de_reproduccion_del_artista;
	
	public Ver_perfil_artista() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_hits = new Hits();
		this.gethL_hits().add(_hits);
		_albumes_del_artista = new Albumes_del_artista();
		this.gethL_albumes().add(_albumes_del_artista);
		_artistas_similares = new Artistas_similares();
		this.gethL_artistasSimilares().add(_artistas_similares);
		_listas_de_reproduccion_del_artista = new Listas_de_reproduccion_del_artista();
		this.gethL_listasDelArtista().add(_listas_de_reproduccion_del_artista);
		
		this.getButton_siguiendo().setVisible(false);
		
	}

	public void Seguir_artista() {
		throw new UnsupportedOperationException();
	}

	public void Ver_listas_con_vista_en_lista() {
		throw new UnsupportedOperationException();
	}

	public void Ver_lista_con_vista_en_bloques() {
		throw new UnsupportedOperationException();
	}
}