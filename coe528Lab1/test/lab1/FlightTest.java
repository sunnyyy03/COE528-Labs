/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sanchit
 */

public class FlightTest
{
    public FlightTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}

    @Test
    public void testConstructor()
    {
	System.out.println("testConstructor");
	boolean exceptionThrown = false;
	try
	{
	   Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1); 
	}
	catch(IllegalArgumentException e)
	{
	    exceptionThrown = true;
	}
	assertTrue(!exceptionThrown);
    }
    
    /**
     * Test of Flight constructor
     */
    @Test
    public void testInvalidConstructor()
    {
	System.out.println("testInvalidConstructor");
	boolean exceptionThrown = false;
	try
	{
	   Flight f = new Flight(1, "[Origin]", "[Origin]", "01/01/01 01:01:01", 1, 1); 
	}
	catch(IllegalArgumentException e)
	{
	    exceptionThrown = true;
	}
	assertTrue(exceptionThrown);
    }
    
    /**
     * Test of bookASeat
     */
    @Test
    public void testBookASeat()
    {
	System.out.println("bookASeat");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	boolean expResult = true;
	boolean result = f.bookASeat();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of toString
     */
    @Test
    public void testToString()
    {
	System.out.println("testToString");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	String expResult = "Flight 1, [Origin] to [Destination], 01/01/01 01:01:01, Original Price: 1.0";
        String result = f.toString();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getFlightNumber
     */
    @Test
    public void testGetFlightNumber()
    {
	System.out.println("getFlightNumber");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	int expResult = 1;
	int result = f.getFlightNumber();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of setFlightNumber
     */
    @Test
    public void testSetFlightNumber()
    {
	System.out.println("setFlightNumber");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setFlightNumber(2);
	int expResult = 2;
	int result = f.getFlightNumber();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getOrigin
     */
    @Test
    public void testGetOrigin()
    {
	System.out.println("getFlightNumber");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	String expResult = "[Origin]";
	String result = f.getOrigin();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of setOrigin
     */
    @Test
    public void testSetOrigin()
    {
	System.out.println("setFlightNumber");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setOrigin("[Origin2]");
	String expResult = "[Origin2]";
	String result = f.getOrigin();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getDestination
     */
    @Test
    public void testGetDestination()
    {
	System.out.println("getDestination");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	String expResult = "[Destination]";
	String result = f.getDestination();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of setDestination
     */
    @Test
    public void testSetDestination()
    {
	System.out.println("setDestination");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setDestination("[Destination2]");
	String expResult = "[Destination2]";
	String result = f.getDestination();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getDepartureTime
     */
    @Test
    public void testGetDepartureTime()
    {
	System.out.println("getDepartureTime");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	String expResult = "01/01/01 01:01:01";
	String result = f.getDepartureTime();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of setDepartureTime
     */
    @Test
    public void testSetDepartureTime()
    {
	System.out.println("setDepartureTime");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setDepartureTime("02/02/02 02:02:02");
	String expResult = "02/02/02 02:02:02";
	String result = f.getDepartureTime();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getCapacity
     */
    @Test
    public void testGetCapacity()
    {
	System.out.println("getCapacity");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	int expResult = 1;
	int result = f.getCapacity();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of setCapacity
     */
    @Test
    public void testSetCapacity()
    {
	System.out.println("setFlightNumber");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setCapacity(2);
	int expResult = 2;
	int result = f.getCapacity();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of getOriginalPrice
     */
    @Test
    public void testGetOriginalPrice()
    {
	System.out.println("getOriginalPrice");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	double expResult = 1;
	double result = f.getOriginalPrice();
	assertEquals(expResult, result, 0);
    }
    
    /**
     * Test of setOriginalPrice
     */
    @Test
    public void testSetOriginalPrice()
    {
	System.out.println("setOriginalPrice");
	Flight f = new Flight(1, "[Origin]", "[Destination]", "01/01/01 01:01:01", 1, 1);
	f.setOriginalPrice(2);
	double expResult = 2;
	double result = f.getOriginalPrice();
	assertEquals(expResult, result, 0);
    }
    
}

