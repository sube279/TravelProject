package ch.hevs.managedbeans;

import java.util.ArrayList;

import javax.ejb.EJB;

import ch.hevs.businessobject.Airport;

import ch.hevs.travelservice.AirportInterface;

public class AirportManagedBean {
	
	//VARIABLE
	private String airportcode;
	private String country;
	private String location;
	
	public ArrayList<Airport> allairports;
	
	@EJB
	private AirportInterface airport;
	
	public ArrayList<Airport> getAllAirports()
	{
		allairports = (ArrayList<Airport>) airport.getAirport();
		return allairports;
	}

	
	//GETTER-SETTER
	public String getAirportcode() {
		return airportcode;
	}

	public void setAirportcode(String airportcode) {
		this.airportcode = airportcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Airport> getAllairports() {
		return allairports;
	}

	public void setAllairports(ArrayList<Airport> allairports) {
		this.allairports = allairports;
	}

	public AirportInterface getAirport() {
		return airport;
	}

	public void setAirport(AirportInterface airport) {
		this.airport = airport;
	}
	

	
	
	
}
