package basededatos;

import java.util.Vector;
import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_adm;
	public Vector<Administrador> _contiene_administrador = new Vector<Administrador>();

	public boolean existe_usuario(Usuario aUsuario) {
		throw new UnsupportedOperationException();
	}
}