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

public class Lista_de_reproduccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final StringExpression imagen;
	public final CollectionExpression contiene;
	public final IntegerExpression es_gestionada_porId;
	public final AssociationExpression es_gestionada_por;
	public final CollectionExpression es_guardada_por;
	
	public Lista_de_reproduccionDetachedCriteria() {
		super(basededatos.Lista_de_reproduccion.class, basededatos.Lista_de_reproduccionCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		es_gestionada_porId = new IntegerExpression("es_gestionada_por.ID", this.getDetachedCriteria());
		es_gestionada_por = new AssociationExpression("es_gestionada_por", this.getDetachedCriteria());
		es_guardada_por = new CollectionExpression("ORM_es_guardada_por", this.getDetachedCriteria());
	}
	
	public Lista_de_reproduccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Lista_de_reproduccionCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		es_gestionada_porId = new IntegerExpression("es_gestionada_por.ID", this.getDetachedCriteria());
		es_gestionada_por = new AssociationExpression("es_gestionada_por", this.getDetachedCriteria());
		es_guardada_por = new CollectionExpression("ORM_es_guardada_por", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria createEs_gestionada_porCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("es_gestionada_por"));
	}
	
	public Usuario_registradoDetachedCriteria createEs_guardada_porCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_es_guardada_por"));
	}
	
	public CancionDetachedCriteria createContieneCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Lista_de_reproduccion uniqueLista_de_reproduccion(PersistentSession session) {
		return (Lista_de_reproduccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Lista_de_reproduccion[] listLista_de_reproduccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
	}
}

