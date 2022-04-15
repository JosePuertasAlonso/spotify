package interfaz;

import vistas.VistaAdministrador;

//import basededatos.iAdministrador;

public class Administrador extends VistaAdministrador{
//	public iAdministrador _iAdministrador;
//	public Buscador_administrador _buscador_administrador;
//	public Anadir_nuevo_album _anadir_nuevo_album;
//	public Dar_de_alta_artista _dar_de_alta_artista;
//	public Crear_nuevo_estilo _crear_nuevo_estilo;
//	public Anadir_nueva_cancion _anadir_nueva_cancion;
	public Cabecera _cabecera;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Administrador() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_cabecera = new Cabecera_cibernauta_registrado();
		this.gethL_cabecera().add(_cabecera);
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		
	}
	
}