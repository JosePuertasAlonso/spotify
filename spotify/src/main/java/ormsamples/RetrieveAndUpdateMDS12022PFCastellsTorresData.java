/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12022PFCastellsTorresData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFCastellsTorresPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Lista lbasededatosLista = basededatos.ListaDAO.loadListaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ListaDAO.save(lbasededatosLista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Usuario lbasededatosUsuario = basededatos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioDAO.save(lbasededatosUsuario);
			basededatos.Usuario_registrado lbasededatosUsuario_registrado = basededatos.Usuario_registradoDAO.loadUsuario_registradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_registradoDAO.save(lbasededatosUsuario_registrado);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.Estadisticas lbasededatosEstadisticas = basededatos.EstadisticasDAO.loadEstadisticasByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstadisticasDAO.save(lbasededatosEstadisticas);
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Lista_de_reproduccionDAO.save(lbasededatosLista_de_reproduccion);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Anuncio lbasededatosAnuncio = basededatos.AnuncioDAO.loadAnuncioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AnuncioDAO.save(lbasededatosAnuncio);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Lista by ListaCriteria");
		basededatos.ListaCriteria lbasededatosListaCriteria = new basededatos.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosListaCriteria.id_Lista.eq();
		System.out.println(lbasededatosListaCriteria.uniqueLista());
		
		System.out.println("Retrieving Album by AlbumCriteria");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAlbumCriteria.id_Lista.eq();
		System.out.println(lbasededatosAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		basededatos.UsuarioCriteria lbasededatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuarioCriteria.ID.eq();
		System.out.println(lbasededatosUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Usuario_registrado by Usuario_registradoCriteria");
		basededatos.Usuario_registradoCriteria lbasededatosUsuario_registradoCriteria = new basededatos.Usuario_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuario_registradoCriteria.ID.eq();
		System.out.println(lbasededatosUsuario_registradoCriteria.uniqueUsuario_registrado());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosArtistaCriteria.ID.eq();
		System.out.println(lbasededatosArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Estadisticas by EstadisticasCriteria");
		basededatos.EstadisticasCriteria lbasededatosEstadisticasCriteria = new basededatos.EstadisticasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEstadisticasCriteria.id_Estadisticas.eq();
		System.out.println(lbasededatosEstadisticasCriteria.uniqueEstadisticas());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCancionCriteria.id_Cancion.eq();
		System.out.println(lbasededatosCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEstiloCriteria.ID.eq();
		System.out.println(lbasededatosEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Lista_de_reproduccion by Lista_de_reproduccionCriteria");
		basededatos.Lista_de_reproduccionCriteria lbasededatosLista_de_reproduccionCriteria = new basededatos.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosLista_de_reproduccionCriteria.id_Lista.eq();
		System.out.println(lbasededatosLista_de_reproduccionCriteria.uniqueLista_de_reproduccion());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.ID.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Anuncio by AnuncioCriteria");
		basededatos.AnuncioCriteria lbasededatosAnuncioCriteria = new basededatos.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAnuncioCriteria.id_Anuncio.eq();
		System.out.println(lbasededatosAnuncioCriteria.uniqueAnuncio());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12022PFCastellsTorresData retrieveAndUpdateMDS12022PFCastellsTorresData = new RetrieveAndUpdateMDS12022PFCastellsTorresData();
			try {
				retrieveAndUpdateMDS12022PFCastellsTorresData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12022PFCastellsTorresData.retrieveByCriteria();
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
