package interfaz;

public class Recomendaciones extends Lista_canciones {
	public Comun _comun;
	
	public Recomendaciones() {
		this.getLabel_titulo().setText("Recomendaciones");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
	
}