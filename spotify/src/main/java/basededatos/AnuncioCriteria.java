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

public class AnuncioCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Anuncio;
	public final IntegerExpression es_publicado_porId;
	public final AssociationExpression es_publicado_por;
	public final StringExpression titulo;
	public final StringExpression descripcion;
	
	public AnuncioCriteria(Criteria criteria) {
		super(criteria);
		id_Anuncio = new IntegerExpression("id_Anuncio", this);
		es_publicado_porId = new IntegerExpression("es_publicado_por.", this);
		es_publicado_por = new AssociationExpression("es_publicado_por", this);
		titulo = new StringExpression("titulo", this);
		descripcion = new StringExpression("descripcion", this);
	}
	
	public AnuncioCriteria(PersistentSession session) {
		this(session.createCriteria(Anuncio.class));
	}
	
	public AnuncioCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createEs_publicado_porCriteria() {
		return new ArtistaCriteria(createCriteria("es_publicado_por"));
	}
	
	public Anuncio uniqueAnuncio() {
		return (Anuncio) super.uniqueResult();
	}
	
	public Anuncio[] listAnuncio() {
		java.util.List list = super.list();
		return (Anuncio[]) list.toArray(new Anuncio[list.size()]);
	}
}

