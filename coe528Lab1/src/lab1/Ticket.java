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

public class Ticket {
    
    //Instance Variables
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticket;
    private static int ticketCount = 1;
    
    //Constructor
    public Ticket(Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.ticket = ticketCount;
        ticketCount++;
    }
    
    //Getters & Setters
    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public int getTicket() {
        return ticket;
    }
    
    public static int getTicketCount()
    {
        return ticketCount;
    }
    
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("%s, Flight %d, %s to %s, %s, original price: $%.2f, ticket price: $%.2f", this.passenger.getName(), this.flight.getFlightNumber(), this.flight.getOrigin(), this.flight.getDestination(), this.flight.getDepartureTime(), this.flight.getOriginalPrice(), this.price); 
    }
    
}
