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

public abstract class Passenger {
    
    //Instance Variables
    private String name;
    protected int age;
    
    //Constructor
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //Getters & Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //applyDiscount method
    public abstract double applyDiscount(double p);
    
}
