package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cancion;

public class BD_Cancion {
	public BDPrincipal _bd_prin_can;
	public Vector<Cancion> _contiene_cancion = new Vector<Cancion>();

	public Cancion[] cargar_ultimos_exitos() throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.ultimo_Exito.eq(true);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}
	
	public Cancion[] cargar_recomendaciones() throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.ultimo_Exito.eq(true);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}

	public Cancion[] buscar_canciones(String aCadena_busqueda) throws PersistentException {
		CancionCriteria criteria = new CancionCriteria();
		criteria.titulo.like(aCadena_busqueda);
		Cancion[] result = CancionDAO.listCancionByCriteria(criteria);
		return result;
	}

	public void anadir_cancion_historial(int aId_Cancion, String aLogin) {
		throw new UnsupportedOperationException();
	}

	public boolean anadir_a_favoritos(int aId_Cancion, String aLogin) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin);
		
		Usuario_registrado u = Usuario_registradoDAO.listUsuario_registradoByCriteria(criteria)[0];
		CancionCriteria criteria2 = new CancionCriteria();
		criteria2.id_Cancion.eq(aId_Cancion);
		Cancion c = CancionDAO.listCancionByCriteria(criteria2)[0];
		
		if (u.marca_como_favorita.contains(c)) {
			try {
				u.marca_como_favorita.remove(c);
				Usuario_registradoDAO.save(u);
				t.commit();
				return true;
			} catch (Exception e) {
				t.rollback();
			}
		} else {
			try {
				u.marca_como_favorita.add(c);
				Usuario_registradoDAO.save(u);
				t.commit();
				return true;
			} catch (Exception e) {
				t.rollback();
			}
		}
		
		return false;
	}

	public Cancion cargar_cancion_mas_escuchada(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_ultima_reproduccion(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void anadir_cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_cancion(int aId_Cancion) {
		throw new UnsupportedOperationException();
	}

	public void modificar_cancion(int aId_Cancion, String aTitulo_cancion, String aArtistas, String aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void establecer_ultimo_exito(int aId_Cancion) {
		throw new UnsupportedOperationException();
	}
}