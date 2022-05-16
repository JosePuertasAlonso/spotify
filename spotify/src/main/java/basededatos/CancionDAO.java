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

public class CancionDAO {
	public static Cancion loadCancionByORMID(int id_Cancion) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id_Cancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id_Cancion) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getCancionByORMID(session, id_Cancion);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(int id_Cancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id_Cancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id_Cancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getCancionByORMID(session, id_Cancion, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id_Cancion) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(id_Cancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id_Cancion) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(id_Cancion));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id_Cancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(id_Cancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id_Cancion, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(id_Cancion), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy, lockMode);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy, lockMode);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion createCancion() {
		return new basededatos.Cancion();
	}
	
	public static boolean save(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion)throws PersistentException {
		try {
			basededatos.Lista[] lEsta_ens = cancion.esta_en.toArray();
			for(int i = 0; i < lEsta_ens.length; i++) {
				lEsta_ens[i].contiene.remove(cancion);
			}
			basededatos.Artista[] lRealizada_pors = cancion.realizada_por.toArray();
			for(int i = 0; i < lRealizada_pors.length; i++) {
				lRealizada_pors[i].realiza.remove(cancion);
			}
			basededatos.Usuario_registrado[] lEs_marcada_como_favorita_pors = cancion.es_marcada_como_favorita_por.toArray();
			for(int i = 0; i < lEs_marcada_como_favorita_pors.length; i++) {
				lEs_marcada_como_favorita_pors[i].marca_como_favorita.remove(cancion);
			}
			basededatos.Usuario_registrado[] lEs_historial_des = cancion.es_historial_de.toArray();
			for(int i = 0; i < lEs_historial_des.length; i++) {
				lEs_historial_des[i].reproduce.remove(cancion);
			}
			return delete(cancion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Lista[] lEsta_ens = cancion.esta_en.toArray();
			for(int i = 0; i < lEsta_ens.length; i++) {
				lEsta_ens[i].contiene.remove(cancion);
			}
			basededatos.Artista[] lRealizada_pors = cancion.realizada_por.toArray();
			for(int i = 0; i < lRealizada_pors.length; i++) {
				lRealizada_pors[i].realiza.remove(cancion);
			}
			basededatos.Usuario_registrado[] lEs_marcada_como_favorita_pors = cancion.es_marcada_como_favorita_por.toArray();
			for(int i = 0; i < lEs_marcada_como_favorita_pors.length; i++) {
				lEs_marcada_como_favorita_pors[i].marca_como_favorita.remove(cancion);
			}
			basededatos.Usuario_registrado[] lEs_historial_des = cancion.es_historial_de.toArray();
			for(int i = 0; i < lEs_historial_des.length; i++) {
				lEs_historial_des[i].reproduce.remove(cancion);
			}
			try {
				session.delete(cancion);
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
	
	public static boolean refresh(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByCriteria(CancionCriteria cancionCriteria) {
		Cancion[] cancions = listCancionByCriteria(cancionCriteria);
		if(cancions == null || cancions.length == 0) {
			return null;
		}
		return cancions[0];
	}
	
	public static Cancion[] listCancionByCriteria(CancionCriteria cancionCriteria) {
		return cancionCriteria.listCancion();
	}
}
