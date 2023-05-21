package u4_w3_d5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import Dao.CatalogoBibliotecarioDAO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Catalogo {

	private static EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("u4_w3_d5");

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		Archivio myArchivio = new Archivio();
		CatalogoBibliotecario libro1 = new Libro("ES-6473", "Il selvaggio", 2003, 582, "Marriagas", "Romanzo");
		CatalogoBibliotecario libro2 = new Libro("ES-342", "titolo", 2022, 452, "autore", "Romanzo");
		CatalogoBibliotecario rivista1 = new Riviste("is-543", "title", 2011, 32, Periodicita.MENSILE);
		CatalogoBibliotecario rivista2 = new Riviste("es-32", "topolino", 1945, 100, Periodicita.SETTIMANALE);
		CatalogoBibliotecarioDAO cbd = new CatalogoBibliotecarioDAO(em);
		cbd.insertCatalogo(rivista2);
		em.close();
		emf.close();
	}

}