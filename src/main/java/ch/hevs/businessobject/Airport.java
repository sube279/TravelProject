package ch.hevs.businessobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//METHOD OF INHERITANCE - A VOIR SI ON VEUT PRENDRE UNE AUTRE
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) 
@Entity
public class Airport {


	//VARIABLE
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private int idAirport;
	private String airportcode;
	private String country;
	private String location;

	//RELATION
	
	//CONSTRUCTOR
	public Airport()
	{

	}
	public Airport(String airportCode, String country, String location)
	{
		this.airportcode = airportCode;
		this.country=country;
		this.location=location;
	}


	//GETTER - SETTER
	public int getIdAirport() 
	{
		return idAirport;
	}
	
	public void setIdAirport(int idAirport) 
	{
		this.idAirport = idAirport;
	}
	
	public String getAirportcode() 
	{
		return airportcode;
	}
	
	public void setAirportcode(String airportCode) 
	{
		this.airportcode = airportCode;
	}
	
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}

}
