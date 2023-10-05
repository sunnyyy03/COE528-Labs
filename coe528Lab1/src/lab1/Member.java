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

public class Member extends Passenger {
    
    //Instance Variables
    private int yearsOfMembership;
    
    //Constructor
    public Member(int yearsOfMembership, String name, int age)
    {
	super(name, age);
	this.yearsOfMembership = yearsOfMembership;
    }
    
    //Ovveridden applyDiscount method
    @Override
    public double applyDiscount(double p){
        if(this.yearsOfMembership > 5){
            return p*0.5;
        }
        else if(this.yearsOfMembership > 1 && this.yearsOfMembership <= 5){
            return p*0.9;
        }
        else
            return p;
    }    
    
}
