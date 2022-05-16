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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EstadisticasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Estadisticas;
	public final IntegerExpression actividad_Semanal;
	public final IntegerExpression pertenecen_aId;
	public final AssociationExpression pertenecen_a;
	
	public EstadisticasDetachedCriteria() {
		super(basededatos.Estadisticas.class, basededatos.EstadisticasCriteria.class);
		id_Estadisticas = new IntegerExpression("id_Estadisticas", this.getDetachedCriteria());
		actividad_Semanal = new IntegerExpression("actividad_Semanal", this.getDetachedCriteria());
		pertenecen_aId = new IntegerExpression("pertenecen_a.id_Estadisticas", this.getDetachedCriteria());
		pertenecen_a = new AssociationExpression("pertenecen_a", this.getDetachedCriteria());
	}
	
	public EstadisticasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstadisticasCriteria.class);
		id_Estadisticas = new IntegerExpression("id_Estadisticas", this.getDetachedCriteria());
		actividad_Semanal = new IntegerExpression("actividad_Semanal", this.getDetachedCriteria());
		pertenecen_aId = new IntegerExpression("pertenecen_a.id_Estadisticas", this.getDetachedCriteria());
		pertenecen_a = new AssociationExpression("pertenecen_a", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria createPertenecen_aCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("pertenecen_a"));
	}
	
	public Estadisticas uniqueEstadisticas(PersistentSession session) {
		return (Estadisticas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estadisticas[] listEstadisticas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estadisticas[]) list.toArray(new Estadisticas[list.size()]);
	}
}

