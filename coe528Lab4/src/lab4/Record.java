/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author sanchit
 */

public class Record
{

	private String filename;
	private static Record instance = null;

	private Record(String n)
	{
		this.filename = n;
	}

	// Effects: Checks if a Record object is already created.
	// If there is no Record object, one is created. Otherwise,
	// no change is made.
	public static Record getInstance()
	{
		if(instance == null)
			instance = new Record("record.txt");

		return instance;
	}

	// Effects: Reads and prints the contents of the associated
	// file to the standard output.
	public void read()
	{
		try
		{
			FileReader r = new FileReader(this.filename); 
			Scanner s = new Scanner(new File(this.filename)); 

			while(s.hasNextLine()) 
				System.out.println(s.nextLine()); 
			 
			s.close();
			r.close();
		}
		catch (IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// Effects: Appends the specified message, msg, to the
	// associated file.
	public void write(String msg)
	{
		try
		{
			FileWriter w = new FileWriter(this.filename, true);
			w.write(msg); 
			w.close();
		}
		catch (IOException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		// Fill the blank below that obtains the sole instance
		// of the Record class.
		// (You should not invoke the Record constructor here.)
		Record r = Record.getInstance();
		// Do not modify the code below
		r.write("Hello-1\n");
		r.write("Hello-2\n");
		System.out.println("Currently the file record.txt " + "contains the following lines:");
		r.read();
	}
}
