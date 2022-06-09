package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Anuncio;
import basededatos.BDPrincipal;
import basededatos.iArtista;
import spotify.GestorUsuarios;
import spotify.TextArea;
import vistas.VistaCrear_anuncio;

public class Crear_anuncio extends VistaCrear_anuncio{
//	private Button _publicar_anuncioB;
//	private Label _tituloL;
//	private Label _ponle_TituloL;
//	private Label _titulo_AnuncioL;
//	private Label _descripcionL;
//	private TextField _titulo_AnuncioTF;
//	private TextArea _descripcionTA;
	public Ver_perfil_artista_registrado _ver_perfil_artista_registrado;
	
	private TextArea ta;
	private iArtista _iArtista = new BDPrincipal();
	
	public Crear_anuncio(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		this.getLabel_errorTitulo().setVisible(false);
		ta = new TextArea();
		this.gethL_textarea().add(ta);
		
		this.getButton_publicarAnuncio().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				String titulo = getInput_titulo().getValue();
				if(titulo == null || titulo.isBlank()) {
					getLabel_errorTitulo().setVisible(true);
				} else {
					Publicar_anuncio();
					GestorUsuarios.artista(false);
				}
				
			}
		});
	}

	public void Publicar_anuncio() {
		basededatos.Anuncio a = new Anuncio();
		a.setTitulo(this.getInput_titulo().getValue());
		a.setDescripcion(this.ta.getText());
		_iArtista.publicar_anuncio(GestorUsuarios.login_u, a);
	}
}