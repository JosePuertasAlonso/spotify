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

public class AnuncioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Anuncio;
	public final IntegerExpression anunciadoId;
	public final AssociationExpression anunciado;
	public final StringExpression titulo;
	public final StringExpression descripcion;
	
	public AnuncioDetachedCriteria() {
		super(basededatos.Anuncio.class, basededatos.AnuncioCriteria.class);
		id_Anuncio = new IntegerExpression("id_Anuncio", this.getDetachedCriteria());
		anunciadoId = new IntegerExpression("anunciado.", this.getDetachedCriteria());
		anunciado = new AssociationExpression("anunciado", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public AnuncioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AnuncioCriteria.class);
		id_Anuncio = new IntegerExpression("id_Anuncio", this.getDetachedCriteria());
		anunciadoId = new IntegerExpression("anunciado.", this.getDetachedCriteria());
		anunciado = new AssociationExpression("anunciado", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createAnunciadoCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("anunciado"));
	}
	
	public Anuncio uniqueAnuncio(PersistentSession session) {
		return (Anuncio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Anuncio[] listAnuncio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Anuncio[]) list.toArray(new Anuncio[list.size()]);
	}
}

