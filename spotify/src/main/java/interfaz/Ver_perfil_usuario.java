package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaVer_perfil_usuario;

public class Ver_perfil_usuario extends VistaVer_perfil_usuario{
//	private Button _seguir_usuarioB;
//	private Label _nombreL;
//	private Label _seguidoresL;
//	private Image _imagenI;
//	private Label _listasL;
	public Ver_lista_de_reproduccion_ajena _ver_lista_de_reproduccion_ajena;
	public Listas_del_usuario _listas_del_usuario;
	
	private basededatos.Usuario_registrado usuario;
	private iComun _iComun = new BDPrincipal();
	
	public Ver_perfil_usuario(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Usuario_registrado usuario) {
		
		this.usuario = usuario;

		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getButton_siguiendo().setVisible(false);
		
		_listas_del_usuario = new Listas_del_usuario(cuerpo, minireproductor, this.usuario);
		this.getvL_listasDelUsuario().as(VerticalLayout.class).add(_listas_del_usuario);
		
		//Nombre del usuario
		this.getLabel_nombreUsuario().setText(this.usuario.getNick());
		
		//Numero de seguidores
		
		this.getLabel_nSeguidores().setText(this.usuario.es_seguido_por.toArray().length + "");
		
		//Foto usuario
		this.getImagen().setSrc(this.usuario.getFoto());
		
		//Boton seguir o siguiendo
		basededatos.Usuario_registrado[] aux = GestorUsuarios._u.sigue.toArray();
		boolean contiene = false;
		for(int i = 0; i < aux.length; i++) {
			if(aux[i].getLogin().equals(this.usuario.getLogin())) {
				contiene = true;
				break;
			}
		}
		
		if(contiene) {
			this.getButton_seguir().setText("SIGUIENDO");
		} else {
			this.getButton_seguir().setText("SEGUIR");
		}
		
		this.getButton_seguir().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				if(getButton_seguir().getText().equals("SIGUIENDO")) {
					getButton_seguir().setText("SEGUIR");
				} else {
					getButton_seguir().setText("SIGUIENDO");
				}
				Seguir_usuario();
				GestorUsuarios.recargarUsuario();
			}
		});
		
	}

	public void Seguir_usuario() {
		_iComun.seguir_usuario(GestorUsuarios.login_u, this.usuario.getLogin());
	}
	
	public void recargar_usuario() {
		GestorUsuarios._u = _iComun.recargar_usuario(GestorUsuarios.login_u);
	}
}