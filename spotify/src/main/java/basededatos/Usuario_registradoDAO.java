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

public class Usuario_registradoDAO {
	public static Usuario_registrado loadUsuario_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadUsuario_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getUsuario_registradoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadUsuario_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return getUsuario_registradoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_registrado) session.load(basededatos.Usuario_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Usuario_registrado) session.get(basededatos.Usuario_registrado.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registrado) session.load(basededatos.Usuario_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado getUsuario_registradoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_registrado) session.get(basededatos.Usuario_registrado.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryUsuario_registrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return queryUsuario_registrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return listUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_registrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_registrado as Usuario_registrado");
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
	
	public static List queryUsuario_registrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_registrado as Usuario_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_registrado(session, condition, orderBy);
			return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado[] listUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_registrado(session, condition, orderBy, lockMode);
			return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return loadUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByQuery(session, condition, orderBy);
		if (usuario_registrados != null && usuario_registrados.length > 0)
			return usuario_registrados[0];
		else
			return null;
	}
	
	public static Usuario_registrado loadUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		if (usuario_registrados != null && usuario_registrados.length > 0)
			return usuario_registrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateUsuario_registradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFCastellsTorresPersistentManager.instance().getSession();
			return iterateUsuario_registradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_registrado as Usuario_registrado");
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
	
	public static java.util.Iterator iterateUsuario_registradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_registrado as Usuario_registrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_registrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado createUsuario_registrado() {
		return new basededatos.Usuario_registrado();
	}
	
	public static boolean save(basededatos.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().saveObject(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().deleteObject(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_registrado usuario_registrado)throws PersistentException {
		if (usuario_registrado instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario_registrado);
		}
		
		try {
			if (usuario_registrado.getTiene() != null) {
				usuario_registrado.getTiene().setPertenecen_a(null);
			}
			
			basededatos.Cancion[] lMarca_como_favoritas = usuario_registrado.marca_como_favorita.toArray();
			for(int i = 0; i < lMarca_como_favoritas.length; i++) {
				lMarca_como_favoritas[i].es_marcada_como_favorita_por.remove(usuario_registrado);
			}
			basededatos.Usuario_registrado[] lSigues = usuario_registrado.sigue.toArray();
			for(int i = 0; i < lSigues.length; i++) {
				lSigues[i].es_seguido_por.remove(usuario_registrado);
			}
			basededatos.Cancion[] lReproduces = usuario_registrado.reproduce.toArray();
			for(int i = 0; i < lReproduces.length; i++) {
				lReproduces[i].es_historial_de.remove(usuario_registrado);
			}
			basededatos.Lista_de_reproduccion[] lGestionas = usuario_registrado.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setEs_gestionada_por(null);
			}
			basededatos.Usuario_registrado[] lEs_seguido_pors = usuario_registrado.es_seguido_por.toArray();
			for(int i = 0; i < lEs_seguido_pors.length; i++) {
				lEs_seguido_pors[i].sigue.remove(usuario_registrado);
			}
			basededatos.Lista_de_reproduccion[] lGuardas = usuario_registrado.guarda.toArray();
			for(int i = 0; i < lGuardas.length; i++) {
				lGuardas[i].es_guardada_por.remove(usuario_registrado);
			}
			return delete(usuario_registrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_registrado usuario_registrado, org.orm.PersistentSession session)throws PersistentException {
		if (usuario_registrado instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario_registrado, session);
		}
		
		try {
			if (usuario_registrado.getTiene() != null) {
				usuario_registrado.getTiene().setPertenecen_a(null);
			}
			
			basededatos.Cancion[] lMarca_como_favoritas = usuario_registrado.marca_como_favorita.toArray();
			for(int i = 0; i < lMarca_como_favoritas.length; i++) {
				lMarca_como_favoritas[i].es_marcada_como_favorita_por.remove(usuario_registrado);
			}
			basededatos.Usuario_registrado[] lSigues = usuario_registrado.sigue.toArray();
			for(int i = 0; i < lSigues.length; i++) {
				lSigues[i].es_seguido_por.remove(usuario_registrado);
			}
			basededatos.Cancion[] lReproduces = usuario_registrado.reproduce.toArray();
			for(int i = 0; i < lReproduces.length; i++) {
				lReproduces[i].es_historial_de.remove(usuario_registrado);
			}
			basededatos.Lista_de_reproduccion[] lGestionas = usuario_registrado.gestiona.toArray();
			for(int i = 0; i < lGestionas.length; i++) {
				lGestionas[i].setEs_gestionada_por(null);
			}
			basededatos.Usuario_registrado[] lEs_seguido_pors = usuario_registrado.es_seguido_por.toArray();
			for(int i = 0; i < lEs_seguido_pors.length; i++) {
				lEs_seguido_pors[i].sigue.remove(usuario_registrado);
			}
			basededatos.Lista_de_reproduccion[] lGuardas = usuario_registrado.guarda.toArray();
			for(int i = 0; i < lGuardas.length; i++) {
				lGuardas[i].es_guardada_por.remove(usuario_registrado);
			}
			try {
				session.delete(usuario_registrado);
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
	
	public static boolean refresh(basededatos.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().refresh(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario_registrado usuario_registrado) throws PersistentException {
		try {
			MDS12022PFCastellsTorresPersistentManager.instance().getSession().evict(usuario_registrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_registrado loadUsuario_registradoByCriteria(Usuario_registradoCriteria usuario_registradoCriteria) {
		Usuario_registrado[] usuario_registrados = listUsuario_registradoByCriteria(usuario_registradoCriteria);
		if(usuario_registrados == null || usuario_registrados.length == 0) {
			return null;
		}
		return usuario_registrados[0];
	}
	
	public static Usuario_registrado[] listUsuario_registradoByCriteria(Usuario_registradoCriteria usuario_registradoCriteria) {
		return usuario_registradoCriteria.listUsuario_registrado();
	}
}
