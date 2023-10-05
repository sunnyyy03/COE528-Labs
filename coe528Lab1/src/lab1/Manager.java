/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author sanchit
 */

public class Manager
{
    //Instance Variables
    private ArrayList<Flight> flights = new ArrayList<Flight>();
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    
    // Scanner
    private static Scanner keyboard = new Scanner(System.in);
    
    //createFlights method
    public void createFlights()
    {        
        boolean validCreation = false;
        
        do
        {
            try
            {
                System.out.print("\nEnter flight number: ");
                int flightNumber = Integer.parseInt(keyboard.nextLine());

                System.out.print("Enter origin of flight: ");
                String origin = keyboard.nextLine();

                System.out.print("Enter destination of flight: ");
                String destination = keyboard.nextLine();

                System.out.print("Enter departure time of flight: ");
                String departureTime = keyboard.nextLine();

                System.out.print("Enter capacity of flight : ");
                int capacity = Integer.parseInt(keyboard.nextLine());

                System.out.print("Enter original price of flight: ");
                double originalPrice = Double.parseDouble(keyboard.nextLine());
                
                Flight f = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
                this.flights.add(f);
                System.out.println("**Flight created**");
                System.out.println("Details: " + f);
                validCreation = true;
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("**Invalid input, please try again**");
            }
        }
        while(!validCreation);
    }
    
    //displayAvailableFlights method
    public void displayAvailableFlights(String origin, String destination)
    {
        boolean flightFound = false;
        
        for(Flight f: this.flights)
        { 		      
           if(f.getNumberOfSeatsLeft() > 0) 
           {
               if((f.getOrigin().equals(origin) && f.getDestination().equals(destination)))
               {
                   System.out.println(f); 
                   flightFound = true;
               }
           }      	
        }
        
        if(!flightFound)
            System.out.println("No flights found from " + origin + " to " + destination);
    }
    
    //getFlight method
    public Flight getFlight(int flightNumber)
    {
        for(Flight f: this.flights) 
        { 		      
           if(f.getFlightNumber() == flightNumber) 
               return f;    	
        }
        return null;
    }
    
    //bookSeat method
    public void bookSeat(int flightNumber, Passenger p)
    {
        boolean flightFound = false;
        
        for(Flight f: this.flights) 
        { 
           if(flightNumber == f.getFlightNumber()) 
           {
               flightFound = true;
               
               if(f.bookASeat()) 
               {
                   System.out.println("**Booking successful**");
                   double price = p.applyDiscount(f.getOriginalPrice()); 
                   Ticket t = new Ticket(p, f, price); 
                   this.tickets.add(t);
                   System.out.println(t);
               }
               else
                   System.out.println("**Booking unsuccessful, flight full**");
           }
        }
        
        if(!flightFound)
            System.out.print("**Booking unsuccessful, invalid flight number**");
    }
    
    //main method
    public static void main(String[] args)
    {
        
        Manager m = new Manager();       
        
        //Testing createFlights
        System.out.println("testing the createFlights method:");
        m.createFlights();
        
        //Testing displayAvailableFlights
        System.out.println("\nTesting the displayAvailableFlights method:");
        System.out.print("Enter origin of flight: ");
        String origin = keyboard.nextLine();
        System.out.print("Enter destination of flight: ");
        String destination = keyboard.nextLine();
        m.displayAvailableFlights(origin, destination);
        
        //Testing getFlight
        System.out.println("\nTesting the getFlight method:");
        System.out.print("Enter flight number: ");
        int flightNum = Integer.parseInt(keyboard.nextLine());
        System.out.println(m.getFlight(flightNum));
        
        // Premade Tests
        System.out.println("\n**Premade Tests**");

        // Test members
        Member test1 = new Member(0, "Jack", 30); // member with 0 years of membership
        Member test2 = new Member(3, "John", 30); // member with 3 years of membership
        Member test3 = new Member(15, "Jake", 30); // member with 15 years of membership
        
        //Test non-members
        NonMember test4 = new NonMember("Bob", 55); // non-member with age of 55
        NonMember test5 = new NonMember("Beth", 75); // non-member with age of 75
        
        //Test person for overbooked case
        NonMember test6 = new NonMember("Caleb", 20);        
        
        // Test flight
        int capacity = 5;
        System.out.println("\nCreating test flight:");
        System.out.println("Flight created: " + m.flights.add(new Flight(10, "Calgary", "Toronto", "January 31, 2023 8:00 AM", capacity, 200)));
        System.out.println("Flight info: " + m.getFlight(10) + " Capacity: " + capacity);
        
        //Testing bookSeat for members
        System.out.println("\nTesting bookSeat method with a new member:");
        m.bookSeat(10, test1);
        System.out.println("Testing bookSeat method with a member of 3 years:");
        m.bookSeat(10, test2);
        System.out.println("Testing bookSeat method with member of 15 years:");
        m.bookSeat(10, test3);
        
        //Testing bookSeat non-members
        System.out.println("Testing bookSeat method with a non-member of age 55:");
        m.bookSeat(10, test4);
        System.out.println("Testing bookSeat method with a non-member of age 75:");
        m.bookSeat(10, test5);        
        
        //Testing overbooked case
        System.out.println("\nTesting overbooking case:");
        m.bookSeat(10, test6);
        
        //Testing getFlight with unknown flight number
        System.out.println("\nTesting the getFlight method with unknown flight number:");
        System.out.println("Return info of flight number 100: " + m.getFlight(100));
        
        //Testing displayAvailableFlights with unknown origin and destination
        System.out.println("\nTesting the displayAvailableFlights method with unknown origin and destination:");
        System.out.println("Display available flights from Toronto to Calgary:");
        m.displayAvailableFlights("Toronto", "Calgary");
    
        //Testing displayAvailableFlights with full capacity flight
        System.out.println("\nTesting the displayAvailableFlights method with full capacity flight:");
        System.out.println("Display available flights from Calgary to Toronto: ");
        m.displayAvailableFlights("Calgary", "Toronto");
    }
    
}