package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Modificar_lista extends Lista {
//	private Button _cambiar_nombre_de_listaB;
//	private Button _eliminar_listaB;
//	private Label _anadir_CancionL;
//	private Button _aceptarB;
//	private TextField _cambiar_NombreTF;
	public Lista_de_reproduccion_propia _lista_de_reproduccion_propia;
	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	public Canciones_de_lista_a_eliminar _canciones_de_lista_a_eliminar;
	public Anadir_canciones_a_lista _anadir_canciones_a_lista;
	public Eliminar_lista _eliminar_lista;
	
	public Modificar_lista(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		super(cuerpo, minireproductor);
		_canciones_de_lista_a_eliminar = new Canciones_de_lista_a_eliminar();
		this.getButton_modificar().setVisible(false);
		this.getButton_anadirCancion().setVisible(true);
		this.getButton_aceptar().setVisible(true);
		this.getLabel_titulo().setVisible(false);
		this.gethL_tituloAceptar().setVisible(true);
		this.getLabel_fechaPublicacion().setVisible(false);
		this.getButton_compartir().setVisible(false);
		this.getvL_cancionesDeListaAlbumListaeliminar().as(VerticalLayout.class).add(_canciones_de_lista_a_eliminar);

		this.getButton_anadirCancion().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				_anadir_canciones_a_lista = new Anadir_canciones_a_lista(cuerpo, minireproductor);
				cuerpo.removeAll();
				cuerpo.getStyle().set("max-height", "80%");
				minireproductor.setVisible(true);
				cuerpo.add(_anadir_canciones_a_lista);
			}
		});
		
		this.getButton_eliminar().addClickListener(new ComponentEventListener<ClickEvent<NativeButton>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<NativeButton> event) {
				Dialog popUp = new Dialog();
				_eliminar_lista = new Eliminar_lista(cuerpo, popUp);
				popUp.add(_eliminar_lista);
				popUp.open();				
			}
		});
		
	}

	public void Cambiar_nombre_de_lista() {
		throw new UnsupportedOperationException();
	}
}