package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iArtista;
import spotify.GestorUsuarios;

public class Modificar_perfil__artista_ extends Modificar_perfil {
//	private Button _seleccionar_foto_perfilB;
//	private Image _imagenI;
	public Ver_perfil_artista_registrado _ver_perfil_artista_registrado;
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	private iArtista _iArtista = new BDPrincipal();
	
	public Modificar_perfil__artista_(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		this.getvL_imagen().setVisible(true);
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		if(GestorUsuarios._u.getFoto() == null || GestorUsuarios._u.getFoto().isBlank()) {
			this.getImagen().setSrc("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png");
		} else {
			this.getImagen().setSrc(GestorUsuarios._u.getFoto());
		}
		
		
		this.getButton_modificarPerfil().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
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
		if(correo_nuevo.isBlank() || _iArtista.login_ya_registrado_modificacion_artista(correo_nuevo)){
			getLabel_errorNuevoCorreo().setVisible(true);
			correcto = false;
		} else {
			getLabel_errorNuevoCorreo().setVisible(false);
		}
		if(correcto){
			String foto = this.getInput_file().getValue();
			if(foto == null || foto.isBlank()) {
				_iArtista.modificar_perfil_artista(correo_actual, correo_nuevo, GestorUsuarios._u.getFoto());
			} else {
				File f = new File(foto);
				foto = "/img/" + f.getName();
				_iArtista.modificar_perfil_artista(correo_actual, correo_nuevo, foto);

			}
			_enviar_correo_de_modificacion = new Enviar_correo_de_modificacion(cuerpo, minireproductor);
			cuerpo.removeAll();
			cuerpo.getStyle().set("max-height", "80%");
			minireproductor.setVisible(true);
			cuerpo.add(_enviar_correo_de_modificacion);
		}
	}
}