package interfaz;

import vistas.VistaVer_todas_canciones_buscadas_administrador;

public class Ver_todas_canciones_buscadas__administrador_ extends VistaVer_todas_canciones_buscadas_administrador {
	public Buscador_administrador _buscador_administrador;
	public Lista_de_canciones__ver_todo_administrador_ _lista_de_canciones__ver_todo_administrador_;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	
	public Ver_todas_canciones_buscadas__administrador_() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		
		_lista_de_canciones__ver_todo_administrador_ = new Lista_de_canciones__ver_todo_administrador_();
		this.gethL_listaDeCancionesVerTodoAdmin().add(_lista_de_canciones__ver_todo_administrador_);
	}
}