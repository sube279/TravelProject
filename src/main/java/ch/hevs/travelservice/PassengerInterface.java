package ch.hevs.travelservice;

import java.util.List;

import javax.ejb.Local;

import ch.hevs.businessobject.Passenger;

@Local
public interface PassengerInterface {

public List<Passenger> displayAllPassenger();
	
}
