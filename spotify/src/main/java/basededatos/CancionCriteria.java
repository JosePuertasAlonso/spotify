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

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_Cancion;
	public final StringExpression titulo;
	public final IntegerExpression duracion;
	public final StringExpression fichero_MP3;
	public final StringExpression fichero_MP4;
	public final StringExpression fichero_Alta_Calidad;
	public final StringExpression nick;
	public final StringExpression compositor;
	public final StringExpression productor;
	public final StringExpression interprete;
	public final IntegerExpression reproducciones;
	public final BooleanExpression ultimo_Exito;
	public final CollectionExpression esta_en;
	public final CollectionExpression realizada_por;
	public final CollectionExpression es_marcada_como_favorita_por;
	public final CollectionExpression es_historial_de;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		id_Cancion = new IntegerExpression("id_Cancion", this);
		titulo = new StringExpression("titulo", this);
		duracion = new IntegerExpression("duracion", this);
		fichero_MP3 = new StringExpression("fichero_MP3", this);
		fichero_MP4 = new StringExpression("fichero_MP4", this);
		fichero_Alta_Calidad = new StringExpression("fichero_Alta_Calidad", this);
		nick = new StringExpression("nick", this);
		compositor = new StringExpression("compositor", this);
		productor = new StringExpression("productor", this);
		interprete = new StringExpression("interprete", this);
		reproducciones = new IntegerExpression("reproducciones", this);
		ultimo_Exito = new BooleanExpression("ultimo_Exito", this);
		esta_en = new CollectionExpression("ORM_esta_en", this);
		realizada_por = new CollectionExpression("ORM_realizada_por", this);
		es_marcada_como_favorita_por = new CollectionExpression("ORM_es_marcada_como_favorita_por", this);
		es_historial_de = new CollectionExpression("ORM_es_historial_de", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(MDS12022PFCastellsTorresPersistentManager.instance().getSession());
	}
	
	public ListaCriteria createEsta_enCriteria() {
		return new ListaCriteria(createCriteria("ORM_esta_en"));
	}
	
	public ArtistaCriteria createRealizada_porCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_realizada_por"));
	}
	
	public Usuario_registradoCriteria createEs_marcada_como_favorita_porCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_es_marcada_como_favorita_por"));
	}
	
	public Usuario_registradoCriteria createEs_historial_deCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_es_historial_de"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

