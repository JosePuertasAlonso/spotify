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

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final StringExpression imagen;
	public final CollectionExpression contiene;
	public final StringExpression fecha_Edicion;
	public final CollectionExpression es_creado_por;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		id_Lista = new IntegerExpression("id_Lista", this);
		nombre = new StringExpression("nombre", this);
		imagen = new StringExpression("imagen", this);
		contiene = new CollectionExpression("ORM_contiene", this);
		fecha_Edicion = new StringExpression("fecha_Edicion", this);
		es_creado_por = new CollectionExpression("ORM_es_creado_por", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createEs_creado_porCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_es_creado_por"));
	}
	
	public CancionCriteria createContieneCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

