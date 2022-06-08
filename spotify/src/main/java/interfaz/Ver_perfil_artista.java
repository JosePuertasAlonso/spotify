package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iComun;
import spotify.GestorUsuarios;
import vistas.VistaVer_perfil_artista;

public class Ver_perfil_artista extends VistaVer_perfil_artista{
//	private Button _seguir_artista;
//	private Button _ver_listas_con_vista_en_listaB;
//	private Button _ver_lista_con_vista_en_bloquesB;
//	private Label _nombreL;
//	private Label _estilosL;
//	private Label _artistas_SimilaresL;
//	private Label _albumesL;
//	private Image _vista_Bloque_I;
//	private Image _vista_ListaI;
	public Artista__bloque_ _artista__bloque_;
	public Opciones_cancion__reproductor_ _opciones_cancion__reproductor_;
	public Artista__lista_ _artista__lista_;
	public Artistas_similares _artistas_similares;
	public Hits _hits;
	public Albumes_del_artista _albumes_del_artista;
	public Listas_de_reproduccion_del_artista _listas_de_reproduccion_del_artista;
	
	private basededatos.Artista artista;
	private iComun _iComun = new BDPrincipal();
	
	public Ver_perfil_artista(VerticalLayout cuerpo, HorizontalLayout minireproductor, basededatos.Artista artista) {
		this.artista = artista;
		this.recargar_artista();
		this.recargar_usuario();
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getButton_siguiendo().setVisible(false);
		
		_hits = new Hits(cuerpo, minireproductor, this.artista);
		this.gethL_hits().add(_hits);
		_albumes_del_artista = new Albumes_del_artista(cuerpo, minireproductor, this.artista);
		this.gethL_albumes().add(_albumes_del_artista);
		_artistas_similares = new Artistas_similares(cuerpo, minireproductor, this.artista);
		this.gethL_artistasSimilares().add(_artistas_similares);
		_listas_de_reproduccion_del_artista = new Listas_de_reproduccion_del_artista(cuerpo, minireproductor, this.artista);
		this.gethL_listasDelArtista().add(_listas_de_reproduccion_del_artista);
		
		//Nombre del artista
		this.getLabel_nombre().setText(artista.getNick());
		
		//Estilos del artista
		String cadenaEstilos = "";
		basededatos.Estilo[] estilos = this.artista.es_identificado_por.toArray();
		for (int i = 0; i < estilos.length; i++) {
			if(i == estilos.length-1) {
				cadenaEstilos += estilos[i].getNombre();
			} else {
				cadenaEstilos += estilos[i].getNombre() + ", ";
			}
		}
		this.getLabel_estilos1().setText(cadenaEstilos);
		
		//Foto artista
		this.getImagen().setSrc(artista.getFoto());
		
		//Boton seguir o siguiendo. No funciona GestorUsuarios._u.sigue.contains(artista). Lo hago a mano
		basededatos.Usuario_registrado[] aux = GestorUsuarios._u.sigue.toArray();
		boolean contiene = false;
		for(int i = 0; i < aux.length; i++) {
			if(aux[i].getLogin().equals(artista.getLogin())) {
				contiene = true;
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
				Seguir_artista();
				GestorUsuarios.recargarUsuario();
			}
		});
	}

	public void Seguir_artista() {
		_iComun.seguir_usuario(GestorUsuarios.login_u, artista.getLogin());
	}
	
	public void recargar_artista() {
		this.artista = _iComun.recargar_artista(this.artista.getLogin());
	}
	
	public void recargar_usuario() {
		GestorUsuarios._u = _iComun.recargar_usuario(GestorUsuarios.login_u);
	}

	public void Ver_listas_con_vista_en_lista() {
		throw new UnsupportedOperationException();
	}

	public void Ver_lista_con_vista_en_bloques() {
		throw new UnsupportedOperationException();
	}
}