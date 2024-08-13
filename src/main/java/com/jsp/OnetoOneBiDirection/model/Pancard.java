package com.jsp.OnetoOneBiDirection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pancard")
public class Pancard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String name;
	
	@OneToOne(mappedBy = "pancard")
	private Person person;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [panid=" + panid + ", name=" + name + ", person=" + person + "]";
	}
	
}
