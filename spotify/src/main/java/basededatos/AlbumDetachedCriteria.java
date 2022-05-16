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

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Lista;
	public final StringExpression nombre;
	public final CollectionExpression contiene;
	public final StringExpression imagen;
	public final StringExpression fecha_Edicion;
	public final CollectionExpression es_creado_por;
	
	public AlbumDetachedCriteria() {
		super(basededatos.Album.class, basededatos.AlbumCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		fecha_Edicion = new StringExpression("fecha_Edicion", this.getDetachedCriteria());
		es_creado_por = new CollectionExpression("ORM_es_creado_por", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AlbumCriteria.class);
		id_Lista = new IntegerExpression("id_Lista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_contiene", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		fecha_Edicion = new StringExpression("fecha_Edicion", this.getDetachedCriteria());
		es_creado_por = new CollectionExpression("ORM_es_creado_por", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createEs_creado_porCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_es_creado_por"));
	}
	
	public CancionDetachedCriteria createContieneCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

