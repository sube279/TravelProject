package ch.hevs.businessobject;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Passenger {

	//VARIABLE
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String firstname;
	
	//RELATION
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Flight> flights;
	
	
	//CONSTRUCTOR
	public Passenger()
	{
		this.flights = new HashSet<Flight>();
	}
	
	public Passenger(String name, String firstname)
	{
		this.name=name;
		this.firstname=firstname;
		this.flights = new HashSet<Flight>(); //Ajouter au passer une liste de vol
		
	}

	
	//GETTER-SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Set<Flight> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}


	

	
}
