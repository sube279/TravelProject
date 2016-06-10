package ch.hevs.businessobject;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Flight {
	
	//VARIABLE
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String company;
	private String flightNbr;
	private int capacite;
	
	//RELATION
	@ManyToMany(mappedBy ="flights", cascade = CascadeType.ALL)
	private Set<Passenger> passengers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Departure departure;
	
	//CONSTRUCTOR
	public Flight()
	{
		this.passengers = new HashSet<Passenger>();

	}
	
	public Flight(String company, String flightNbr, int capacite)
	{
		this.company=company;
		this.flightNbr=flightNbr;
		this.capacite=capacite;
		this.passengers = new HashSet<Passenger>();
	}

	
	//GETTER-SETTER
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlightNbr() {
		return flightNbr;
	}

	public void setFlightNbr(String flightNbr) {
		this.flightNbr = flightNbr;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Departure getDeparture() {
		return departure;
	}

	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	
	

}
