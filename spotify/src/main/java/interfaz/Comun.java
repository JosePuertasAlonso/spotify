package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaComun;

//import basededatos.iComun;

public class Comun extends VistaComun{
//	public iComun _iComun;
	public Reproductor_resumido__usuario_registrado_ _reproductor_resumido__usuario_registrado_;
	public Esuchadas_recientemente _esuchadas_recientemente;
	public Recomendaciones _recomendaciones;
	public Favoritas _favoritas;
	//public Buscador _buscador; CAMBIADO DE VISUAL PARADIGM
	public Barra_buscador _barra_buscador; //ANADIDO A MANO
	
	public Comun() {
		_barra_buscador = new Barra_buscador();
		_recomendaciones = new Recomendaciones();
		_esuchadas_recientemente = new Esuchadas_recientemente();
		_favoritas = new Favoritas();
		_reproductor_resumido__usuario_registrado_ = new Reproductor_resumido__usuario_registrado_();
		
		this.getStyle().set("margin", "0px");
		this.gethL_buscador().add(_barra_buscador);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_recomendaciones);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_esuchadas_recientemente);
		this.getvL_contendorListasCanciones().as(VerticalLayout.class).add(_favoritas);
		
		this.gethL_minireproductor().add(_reproductor_resumido__usuario_registrado_);
	}
	
}