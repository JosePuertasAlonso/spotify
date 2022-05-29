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

public class ListaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final StringExpression imagen;
	public final CollectionExpression contiene;
	
	public ListaCriteria(Criteria criteria) {
		super(criteria);
		id_Lista = new IntegerExpression("id_Lista", this);
		nombre = new StringExpression("nombre", this);
		imagen = new StringExpression("imagen", this);
		contiene = new CollectionExpression("ORM_contiene", this);
	}
	
	public ListaCriteria(PersistentSession session) {
		this(session.createCriteria(Lista.class));
	}
	
	public ListaCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createContieneCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene"));
	}
	
	public Lista uniqueLista() {
		return (Lista) super.uniqueResult();
	}
	
	public Lista[] listLista() {
		java.util.List list = super.list();
		return (Lista[]) list.toArray(new Lista[list.size()]);
	}
}

