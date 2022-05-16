/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12022PFCastellsTorresData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_historial_de, es_marcada_como_favorita_por, realizada_por, esta_en, ultimo_Exito, reproducciones, duracion
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.Lista lbasededatosLista = basededatos.ListaDAO.createLista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			basededatos.ListaDAO.save(lbasededatosLista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creado_por
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.createLista_de_reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_guardada_por, es_gestionada_por
			basededatos.Lista_de_reproduccionDAO.save(lbasededatosLista_de_reproduccion);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.createUsuario();
			// Initialize the properties of the persistent object here
			basededatos.UsuarioDAO.save(lbasededatosUsuario);
			basededatos.Usuario_registrado lbasededatosUsuario_registrado = basededatos.Usuario_registradoDAO.createUsuario_registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : guarda, es_seguido_por, gestiona, reproduce, sigue, marca_como_favorita, tiene, dias_baja, seguidores
			basededatos.Usuario_registradoDAO.save(lbasededatosUsuario_registrado);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : publica, es_similar_de, es_identificado_por, es_autor_de, es_similar_a, realiza
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : identifica_a
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			basededatos.Anuncio lbasededatosAnuncio = basededatos.AnuncioDAO.createAnuncio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_publicado_por
			basededatos.AnuncioDAO.save(lbasededatosAnuncio);
			basededatos.Estadisticas lbasededatosEstadisticas = basededatos.EstadisticasDAO.createEstadisticas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenecen_a, actividad_Semanal
			basededatos.EstadisticasDAO.save(lbasededatosEstadisticas);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12022PFCastellsTorresData createMDS12022PFCastellsTorresData = new CreateMDS12022PFCastellsTorresData();
			try {
				createMDS12022PFCastellsTorresData.createTestData();
			}
			finally {
				basededatos.MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
