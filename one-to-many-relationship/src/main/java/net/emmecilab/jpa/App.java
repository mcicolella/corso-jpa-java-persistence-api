package net.emmecilab.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.emmecilab.jpa.model.Author;
import net.emmecilab.jpa.model.Book;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-mysql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
		
			entityManager.getTransaction().begin();

			Author a1 = new Author();
			a1.setFirstName("Dante");
			a1.setLastName("Alighieri");
			
			Book b1 = new Book();
			b1.setTitle("La Divina Commedia");
			
			a1.getBooks().add(b1);
						
			entityManager.persist(a1);

			entityManager.getTransaction().commit();
			entityManager.clear();
		
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		}

		entityManager.close();
	}
}
