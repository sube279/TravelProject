package ch.hevs.businessobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	//VARIABLE
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String name;
	private String surname;
	
	//RELATION
	
	//CONSTRUCTOR
	public Passenger()
	{
		
	}
	
	public Passenger(String name, String surname)
	{
		this.name=name;
		this.surname=surname;
	}

	//GETTER-SETTER
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSurname() 
	{
		return surname;
	}

	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	

	
}
