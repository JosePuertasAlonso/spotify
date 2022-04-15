package interfaz;

public class Favoritas extends Lista_canciones {
	public Comun _comun;
	
	public Favoritas() {
		this.getLabel_titulo().setText("Favoritas");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
}