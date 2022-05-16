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

public class EstiloDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final CollectionExpression identifica_a;
	
	public EstiloDetachedCriteria() {
		super(basededatos.Estilo.class, basededatos.EstiloCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		identifica_a = new CollectionExpression("ORM_identifica_a", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstiloCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		identifica_a = new CollectionExpression("ORM_identifica_a", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createIdentifica_aCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_identifica_a"));
	}
	
	public Estilo uniqueEstilo(PersistentSession session) {
		return (Estilo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estilo[] listEstilo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

