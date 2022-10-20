package net.emmecilab.jpa_relationship_base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.emmecilab.jpa_relationship_base.model.Author;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-mysql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();

			Author p1 = new Author();
			p1.setFirstName("Dante");
			p1.setLastName("Alighieri");
			entityManager.persist(p1);

			entityManager.getTransaction().commit();
			entityManager.clear();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
		}
		// Person foundPerson = entityManager.find(Person.class, 1L);
		// System.out.println(foundPerson.getId());

		entityManager.close();
	}
}
