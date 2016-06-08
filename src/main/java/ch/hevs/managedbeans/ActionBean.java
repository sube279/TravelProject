package ch.hevs.managedbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import ch.hevs.businessobject.Passenger;
import ch.hevs.travelservice.PassengerInterface;

public class ActionBean {
	
	
	//VARIABLE
	private String name;
	private String surname;
	private List<Passenger> allPassenger;
	

	@EJB
	private PassengerInterface passenger;
	
	
	@PostConstruct
	 public void initialize() {	

		allPassenger = passenger.displayAllPassenger();
		
		/*
		// use JNDI to inject reference to bank
		InitialContext ctx = new InitialContext();
		passenger = (PassengerInterface) ctx.lookup("java:global/TP12-WEB-EJB-PC-EPC-E-0.0.1-SNAPSHOT/PassengerBean!ch.hevs.travelservice.PassengerInterface");    	
		
		//Get Passengers
		List<Passenger> passengerList = passenger.getPassenger();
		this.passengerName = new ArrayList<String>();
		for(Passenger passg : passengerList)
		{
			this.passengerName.add(passg.getName());
		}
		*/
	}


	//GETTER-SETTER
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}




	public PassengerInterface getPassenger() {
		return passenger;
	}


	public void setPassenger(PassengerInterface passenger) {
		this.passenger = passenger;
	}
	
}
