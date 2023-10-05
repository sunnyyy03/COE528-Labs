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

public class NonMember extends Passenger {
    
    //Instance Variables
    int age;
    
    //Constructor
    public NonMember(String name, int age){
        super(name, age);
        this.age = age;
    }
    
    //Ovveridden applyDiscount method
    @Override
    public double applyDiscount(double p){
        if(this.age > 65){
            return p*0.9;
        }
        else
            return p;
    }
    
}
