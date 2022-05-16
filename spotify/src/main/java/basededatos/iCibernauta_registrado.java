package basededatos;

public interface iCibernauta_registrado extends iComun {

	public void modificar_perfil_usuario(String aLogin, String aCorreo_antiguo, String aCorreo_nuevo);
}