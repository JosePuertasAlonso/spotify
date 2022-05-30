package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComun;

//import basededatos.iComun;

public class Comun extends VistaComun{
//	public iComun _iComun;
	public static Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	public Esuchadas_recientemente _esuchadas_recientemente;
	public Recomendaciones _recomendaciones;
	public Favoritas _favoritas;
	public Buscador _buscador; //CAMBIADO DE VISUAL PARADIGM
	public Barra_buscador _barra_buscador; //ANADIDO A MANO
	
	public Comun() {
		VerticalLayout cuerpo = this.getvL_cuerpo().as(VerticalLayout.class);
		HorizontalLayout minireproductor = this.gethL_minireproductor();
		
		
		_barra_buscador = new Barra_buscador();
		_recomendaciones = new Recomendaciones(cuerpo, minireproductor);
		_esuchadas_recientemente = new Esuchadas_recientemente(cuerpo, minireproductor);
		_favoritas = new Favoritas(cuerpo, minireproductor);
		_reproductor_resumido__usuario_registrado_ = new Reproductor_resumido__usuario_registrado_(cuerpo, minireproductor);
		
		this.getStyle().set("margin", "0px");
		this.getStyle().set("padding", "0px");
		this.getStyle().set("width", "100%");
		this.getStyle().set("height", "100%");
		
		this.gethL_buscador().add(_barra_buscador);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_recomendaciones);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_esuchadas_recientemente);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_favoritas);
		
		this.gethL_minireproductor().add(_reproductor_resumido__usuario_registrado_);
		
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
	}
	
}