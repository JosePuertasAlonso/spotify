package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_perfil;

public class Ver_perfil extends VistaVer_perfil{
//	private Button _recuperar_perfilB;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Image _imagenI;
//	private Label _crear_ListaL;
//	private Button _estadisticasB;
//	private Button _modificar_PerfilB;
//	private Button _eliminar_PerfilB;
//	private Label _mis_ListasL;
//	private Label _numero_ListasL;
//	private Button _consultar_AnunciosB;
	public Cabecera_cibernauta_registrado _cabecera_cibernauta_registrado;
	public Dar_de_baja_perfil _dar_de_baja_perfil;
	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	public Ver_estadisticas _ver_estadisticas;
	public Listas_de_reproduccion_del_perfil _listas_de_reproduccion_del_perfil;
	public Ver_anuncios_de_artistas _ver_anuncios_de_artistas;
	public Modificar_perfil _modificar_perfil;
	
	public Ver_perfil() {
		_listas_de_reproduccion_del_perfil = new Listas_de_reproduccion_del_perfil();
		this.getStyle().set("margin", "0px");
		this.getvL_lisaDeReproduccionDelPerfil().as(VerticalLayout.class).add(_listas_de_reproduccion_del_perfil);
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");

		this.getButton_crearAnuncio().setVisible(false);
		this.getButton_recuperarPerfil().setVisible(false);
	}

	public void Recuperar_perfil() {
		throw new UnsupportedOperationException();
	}
	
}