package interfaz;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRecuperar_contrasena;

public class Recuperar_contrasena extends VistaRecuperar_contrasena{
//	private Label _tituloL;
//	private Label _introducir_EmailL;
//	private Button _enviarB;
	public Iniciar_sesion _iniciar_sesion;
	public Enviar_correo_de_recuperacion _enviar_correo_de_recuperacion;
	
	public Recuperar_contrasena(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
    	getStyle().set("margin", "0px");
    	getStyle().set("width", "100%");
    	getStyle().set("height", "100%");
    	
    	this.getLabel_errorCorreo().setVisible(false);

//		_enviar_correo_de_recuperacion = new Enviar_correo_de_recuperacion(cuerpo, minireproductor);
//		this.getButton_enviarCorreo().addClickListener(new ComponentEventListener() {
//			@Override
//			public void onComponentEvent(ComponentEvent event) {
//				cuerpo.removeAll();
//				cuerpo.getStyle().set("max-height", "90%");
//				minireproductor.setVisible(false);
//				cuerpo.add(_enviar_correo_de_recuperacion);
//			}
//		});
	}

	public void Validar_correo_existente() {
		throw new UnsupportedOperationException();
	}
}