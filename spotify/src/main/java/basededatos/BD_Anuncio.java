package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Anuncio;

public class BD_Anuncio {
	public BDPrincipal _bd_prin_anun;
	public Vector<Anuncio> _contiene_anuncio = new Vector<Anuncio>();

	public void publicar_anuncio(String aLogin_artista, Anuncio aAnuncio) throws PersistentException {
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.login.eq(aLogin_artista);
		Artista a = ArtistaDAO.loadArtistaByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			a.anuncia.add(aAnuncio);
			ArtistaDAO.save(a);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}
}