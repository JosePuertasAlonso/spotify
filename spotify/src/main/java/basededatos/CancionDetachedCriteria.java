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

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_Cancion;
	public final StringExpression titulo;
	public final StringExpression imagen;
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
	
	public CancionDetachedCriteria() {
		super(basededatos.Cancion.class, basededatos.CancionCriteria.class);
		id_Cancion = new IntegerExpression("id_Cancion", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		fichero_MP3 = new StringExpression("fichero_MP3", this.getDetachedCriteria());
		fichero_MP4 = new StringExpression("fichero_MP4", this.getDetachedCriteria());
		fichero_Alta_Calidad = new StringExpression("fichero_Alta_Calidad", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		compositor = new StringExpression("compositor", this.getDetachedCriteria());
		productor = new StringExpression("productor", this.getDetachedCriteria());
		interprete = new StringExpression("interprete", this.getDetachedCriteria());
		reproducciones = new IntegerExpression("reproducciones", this.getDetachedCriteria());
		ultimo_Exito = new BooleanExpression("ultimo_Exito", this.getDetachedCriteria());
		esta_en = new CollectionExpression("ORM_esta_en", this.getDetachedCriteria());
		realizada_por = new CollectionExpression("ORM_realizada_por", this.getDetachedCriteria());
		es_marcada_como_favorita_por = new CollectionExpression("ORM_es_marcada_como_favorita_por", this.getDetachedCriteria());
		es_historial_de = new CollectionExpression("ORM_es_historial_de", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionCriteria.class);
		id_Cancion = new IntegerExpression("id_Cancion", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		fichero_MP3 = new StringExpression("fichero_MP3", this.getDetachedCriteria());
		fichero_MP4 = new StringExpression("fichero_MP4", this.getDetachedCriteria());
		fichero_Alta_Calidad = new StringExpression("fichero_Alta_Calidad", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		compositor = new StringExpression("compositor", this.getDetachedCriteria());
		productor = new StringExpression("productor", this.getDetachedCriteria());
		interprete = new StringExpression("interprete", this.getDetachedCriteria());
		reproducciones = new IntegerExpression("reproducciones", this.getDetachedCriteria());
		ultimo_Exito = new BooleanExpression("ultimo_Exito", this.getDetachedCriteria());
		esta_en = new CollectionExpression("ORM_esta_en", this.getDetachedCriteria());
		realizada_por = new CollectionExpression("ORM_realizada_por", this.getDetachedCriteria());
		es_marcada_como_favorita_por = new CollectionExpression("ORM_es_marcada_como_favorita_por", this.getDetachedCriteria());
		es_historial_de = new CollectionExpression("ORM_es_historial_de", this.getDetachedCriteria());
	}
	
	public ListaDetachedCriteria createEsta_enCriteria() {
		return new ListaDetachedCriteria(createCriteria("ORM_esta_en"));
	}
	
	public ArtistaDetachedCriteria createRealizada_porCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_realizada_por"));
	}
	
	public Usuario_registradoDetachedCriteria createEs_marcada_como_favorita_porCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_es_marcada_como_favorita_por"));
	}
	
	public Usuario_registradoDetachedCriteria createEs_historial_deCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_es_historial_de"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

