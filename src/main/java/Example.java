/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tienm
 */
class Customer {
    private String name;
    private float x;

    public Customer(String name) {
            this.name = name;
    }
    public Customer(String name, float x) {
            this.name = name;
            this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    
}
 
/* Name of the class has to be "Main" only if the class is public. */
public class Example
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Customer customer = new Customer("Albert", 10);
		System.out.println("Welcome "+customer.getName());
	}
}
