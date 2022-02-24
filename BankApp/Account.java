package BankApp;

import java.util.Scanner;


public class Account {
	// Class Variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	//Class Constructor
	Account(String CName, String CID) {
		customerName = CName;
		customerID = CID;
		
	}
	
	//Function for depositing money
	void deposit(int ammount) {
		if (ammount !=0) {
			balance = balance + ammount;
			previousTransaction = ammount;
			
		}
	}
	
	// Function to withdraw money
	void withdraw(int amount) {
		if (amount !=0) {
			balance = balance - amount;
			previousTransaction = - amount; 
		}
	}
	
	// Function to show previous transactions
	void getpreviousTransaction( ) {
		if (previousTransaction > 0) {
			System.out.println("Deposited:" + previousTransaction);
			
		}else if (previousTransaction <0) {
			System.out.println("Withdrawn:" + previousTransaction);
		}else {
			System.out.println("No transaction occured");
		}
	}
	
	// Function for calculating interest of current funds after certain number of years
	void calculateInterest(int years) {
		double interestRate = .115;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + "years" + " , your balance will be " + "#"+newBalance);
	}
	
	//Function to show main menu
	void showMenu( ) {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome: " + customerName + "!");
		System.out.println("Your ID :" + customerID);
		System.out.println();
		System.out.println("What would you like to do?:");
		System.out.println();
		System.out.println("A. check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");
		
		do {
			System.out.println();
			System.out.println("Enter an option:");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch (option) {
			//Case 'A' allows user to check their balance
			case 'A':
				System.out.println("====================");
				System.out.println("Balance =  # " + balance);
				System.out.println("====================");
				System.out.println();
				break;
			
				//Case 'B' allows user to deposit money
				
			case 'B': 
				System.out.println("Enter amount to deposit:");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
				
			//Case 'C' allows user to withdraw money from their account
			case 'C':
				System.out.println("Enter amount to withdraw:");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
				
			//Case 'D' allows user to view recent transaction
			case 'D':
				System.out.println("====================");
				getpreviousTransaction();
				System.out.println("====================");
				System.out.println();
				break;
				
			//Case 'E'  calculates the accured interest	
			case 'E':
				System.out.println("Enter how many years of accured interest:");
				int years = scanner.nextInt();
				calculateInterest(years);
				break;
			
			//Case 'F' exits the user from their account
			case 'F':
				System.out.println("====================");
				break;
				
			//The defaul value let's the user know that they entered invalid option
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, D, E, F");
				break;
				
			}

		}while (option !='F');
		System.out.println("Thank you for banking with us!");	
	
	}	
}	
			
			 


