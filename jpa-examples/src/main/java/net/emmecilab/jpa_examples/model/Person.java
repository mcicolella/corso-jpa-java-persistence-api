package net.emmecilab.jpa_examples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
public class Person {
	@Id
	@GeneratedValue
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_generator")
	//@SequenceGenerator(name="person_generator", sequenceName = "person_seq", allocationSize=50)
	//@GeneratedValue(strategy = GenerationType.TABLE)
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	//@TableGenerator(name = "table-generator", table = "dep_ids",
		//pkColumnName = "seq_id", valueColumnName = "seq_value", allocationSize = 10)
	private Long id;
	private String firstName;
	private String lastName;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
