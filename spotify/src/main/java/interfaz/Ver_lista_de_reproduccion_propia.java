package interfaz;

public class Ver_lista_de_reproduccion_propia extends Lista_de_reproduccion {
//	private Button _modificar_listaB;
	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
	public Modificar_lista _modificar_lista;
	
	public Ver_lista_de_reproduccion_propia() {
		super();
		this.getButton_modificar().setVisible(true);
	}
	
}