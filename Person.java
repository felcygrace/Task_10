package Task_10;

import java.util.Scanner;

//Creating the class Person
public class Person {
    //name and age are attributes
    private String name;
    private int age;
    //creating default constructor
    public Person(){
        
    }
    
    //creating a parameter constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        sc.close();
        //creating an object 
        Person person = new Person(name,age);
        //accessing attributes using getters
        System.out.print("Name: "+person.getName()+" Age: "+person.getAge());

    }

}
