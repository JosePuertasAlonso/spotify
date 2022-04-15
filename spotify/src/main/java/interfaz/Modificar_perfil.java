package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaModificar_perfil;

public class Modificar_perfil extends VistaModificar_perfil{
//	private Label _tituloL;
//	private Label _nombre_UsuarioL;
//	private Label _email_ActualL;
//	private TextField _email_ActualTF;
//	private Label _email_NuevoL;
//	private TextField _email_NuevoTF;
//	private Button _modificarB;
	public Ver_perfil_cibernauta_registrado _ver_perfil_cibernauta_registrado;
	public Ver_perfil _ver_perfil;
	public Enviar_correo_de_modificacion _enviar_correo_de_modificacion;
	
	public Modificar_perfil() {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_errorCorreoActual().setVisible(false);
		this.getLabel_errorNuevoCorreo().setVisible(false);
		this.getvL_imagen().setVisible(false);

	}

	public void Validar_nuevo_correo() {
		throw new UnsupportedOperationException();
	}
}