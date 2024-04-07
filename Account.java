package Task_10;

import java.util.Scanner;

public class Account {
    private double balance;
    private String accountnumber;
    //creating default and argument constructor 
    public Account(){

    }
    public Account(double balance, String accountnumber){
        this.balance=balance;
        this.accountnumber =accountnumber;
    }
    //getters method 
    public double getBalance(){
       return balance;
    }
   
    public String getAccountnumber(){
        return accountnumber;
    }
    //method to withdraw money

    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance -=amount;
            System.out.println("Withdrawn: "+amount+" Total amount: "+balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
    //methods to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount+" Total amount: "+balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        String accountnumber =sc.nextLine();
        System.out.println("Enter the Balance");
        double balance = sc.nextDouble();
        sc.close();
        //object created for class account 
        Account account = new Account(balance,accountnumber);

        System.out.println("Acount Number: "+ account.getAccountnumber());
        System.out.println("Current Balance: "+account.getBalance());
        
        account.deposit(900);
        account.withdraw(200);
    }

    
}
