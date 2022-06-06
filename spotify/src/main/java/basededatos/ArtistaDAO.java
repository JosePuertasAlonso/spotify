/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArtistaDAO {
	public static Artista loadArtistaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getArtistaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getArtistaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy, lockMode);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy, lockMode);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista createArtista() {
		return new basededatos.Artista();
	}
	
	public static boolean save(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista)throws PersistentException {
		try {
			basededatos.Cancion[] lRealizas = artista.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].realizada_por.remove(artista);
			}
			basededatos.Artista[] lEs_similar_as = artista.es_similar_a.toArray();
			for(int i = 0; i < lEs_similar_as.length; i++) {
				lEs_similar_as[i].es_similar_de.remove(artista);
			}
			basededatos.Album[] lEs_autor_des = artista.es_autor_de.toArray();
			for(int i = 0; i < lEs_autor_des.length; i++) {
				lEs_autor_des[i].es_creado_por.remove(artista);
			}
			basededatos.Estilo[] lEs_identificado_pors = artista.es_identificado_por.toArray();
			for(int i = 0; i < lEs_identificado_pors.length; i++) {
				lEs_identificado_pors[i].identifica_a.remove(artista);
			}
			basededatos.Artista[] lEs_similar_des = artista.es_similar_de.toArray();
			for(int i = 0; i < lEs_similar_des.length; i++) {
				lEs_similar_des[i].es_similar_a.remove(artista);
			}
			basededatos.Anuncio[] lAnuncias = artista.anuncia.toArray();
			for(int i = 0; i < lAnuncias.length; i++) {
				lAnuncias[i].setAnunciado(null);
			}
			if (artista.getTiene() != null) {
				artista.getTiene().setPertenecen_a(null);
			}
			
			basededatos.Cancion[] lMarca_como_favoritas = artista.marca_como_favorita.toArray();
			for(int i = 0; i < lMarca_como_favoritas.length; i++) {
				lMarca_como_favoritas[i].es_marcada_como_favorita_por.remove(artista);
			}
			basededatos.Usuario_registrado[] lSigues = artista.sigue.toArray();
			for(int i = 0; i < lSigues.length; i++) {
				lSigues[i].es_seguido_por.remove(artista);
			}
			basededatos.Cancion[] lReproduces = artista.reproduce.toArray();
			for(int i = 0; i < lReproduces.length; i++) {
				lReproduces[i].es_historial_de.remove(artista);
			}
			basededatos.Lista_de_reproduccion[] lGestionas = artista.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setEs_gestionada_por(null);
			}
			basededatos.Usuario_registrado[] lEs_seguido_pors = artista.es_seguido_por.toArray();
			for(int i = 0; i < lEs_seguido_pors.length; i++) {
				lEs_seguido_pors[i].sigue.remove(artista);
			}
			basededatos.Lista_de_reproduccion[] lGuardas = artista.guarda.toArray();
			for(int i = 0; i < lGuardas.length; i++) {
				lGuardas[i].es_guardada_por.remove(artista);
			}
			return delete(artista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Cancion[] lRealizas = artista.realiza.toArray();
			for(int i = 0; i < lRealizas.length; i++) {
				lRealizas[i].realizada_por.remove(artista);
			}
			basededatos.Artista[] lEs_similar_as = artista.es_similar_a.toArray();
			for(int i = 0; i < lEs_similar_as.length; i++) {
				lEs_similar_as[i].es_similar_de.remove(artista);
			}
			basededatos.Album[] lEs_autor_des = artista.es_autor_de.toArray();
			for(int i = 0; i < lEs_autor_des.length; i++) {
				lEs_autor_des[i].es_creado_por.remove(artista);
			}
			basededatos.Estilo[] lEs_identificado_pors = artista.es_identificado_por.toArray();
			for(int i = 0; i < lEs_identificado_pors.length; i++) {
				lEs_identificado_pors[i].identifica_a.remove(artista);
			}
			basededatos.Artista[] lEs_similar_des = artista.es_similar_de.toArray();
			for(int i = 0; i < lEs_similar_des.length; i++) {
				lEs_similar_des[i].es_similar_a.remove(artista);
			}
			basededatos.Anuncio[] lAnuncias = artista.anuncia.toArray();
			for(int i = 0; i < lAnuncias.length; i++) {
				lAnuncias[i].setAnunciado(null);
			}
			if (artista.getTiene() != null) {
				artista.getTiene().setPertenecen_a(null);
			}
			
			basededatos.Cancion[] lMarca_como_favoritas = artista.marca_como_favorita.toArray();
			for(int i = 0; i < lMarca_como_favoritas.length; i++) {
				lMarca_como_favoritas[i].es_marcada_como_favorita_por.remove(artista);
			}
			basededatos.Usuario_registrado[] lSigues = artista.sigue.toArray();
			for(int i = 0; i < lSigues.length; i++) {
				lSigues[i].es_seguido_por.remove(artista);
			}
			basededatos.Cancion[] lReproduces = artista.reproduce.toArray();
			for(int i = 0; i < lReproduces.length; i++) {
				lReproduces[i].es_historial_de.remove(artista);
			}
			basededatos.Lista_de_reproduccion[] lGestionas = artista.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setEs_gestionada_por(null);
			}
			basededatos.Usuario_registrado[] lEs_seguido_pors = artista.es_seguido_por.toArray();
			for(int i = 0; i < lEs_seguido_pors.length; i++) {
				lEs_seguido_pors[i].sigue.remove(artista);
			}
			basededatos.Lista_de_reproduccion[] lGuardas = artista.guarda.toArray();
			for(int i = 0; i < lGuardas.length; i++) {
				lGuardas[i].es_guardada_por.remove(artista);
			}
			try {
				session.delete(artista);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		Artista[] artistas = listArtistaByCriteria(artistaCriteria);
		if(artistas == null || artistas.length == 0) {
			return null;
		}
		return artistas[0];
	}
	
	public static Artista[] listArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		return artistaCriteria.listArtista();
	}
}
