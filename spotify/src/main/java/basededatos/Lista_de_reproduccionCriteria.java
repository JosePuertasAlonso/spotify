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

public class Lista_de_reproduccionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final CollectionExpression contiene;
	public final IntegerExpression es_gestionada_porId;
	public final AssociationExpression es_gestionada_por;
	public final CollectionExpression es_guardada_por;
	
	public Lista_de_reproduccionCriteria(Criteria criteria) {
		super(criteria);
		id_Lista = new IntegerExpression("id_Lista", this);
		nombre = new StringExpression("nombre", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		es_gestionada_porId = new IntegerExpression("es_gestionada_por.", this);
		es_gestionada_por = new AssociationExpression("es_gestionada_por", this);
		es_guardada_por = new CollectionExpression("ORM_es_guardada_por", this);
	}
	
	public Lista_de_reproduccionCriteria(PersistentSession session) {
		this(session.createCriteria(Lista_de_reproduccion.class));
	}
	
	public Lista_de_reproduccionCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createEs_gestionada_porCriteria() {
		return new Usuario_registradoCriteria(createCriteria("es_gestionada_por"));
	}
	
	public Usuario_registradoCriteria createEs_guardada_porCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_es_guardada_por"));
	}
	
	public CancionCriteria createContieneCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion() {
		return (Lista_de_reproduccion) super.uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion() {
		java.util.List list = super.list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

