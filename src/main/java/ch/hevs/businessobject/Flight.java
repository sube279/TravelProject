package ch.hevs.businessobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	//VARIABLE
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String company;
	private String flightNbr;
	private int capacite;
	
	//RELATION
	
	
	//CONSTRUCTOR
	public Flight()
	{
		
	}
	
	public Flight(String company, String flightNbr, int capacite)
	{
		this.company=company;
		this.flightNbr=flightNbr;
		this.capacite=capacite;
	}

	
	//GETTER-SETTER
	public String getCompany() 
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public String getFlightNbr() 
	{
		return flightNbr;
	}

	public void setFlightNbr(String flightNbr) 
	{
		this.flightNbr = flightNbr;
	}

	public int getCapacite() 
	{
		return capacite;
	}

	public void setCapacite(int capacite) 
	{
		this.capacite = capacite;
	}
	
	
	
	

}
