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

public class ArtistaCriteria extends AbstractORMCriteria {
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
	
	public ArtistaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		login = new StringExpression("login", this);
		password = new StringExpression("password", this);
		seguidores = new IntegerExpression("seguidores", this);
		foto = new StringExpression("foto", this);
		nick = new StringExpression("nick", this);
		dias_baja = new IntegerExpression("dias_baja", this);
		tieneId = new IntegerExpression("tiene.id_Estadisticas", this);
		tiene = new AssociationExpression("tiene", this);
		marca_como_favorita = new CollectionExpression("ORM_marca_como_favorita", this);
		sigue = new CollectionExpression("ORM_sigue", this);
		reproduce = new CollectionExpression("ORM_reproduce", this);
		gestiona = new CollectionExpression("ORM_gestiona", this);
		es_seguido_por = new CollectionExpression("ORM_es_seguido_por", this);
		guarda = new CollectionExpression("ORM_guarda", this);
		realiza = new CollectionExpression("ORM_realiza", this);
		es_similar_a = new CollectionExpression("ORM_es_similar_a", this);
		es_autor_de = new CollectionExpression("ORM_es_autor_de", this);
		es_identificado_por = new CollectionExpression("ORM_es_identificado_por", this);
		es_similar_de = new CollectionExpression("ORM_es_similar_de", this);
		publica = new CollectionExpression("ORM_publica", this);
	}
	
	public ArtistaCriteria(PersistentSession session) {
		this(session.createCriteria(Artista.class));
	}
	
	public ArtistaCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createRealizaCriteria() {
		return new CancionCriteria(createCriteria("ORM_realiza"));
	}
	
	public ArtistaCriteria createEs_similar_aCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_es_similar_a"));
	}
	
	public AlbumCriteria createEs_autor_deCriteria() {
		return new AlbumCriteria(createCriteria("ORM_es_autor_de"));
	}
	
	public EstiloCriteria createEs_identificado_porCriteria() {
		return new EstiloCriteria(createCriteria("ORM_es_identificado_por"));
	}
	
	public ArtistaCriteria createEs_similar_deCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_es_similar_de"));
	}
	
	public AnuncioCriteria createPublicaCriteria() {
		return new AnuncioCriteria(createCriteria("ORM_publica"));
	}
	
	public EstadisticasCriteria createTieneCriteria() {
		return new EstadisticasCriteria(createCriteria("tiene"));
	}
	
	public CancionCriteria createMarca_como_favoritaCriteria() {
		return new CancionCriteria(createCriteria("ORM_marca_como_favorita"));
	}
	
	public Usuario_registradoCriteria createSigueCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_sigue"));
	}
	
	public CancionCriteria createReproduceCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce"));
	}
	
	public Lista_de_reproduccionCriteria createGestionaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_gestiona"));
	}
	
	public Usuario_registradoCriteria createEs_seguido_porCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_es_seguido_por"));
	}
	
	public Lista_de_reproduccionCriteria createGuardaCriteria() {
		return new Lista_de_reproduccionCriteria(createCriteria("ORM_guarda"));
	}
	
	public Artista uniqueArtista() {
		return (Artista) super.uniqueResult();
	}
	
	public Artista[] listArtista() {
		java.util.List list = super.list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

