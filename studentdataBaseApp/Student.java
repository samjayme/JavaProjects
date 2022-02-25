package studentdataBaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private  String studentID;
	private String courses=" "; 
	private int gradeYear;
	private int tuitionBalance =0;
	private int costOfCourses = 600;
	private static int id = 1000;
	
	//Constructor:prompts user to enter student's name and year
	public Student( ) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student's first name:");
		this.firstName = in.nextLine();
		
		System.out.println("Enter last name:");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Somophore\3 - Junior\n4 - Senior\n Enter student class grade:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
		
		
		
	//Generate an ID
	private void  setStudentID(){
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
		
	}
	
	//Enroll in courses
	public void enroll()	{
		//GET inside a loop ,user hit q to quit
		do {
			System.out.println("Enter course to enroll (Q to qiut): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourses;
			}
			else {
				break;
			}
		
		}while (1!=0);
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
		
		
	}

	//View balance 
	public void viewBalance( ) {
		System.out.println("Your balance is: #" + tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		System.out.println("Enter your payment: #");
		Scanner in =new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment; 
		System.out.println("Thank you for payment of #" + payment);
		viewBalance();
	}
	//Show status
	public void showStatus( ) {
		System.out.println("Name:" + firstName+" " + lastName +
				"\nStudentID:" + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: " + tuitionBalance);
		
	}

}  