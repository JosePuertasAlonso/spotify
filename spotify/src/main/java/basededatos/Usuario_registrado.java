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
@Table(name="`Usuario registrado`")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioID", referencedColumnName="ID")
public class Usuario_registrado extends basededatos.Usuario implements Serializable {
	public Usuario_registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_MARCA_COMO_FAVORITA) {
			return ORM_marca_como_favorita;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SIGUE) {
			return ORM_sigue;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_REPRODUCE) {
			return ORM_reproduce;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_GESTIONA) {
			return ORM_gestiona;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_ES_SEGUIDO_POR) {
			return ORM_es_seguido_por;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_GUARDA) {
			return ORM_guarda;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_TIENE) {
			this.tiene = (basededatos.Estadisticas) owner;
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
	
	@Column(name="Seguidores", nullable=false, length=10)	
	private int seguidores;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String nick;
	
	@Column(name="Dias_baja", nullable=false, length=10)	
	private int dias_baja;
	
	@OneToOne(optional=false, targetEntity=basededatos.Estadisticas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EstadisticasId_Estadisticas", referencedColumnName="Id_Estadisticas", nullable=false) }, foreignKey=@ForeignKey(name="FKUsuario re601075"))	
	private basededatos.Estadisticas tiene;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Cancion_Usuario registrado`", joinColumns={ @JoinColumn(name="`Usuario registradoUsuarioID`") }, inverseJoinColumns={ @JoinColumn(name="CancionId_Cancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_marca_como_favorita = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Usuario registrado_Usuario registrado`", joinColumns={ @JoinColumn(name="`Usuario registradoUsuarioID2`") }, inverseJoinColumns={ @JoinColumn(name="`Usuario registradoUsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_sigue = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Cancion_Usuario registrado2`", joinColumns={ @JoinColumn(name="`Usuario registradoUsuarioID`") }, inverseJoinColumns={ @JoinColumn(name="CancionId_Cancion") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reproduce = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_gestionada_por", targetEntity=basededatos.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gestiona = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_sigue", targetEntity=basededatos.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_seguido_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_es_guardada_por", targetEntity=basededatos.Lista_de_reproduccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_guarda = new java.util.HashSet();
	
	public void setSeguidores(int value) {
		this.seguidores = value;
	}
	
	public int getSeguidores() {
		return seguidores;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setDias_baja(int value) {
		this.dias_baja = value;
	}
	
	public int getDias_baja() {
		return dias_baja;
	}
	
	private void setORM_Marca_como_favorita(java.util.Set value) {
		this.ORM_marca_como_favorita = value;
	}
	
	private java.util.Set getORM_Marca_como_favorita() {
		return ORM_marca_como_favorita;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection marca_como_favorita = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_MARCA_COMO_FAVORITA, ORMConstants.KEY_CANCION_ES_MARCADA_COMO_FAVORITA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Sigue(java.util.Set value) {
		this.ORM_sigue = value;
	}
	
	private java.util.Set getORM_Sigue() {
		return ORM_sigue;
	}
	
	@Transient	
	public final basededatos.Usuario_registradoSetCollection sigue = new basededatos.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SIGUE, ORMConstants.KEY_USUARIO_REGISTRADO_ES_SEGUIDO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTiene(basededatos.Estadisticas value) {
		if (this.tiene != value) {
			basededatos.Estadisticas ltiene = this.tiene;
			this.tiene = value;
			if (value != null) {
				tiene.setPertenecen_a(this);
			}
			if (ltiene != null && ltiene.getPertenecen_a() == this) {
				ltiene.setPertenecen_a(null);
			}
		}
	}
	
	public basededatos.Estadisticas getTiene() {
		return tiene;
	}
	
	private void setORM_Reproduce(java.util.Set value) {
		this.ORM_reproduce = value;
	}
	
	private java.util.Set getORM_Reproduce() {
		return ORM_reproduce;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection reproduce = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_REPRODUCE, ORMConstants.KEY_CANCION_ES_HISTORIAL_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Gestiona(java.util.Set value) {
		this.ORM_gestiona = value;
	}
	
	private java.util.Set getORM_Gestiona() {
		return ORM_gestiona;
	}
	
	@Transient	
	public final basededatos.Lista_de_reproduccionSetCollection gestiona = new basededatos.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_GESTIONA, ORMConstants.KEY_LISTA_DE_REPRODUCCION_ES_GESTIONADA_POR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_seguido_por(java.util.Set value) {
		this.ORM_es_seguido_por = value;
	}
	
	private java.util.Set getORM_Es_seguido_por() {
		return ORM_es_seguido_por;
	}
	
	@Transient	
	public final basededatos.Usuario_registradoSetCollection es_seguido_por = new basededatos.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_ES_SEGUIDO_POR, ORMConstants.KEY_USUARIO_REGISTRADO_SIGUE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Guarda(java.util.Set value) {
		this.ORM_guarda = value;
	}
	
	private java.util.Set getORM_Guarda() {
		return ORM_guarda;
	}
	
	@Transient	
	public final basededatos.Lista_de_reproduccionSetCollection guarda = new basededatos.Lista_de_reproduccionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_GUARDA, ORMConstants.KEY_LISTA_DE_REPRODUCCION_ES_GUARDADA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
