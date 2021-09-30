import java.util.*;
public class Faculty extends Employee{
	
	private String department;
	ArrayList<String> classesTeach = new ArrayList<String>();
	
	private static int numberOfClasses = 0;
	
	public Faculty(String firstName, String lastName, String phoneNumber, double payRate, int payScale, String department) {
		super(firstName, lastName, phoneNumber, payRate, payScale);
		this.department = department;
	}
	
	public void addClass(String nameOfClass) {
		classesTeach.add(nameOfClass);
		numberOfClasses++;
	}
	
	public void calculatePay() {
		monthlyPay = payRate/payScale + 500*numberOfClasses; 
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nClasses Taught: " + classesTeach + "\nMonthly Pay: " + monthlyPay;
	}

}
