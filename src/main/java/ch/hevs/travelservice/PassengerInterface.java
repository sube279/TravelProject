package ch.hevs.travelservice;

import java.util.*;

import javax.ejb.Local;

import ch.hevs.businessobject.Passenger;



@Local
public interface PassengerInterface {


	public List<Passenger> displayListPassenger();
	


}
