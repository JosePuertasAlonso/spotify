package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion{
//	private Button _crear_listaB;
//	private Label _tituloL;
//	private Label _nombre_ListaL;
//	private TextField _nombre_ListaTF;
//	private Label _ponle_TituloL;
	public Anadir_cancion_a_una_lista _anadir_cancion_a_una_lista;
	public Ver_perfil _ver_perfil;
	
	private iComun _iComun = new BDPrincipal();
	
	public Crear_lista_de_reproduccion(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getButton_crearLista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Crear_lista();
				GestorUsuarios.usuario(false);
			}
		});
	}

	public void Crear_lista() {
		String nombreLista = this.getInput_titulo().getValue();
		String foto = this.getInput_file().getValue();
		if(nombreLista == null || nombreLista.isBlank()) {
			nombreLista = "Lista de reproduccion";
		}
		if(foto == null || foto.isBlank()) {
			foto = "/img/song.png";
		} else {
			File f = new File(foto);
			foto = "/img/" + f.getName();
		}
		_iComun.crear_lista(GestorUsuarios.login_u, nombreLista, foto);
		
	}
}