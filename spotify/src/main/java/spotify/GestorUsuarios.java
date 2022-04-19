package spotify;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Administrador;
import interfaz.Artista;
import interfaz.Cibernauta_no_registrado;
import interfaz.Cibernauta_registrado;

public class GestorUsuarios {
	
	private static VerticalLayout vl_principal;
	
	public static void incializar(VerticalLayout v) {
		vl_principal = v;
	}
	
	public static void cibernauta() {
		Cibernauta_no_registrado cibernauta = new Cibernauta_no_registrado();
		vl_principal.removeAll();
		vl_principal.add(cibernauta);
	}
	
	public static void usuario() {
		Cibernauta_registrado usuario = new Cibernauta_registrado();
		vl_principal.removeAll();
		vl_principal.add(usuario);
	}
	
	public static void artista() {
		Artista artista = new Artista();
		vl_principal.removeAll();
		vl_principal.add(artista);
	}
	
	public static void administrador() {
		Administrador administrador = new Administrador();
		vl_principal.removeAll();
		vl_principal.add(administrador);
	}
	
	
	
	

}
