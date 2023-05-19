package Dao;

import javax.persistence.EntityManager;

public class CatalogoBibliotecarioDAO {

	EntityManager em;

	public CatalogoBibliotecarioDAO(EntityManager em) {

		this.em = em;
	}

}
