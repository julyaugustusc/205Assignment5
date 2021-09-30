
public class Student extends People{
	
	private String major;
	private double gpa;
	
	public Student(String firstName, String lastName, String phoneNumber, String major) {
		super(firstName, lastName, phoneNumber);
		this.major = major;
		this.gpa = 0.0;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void changeMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\tMajor: " + major; 
			// + "\nGPA: " + gpa + "\n Phone Number: " + phoneNumber;
	}
	//YES I purposely took out the phone number and GPA because these are not asked for 
	//in any case in university.java and it's too bulky, I did show how I would code it though.

}
