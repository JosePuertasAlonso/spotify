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
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANCION_ESTA_EN) {
			return ORM_esta_en;
		}
		else if (key == ORMConstants.KEY_CANCION_REALIZADA_POR) {
			return ORM_realizada_por;
		}
		else if (key == ORMConstants.KEY_CANCION_ES_MARCADA_COMO_FAVORITA_POR) {
			return ORM_es_marcada_como_favorita_por;
		}
		else if (key == ORMConstants.KEY_CANCION_ES_HISTORIAL_DE) {
			return ORM_es_historial_de;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_Cancion", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CANCION_ID_CANCION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCION_ID_CANCION_GENERATOR", strategy="native")	
	private int id_Cancion;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Imagen", nullable=true, length=255)	
	private String imagen;
	
	@Column(name="Duracion", nullable=false, length=10)	
	private int duracion;
	
	@Column(name="Fichero_MP3", nullable=true, length=255)	
	private String fichero_MP3;
	
	@Column(name="Fichero_MP4", nullable=true, length=255)	
	private String fichero_MP4;
	
	@Column(name="Fichero_Alta_Calidad", nullable=true, length=255)	
	private String fichero_Alta_Calidad;
	
	@Column(name="Nick", nullable=true, length=255)	
	private String nick;
	
	@Column(name="Compositor", nullable=true, length=255)	
	private String compositor;
	
	@Column(name="Productor", nullable=true, length=255)	
	private String productor;
	
	@Column(name="Interprete", nullable=true, length=255)	
	private String interprete;
	
	@Column(name="Reproducciones", nullable=false, length=10)	
	private int reproducciones;
	
	@Column(name="Ultimo_Exito", nullable=false, length=1)	
	private boolean ultimo_Exito;
	
	@ManyToMany(mappedBy="ORM_contiene", targetEntity=basededatos.Lista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_esta_en = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_realiza", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_realizada_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_marca_como_favorita", targetEntity=basededatos.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_marcada_como_favorita_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_reproduce", targetEntity=basededatos.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_historial_de = new java.util.HashSet();
	
	private void setId_Cancion(int value) {
		this.id_Cancion = value;
	}
	
	public int getId_Cancion() {
		return id_Cancion;
	}
	
	public int getORMID() {
		return getId_Cancion();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setDuracion(int value) {
		this.duracion = value;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setFichero_MP3(String value) {
		this.fichero_MP3 = value;
	}
	
	public String getFichero_MP3() {
		return fichero_MP3;
	}
	
	public void setFichero_MP4(String value) {
		this.fichero_MP4 = value;
	}
	
	public String getFichero_MP4() {
		return fichero_MP4;
	}
	
	public void setFichero_Alta_Calidad(String value) {
		this.fichero_Alta_Calidad = value;
	}
	
	public String getFichero_Alta_Calidad() {
		return fichero_Alta_Calidad;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setCompositor(String value) {
		this.compositor = value;
	}
	
	public String getCompositor() {
		return compositor;
	}
	
	public void setProductor(String value) {
		this.productor = value;
	}
	
	public String getProductor() {
		return productor;
	}
	
	public void setInterprete(String value) {
		this.interprete = value;
	}
	
	public String getInterprete() {
		return interprete;
	}
	
	public void setReproducciones(int value) {
		this.reproducciones = value;
	}
	
	public int getReproducciones() {
		return reproducciones;
	}
	
	public void setUltimo_Exito(boolean value) {
		this.ultimo_Exito = value;
	}
	
	public boolean getUltimo_Exito() {
		return ultimo_Exito;
	}
	
	private void setORM_Esta_en(java.util.Set value) {
		this.ORM_esta_en = value;
	}
	
	private java.util.Set getORM_Esta_en() {
		return ORM_esta_en;
	}
	
	@Transient	
	public final basededatos.ListaSetCollection esta_en = new basededatos.ListaSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ESTA_EN, ORMConstants.KEY_LISTA_CONTIENE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Realizada_por(java.util.Set value) {
		this.ORM_realizada_por = value;
	}
	
	private java.util.Set getORM_Realizada_por() {
		return ORM_realizada_por;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection realizada_por = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_REALIZADA_POR, ORMConstants.KEY_ARTISTA_REALIZA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_marcada_como_favorita_por(java.util.Set value) {
		this.ORM_es_marcada_como_favorita_por = value;
	}
	
	private java.util.Set getORM_Es_marcada_como_favorita_por() {
		return ORM_es_marcada_como_favorita_por;
	}
	
	@Transient	
	public final basededatos.Usuario_registradoSetCollection es_marcada_como_favorita_por = new basededatos.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ES_MARCADA_COMO_FAVORITA_POR, ORMConstants.KEY_USUARIO_REGISTRADO_MARCA_COMO_FAVORITA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_historial_de(java.util.Set value) {
		this.ORM_es_historial_de = value;
	}
	
	private java.util.Set getORM_Es_historial_de() {
		return ORM_es_historial_de;
	}
	
	@Transient	
	public final basededatos.Usuario_registradoSetCollection es_historial_de = new basededatos.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ES_HISTORIAL_DE, ORMConstants.KEY_USUARIO_REGISTRADO_REPRODUCE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Cancion());
	}
	
}
