package Task_10;

import java.util.Scanner;

class Employee {
    //initiating attributes 
    public int id;
    public String firstname;
    public String lastname;
    public int salary;
    // constructor 
    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    //getters method
    public int getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getName(){
        return firstname+lastname;
    }
    public int getSalary(){
        return salary;
    }
    //setters for salary
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnualSalary(){
        return salary*12;
    }
    //method for raise salary
    public int raiseSalary(int percentage){
        double raiseAmount = salary * (percentage / 100.0);
        salary += raiseAmount;
        return salary;
    }
    //method toString 
    public String toString(){
        return "Employee[" +
        "ID: " + id  +","+
        "Name: " + firstname + " " + lastname +","+
        "Salary: " + salary+"]";
        
    }
    public static void main(String[] args) {
        //scanner class to get input from user 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();

        System.out.println("Enter employee first name:");
        String firstname = scanner.next();

        System.out.println("Enter employee last name:");
        String lastname = scanner.next();

        System.out.println("Enter employee salary:");
        int salary = scanner.nextInt();
        System.out.println("Enter the percent raise in salary");
        int percentage = scanner.nextInt();
        scanner.close();
        // creating object for employee class 
        Employee employee = new Employee(id, firstname, lastname, salary);
        
        //print statement to print the output 
        System.out.println("Annual Salary: "+employee.getAnualSalary());
        System.out.println("Raise in Salary:" + employee.raiseSalary(percentage));
        System.out.println(employee.toString());
    }
}
