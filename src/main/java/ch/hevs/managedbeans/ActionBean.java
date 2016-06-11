package ch.hevs.managedbeans;

import java.util.*;

import javax.annotation.*;
import javax.ejb.EJB;

import ch.hevs.businessobject.Passenger;
import ch.hevs.travelservice.PassengerInterface;

public class ActionBean {


	//VARIABLE
	private String name;
	private String firstname;
	private String passengerValide;
	private ArrayList<Passenger> displayListPassenger;
	
	
	@EJB
	private PassengerInterface passenger;


	//POST CONSTRUC
	@PostConstruct
	public void init()
	{
		displayListPassenger = (ArrayList<Passenger>) passenger.displayListPassenger();
	}
	
	
	
	/*
	 * Add a new passenger
	 * -> Cheack if the passenger existe
	 
	public void addPassenger()
	{
		Passenger p = new Passenger(this.name,this.firstname);
		if(!passenger.addPassenger(p))
		{
			setPassengerValide("Passenger exist");
		}
		else
		{
			setPassengerValide("Passenger add");
			name="";
			firstname="";
		}
	}

	*/
	//GETTER-SETTER

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPassengerValide() {
		return passengerValide;
	}

	public void setPassengerValide(String passengerValide) {
		this.passengerValide = passengerValide;
	}

	

	public ArrayList<Passenger> getDisplayListPassenger() {
		return displayListPassenger;
	}



	public void setDisplayListPassenger(ArrayList<Passenger> displayListPassenger) {
		this.displayListPassenger = displayListPassenger;
	}



	public PassengerInterface getPassenger() {
		return passenger;
	}

	public void setPassenger(PassengerInterface passenger) {
		this.passenger = passenger;
	}

	
	
	

}
