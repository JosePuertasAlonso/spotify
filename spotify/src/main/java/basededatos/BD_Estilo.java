package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Estilo;

public class BD_Estilo {
	public BDPrincipal _bd_prin_est;
	public Vector<Estilo> _contiene_estilo = new Vector<Estilo>();

	public void anadir_estilo(String aEstilo) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			Estilo e = EstiloDAO.createEstilo();
			e.setNombre(aEstilo);
			EstiloDAO.save(e);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public boolean existe_estilo(String aEstilo) throws PersistentException {
		boolean result = false;
		EstiloCriteria criteria = new EstiloCriteria();
		criteria.nombre.eq(aEstilo);
		Estilo[] e = EstiloDAO.listEstiloByCriteria(criteria);
		if(e.length > 0) {
			result = true;
		}
		return result;
	}

	public Estilo[] cargar_estilos() throws PersistentException {
		EstiloCriteria criteria = new EstiloCriteria();
		criteria.nombre.like("%" + "" + "%");
		return EstiloDAO.listEstiloByCriteria(criteria);
	}
}