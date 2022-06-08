package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Lista;

public class BD_Lista {
	public BDPrincipal _bd_prin_list;
	public Vector<Lista> _contiene_lista = new Vector<Lista>();

	public Lista_de_reproduccion[] buscar_listas(String aCadena_busqueda) throws PersistentException {
		Lista_de_reproduccionCriteria criteria = new Lista_de_reproduccionCriteria();
		criteria.nombre.like("%" + aCadena_busqueda + "%");
		Lista_de_reproduccion[] result = Lista_de_reproduccionDAO.listLista_de_reproduccionByCriteria(criteria);
		return result;
	}

	public void guardar_lista(Lista_de_reproduccion aLista, String aLogin) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado u = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
		
		Lista_de_reproduccion result = new Lista_de_reproduccion();
		result.setEs_gestionada_por(u);
		result.setImagen(aLista.getImagen());
		result.setNombre(aLista.getNombre());
		
		Cancion[] cancionesLista = aLista.contiene.toArray();
		for(Cancion c : cancionesLista) {
			CancionCriteria criteria2 = new CancionCriteria();
			criteria2.id_Cancion.eq(c.getId_Cancion());
			Cancion aux = CancionDAO.loadCancionByCriteria(criteria2);
			result.contiene.add(aux);
		}
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			u.gestiona.add(result);
			Usuario_registradoDAO.save(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public Lista_de_reproduccion[] cargar_listas_perfil(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void anadir_cancion_a_la_lista(String aLogin, int aId_Cancion, int aId_Lista) throws PersistentException {
		ListaCriteria criteria = new ListaCriteria();
		criteria.id_Lista.eq(aId_Lista);
		Lista lista = ListaDAO.loadListaByCriteria(criteria);
		
		CancionCriteria criteria2 = new CancionCriteria();
		criteria2.id_Cancion.eq(aId_Cancion);
		Cancion cancion = CancionDAO.loadCancionByCriteria(criteria2);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(lista.contiene.contains(cancion)) {
				lista.contiene.remove(cancion);
			} else {
				lista.contiene.add(cancion);
			}
			ListaDAO.save(lista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void crear_lista(String aLogin, String aNombre_lista, String foto) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		Usuario_registrado usuario = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = new Lista_de_reproduccion();
			lista.setNombre(aNombre_lista);
			lista.setImagen(foto);
			usuario.gestiona.add(lista);
			Usuario_registradoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public Cancion[] cargar_canciones_album(int aId_album) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_lista(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista(int aId_Lista) throws PersistentException {
		Lista_de_reproduccionCriteria criteria = new Lista_de_reproduccionCriteria();
		criteria.id_Lista.eq(aId_Lista);
		Lista listaGenerica = Lista_de_reproduccionDAO.loadLista_de_reproduccionByCriteria(criteria);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			ListaDAO.delete(listaGenerica);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void eliminar_cancion_lista(int aId_Lista, int aId_Cancion) throws PersistentException {
		ListaCriteria criteria = new ListaCriteria();
		criteria.id_Lista.eq(aId_Lista);
		Lista lista = ListaDAO.loadListaByCriteria(criteria);
		
		CancionCriteria criteria2 = new CancionCriteria();
		criteria2.id_Cancion.eq(aId_Cancion);
		Cancion cancion = CancionDAO.loadCancionByCriteria(criteria2);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(lista.contiene.contains(cancion)) {
				lista.contiene.remove(cancion);
			}
			ListaDAO.save(lista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void cambiar_nombre_lista(int aId_Lista, String aNombre_nuevo_lista) throws PersistentException {
		ListaCriteria criteria = new ListaCriteria();
		criteria.id_Lista.eq(aId_Lista);
		Lista lista = ListaDAO.loadListaByCriteria(criteria);
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			lista.setNombre(aNombre_nuevo_lista);
			ListaDAO.save(lista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
	}

	public void anadir_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_album(int aId_Album) {
		throw new UnsupportedOperationException();
	}

	public void modificar_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public Album[] buscar_albumes_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}
}