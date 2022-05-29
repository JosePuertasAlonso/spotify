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

public class ListaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final StringExpression imagen;
	public final CollectionExpression contiene;
	
	public ListaDetachedCriteria() {
		super(basededatos.Lista.class, basededatos.ListaCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public ListaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ListaCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createContieneCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Lista uniqueLista(PersistentSession session) {
		return (Lista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista[] listLista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

