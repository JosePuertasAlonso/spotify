package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListas_de_reproduccion_del_artista;

public class Listas_de_reproduccion_del_artista extends VistaListas_de_reproduccion_del_artista{
	public Ver_perfil_artista _ver_perfil_artista;
	public Lista_del_artista _lista_del_artista;
	//ANADIDO A MANO:
	public Vector<Lista_del_artista> _list_Lista_del_artista = new Vector<Lista_del_artista>();
	
	private VerticalLayout cuerpo;
	private HorizontalLayout minireproductor;
	
	public Listas_de_reproduccion_del_artista(VerticalLayout cuerpo, HorizontalLayout minireproductor) {
		
		this.cuerpo = cuerpo;
		this.minireproductor = minireproductor;
		
		cargarListasArtista();
		
		int cont = 0;
		HorizontalLayout layout = this.gethL_contenedorListaDelArtista();
		for(int i = 0; i < _list_Lista_del_artista.size(); i++) {
			if(cont == 6) {
				layout = new HorizontalLayout();
				layout.getStyle().set("width", "100%");
				layout.getStyle().set("max-height", "50%");
				layout.getThemeList().set("spacing", true);
				this.getvL_listaFilas().as(VerticalLayout.class).add(layout);
				cont = 0;
			}
			
			layout.add(_list_Lista_del_artista.get(i));
			layout.getThemeList().set("spacing", true);
			cont++;
			
		}
		
		this.getStyle().set("margin", "0px");
	}
	
	public void cargarListasArtista() {
		Lista_del_artista l;
		for(int i = 0; i < 6; i++) {
			l = new Lista_del_artista(cuerpo, minireproductor);
			l.getStyle().set("margin-right", "var(--lumo-space-m)");
			l.getStyle().set("max-width", "15.5%");
			_list_Lista_del_artista.add(l);
		}
	}
	

	
	
	
}