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
@Table(name="Anuncio")
public class Anuncio implements Serializable {
	public Anuncio() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ANUNCIO_ANUNCIADO) {
			this.anunciado = (basededatos.Artista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Anuncio", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ANUNCIO_ID_ANUNCIO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ANUNCIO_ID_ANUNCIO_GENERATOR", strategy="native")	
	private int id_Anuncio;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`ArtistaUsuario registradoID`", referencedColumnName="`Usuario registradoID`", nullable=false) }, foreignKey=@ForeignKey(name="FKAnuncio263496"))	
	private basededatos.Artista anunciado;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	private void setId_Anuncio(int value) {
		this.id_Anuncio = value;
	}
	
	public int getId_Anuncio() {
		return id_Anuncio;
	}
	
	public int getORMID() {
		return getId_Anuncio();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setAnunciado(basededatos.Artista value) {
		if (anunciado != null) {
			anunciado.anuncia.remove(this);
		}
		if (value != null) {
			value.anuncia.add(this);
		}
	}
	
	public basededatos.Artista getAnunciado() {
		return anunciado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Anunciado(basededatos.Artista value) {
		this.anunciado = value;
	}
	
	private basededatos.Artista getORM_Anunciado() {
		return anunciado;
	}
	
	public String toString() {
		return String.valueOf(getId_Anuncio());
	}
	
}
