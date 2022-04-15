package interfaz;

public class Esuchadas_recientemente extends Lista_canciones {
	public Comun _comun;
	
	public Esuchadas_recientemente() {
		this.getLabel_titulo().setText("Escuchadas recientemente");
		this.getStyle().set("margin-top", "var(--lumo-space-m)");
	}
}