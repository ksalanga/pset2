/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner; 
public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String first = in.nextLine();
		System.out.println("Enter your Last Name: ");
		String last = in.nextLine();
		System.out.println("Hello, " + first + " " + last + "!");
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("Homework Grade: ");
		double homework = in.nextDouble();
		System.out.println("Quiz Grade: ");
		double quiz = in.nextDouble();
		System.out.println("Test Grade: ");
		double testgrade = in.nextDouble();
		double grade = (double) testgrade * .55 + quiz * .3 + homework * .15;
		System.out.println(grade + "%");
	}
	
	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.println("How many students will be attending?");
		double students = in.nextDouble(); 
		System.out.println("How many teachers will be attending?");
		double teachers = in.nextDouble(); 
		in.nextLine(); 
		
		int buses = (int) Math.ceil((students + teachers) / 46); 
		System.out.println("You need " + buses + " buses for the trip!");
		System.out.println(" ");
	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first name?"); 
		String first = in.nextLine(); 
		System.out.println("What is your last name?");
		String last = in.nextLine(); 
		System.out.println("What grade are you in?");
		String grade = in.nextLine(); 
		System.out.println("How old are you?");
		String age = in.nextLine(); 
		System.out.println("What is your hometown?");
		String hometown = in.nextLine(); 
		
		System.out.println("NAME     : " + first + " " + last);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
		System.out.println(" ");
	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		char first = in.nextLine().charAt(0); 
		System.out.print("Enter your middle name: ");
		char middle = in.nextLine().charAt(0);
		System.out.print("Enter your last name: ");
		char last = in.nextLine().charAt(0);
		
		System.out.println("Your initials are " + first + middle + last + "!");
		in.close();
	}
}

