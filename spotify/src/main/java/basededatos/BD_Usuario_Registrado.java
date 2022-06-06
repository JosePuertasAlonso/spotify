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

	public boolean seguir_usuario(String aLogin_usuario, String aLogin_usuario_a_seguir) {
		throw new UnsupportedOperationException();
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
}