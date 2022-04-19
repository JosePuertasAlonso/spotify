package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEnviar_correo_anadir_artista;

public class Enviar_correo_anadir_artista extends VistaEnviar_correo_anadir_artista{
//	private Label _tituloL;
//	private Label _email_EnviadoL;
//	private Button _aceptarB;
	public Gestor_correo_electronico _gestor_correo_electronico;
	public Dar_de_alta_artista _dar_de_alta_artista;
	
	public Enviar_correo_anadir_artista(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
	}

	public void Enviar_correo() {
		throw new UnsupportedOperationException();
	}
}