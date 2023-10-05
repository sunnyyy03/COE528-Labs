/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.ArrayList;

/**
 *
 * @author sanchit
 */

public class QueueOfDistinctStrings {
    
    // Overview: QueueOfDistinctStrings are mutable, bounded
	// collection of distinct strings that operate in
	// FIFO (First-In-First-Out) order.
	
	// The abstraction function is:
	// AF(c) = an abstract collection d (where c is a Java QueueOfDistinctStrings object)
	//		   where c.items is an ArrayList containing the distinct Strings placed in the queue
	
	// The rep invariant is:
	// RI(c) = true if items.get(i) != items.get(j), where i is the index of 
	//		   any String contained in items and j is every other
	//		   index that is not i (ie. there must be no duplicate Strings in items).
	//		 = false otherwise
	
	// Representation (rep)
	private ArrayList<String> items;
	
	// Constructors
	// EFFECTS: Creates a new QueueOfDistinctStrings object
	public QueueOfDistinctStrings()
	{
		items = new ArrayList<String>();
	}
	
	// MODIFIES: this
	// EFFECTS: Appends the element at the end of the queue
	// if the element is not in the queue, otherwise
	// does nothing.
	public void enqueue(String element) throws Exception
	{
		if(element == null)
		{
			throw new Exception();
		}
		if(false == items.contains(element))
		{
			items.add(element);
		}
	}

	// MODIFIES: this
	// EFFECTS: Removes an element from the front of the queue
	public String dequeue() throws Exception
	{
		if(items.size() == 0)
		{
			throw new Exception();
		}
		return items.remove(0);
	}
	
	// EFFECTS: Returns true if the rep invariant holds for this
	// object; otherwise returns false
	public boolean repOK()
	{
		for(int i = 0; i < items.size(); i++)
		{
			for(int j = i + 1; j < items.size(); j++)
			{
				if(items.get(i).equals(items.get(j)))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	// EFFECTS: Returns a string that contains the strings in the
	// queue, the front element and the end element.
	// Implements the abstraction function.
	@Override
	public String toString()
	{
		return items.toString() + "\tFront of queue: " + items.get(0) + "\tEnd of queue: " + items.get(items.size() - 1);
	}
	
        
}
