package ch.hevs.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import ch.hevs.businessobject.Passenger;
import ch.hevs.travelservice.PassengerInterface;

public class ActionBean {


	//VARIABLE
	private String name;
	private String surname;
	
	public ArrayList<Passenger> allpassengers;

	@EJB
	private PassengerInterface passenger;


	public ArrayList<Passenger> getAllPassenger()
	{
		allpassengers = (ArrayList<Passenger>) passenger.getPassenger();
		return allpassengers;
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
