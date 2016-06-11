package ch.hevs.businessobject;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Destination extends Airport {


	//VARIABLE
	private String flightDate;
	private String destinationTime;

	//RELATION ?? 
	@OneToMany(mappedBy ="destination", cascade = CascadeType.ALL)
	private Set<Flight> flights;

	//CONSTRUCTOR
	public Destination()
	{

	}

	public Destination(String airportCode, String country, String location, String flightDate, String destinationTime)
	{
		super(airportCode,country,location);
		this.flightDate=flightDate;
		this.destinationTime=destinationTime;

	}

	//GETTER-SETTER
	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}


	public void addDestination(Flight f)
	{
		this.flights.add(f);
		f.setDestination(this);
	}


}
