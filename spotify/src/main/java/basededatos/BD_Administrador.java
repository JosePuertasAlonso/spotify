package basededatos;

import java.util.Vector;

import org.orm.PersistentException;

import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_adm;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public Administrador existe_usuario(Usuario aUsuario) throws PersistentException {
		AdministradorCriteria c = new AdministradorCriteria();
		c.login.eq(aUsuario.getLogin());
		c.password.eq(aUsuario.getPassword());
		Administrador[] a = c.listAdministrador();
		if(a.length > 0) {
			return a[0];
		} else {
			return null;
		}
	}
}