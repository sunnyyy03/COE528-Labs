/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author sanchit
 */

public class Flight {
    
    //Instance Variables    
    private int flightNumber, capacity, numberOfSeatsLeft;
    private double originalPrice;
    private String origin, destination, departureTime;
    
    //Constructor
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice)
    {
	if(origin.equals(destination)) 
	    throw new IllegalArgumentException();
        
	this.origin = origin;
	this.destination = destination;
	this.flightNumber = flightNumber;
	this.departureTime = departureTime;
	this.capacity = capacity;
	this.numberOfSeatsLeft = capacity;
	this.originalPrice = originalPrice;
    }
 
    //Getters & Setters    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
     public double getOriginalPrice(){
        return this.originalPrice;
    }
     
    public String getOrigin(){
        return this.origin;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber = flightNumber;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    
    public void setOrigin(String origin){
        this.origin = origin;
    }
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    // bookASeat method
    public boolean bookASeat()
    {
	if(numberOfSeatsLeft > 0) 
	{
	    numberOfSeatsLeft--; 
	    return true; 
	}
	else
	    return false;
    }
    
    @Override
    public String toString()
    {
	return "Flight " + this.getFlightNumber() + ", " + this.getOrigin() + " to " + this.getDestination() + ", " + this.getDepartureTime() + ", Original Price: " + this.getOriginalPrice();
    }
    
}
