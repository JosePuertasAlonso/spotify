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

public class ListaDAO {
	public static Lista loadListaByORMID(int id_Lista) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadListaByORMID(session, id_Lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista getListaByORMID(int id_Lista) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getListaByORMID(session, id_Lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByORMID(int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadListaByORMID(session, id_Lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista getListaByORMID(int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getListaByORMID(session, id_Lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByORMID(PersistentSession session, int id_Lista) throws PersistentException {
		try {
			return (Lista) session.load(basededatos.Lista.class, new Integer(id_Lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista getListaByORMID(PersistentSession session, int id_Lista) throws PersistentException {
		try {
			return (Lista) session.get(basededatos.Lista.class, new Integer(id_Lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByORMID(PersistentSession session, int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista) session.load(basededatos.Lista.class, new Integer(id_Lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista getListaByORMID(PersistentSession session, int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista) session.get(basededatos.Lista.class, new Integer(id_Lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryLista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryLista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista[] listListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista[] listListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista as Lista");
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
	
	public static List queryLista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista as Lista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista[] listListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista(session, condition, orderBy);
			return (Lista[]) list.toArray(new Lista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista[] listListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista(session, condition, orderBy, lockMode);
			return (Lista[]) list.toArray(new Lista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista[] listas = listListaByQuery(session, condition, orderBy);
		if (listas != null && listas.length > 0)
			return listas[0];
		else
			return null;
	}
	
	public static Lista loadListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista[] listas = listListaByQuery(session, condition, orderBy, lockMode);
		if (listas != null && listas.length > 0)
			return listas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateListaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateListaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateListaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista as Lista");
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
	
	public static java.util.Iterator iterateListaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista as Lista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista createLista() {
		return new basededatos.Lista();
	}
	
	public static boolean save(basededatos.Lista lista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(lista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Lista lista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(lista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista lista)throws PersistentException {
		if (lista instanceof basededatos.Album) {
			return basededatos.AlbumDAO.deleteAndDissociate((basededatos.Album) lista);
		}
		
		if (lista instanceof basededatos.Lista_de_reproduccion) {
			return basededatos.Lista_de_reproduccionDAO.deleteAndDissociate((basededatos.Lista_de_reproduccion) lista);
		}
		
		try {
			basededatos.Cancion[] lContienes = lista.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].esta_en.remove(lista);
			}
			return delete(lista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista lista, org.orm.PersistentSession session)throws PersistentException {
		if (lista instanceof basededatos.Album) {
			return basededatos.AlbumDAO.deleteAndDissociate((basededatos.Album) lista, session);
		}
		
		if (lista instanceof basededatos.Lista_de_reproduccion) {
			return basededatos.Lista_de_reproduccionDAO.deleteAndDissociate((basededatos.Lista_de_reproduccion) lista, session);
		}
		
		try {
			basededatos.Cancion[] lContienes = lista.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].esta_en.remove(lista);
			}
			try {
				session.delete(lista);
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
	
	public static boolean refresh(basededatos.Lista lista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(lista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Lista lista) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(lista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista loadListaByCriteria(ListaCriteria listaCriteria) {
		Lista[] listas = listListaByCriteria(listaCriteria);
		if(listas == null || listas.length == 0) {
			return null;
		}
		return listas[0];
	}
	
	public static Lista[] listListaByCriteria(ListaCriteria listaCriteria) {
		return listaCriteria.listLista();
	}
}
