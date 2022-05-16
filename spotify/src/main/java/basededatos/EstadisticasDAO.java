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

public class EstadisticasDAO {
	public static Estadisticas loadEstadisticasByORMID(int id_Estadisticas) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstadisticasByORMID(session, id_Estadisticas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas getEstadisticasByORMID(int id_Estadisticas) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getEstadisticasByORMID(session, id_Estadisticas);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByORMID(int id_Estadisticas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstadisticasByORMID(session, id_Estadisticas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas getEstadisticasByORMID(int id_Estadisticas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getEstadisticasByORMID(session, id_Estadisticas, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByORMID(PersistentSession session, int id_Estadisticas) throws PersistentException {
		try {
			return (Estadisticas) session.load(basededatos.Estadisticas.class, new Integer(id_Estadisticas));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas getEstadisticasByORMID(PersistentSession session, int id_Estadisticas) throws PersistentException {
		try {
			return (Estadisticas) session.get(basededatos.Estadisticas.class, new Integer(id_Estadisticas));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByORMID(PersistentSession session, int id_Estadisticas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadisticas) session.load(basededatos.Estadisticas.class, new Integer(id_Estadisticas), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas getEstadisticasByORMID(PersistentSession session, int id_Estadisticas, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadisticas) session.get(basededatos.Estadisticas.class, new Integer(id_Estadisticas), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadisticas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryEstadisticas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadisticas(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryEstadisticas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas[] listEstadisticasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listEstadisticasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas[] listEstadisticasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listEstadisticasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadisticas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadisticas as Estadisticas");
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
	
	public static List queryEstadisticas(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadisticas as Estadisticas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadisticas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas[] listEstadisticasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstadisticas(session, condition, orderBy);
			return (Estadisticas[]) list.toArray(new Estadisticas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas[] listEstadisticasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstadisticas(session, condition, orderBy, lockMode);
			return (Estadisticas[]) list.toArray(new Estadisticas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstadisticasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadEstadisticasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estadisticas[] estadisticases = listEstadisticasByQuery(session, condition, orderBy);
		if (estadisticases != null && estadisticases.length > 0)
			return estadisticases[0];
		else
			return null;
	}
	
	public static Estadisticas loadEstadisticasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estadisticas[] estadisticases = listEstadisticasByQuery(session, condition, orderBy, lockMode);
		if (estadisticases != null && estadisticases.length > 0)
			return estadisticases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstadisticasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateEstadisticasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateEstadisticasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadisticas as Estadisticas");
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
	
	public static java.util.Iterator iterateEstadisticasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadisticas as Estadisticas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadisticas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas createEstadisticas() {
		return new basededatos.Estadisticas();
	}
	
	public static boolean save(basededatos.Estadisticas estadisticas) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(estadisticas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Estadisticas estadisticas) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(estadisticas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estadisticas estadisticas)throws PersistentException {
		try {
			if (estadisticas.getPertenecen_a() != null) {
				estadisticas.getPertenecen_a().setTiene(null);
			}
			
			return delete(estadisticas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estadisticas estadisticas, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estadisticas.getPertenecen_a() != null) {
				estadisticas.getPertenecen_a().setTiene(null);
			}
			
			try {
				session.delete(estadisticas);
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
	
	public static boolean refresh(basededatos.Estadisticas estadisticas) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(estadisticas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Estadisticas estadisticas) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(estadisticas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadisticas loadEstadisticasByCriteria(EstadisticasCriteria estadisticasCriteria) {
		Estadisticas[] estadisticases = listEstadisticasByCriteria(estadisticasCriteria);
		if(estadisticases == null || estadisticases.length == 0) {
			return null;
		}
		return estadisticases[0];
	}
	
	public static Estadisticas[] listEstadisticasByCriteria(EstadisticasCriteria estadisticasCriteria) {
		return estadisticasCriteria.listEstadisticas();
	}
}
