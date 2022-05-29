package basededatos;

import interfaz.Cibernauta_no_registrado;
import interfaz.Cibernauta_registrado;
import interfaz.Comun;
import interfaz.Artista;

import org.orm.PersistentException;

import interfaz.Administrador;
import interfaz.Facebook;
import interfaz.Apple;
import interfaz.Google;
import interfaz.Cibernauta_sin_contrasena;
import interfaz.Gestor_correo_electronico;

public class BDPrincipal implements iCibernauta_no_registrado, iCibernauta_registrado, iComun, iArtista, iAdministrador, iFacebook, iApple, iGoogle, iCibernauta_sin_contrasena, iGestor_correo_electronico {
	public BD_Estadisticas _bd_est = new BD_Estadisticas();
	public BD_Cancion _bd_can = new BD_Cancion();
	public BD_Usuario_Registrado _bd_us_reg = new BD_Usuario_Registrado();
	public BD_Lista _bd_list = new BD_Lista();
	public BD_Anuncio _bd_anun = new BD_Anuncio();
	public BD_Artista _bd_art = new BD_Artista();
	public BD_Administrador _bd_adm = new BD_Administrador();
	public BD_Estilo _bd_estilo = new BD_Estilo();

	public Cancion[] cargar_ultimos_exitos() {
		Cancion[] result = null;
		try {
			result = _bd_can.cargar_ultimos_exitos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void registrar_usuario(Usuario_registrado aUsuario) {
		try {
			_bd_us_reg.registrar_usuario(aUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean nick_ya_registrado(String aNick) {
		boolean result = false;
		try {
			result = _bd_us_reg.nick_ya_registrado(aNick);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean login_ya_registrado(String aLogin) {
		boolean result = false;
		try {
			result = _bd_us_reg.login_ya_registrado(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	public Usuario existe_usuario(Usuario aUsuario) {
		Usuario result = null;
		try {
			result = _bd_us_reg.existe_usuario(aUsuario);
			if(result != null) {
				return result;
			} else {
				result = _bd_art.existe_usuario(aUsuario);
				if(result != null) {
					return result;
				} else {
					result = _bd_adm.existe_usuario(aUsuario);
					return result;
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_recomendaciones() {
		Cancion[] result = null;
		try {
			result = _bd_can.cargar_recomendaciones();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Cancion[] cargar_escuchadas_recientemente(String aLogin) {
		Cancion[] result = null;
		try {
			result = _bd_us_reg.cargar_escuchadas_recientemente(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Cancion[] cargar_favoritas(String aLogin) {
		Cancion[] result = null;
		try {
			result = _bd_us_reg.cargar_favoritas(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Cancion[] buscar_canciones(String aCadena_busqueda) {
		Cancion[] result = null;
		try {
			result = _bd_can.buscar_canciones(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public basededatos.Artista[] buscar_artistas(String aCadena_busqueda) {
		basededatos.Artista[] result = null;
		try {
			result = _bd_art.buscar_artistas(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Lista_de_reproduccion[] buscar_listas(String aCadena_busqueda) {
		Lista_de_reproduccion[] result = null;
		try {
			result = _bd_list.buscar_listas(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void guardar_lista(Lista_de_reproduccion aLista, String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void anadir_cancion_historial(int aId_Cancion, String aLogin) {
		throw new UnsupportedOperationException();
	}

	public boolean anadir_a_favoritos(int aId_Cancion, String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] cargar_listas_perfil(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void anadir_cancion_a_la_lista(String aLogin, int aId_Cancion, int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void crear_lista(String aLogin, String aNombre_lista) {
		throw new UnsupportedOperationException();
	}

	public boolean seguir_artista(String aLogin_usuario, String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_hits(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Album[] cargar_albumes_artista(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Artista[] cargar_artistas_similares(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] cargar_listas_artista(String aLogin_artista) {
		throw new UnsupportedOperationException();
	}

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_album(int aId_Album) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_lista(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_cancion_mas_escuchada(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Cancion cargar_ultima_reproduccion(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Anuncio[] cargar_anuncios(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_perfil(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_cancion_lista(int aId_Lista, int aId_Cancion) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_nombre_lista(int aId_Lista, String aNombre_nuevo_lista) {
		throw new UnsupportedOperationException();
	}

	public void publicar_anuncio(String aLogin_artista, Anuncio aAnuncio) {
		throw new UnsupportedOperationException();
	}

	public void modificar_perfil_artista(String aLogin_artista, String aCorreo_nuevo, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public void anadir_estilo(String aEstilo) {
		try {
			_bd_estilo.anadir_estilo(aEstilo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void anadir_cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_canciones_album_administrador(int aId_Album) {
		throw new UnsupportedOperationException();
	}

	public void anadir_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public Estilo[] cargar_estilos() {
		throw new UnsupportedOperationException();
	}

	public void anadir_artista(basededatos.Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_cancion(int aId_Cancion) {
		throw new UnsupportedOperationException();
	}

	public void modificar_cancion(int aId_Cancion, String aTitulo_cancion, String aArtistas, String aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void establecer_ultimo_exito(int aId_Cancion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_album(int aId_album) {
		throw new UnsupportedOperationException();
	}

	public void modificar_album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_artista(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public void modificar_artista_administrador(String aFoto, Estilo[] aEstilos) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_perfil_administrador(String aLogin) {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_no_registrado get_Cibernauta_no_registrado() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_registrado get_Cibernauta_registrado() {
		throw new UnsupportedOperationException();
	}

	public Comun get_Comun() {
		throw new UnsupportedOperationException();
	}

	public Artista get_Artista() {
		throw new UnsupportedOperationException();
	}

	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}

	public Facebook get_Facebook() {
		throw new UnsupportedOperationException();
	}

	public Apple get_Apple() {
		throw new UnsupportedOperationException();
	}

	public Google get_Google() {
		throw new UnsupportedOperationException();
	}

	public Cibernauta_sin_contrasena get_Cibernauta_sin_contrasena() {
		throw new UnsupportedOperationException();
	}

	public Gestor_correo_electronico get_Gestor_correo_electronico() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] buscar_canciones_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}

	public Album[] buscar_albumes_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}

	public basededatos.Artista[] buscar_artistas_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean existe_estilo(String aEstilo) {
		boolean result = false;
		try {
			result = _bd_estilo.existe_estilo(aEstilo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}