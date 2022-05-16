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
@Table(name="Lista")
@Inheritance(strategy=InheritanceType.JOINED)
public class Lista implements Serializable {
	public Lista() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Lista", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_LISTA_ID_LISTA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_LISTA_ID_LISTA_GENERATOR", strategy="native")	
	private int id_Lista;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Lista", joinColumns={ @JoinColumn(name="ListaId_Lista") }, inverseJoinColumns={ @JoinColumn(name="CancionId_Cancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private void setId_Lista(int value) {
		this.id_Lista = value;
	}
	
	public int getId_Lista() {
		return id_Lista;
	}
	
	public int getORMID() {
		return getId_Lista();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_CONTIENE, ORMConstants.KEY_CANCION_ESTA_EN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Lista());
	}
	
}
