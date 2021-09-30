public class People {
	
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected double payRate;
	protected double monthlyPay;
	
	
	public People(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.payRate = 0;
		this.monthlyPay = 0;
	}
	
	public void calculatePay() {
		this.monthlyPay = 0;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName +"\nPhone: " + phoneNumber;
	}

}
