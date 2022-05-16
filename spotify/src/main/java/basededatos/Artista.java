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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Artista")
@Inheritance(strategy=InheritanceType.JOINED)
public class Artista extends basededatos.Usuario_registrado implements Serializable {
	public Artista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARTISTA_REALIZA) {
			return ORM_realiza;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ES_SIMILAR_A) {
			return ORM_es_similar_a;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ES_AUTOR_DE) {
			return ORM_es_autor_de;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ES_IDENTIFICADO_POR) {
			return ORM_es_identificado_por;
		}
		else if (key == ORMConstants.KEY_ARTISTA_ES_SIMILAR_DE) {
			return ORM_es_similar_de;
		}
		else if (key == ORMConstants.KEY_ARTISTA_PUBLICA) {
			return ORM_publica;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Artista", joinColumns={ @JoinColumn(name="ArtistaUsuarioID") }, inverseJoinColumns={ @JoinColumn(name="CancionId_Cancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realiza = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Artista", joinColumns={ @JoinColumn(name="ArtistaUsuarioID2") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_similar_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_creado_por", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_autor_de = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_identifica_a", targetEntity=basededatos.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_identificado_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_similar_a", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_similar_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_publicado_por", targetEntity=basededatos.Anuncio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_publica = new java.util.HashSet();
	
	private void setORM_Realiza(java.util.Set value) {
		this.ORM_realiza = value;
	}
	
	private java.util.Set getORM_Realiza() {
		return ORM_realiza;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection realiza = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_REALIZA, ORMConstants.KEY_CANCION_REALIZADA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_similar_a(java.util.Set value) {
		this.ORM_es_similar_a = value;
	}
	
	private java.util.Set getORM_Es_similar_a() {
		return ORM_es_similar_a;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection es_similar_a = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ES_SIMILAR_A, ORMConstants.KEY_ARTISTA_ES_SIMILAR_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_autor_de(java.util.Set value) {
		this.ORM_es_autor_de = value;
	}
	
	private java.util.Set getORM_Es_autor_de() {
		return ORM_es_autor_de;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection es_autor_de = new basededatos.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ES_AUTOR_DE, ORMConstants.KEY_ALBUM_ES_CREADO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_identificado_por(java.util.Set value) {
		this.ORM_es_identificado_por = value;
	}
	
	private java.util.Set getORM_Es_identificado_por() {
		return ORM_es_identificado_por;
	}
	
	@Transient	
	public final basededatos.EstiloSetCollection es_identificado_por = new basededatos.EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ES_IDENTIFICADO_POR, ORMConstants.KEY_ESTILO_IDENTIFICA_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_similar_de(java.util.Set value) {
		this.ORM_es_similar_de = value;
	}
	
	private java.util.Set getORM_Es_similar_de() {
		return ORM_es_similar_de;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection es_similar_de = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_ES_SIMILAR_DE, ORMConstants.KEY_ARTISTA_ES_SIMILAR_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Publica(java.util.Set value) {
		this.ORM_publica = value;
	}
	
	private java.util.Set getORM_Publica() {
		return ORM_publica;
	}
	
	@Transient	
	public final basededatos.AnuncioSetCollection publica = new basededatos.AnuncioSetCollection(this, _ormAdapter, ORMConstants.KEY_ARTISTA_PUBLICA, ORMConstants.KEY_ANUNCIO_ES_PUBLICADO_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
