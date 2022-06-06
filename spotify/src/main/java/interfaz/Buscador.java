package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBuscador;

public class Buscador extends VistaBuscador {
//	private Label _tituloL;
//	private Label _resultados_BusquedaL;
//	private Label _cancionesL;
//	private Label _artistasL;
//	private Label _listasL;
//	private Button _ver_Todos_ArtistasB;
//	private Button _ver_Todas_CancionesB;
//	private Button _ver_Todas_ListasB;
	public Comun _comun;
	public Ver_todas_listas_buscadas _ver_todas_listas_buscadas;
	public Listas_de_reproduccion_buscadas _listas_de_reproduccion_buscadas;
	public Ver_todas_las_canciones_buscadas _ver_todas_las_canciones_buscadas;
	public Lista_de_canciones_buscadas _lista_de_canciones_buscadas;
	public Lista_de_artistas_buscados _lista_de_artistas_buscados;
	public Ver_todos_los_artistas_buscados _ver_todos_los_artistas_buscados;
	
	//ANADIDO A MANO
	public Barra_buscador _barra_buscador;
	public Buscador _buscador;
	
	public Buscador(VerticalLayout cuerpo, HorizontalLayout minireproductor, String cadenaBusqueda) {
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.getLabel_resultadosPara().setText("Resultados para:  \" " + cadenaBusqueda + " \"");
		
		_barra_buscador = new Barra_buscador();
		this.gethL_barraBuscador().add(_barra_buscador);
		_barra_buscador.getButton_buscar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_buscador = new Buscador(cuerpo, minireproductor, _barra_buscador.getInput_buscar().getValue());
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_buscador);
			}
		});
		
		_lista_de_canciones_buscadas = new Lista_de_canciones_buscadas(cadenaBusqueda);
		this.gethL_listaDeCancionesBuscadas().add(_lista_de_canciones_buscadas);
		_lista_de_artistas_buscados = new Lista_de_artistas_buscados(cuerpo, minireproductor, cadenaBusqueda);
		this.gethL_listaDeArtistasBuscados().add(_lista_de_artistas_buscados);
		_listas_de_reproduccion_buscadas = new Listas_de_reproduccion_buscadas(cuerpo, minireproductor, cadenaBusqueda);
		this.gethL_listasDeReproduccionBuscadas().add(_listas_de_reproduccion_buscadas);
		
		this.getButton_verTodoCanciones().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_todas_las_canciones_buscadas = new Ver_todas_las_canciones_buscadas(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_todas_las_canciones_buscadas);
			}
		});
		
		this.getButton_verTodoArtistas().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_todos_los_artistas_buscados = new Ver_todos_los_artistas_buscados(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_todos_los_artistas_buscados);
				
			}
		});
		
		
		this.getButton_verTodoListas().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_ver_todas_listas_buscadas = new Ver_todas_listas_buscadas(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_ver_todas_listas_buscadas);
				
			}
		});
		
	}
	
}