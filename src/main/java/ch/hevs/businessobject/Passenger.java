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
	private String firstname;
	
	//RELATION
	
	//CONSTRUCTOR
	public Passenger()
	{
		
	}
	
	public Passenger(String name, String firstname)
	{
		this.name=name;
		this.firstname=firstname;
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

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	

	
}
