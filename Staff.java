
public class Staff extends Employee{
	
	private String title;
	
	public Staff(String firstName, String lastName, String phoneNumber, double payRate, int payScale, String title) {
		super(firstName, lastName, phoneNumber, payRate, payScale);
		this.title = title;
	}
	
	public String toString() {
		return "Name: " + firstName  + " " + lastName +"\nTitle: " + title + "\nMonthly Pay: " + monthlyPay;
	}
	
	public void calculatePay() {
		monthlyPay = payRate/payScale;
	}
	

}
