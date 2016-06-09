package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.hevs.businessobject.Airport;

@Stateless
public class AirportBean implements AirportInterface {

	@PersistenceContext(name = "travelPU")
	private EntityManager em;
	private List<Airport> airports;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Airport> getAirport() {
		airports = (List<Airport>) em.createQuery("FROM Airport").getResultList();
		return airports;
	}

}
