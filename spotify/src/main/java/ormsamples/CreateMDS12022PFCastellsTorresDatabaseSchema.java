/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12022PFCastellsTorresDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.MDS12022PFCastellsTorresPersistentManager.instance());
			basededatos.MDS12022PFCastellsTorresPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
