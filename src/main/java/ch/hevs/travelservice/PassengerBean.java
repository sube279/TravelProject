package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.hevs.businessobject.Passenger;

@Stateless
public class PassengerBean implements PassengerInterface{

	@PersistenceContext(name = "travelPU")
	private EntityManager em;
	private List<Passenger> passengers;

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Passenger> getPassenger() {
		passengers = (List<Passenger>) em.createQuery("FROM Passenger").getResultList();
		return passengers;
	}
	
	

	

}
