package basededatos;

public interface iCibernauta_no_registrado {

	public Cancion[] cargar_ultimos_exitos();

	public void registrar_usuario(Usuario_registrado aUsuario);

	public boolean existe_usuario(Usuario aUsuario);
}