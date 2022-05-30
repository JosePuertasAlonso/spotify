package basededatos;

import java.util.Vector;

import org.orm.PersistentException;

import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_adm;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public boolean existe_usuarioAdmin(String login, String password) throws PersistentException {
		AdministradorCriteria c = new AdministradorCriteria();
		c.login.eq(login);
		c.password.eq(password);
		Administrador[] a = c.listAdministrador();
		if(a.length > 0) {
			return true;
		} else {
			return false;
		}
	}
}