package EmailApp;

import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLenght = 10;
	private String companysuffix= "anycompany.com";
		
	 
	// Constructor to recieve firstname and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName  = lastName; 
		
		// call a method for asking Department and return Department
		this.department= setDepartment();
		System.out.println("Department" + " " +this.department);
		// call a method to  generate paasword
		this.password = randomPassword(defaultPasswordLenght);
		System.out.println("your password is:" + " " + password);
		
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() +companysuffix;
		
	}
	
	// Ask fo department
	private String setDepartment() {
		System.out.println("New worker :" + firstName + " " + lastName + "\nEnter Department code:\n1 for sales\n2 for Developement\n3 for Acctounting \n0 for none\n enter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2) { return "dev";}
		else if (depChoice == 3) { return "acct";}
		else {return "";}
		
	}
	// Generate random password
	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";
		char [] password = new char[lenght];
		for (int i=0; i<lenght; i++) {
			int rand =(int) (Math.random ()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
		
	}
	
	// Set mailboxcapacity
	public void setmMilboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
		
	}
	
	// Set alternate email
	public void setAlternateEmail(String altmail) {
		this.alternateEmail= altmail;
		
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
		
	}
	public int getmalBoxCapacity() {return mailBoxCapacity;}
	public String getalternateEmail() {return alternateEmail;}
	public String getchangePassword( ) {return password;}
	
	public String showInfo() {
		return "ProfileName:" + firstName + " " + lastName +
				"\nCompanyMail:"+ " "+ email +
				"\nmailBoxCapcity:" + mailBoxCapacity + "mb";
	}

}
