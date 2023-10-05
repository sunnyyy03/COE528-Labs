/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.ArrayList;
/**
 *
 * @author sanchit
 */
public class FoodCategory extends FoodComponent
{
    protected ArrayList<FoodComponent> components = new ArrayList();
    private double total;

    public FoodCategory(String categoryName)
    {
        this.name = categoryName;
    }

    @Override
    public double getPrice()
    {
        this.total = 0;

        for(FoodComponent c: this.components)
            this.total += c.getPrice();

        return this.total;
    }

    @Override
    public void print(int level)
    {
        for(int i = 0; i < level; i++)
            System.out.print("\t");

        System.out.print("FoodCategory: (" + this.name + ", " + this.getPrice() + ") contains: \n");

        for(int i = 0; i < this.components.size(); i++)
            this.components.get(i).print(level + 1);
    }

    public void add(FoodComponent c)
    {
        this.components.add(c);
    }

    public void remove(FoodComponent c)
    {
        this.components.remove(c);
    }
}