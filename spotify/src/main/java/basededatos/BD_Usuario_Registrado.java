package basededatos;

import java.util.Vector;
import basededatos.Usuario_registrado;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_prin_us_reg;
	public Vector<Usuario_registrado> _contiene_usuario_registrado = new Vector<Usuario_registrado>();

	public void registrar_usuario(Usuario_registrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public boolean existe_usuario(Usuario aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_recomendaciones(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_escuchadas_recientemente(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_favoritas(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) {
		throw new UnsupportedOperationException();
	}

	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_perfil(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_perfil_administrador(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public boolean es_usuario_registrado(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}
}