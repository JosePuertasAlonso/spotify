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

public class Usuario_registradoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression anuncia;
	
	public Usuario_registradoDetachedCriteria() {
		super(basededatos.Usuario_registrado.class, basededatos.Usuario_registradoCriteria.class);
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
		anuncia = new CollectionExpression("ORM_anuncia", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.Usuario_registradoCriteria.class);
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
		anuncia = new CollectionExpression("ORM_anuncia", this.getDetachedCriteria());
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
	
	public AnuncioDetachedCriteria createAnunciaCriteria() {
		return new AnuncioDetachedCriteria(createCriteria("ORM_anuncia"));
	}
	
	public Usuario_registrado uniqueUsuario_registrado(PersistentSession session) {
		return (Usuario_registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_registrado[] listUsuario_registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
	}
}

