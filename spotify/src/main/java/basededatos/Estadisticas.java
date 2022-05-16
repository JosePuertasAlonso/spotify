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
@Table(name="Estadisticas")
public class Estadisticas implements Serializable {
	public Estadisticas() {
	}
	
	@Column(name="Id_Estadisticas", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ESTADISTICAS_ID_ESTADISTICAS_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTADISTICAS_ID_ESTADISTICAS_GENERATOR", strategy="native")	
	private int id_Estadisticas;
	
	@Column(name="Actividad_Semanal", nullable=false, length=10)	
	private int actividad_Semanal;
	
	@OneToOne(mappedBy="tiene", targetEntity=basededatos.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private basededatos.Usuario_registrado pertenecen_a;
	
	private void setId_Estadisticas(int value) {
		this.id_Estadisticas = value;
	}
	
	public int getId_Estadisticas() {
		return id_Estadisticas;
	}
	
	public int getORMID() {
		return getId_Estadisticas();
	}
	
	public void setActividad_Semanal(int value) {
		this.actividad_Semanal = value;
	}
	
	public int getActividad_Semanal() {
		return actividad_Semanal;
	}
	
	public void setPertenecen_a(basededatos.Usuario_registrado value) {
		if (this.pertenecen_a != value) {
			basededatos.Usuario_registrado lpertenecen_a = this.pertenecen_a;
			this.pertenecen_a = value;
			if (value != null) {
				pertenecen_a.setTiene(this);
			}
			if (lpertenecen_a != null && lpertenecen_a.getTiene() == this) {
				lpertenecen_a.setTiene(null);
			}
		}
	}
	
	public basededatos.Usuario_registrado getPertenecen_a() {
		return pertenecen_a;
	}
	
	public String toString() {
		return String.valueOf(getId_Estadisticas());
	}
	
}
