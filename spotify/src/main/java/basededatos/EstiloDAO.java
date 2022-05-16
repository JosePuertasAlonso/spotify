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

public class EstiloDAO {
	public static Estilo loadEstiloByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstiloByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getEstiloByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstiloByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getEstiloByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Estilo) session.load(basededatos.Estilo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Estilo) session.get(basededatos.Estilo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estilo) session.load(basededatos.Estilo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo getEstiloByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estilo) session.get(basededatos.Estilo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryEstilo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryEstilo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstilo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estilo as Estilo");
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
	
	public static List queryEstilo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estilo as Estilo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estilo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstilo(session, condition, orderBy);
			return (Estilo[]) list.toArray(new Estilo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo[] listEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstilo(session, condition, orderBy, lockMode);
			return (Estilo[]) list.toArray(new Estilo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estilo[] estilos = listEstiloByQuery(session, condition, orderBy);
		if (estilos != null && estilos.length > 0)
			return estilos[0];
		else
			return null;
	}
	
	public static Estilo loadEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estilo[] estilos = listEstiloByQuery(session, condition, orderBy, lockMode);
		if (estilos != null && estilos.length > 0)
			return estilos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstiloByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateEstiloByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstiloByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateEstiloByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstiloByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estilo as Estilo");
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
	
	public static java.util.Iterator iterateEstiloByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estilo as Estilo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estilo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo createEstilo() {
		return new basededatos.Estilo();
	}
	
	public static boolean save(basededatos.Estilo estilo) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Estilo estilo) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estilo estilo)throws PersistentException {
		try {
			basededatos.Artista[] lIdentifica_as = estilo.identifica_a.toArray();
			for(int i = 0; i < lIdentifica_as.length; i++) {
				lIdentifica_as[i].es_identificado_por.remove(estilo);
			}
			return delete(estilo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estilo estilo, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Artista[] lIdentifica_as = estilo.identifica_a.toArray();
			for(int i = 0; i < lIdentifica_as.length; i++) {
				lIdentifica_as[i].es_identificado_por.remove(estilo);
			}
			try {
				session.delete(estilo);
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
	
	public static boolean refresh(basededatos.Estilo estilo) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Estilo estilo) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(estilo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estilo loadEstiloByCriteria(EstiloCriteria estiloCriteria) {
		Estilo[] estilos = listEstiloByCriteria(estiloCriteria);
		if(estilos == null || estilos.length == 0) {
			return null;
		}
		return estilos[0];
	}
	
	public static Estilo[] listEstiloByCriteria(EstiloCriteria estiloCriteria) {
		return estiloCriteria.listEstilo();
	}
}
