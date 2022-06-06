package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta_registrado;
import spotify.GestorUsuarios;
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
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	private iCibernauta_registrado _iCibernauta_registrado = new BDPrincipal();
	
	public Modificar_perfil(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		
		this.getLabel_errorCorreoActual().setVisible(false);
		this.getLabel_errorNuevoCorreo().setVisible(false);
		this.getvL_imagen().setVisible(false);
		
		this.getButton_modificarPerfil().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				String correo_actual = getInput_correoActual().getValue();
				String correo_nuevo = getInput_correoNuevo().getValue();
				modificar_perfil_usuario();
			}
		});

	}

	public void modificar_perfil_usuario() {
		String correo_actual = getInput_correoActual().getValue();
		String correo_nuevo = getInput_correoNuevo().getValue();
		boolean correcto = true;
		if(!correo_actual.equals(GestorUsuarios.login_u)) {
			getLabel_errorCorreoActual().setVisible(true);
			correcto = false;
		} else {
			getLabel_errorCorreoActual().setVisible(false);
		}
		if(correo_nuevo.isBlank() || _iCibernauta_registrado.login_ya_registrado_modificacion(correo_nuevo)){
			getLabel_errorNuevoCorreo().setVisible(true);
			correcto = false;
		} else {
			getLabel_errorNuevoCorreo().setVisible(false);
		}
		if(correcto){
			_iCibernauta_registrado.modificar_perfil_usuario(correo_actual, correo_actual, correo_nuevo);
			_enviar_correo_de_modificacion = new Enviar_correo_de_modificacion(cuerpo, minireproductor);
			cuerpo.removeAll();
			cuerpo.getStyle().set("max-height", "80%");
			minireproductor.setVisible(true);
			cuerpo.add(_enviar_correo_de_modificacion);
		}
	}
}