package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.hevs.businessobject.Airport;
import ch.hevs.businessobject.Flight;

@Stateless
public class FlightBean {
/*	
	@PersistenceContext(name = "travelPU")
	private EntityManager em;
	private List<Flight> flights;
	
	
	public List<Flight> getFlights()
	{
		flights = (List<Flight>) em.createQuery("Select f FROM Flight f").getResultList();
		return flights;
	}*/
}
