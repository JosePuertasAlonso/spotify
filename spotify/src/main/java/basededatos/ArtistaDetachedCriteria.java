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

public class ArtistaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression login;
	public final StringExpression password;
	public final IntegerExpression seguidores;
	public final StringExpression foto;
	public final StringExpression nick;
	public final IntegerExpression dias_baja;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	public final CollectionExpression marca_como_favorita;
	public final CollectionExpression sigue;
	public final CollectionExpression reproduce;
	public final CollectionExpression gestiona;
	public final CollectionExpression es_seguido_por;
	public final CollectionExpression guarda;
	public final CollectionExpression realiza;
	public final CollectionExpression es_similar_a;
	public final CollectionExpression es_autor_de;
	public final CollectionExpression es_identificado_por;
	public final CollectionExpression es_similar_de;
	public final CollectionExpression publica;
	
	public ArtistaDetachedCriteria() {
		super(basededatos.Artista.class, basededatos.ArtistaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		seguidores = new IntegerExpression("seguidores", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		dias_baja = new IntegerExpression("dias_baja", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.id_Estadisticas", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
		marca_como_favorita = new CollectionExpression("ORM_marca_como_favorita", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_sigue", this.getDetachedCriteria());
		reproduce = new CollectionExpression("ORM_reproduce", this.getDetachedCriteria());
		gestiona = new CollectionExpression("ORM_gestiona", this.getDetachedCriteria());
		es_seguido_por = new CollectionExpression("ORM_es_seguido_por", this.getDetachedCriteria());
		guarda = new CollectionExpression("ORM_guarda", this.getDetachedCriteria());
		realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
		es_similar_a = new CollectionExpression("ORM_es_similar_a", this.getDetachedCriteria());
		es_autor_de = new CollectionExpression("ORM_es_autor_de", this.getDetachedCriteria());
		es_identificado_por = new CollectionExpression("ORM_es_identificado_por", this.getDetachedCriteria());
		es_similar_de = new CollectionExpression("ORM_es_similar_de", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ArtistaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		login = new StringExpression("login", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		seguidores = new IntegerExpression("seguidores", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		dias_baja = new IntegerExpression("dias_baja", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.id_Estadisticas", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
		marca_como_favorita = new CollectionExpression("ORM_marca_como_favorita", this.getDetachedCriteria());
		sigue = new CollectionExpression("ORM_sigue", this.getDetachedCriteria());
		reproduce = new CollectionExpression("ORM_reproduce", this.getDetachedCriteria());
		gestiona = new CollectionExpression("ORM_gestiona", this.getDetachedCriteria());
		es_seguido_por = new CollectionExpression("ORM_es_seguido_por", this.getDetachedCriteria());
		guarda = new CollectionExpression("ORM_guarda", this.getDetachedCriteria());
		realiza = new CollectionExpression("ORM_realiza", this.getDetachedCriteria());
		es_similar_a = new CollectionExpression("ORM_es_similar_a", this.getDetachedCriteria());
		es_autor_de = new CollectionExpression("ORM_es_autor_de", this.getDetachedCriteria());
		es_identificado_por = new CollectionExpression("ORM_es_identificado_por", this.getDetachedCriteria());
		es_similar_de = new CollectionExpression("ORM_es_similar_de", this.getDetachedCriteria());
		publica = new CollectionExpression("ORM_publica", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createRealizaCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_realiza"));
	}
	
	public ArtistaDetachedCriteria createEs_similar_aCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_es_similar_a"));
	}
	
	public AlbumDetachedCriteria createEs_autor_deCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_es_autor_de"));
	}
	
	public EstiloDetachedCriteria createEs_identificado_porCriteria() {
		return new EstiloDetachedCriteria(createCriteria("ORM_es_identificado_por"));
	}
	
	public ArtistaDetachedCriteria createEs_similar_deCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_es_similar_de"));
	}
	
	public AnuncioDetachedCriteria createPublicaCriteria() {
		return new AnuncioDetachedCriteria(createCriteria("ORM_publica"));
	}
	
	public EstadisticasDetachedCriteria createTieneCriteria() {
		return new EstadisticasDetachedCriteria(createCriteria("tiene"));
	}
	
	public CancionDetachedCriteria createMarca_como_favoritaCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_marca_como_favorita"));
	}
	
	public Usuario_registradoDetachedCriteria createSigueCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_sigue"));
	}
	
	public CancionDetachedCriteria createReproduceCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_reproduce"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createGestionaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_gestiona"));
	}
	
	public Usuario_registradoDetachedCriteria createEs_seguido_porCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_es_seguido_por"));
	}
	
	public Lista_de_reproduccionDetachedCriteria createGuardaCriteria() {
		return new Lista_de_reproduccionDetachedCriteria(createCriteria("ORM_guarda"));
	}
	
	public Artista uniqueArtista(PersistentSession session) {
		return (Artista) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Artista[] listArtista(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

