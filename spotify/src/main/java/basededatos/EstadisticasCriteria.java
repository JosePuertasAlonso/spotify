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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EstadisticasCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Estadisticas;
	public final IntegerExpression actividad_Semanal;
	public final IntegerExpression pertenecen_aId;
	public final AssociationExpression pertenecen_a;
	
	public EstadisticasCriteria(Criteria criteria) {
		super(criteria);
		id_Estadisticas = new IntegerExpression("id_Estadisticas", this);
		actividad_Semanal = new IntegerExpression("actividad_Semanal", this);
		pertenecen_aId = new IntegerExpression("pertenecen_a.id_Estadisticas", this);
		pertenecen_a = new AssociationExpression("pertenecen_a", this);
	}
	
	public EstadisticasCriteria(PersistentSession session) {
		this(session.createCriteria(Estadisticas.class));
	}
	
	public EstadisticasCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createPertenecen_aCriteria() {
		return new Usuario_registradoCriteria(createCriteria("pertenecen_a"));
	}
	
	public Estadisticas uniqueEstadisticas() {
		return (Estadisticas) super.uniqueResult();
	}
	
	public Estadisticas[] listEstadisticas() {
		java.util.List list = super.list();
		return (Estadisticas[]) list.toArray(new Estadisticas[list.size()]);
	}
}

