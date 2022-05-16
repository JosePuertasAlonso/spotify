package basededatos;

import java.util.Vector;
import basededatos.Anuncio;

public class BD_Anuncio {
	public BDPrincipal _bd_prin_anun;
	public Vector<Anuncio> _contiene_anuncio = new Vector<Anuncio>();

	public void publicar_anuncio(String aLogin_artista, Anuncio aAnuncio) {
		throw new UnsupportedOperationException();
	}
}