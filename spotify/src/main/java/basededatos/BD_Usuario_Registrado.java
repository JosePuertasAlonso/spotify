package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Usuario_registrado;

public class BD_Usuario_Registrado {
	public BDPrincipal _bd_prin_us_reg;
	public Vector<Usuario_registrado> _contiene_usuario_registrado = new Vector<Usuario_registrado>();

	public void registrar_usuario(Usuario_registrado aUsuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public boolean nick_ya_registrado(String aNick) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.nick.eq(aNick);
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean login_ya_registrado(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return true;
		}else {
			return false;
		}
	}


	public Usuario_registrado existe_usuario(Usuario_registrado aUsuario) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aUsuario.getLogin());
		c.password.eq(aUsuario.getPassword());
		Usuario_registrado[] u = c.listUsuario_registrado();
		if(u.length > 0) {
			return u[0];
		} else {
			return null;
		}
	}

	public Cancion[] cargar_escuchadas_recientemente(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		return u.reproduce.toArray();
	}

	public Cancion[] cargar_favoritas(String aLogin) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		return u.marca_como_favorita.toArray();
	}

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(aLogin_usuario);
		Usuario_registrado usuario = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
		
		Usuario_registradoCriteria criteria2 = new Usuario_registradoCriteria();
		criteria2.login.eq(aLogin_usuario_a_seguir);
		Usuario_registrado usuario_a_seguir = Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria2);
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			if(usuario.sigue.contains(usuario_a_seguir)) {
				usuario.sigue.remove(usuario_a_seguir);
				usuario_a_seguir.setSeguidores(usuario_a_seguir.getSeguidores() - 1);
			} else {
				usuario.sigue.add(usuario_a_seguir);
				usuario_a_seguir.setSeguidores(usuario_a_seguir.getSeguidores() + 1);
			}
			Usuario_registradoDAO.save(usuario);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		return false;
		
	}

	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo) throws PersistentException {
		Usuario_registradoCriteria c = new Usuario_registradoCriteria();
		c.login.eq(aLogin);
		Usuario_registrado u = c.listUsuario_registrado()[0];
		
		PersistentTransaction t = MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			u.setLogin(aCorreo_nuevo);
			Usuario_registradoDAO.save(u);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
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

	public Usuario_registrado recargar_usuario(String login_u) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.login.eq(login_u);
		return Usuario_registradoDAO.loadUsuario_registradoByCriteria(criteria);
	}
}