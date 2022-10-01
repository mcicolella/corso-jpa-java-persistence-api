package net.emmecilab.jpa_examples;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.emmecilab.jpa_examples.model.Person;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-mysql");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();

			Person p1 = new Person();
			p1.setFirstName("pinco");
			p1.setLastName("pallino");
			// p1.setId(1L);
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
