package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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



	@TransactionAttribute(value = TransactionAttributeType.REQUIRED)
	public boolean addPassenger(Passenger p) {
		TypedQuery query = em.createQuery("SELECT p FROM Passenger p WHERE p.name=:name", Passenger.class);
		query.setParameter("name", p.getName());

		List<Passenger> listCheckViewer = query.getResultList();

		if(listCheckViewer.size() == 0)
		{
			em.persist(p);
			return true ;
		}
		else
		{
			return false ;
		}
	}
	
	

	

}
