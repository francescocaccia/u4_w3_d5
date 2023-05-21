package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import lombok.extern.slf4j.Slf4j;
import u4_w3_d5.CatalogoBibliotecario;

@Slf4j
public class CatalogoBibliotecarioDAO {

	EntityManager em;

	public CatalogoBibliotecarioDAO(EntityManager em) {

		this.em = em;
	}

	public void insertCatalogo(CatalogoBibliotecario cb) {

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		em.persist(cb);
		transaction.commit();
//		log.info("catalogo inserito");
	}

	public void removeCatalogoByISBN(String codiceISBN) {
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		Query query = em.createQuery("DELETE FROM catalogobibliotecario WHERE codiceISBN = :codiceISBN ");
		query.setParameter("codiceISBN", codiceISBN);
		query.executeUpdate();
		transaction.commit();
	}

	public CatalogoBibliotecario ricercaByISBN(String codiceISBN) {

		CatalogoBibliotecario cb = em.find(CatalogoBibliotecario.class, codiceISBN);
		return cb;
	};

}
