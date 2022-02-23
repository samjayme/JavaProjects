package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmail;
	 
	// Constructor to recieve firstname and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName; 
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// call a method for asking Department and return Department
		this.department= setDepartment();
		System.out.println("Department" + " " +this.department);
	}
	
	// Ask fo department
	private String setDepartment() {
		System.out.println("Enter Department:\n1 for sales\n2 for Developement\n3 for Acctounting \n0 for none\n enter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2) { return "dev";}
		else if (depChoice == 3) { return "acct";}
		else {return "";}
		
	}
	
	// Set mailboxcapacity
	
	// Set alternate email
	
	// Change the password

}
