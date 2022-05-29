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
@Table(name="Album")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ListaId_Lista", referencedColumnName="Id_Lista")
public class Album extends basededatos.Lista implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALBUM_ES_CREADO_POR) {
			return ORM_es_creado_por;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Fecha_Edicion", nullable=true, length=255)	
	private String fecha_Edicion;
	
	@ManyToMany(targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Artista_Album", joinColumns={ @JoinColumn(name="AlbumListaId_Lista") }, inverseJoinColumns={ @JoinColumn(name="ArtistaUsuarioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creado_por = new java.util.HashSet();
	
	public void setFecha_Edicion(String value) {
		this.fecha_Edicion = value;
	}
	
	public String getFecha_Edicion() {
		return fecha_Edicion;
	}
	
	private void setORM_Es_creado_por(java.util.Set value) {
		this.ORM_es_creado_por = value;
	}
	
	private java.util.Set getORM_Es_creado_por() {
		return ORM_es_creado_por;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection es_creado_por = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_ES_CREADO_POR, ORMConstants.KEY_ARTISTA_ES_AUTOR_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
