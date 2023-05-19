package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import lombok.extern.slf4j.Slf4j;
import u4_w3_d5.CatalogoBibliotecario;
import u4_w3_d5.Periodicita;
import u4_w3_d5.Riviste;

@Slf4j
public class ArchivioDAO {

	EntityManager em;

	public ArchivioDAO(EntityManager em) {

		this.em = em;
	}

	public void addElement(String codiceISBN, String titolo, int annoPubblicazione, int numeroPagine,
			Periodicita periodicita) {
		EntityTransaction t = em.getTransaction();
		t.begin();
		CatalogoBibliotecario cb = new Riviste(codiceISBN, titolo, annoPubblicazione, numeroPagine, periodicita);
		em.persist(cb);
		t.commit();

	}

}
