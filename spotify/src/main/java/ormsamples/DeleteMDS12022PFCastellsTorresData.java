/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12022PFCastellsTorresData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Lista lbasededatosLista = basededatos.ListaDAO.loadListaByQuery(null, null);
			// Delete the persistent object
			basededatos.ListaDAO.delete(lbasededatosLista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			basededatos.AlbumDAO.delete(lbasededatosAlbum);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioDAO.delete(lbasededatosUsuario);
			basededatos.Usuario_registrado lbasededatosUsuario_registrado = basededatos.Usuario_registradoDAO.loadUsuario_registradoByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_registradoDAO.delete(lbasededatosUsuario_registrado);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			basededatos.ArtistaDAO.delete(lbasededatosArtista);
			basededatos.Estadisticas lbasededatosEstadisticas = basededatos.EstadisticasDAO.loadEstadisticasByQuery(null, null);
			// Delete the persistent object
			basededatos.EstadisticasDAO.delete(lbasededatosEstadisticas);
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionDAO.delete(lbasededatosCancion);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			basededatos.EstiloDAO.delete(lbasededatosEstilo);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Delete the persistent object
			basededatos.Lista_de_reproduccionDAO.delete(lbasededatosLista_de_reproduccion);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			basededatos.Anuncio lbasededatosAnuncio = basededatos.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Delete the persistent object
			basededatos.AnuncioDAO.delete(lbasededatosAnuncio);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12022PFCastellsTorresData deleteMDS12022PFCastellsTorresData = new DeleteMDS12022PFCastellsTorresData();
			try {
				deleteMDS12022PFCastellsTorresData.deleteTestData();
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
