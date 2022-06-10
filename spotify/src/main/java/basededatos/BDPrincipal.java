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


	public Usuario_registrado existe_usuario(Usuario_registrado aUsuario) {
		Usuario_registrado result = null;
		try {
			result = _bd_art.existe_usuario(aUsuario);
			if(result != null) {
				return result;
			} else {
				result = _bd_us_reg.existe_usuario(aUsuario);
				if(result != null) {
					return result;
				}
			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean existe_usuarioAdmin(String login, String password) {
		boolean result = false;
		try {
			result = _bd_adm.existe_usuarioAdmin(login, password);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo) {
		try {
			_bd_us_reg.modificar_perfil_usuario(aLogin, aCorreo_antiguo, aCorreo_nuevo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			_bd_list.guardar_lista(aLista, aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void anadir_cancion_historial(int aId_Cancion, String aLogin) {
		try {
			_bd_can.anadir_cancion_historial(aId_Cancion, aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean anadir_a_favoritos(int aId_Cancion, String aLogin) {
		boolean result = false;
		try {
			result = _bd_can.anadir_a_favoritos(aId_Cancion, aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void anadir_cancion_a_la_lista(String aLogin, int aId_Cancion, int aId_Lista) {
		try {
			_bd_list.anadir_cancion_a_la_lista(aLogin, aId_Cancion, aId_Lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void crear_lista(String aLogin, String aNombre_lista, String aFoto) {
		try {
			_bd_list.crear_lista(aLogin, aNombre_lista, aFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public basededatos.Artista[] cargar_artistas_similares(String aLogin_artista) {
		basededatos.Artista[] result = null;
		try {
			result = _bd_art.cargar_artistas_similares(aLogin_artista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) {
		boolean result = false;
		try {
			result = _bd_us_reg.seguir_usuario(aLogin_usuario, aLogin_usuario_a_seguir);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Cancion cargar_cancion_mas_escuchada() {
		Cancion result = null;
		try {
			result = _bd_can.cargar_cancion_mas_escuchada();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Anuncio[] cargar_anuncios(String aLogin) {
		Anuncio[] result = null;
		try {
			result = _bd_art.cargar_anuncios(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void eliminar_perfil(String aLogin) {
		try {
			_bd_us_reg.eliminar_perfil(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_lista(int aId_Lista) {
		try {
			_bd_list.eliminar_lista(aId_Lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_cancion_lista(int aId_Lista, int aId_Cancion) {
		try {
			_bd_list.eliminar_cancion_lista(aId_Lista, aId_Cancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cambiar_nombre_lista(int aId_Lista, String aNombre_nuevo_lista) {
		try {
			_bd_list.cambiar_nombre_lista(aId_Lista, aNombre_nuevo_lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void publicar_anuncio(String aLogin_artista, Anuncio aAnuncio) {
		try {
			_bd_anun.publicar_anuncio(aLogin_artista, aAnuncio);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificar_perfil_artista(String aLogin_artista, String aCorreo_nuevo, String aFoto) {
		try {
			_bd_art.modificar_perfil_artista(aLogin_artista, aCorreo_nuevo, aFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			_bd_can.anadir_cancion(aCancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void anadir_album(Album aAlbum) {
		try {
			_bd_list.anadir_album(aAlbum);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Estilo[] cargar_estilos() {
		Estilo[] result = null;
		try {
			result = _bd_estilo.cargar_estilos();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void anadir_artista(basededatos.Artista aArtista) {
		try {
			_bd_art.anadir_artista(aArtista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_cancion(int aId_Cancion) {
		try {
			_bd_can.eliminar_cancion(aId_Cancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificar_cancion(int aId_Cancion, Cancion aCancion, basededatos.Artista[] nuevosArtistas) {
		try {
			_bd_can.modificar_cancion(aId_Cancion, aCancion, nuevosArtistas);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void establecer_ultimo_exito(int aId_Cancion) {
		try {
			_bd_can.establecer_ultimo_exito(aId_Cancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_album(int aId_album) {
		try {
			_bd_list.eliminar_album(aId_album);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modificar_album(int aId_album, Album aAlbum, basededatos.Artista[] artistas_album) {
		try {
			_bd_list.modificar_album(aId_album, aAlbum, artistas_album);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void modificar_artista_administrador(String login_artista, String aFoto) {
		try {
			_bd_art.modificar_artista_administrador(login_artista, aFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_perfil_administrador(String aLogin) {
		try {
			_bd_us_reg.eliminar_perfil(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Cancion[] result = null;
		try {
			result = _bd_can.buscar_canciones(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Album[] buscar_albumes_administrador(String aCadena_busqueda) {
		Album[] result = null;
		try {
			result = _bd_list.buscar_albumes_administrador(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public basededatos.Artista[] buscar_artistas_administrador(String aCadena_busqueda) {
		basededatos.Artista[] result = null;
		try {
			result = _bd_art.buscar_artistas(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Usuario_registrado[] buscar_perfiles_administrador(String aCadena_busqueda) {
		Usuario_registrado[] result = null;
		try {
			result = _bd_us_reg.buscar_perfiles_administrador(aCadena_busqueda);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
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

	@Override
	public boolean login_ya_registrado_modificacion(String aLogin) {
		boolean result = false;
		try {
			result = _bd_us_reg.login_ya_registrado(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public basededatos.Artista recargar_artista(String aLogin) {
		basededatos.Artista result = null;
		try {
			result = _bd_art.recargar_artista(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Usuario_registrado recargar_usuario(String login_u) {
		basededatos.Usuario_registrado result = null;
		try {
			result = _bd_us_reg.recargar_usuario(login_u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean login_ya_registrado_modificacion_artista(String aLogin) {
		boolean result = false;
		try {
			result = _bd_us_reg.login_ya_registrado(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public basededatos.Artista[] existen_artistas(String[] artistas) {
		basededatos.Artista[] result = null;
		try {
			result = _bd_art.existen_artistas(artistas);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean nick_ya_registrado_administrador(String aNick) {
		boolean result = false;
		try {
			result = _bd_us_reg.nick_ya_registrado(aNick);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean login_ya_registrado_administrador(String aLogin) {
		boolean result = false;
		try {
			result = _bd_us_reg.login_ya_registrado(aLogin);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void anadir_cancion_al_album(int aId_cancion, int aId_album) {
		try {
			_bd_list.anadir_cancion_al_album(aId_cancion, aId_album);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void asignar_estilo(Estilo estilo, String login_artista) {
		try {
			_bd_art.asignar_estilo(estilo, login_artista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Cancion recargar_cancion(int id_cancion) {
		Cancion result = null;
		try {
			result = _bd_can.recargar_cancion(id_cancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public Lista recargar_lista(int id_lista) {
		Lista result = null;
		try {
			result = _bd_list.recargar_lista(id_lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}