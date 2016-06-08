package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.hevs.businessobject.Passenger;

@Stateless
public class PassengerBean implements PassengerInterface{

	@PersistenceContext(name = "PassengerPU")
	private EntityManager em;

	public List<Passenger> displayAllPassenger() {
		List<Passenger> listAllPassenger = (List<Passenger>) em.createQuery("Select * FROM Passenger").getResultList();
		return listAllPassenger;
	}



}
