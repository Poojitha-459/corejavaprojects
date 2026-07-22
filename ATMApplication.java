package com.projects1;

import java.util.Scanner;

import com.projects1.BankApplication;

class BankApplication{
    int accountnumber;
    double balance = 5000.00;   
    int pin=4563;

    Scanner sc = new Scanner(System.in);
boolean validatepin() {
System.out.println("entered a pin:");
int enteredpin=sc.nextInt();
if(enteredpin==pin) {
	return true;
}else {
System.out.println("wrong pin");
return false;
}
}
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit() {
        System.out.println("Enter deposit amount:");
        double amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("total amount in my account:"+balance);
    }

    void withdraw() {
        System.out.println("Enter withdraw amount:");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("total balance is:"+balance);
        } else { 
            System.out.println("Insufficient balance");
        }
    }
        void menu() {
        int choice;
       
	       do {
	    	   System.out.println("1.deposit");
	    	   System.out.println("2.withdraw");
	    	   System.out.println("3.balance");
	    	   System.out.println("4.exit");
	    	   System.out.println("enter choice");
	    	   choice=sc.nextInt();
	    	   switch(choice){
	    		   case 1:
	    			   deposit();
	    		   break;
	    		   case 2:
	    			   withdraw();
	    		   break;
	    		   case 3: 
	    			   checkBalance();
	    		   break;
	    		   case 4:
	    			   System.out.println("thank you!!! you are exit");
	    		   break;
	    		   default:
	    			   System.out.println("invalid");
	    	   
	    	   }
	       }while(choice!=4);
        }
}
public class ATMApplication {

	public static void main(String[] args) {
		BankApplication a1 = new BankApplication();
        System.out.println("!!! Welcome !!!");
       if(a1.validatepin()){
        a1.menu();
       
       }
       else {
    	   System.out.println("Access retricted");
       }
    }
 

	}


