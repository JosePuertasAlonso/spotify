package interfaz;

//import basededatos.iArtista;

public class Artista extends Comun {
//	public iArtista _iArtista;
	public Cabecera_artista_registrado _cabecera_artista_registrado;
	
	public Artista() {
		_cabecera_artista_registrado = new Cabecera_artista_registrado();
		this.gethL_cabecera().add(_cabecera_artista_registrado);
	}
	
}