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

public class EstiloCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final CollectionExpression identifica_a;
	
	public EstiloCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		identifica_a = new CollectionExpression("ORM_identifica_a", this);
	}
	
	public EstiloCriteria(PersistentSession session) {
		this(session.createCriteria(Estilo.class));
	}
	
	public EstiloCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createIdentifica_aCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_identifica_a"));
	}
	
	public Estilo uniqueEstilo() {
		return (Estilo) super.uniqueResult();
	}
	
	public Estilo[] listEstilo() {
		java.util.List list = super.list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

