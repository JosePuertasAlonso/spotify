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
@Table(name="`Lista de reproduccion`")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="ListaId_Lista", referencedColumnName="Id_Lista")
public class Lista_de_reproduccion extends basededatos.Lista implements Serializable {
	public Lista_de_reproduccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_ES_GUARDADA_POR) {
			return ORM_es_guardada_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_LISTA_DE_REPRODUCCION_ES_GESTIONADA_POR) {
			this.es_gestionada_por = (basededatos.Usuario_registrado) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=basededatos.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`Usuario registradoID`", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKLista de r548125"))	
	private basededatos.Usuario_registrado es_gestionada_por;
	
	@ManyToMany(targetEntity=basededatos.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@JoinTable(name="`Usuario registrado_Lista de reproduccion`", joinColumns={ @JoinColumn(name="`Lista de reproduccionListaId_Lista`") }, inverseJoinColumns={ @JoinColumn(name="`Usuario registradoID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_guardada_por = new java.util.HashSet();
	
	private void setORM_Es_guardada_por(java.util.Set value) {
		this.ORM_es_guardada_por = value;
	}
	
	private java.util.Set getORM_Es_guardada_por() {
		return ORM_es_guardada_por;
	}
	
	@Transient	
	public final basededatos.Usuario_registradoSetCollection es_guardada_por = new basededatos.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_LISTA_DE_REPRODUCCION_ES_GUARDADA_POR, ORMConstants.KEY_USUARIO_REGISTRADO_GUARDA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_gestionada_por(basededatos.Usuario_registrado value) {
		if (es_gestionada_por != null) {
			es_gestionada_por.gestiona.remove(this);
		}
		if (value != null) {
			value.gestiona.add(this);
		}
	}
	
	public basededatos.Usuario_registrado getEs_gestionada_por() {
		return es_gestionada_por;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_gestionada_por(basededatos.Usuario_registrado value) {
		this.es_gestionada_por = value;
	}
	
	private basededatos.Usuario_registrado getORM_Es_gestionada_por() {
		return es_gestionada_por;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
