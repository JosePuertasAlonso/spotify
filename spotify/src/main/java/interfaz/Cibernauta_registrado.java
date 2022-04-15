package interfaz;

//import basededatos.iCibernauta_registrado;

public class Cibernauta_registrado extends Comun {
//	public iCibernauta_registrado _iCibernauta_registrado;
	public Cabecera_cibernauta_registrado _cabecera_cibernauta_registrado;
	
	
	public Cibernauta_registrado() {
		_cabecera_cibernauta_registrado = new Cabecera_cibernauta_registrado();
		this.gethL_cabecera().add(_cabecera_cibernauta_registrado);
	}
	
	
	
}