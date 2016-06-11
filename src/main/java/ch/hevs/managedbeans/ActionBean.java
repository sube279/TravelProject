package ch.hevs.managedbeans;

import java.util.ArrayList;
import javax.ejb.EJB;

import ch.hevs.businessobject.Passenger;
import ch.hevs.travelservice.PassengerInterface;

public class ActionBean {


	//VARIABLE
	private String name;
	private String surname;
	private String passengerValide;
	
	public ArrayList<Passenger> allpassengers;

	@EJB
	private PassengerInterface passenger;

	

	/*
	 * Return allPassenger
	 */
	public ArrayList<Passenger> getAllPassenger()
	{
		allpassengers = (ArrayList<Passenger>) passenger.getPassenger();
		return allpassengers;
	}

	/*
	 * Add a new passenger
	 * -> Cheack if the passenger existe
	 */
	public void addPassenger()
	{
		Passenger p = new Passenger(this.name,this.surname);
		if(!passenger.addPassenger(p))
		{
			setPassengerValide("Passenger exist");
		}
		else
		{
			setPassengerValide("Passenger add");
			name="";
			surname="";
		}
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

	public String getPassengerValide() {
		return passengerValide;
	}

	public void setPassengerValide(String passengerValide) {
		this.passengerValide = passengerValide;
	}

}
