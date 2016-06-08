package ch.hevs.businessobject;

import javax.persistence.Entity;

@Entity
public class Departure extends Airport {


	//VARIABLE
	private String flightDate;
	private String departureTime;


	//RELATION 


	//CONSTRUCTOR
	public Departure()
	{

	}

	public Departure(String airportCode, String country, String location, String flightDate, String departureTime)
	{
		super(airportCode,country,location);
		this.flightDate=flightDate;
		this.departureTime=departureTime;

	}

	
	//GETTER-SETTER
	public String getFlightDate() 
	{
		return flightDate;
	}

	public void setFlightDate(String flightDate) 
	{
		this.flightDate = flightDate;
	}

	public String getDepartureTime() 
	{
		return departureTime;
	}

	public void setDepartureTime(String departureTime) 
	{
		this.departureTime = departureTime;
	}

	 
}
