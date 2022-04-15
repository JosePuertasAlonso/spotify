package interfaz;

import vistas.VistaModificar_artista;

public class Modificar_artista extends VistaModificar_artista{
//	private Button _seleccionar_foto_perfilB;
//	private Label _tituloL;
//	private Image _imagenI;
//	private Label _estilosL;
//	private Button _confirmar_modificar_artistaB;
	public Artista__Administrador_ _artista__Administrador_;
	public Estilos _estilos;
	
	public Modificar_artista() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_estilos = new Estilos();
		this.gethL_estilos().add(_estilos);
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_modificar_artista() {
		throw new UnsupportedOperationException();
	}
}