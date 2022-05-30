package basededatos;

public interface iCibernauta_no_registrado {

	public Cancion[] cargar_ultimos_exitos();

	public void registrar_usuario(Usuario_registrado aUsuario);

	public Usuario_registrado existe_usuario(Usuario_registrado aUsuario);
	
	public boolean existe_usuarioAdmin(String login, String password);
	
	public boolean nick_ya_registrado(String aNick);
	
	public boolean login_ya_registrado(String aLogin);
}