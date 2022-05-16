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

public class Lista_de_reproduccionDAO {
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int id_Lista) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, id_Lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int id_Lista) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, id_Lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, id_Lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, id_Lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int id_Lista) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(basededatos.Lista_de_reproduccion.class, new Integer(id_Lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int id_Lista) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(basededatos.Lista_de_reproduccion.class, new Integer(id_Lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(basededatos.Lista_de_reproduccion.class, new Integer(id_Lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int id_Lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(basededatos.Lista_de_reproduccion.class, new Integer(id_Lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy, lockMode);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion createLista_de_reproduccion() {
		return new basededatos.Lista_de_reproduccion();
	}
	
	public static boolean save(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_de_reproduccion lista_de_reproduccion)throws PersistentException {
		try {
			if (lista_de_reproduccion.getEs_gestionada_por() != null) {
				lista_de_reproduccion.getEs_gestionada_por().gestiona.remove(lista_de_reproduccion);
			}
			
			basededatos.Usuario_registrado[] lEs_guardada_pors = lista_de_reproduccion.es_guardada_por.toArray();
			for(int i = 0; i < lEs_guardada_pors.length; i++) {
				lEs_guardada_pors[i].guarda.remove(lista_de_reproduccion);
			}
			basededatos.Cancion[] lContienes = lista_de_reproduccion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].esta_en.remove(lista_de_reproduccion);
			}
			return delete(lista_de_reproduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_de_reproduccion lista_de_reproduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lista_de_reproduccion.getEs_gestionada_por() != null) {
				lista_de_reproduccion.getEs_gestionada_por().gestiona.remove(lista_de_reproduccion);
			}
			
			basededatos.Usuario_registrado[] lEs_guardada_pors = lista_de_reproduccion.es_guardada_por.toArray();
			for(int i = 0; i < lEs_guardada_pors.length; i++) {
				lEs_guardada_pors[i].guarda.remove(lista_de_reproduccion);
			}
			basededatos.Cancion[] lContienes = lista_de_reproduccion.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].esta_en.remove(lista_de_reproduccion);
			}
			try {
				session.delete(lista_de_reproduccion);
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
	
	public static boolean refresh(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByCriteria(lista_de_reproduccionCriteria);
		if(lista_de_reproduccions == null || lista_de_reproduccions.length == 0) {
			return null;
		}
		return lista_de_reproduccions[0];
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		return lista_de_reproduccionCriteria.listLista_de_reproduccion();
	}
}
