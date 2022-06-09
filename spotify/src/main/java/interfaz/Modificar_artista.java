package interfaz;

import java.io.File;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorUsuarios;
import vistas.VistaModificar_artista;

public class Modificar_artista extends VistaModificar_artista{
//	private Button _seleccionar_foto_perfilB;
//	private Label _tituloL;
//	private Image _imagenI;
//	private Label _estilosL;
//	private Button _confirmar_modificar_artistaB;
	public Artista__Administrador_ _artista__Administrador_;
	public Estilos _estilos;
	
	private iAdministrador _iAdministrador = new BDPrincipal();
	private basededatos.Artista artista;
	
	public Modificar_artista(VerticalLayout cuerpo, basededatos.Artista artista) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("margin-bottom", "var(--lumo-space-l)");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getImagen().setSrc("https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/User-avatar.svg/2048px-User-avatar.svg.png");
		
		this.artista = artista;
		
		if(artista.getFoto() != null) {
			this.getImagen().setSrc(artista.getFoto());
		}
		
		this.getButton_modificarArtista().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Confirmar_modificar_artista();
				GestorUsuarios.administrador();
				
			}
		});
		
		_estilos = new Estilos(artista);
		this.gethL_estilos().add(_estilos);
	}

	public void Seleccionar_foto_perfil() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_modificar_artista() {
		String foto = this.getInput_file().getValue();
		if(foto == null || foto.isBlank()) {
			foto = this.artista.getFoto();
		} else {
			File f = new File(foto);
			foto = "/img/" + f.getName();
		}
		_iAdministrador.modificar_artista_administrador(this.artista.getLogin(), foto);
	}
}