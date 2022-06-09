package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaCrear_nuevo_estilo;

public class Crear_nuevo_estilo extends VistaCrear_nuevo_estilo{
//	private Label _tituloL;
//	private Label _nombreL;
//	private TextField _nombreTF;
//	private Label _ponle_NombreL;
//	private Button _anadir_estiloB;
	public Administrador _administrador;
	
	iAdministrador _iAdministrador = new BDPrincipal();
	
	public Crear_nuevo_estilo(VerticalLayout cuerpo) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLabel_errorEstilo().setVisible(false);
		
		this.getButton_andirEstilo().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				if(getInput_nombreEstilo().getValue() == null || getInput_nombreEstilo().getValue().isBlank()) {
					getLabel_errorEstilo().setVisible(true);
				} else {
					Anadir_estilo();
				}
				
			}
		});
		
	}

	public void Anadir_estilo() {
		String estilo = this.getInput_nombreEstilo().getValue();
		if(_iAdministrador.existe_estilo(estilo)) {
			this.getLabel_errorEstilo().setVisible(true);
		}else {
			_iAdministrador.anadir_estilo(estilo);
			GestorUsuarios.administrador();
		}
	}
}