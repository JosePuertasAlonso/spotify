/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12022PFCastellsTorresData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cancion...");
		basededatos.Cancion[] basededatosCancions = basededatos.CancionDAO.listCancionByQuery(null, null);
		int length = Math.min(basededatosCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista...");
		basededatos.Lista[] basededatosListas = basededatos.ListaDAO.listListaByQuery(null, null);
		length = Math.min(basededatosListas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosListas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Album...");
		basededatos.Album[] basededatosAlbums = basededatos.AlbumDAO.listAlbumByQuery(null, null);
		length = Math.min(basededatosAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_de_reproduccion...");
		basededatos.Lista_de_reproduccion[] basededatosLista_de_reproduccions = basededatos.Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
		length = Math.min(basededatosLista_de_reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosLista_de_reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		basededatos.Usuario[] basededatosUsuarios = basededatos.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(basededatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_registrado...");
		basededatos.Usuario_registrado[] basededatosUsuario_registrados = basededatos.Usuario_registradoDAO.listUsuario_registradoByQuery(null, null);
		length = Math.min(basededatosUsuario_registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuario_registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		basededatos.Artista[] basededatosArtistas = basededatos.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(basededatosArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		basededatos.Estilo[] basededatosEstilos = basededatos.EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(basededatosEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Anuncio...");
		basededatos.Anuncio[] basededatosAnuncios = basededatos.AnuncioDAO.listAnuncioByQuery(null, null);
		length = Math.min(basededatosAnuncios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAnuncios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estadisticas...");
		basededatos.Estadisticas[] basededatosEstadisticases = basededatos.EstadisticasDAO.listEstadisticasByQuery(null, null);
		length = Math.min(basededatosEstadisticases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEstadisticases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cancion by Criteria...");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCancionCriteria.id_Cancion.eq();
		lbasededatosCancionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cancion[] basededatosCancions = lbasededatosCancionCriteria.listCancion();
		int length =basededatosCancions== null ? 0 : Math.min(basededatosCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Lista by Criteria...");
		basededatos.ListaCriteria lbasededatosListaCriteria = new basededatos.ListaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosListaCriteria.id_Lista.eq();
		lbasededatosListaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Lista[] basededatosListas = lbasededatosListaCriteria.listLista();
		length =basededatosListas== null ? 0 : Math.min(basededatosListas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosListas[i]);
		}
		System.out.println(length + " Lista record(s) retrieved."); 
		
		System.out.println("Listing Album by Criteria...");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAlbumCriteria.id_Lista.eq();
		lbasededatosAlbumCriteria.setMaxResults(ROW_COUNT);
		basededatos.Album[] basededatosAlbums = lbasededatosAlbumCriteria.listAlbum();
		length =basededatosAlbums== null ? 0 : Math.min(basededatosAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Lista_de_reproduccion by Criteria...");
		basededatos.Lista_de_reproduccionCriteria lbasededatosLista_de_reproduccionCriteria = new basededatos.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosLista_de_reproduccionCriteria.id_Lista.eq();
		lbasededatosLista_de_reproduccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Lista_de_reproduccion[] basededatosLista_de_reproduccions = lbasededatosLista_de_reproduccionCriteria.listLista_de_reproduccion();
		length =basededatosLista_de_reproduccions== null ? 0 : Math.min(basededatosLista_de_reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosLista_de_reproduccions[i]);
		}
		System.out.println(length + " Lista_de_reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		basededatos.UsuarioCriteria lbasededatosUsuarioCriteria = new basededatos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuarioCriteria.ID.eq();
		lbasededatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario[] basededatosUsuarios = lbasededatosUsuarioCriteria.listUsuario();
		length =basededatosUsuarios== null ? 0 : Math.min(basededatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Usuario_registrado by Criteria...");
		basededatos.Usuario_registradoCriteria lbasededatosUsuario_registradoCriteria = new basededatos.Usuario_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuario_registradoCriteria.ID.eq();
		lbasededatosUsuario_registradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_registrado[] basededatosUsuario_registrados = lbasededatosUsuario_registradoCriteria.listUsuario_registrado();
		length =basededatosUsuario_registrados== null ? 0 : Math.min(basededatosUsuario_registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuario_registrados[i]);
		}
		System.out.println(length + " Usuario_registrado record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosArtistaCriteria.ID.eq();
		lbasededatosArtistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Artista[] basededatosArtistas = lbasededatosArtistaCriteria.listArtista();
		length =basededatosArtistas== null ? 0 : Math.min(basededatosArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEstiloCriteria.ID.eq();
		lbasededatosEstiloCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estilo[] basededatosEstilos = lbasededatosEstiloCriteria.listEstilo();
		length =basededatosEstilos== null ? 0 : Math.min(basededatosEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
		System.out.println("Listing Anuncio by Criteria...");
		basededatos.AnuncioCriteria lbasededatosAnuncioCriteria = new basededatos.AnuncioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAnuncioCriteria.id_Anuncio.eq();
		lbasededatosAnuncioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Anuncio[] basededatosAnuncios = lbasededatosAnuncioCriteria.listAnuncio();
		length =basededatosAnuncios== null ? 0 : Math.min(basededatosAnuncios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAnuncios[i]);
		}
		System.out.println(length + " Anuncio record(s) retrieved."); 
		
		System.out.println("Listing Estadisticas by Criteria...");
		basededatos.EstadisticasCriteria lbasededatosEstadisticasCriteria = new basededatos.EstadisticasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEstadisticasCriteria.id_Estadisticas.eq();
		lbasededatosEstadisticasCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estadisticas[] basededatosEstadisticases = lbasededatosEstadisticasCriteria.listEstadisticas();
		length =basededatosEstadisticases== null ? 0 : Math.min(basededatosEstadisticases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEstadisticases[i]);
		}
		System.out.println(length + " Estadisticas record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.ID.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12022PFCastellsTorresData listMDS12022PFCastellsTorresData = new ListMDS12022PFCastellsTorresData();
			try {
				listMDS12022PFCastellsTorresData.listTestData();
				//listMDS12022PFCastellsTorresData.listByCriteria();
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
