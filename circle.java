package Task_10;

import java.util.Scanner;

public class circle {
    //initialising attributes 
    private double radius;
    private double pi;
    //default constructor 
    public circle(){
        this.radius=0;
        this.pi = Math.PI;
    }
    //parameter constructor 
    public circle(double radius, double pi){
        this.radius=radius;
        this.pi = Math.PI;

    }
   // getters and setters method 
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getPi(){
        return pi;
    }
    public void setPi(double pi){
        this.pi=pi;
    }
     //method to implement circumference 
     public double circleCircumference(){
        return 2* pi *radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius=sc.nextDouble();
        sc.close();
        circle circle =new circle();
        circle.setRadius(radius);
        System.out.print("The circumference of the circle is: "+ circle.circleCircumference());

    }
    
}
