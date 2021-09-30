import java.util.*;
public class University {

	public static void main(String args[])
	{
		String univ_Name, location;
		ArrayList<People> people = new ArrayList<People>();
		char choice = 'A';
		String line;
		Scanner scan = new Scanner(System.in);
		
		// read the name and the location of the university here
		System.out.println("What is the name of the University?");
		univ_Name = scan.nextLine();
		System.out.println("What is the location of the University?");
		location = scan.nextLine();
		
		//I know it's not in the UML framework, but it makes more sense to keep track of it here
		int numberOfStudents = 0;
		int numberOfFaculty = 0;
		int numberOfStaff = 0;


	do{
		System.out.print("What action would you like to perform?\n");
        printMenu();
        line = scan.nextLine();

        if (line.length() == 1)
         {
          choice = line.charAt(0);
          choice = Character.toUpperCase(choice);

		switch(choice)
		{
		case 'A':
			// add a Student here
			/* read the first name, last name, phone number, major as parameters and then call the
			 * constructor of the Student class to create the instance
			 * then read the gpa, call setGpa method of the student to set the gpa
			 * finally add the student instance to the people list
			 */
			System.out.println("Enter first Name:");
			String firstName = scan.nextLine();
			System.out.println("Enter last name:");
			String lastName = scan.nextLine();
			System.out.println("Enter phone number:");
			String phoneNumber = scan.nextLine();
			System.out.println("Enter major:");
			String major = scan.nextLine();
			
			Student s1 = new Student(firstName, lastName, phoneNumber, major);
			
			System.out.println("Enter GPA:");
			double gpa = scan.nextDouble();
			scan.nextLine(); //Eat up extra line
			
			s1.setGpa(gpa);
			people.add(s1);
			numberOfStudents++;
			
			System.out.println("\nNumber of total people: " + people.size() + "\n");

			break;
		case 'B':
			// add a Staff here
			/* read the first name, last name, phone number, payRate, payScale, and title and then call the
			 * constructor of the Staff class to create the instance
			 * finally add the Staff instance to the people list
			*/
			System.out.println("Enter first Name:");
			firstName = scan.nextLine();
			System.out.println("Enter last name:");
			lastName = scan.nextLine();
			System.out.println("Enter phone number:");
			phoneNumber = scan.nextLine();
			System.out.println("Enter pay rate:");
			double payRate = scan.nextDouble();
			
			int payScale = 9;
			int entry = 0;
			do {
				System.out.println("Enter pay scale of either 9 or 12:");
				entry = scan.nextInt();
				if(entry == 9 || entry == 12)
					payScale = entry;
				else 
					System.out.println("This is an invalid entry");
			} while 
				(entry != 9 && entry != 12);
			scan.nextLine();//eat up line
			
			System.out.println("Enter title:");
			String title = scan.nextLine();
			
			Staff st1 = new Staff(firstName, lastName, phoneNumber, payRate, payScale, title);
			st1.calculatePay();
			
			people.add(st1);
			numberOfStaff++;
			
			System.out.println("\nNumber of total people: " + people.size() + "\n");

			break;
		case 'C':
			// add a Faculty here
			/* read the first name, last name, phone number, payRate, payScale, and department and then call the
			 * constructor of the Faculty class to create the instance
			 * read list of courses the instructor read and call the addClass method
			 * of the faculty to add classes
			 * finally add the Faculty instance to the people list
			*/
			System.out.println("Enter first Name:");
			firstName = scan.nextLine();
			System.out.println("Enter last name:");
			lastName = scan.nextLine();
			System.out.println("Enter phone number:");
			phoneNumber = scan.nextLine();
			System.out.println("Enter pay rate:");
			payRate = scan.nextDouble();
			
			payScale = 9;
			entry = 0;
			do {
				System.out.println("Enter pay scale of either 9 or 12:");
				entry = scan.nextInt();
				if(entry == 9 || entry == 12)
					payScale = entry;
				else 
					System.out.println("This is an invalid entry");
			} while 
				(entry != 9 && entry != 12);
			
			scan.nextLine(); //Consume line
			System.out.println("Enter department:");
			String department = scan.nextLine();
			
			Faculty f1 = new Faculty(firstName, lastName, phoneNumber, payRate, payScale, department);
			f1.calculatePay();
			
			people.add(f1);
			numberOfFaculty++;
			
			System.out.println("\nNumber of total people: " + people.size() + "\n");


			break;

		case 'D':
			// display university info
			/* university name, location, number of students, number of faculty and number of
			 *staff
			 */
			System.out.println("University Name: " + univ_Name + "\nLocation: " + location + "\nNumber of Students: " + numberOfStudents 
					+ "\nNumber of Faculty: " + numberOfFaculty + "\nNumber of Staff: " + numberOfStaff +"\n");

			break;
		case 'E':
			// display people info
			/* display the fist name and the last name of each person at school
			 *
			 */
			for(int i = 0; i < people.size(); i++) {
				People p = people.get(i);
				System.out.println(p.getName());
			}

			break;

		case 'F':
			// display Student info
			/* display fist name, last name, and the major of each student
			 * java has a construct called instanceof. That construct can determine
			 * the object instance type
			 * example:
			 *  String str = new String("hello");
			 *  if(str instanceof String) will be evaluated to true
			 */
			for(int i = 0; i < people.size(); i++) {
				People p = people.get(i);
				if(p instanceof Student)
					System.out.println(p.toString());
			}
			break;

		case 'G':
			// display Employee info
			/* display fist name, last name, pay rate, and monthly pay of each employee
			 *
			 */
			for(int i = 0; i < people.size(); i++) {
				People p = people.get(i);
				if(p instanceof Employee)
					System.out.println(p.toString());
			}

			break;

		case 'Q':
			// quit the program

			break;
		case '?':
			printMenu();

			break;

		default:
			System.out.println("default");

		}


        } else
		     {
        	     System.out.print("Unknown action\n");
		     }

		}while(choice != 'Q');
	scan.close();

	}
	 public static void printMenu()
	   {
	     System.out.print("Choice\t\tAction\n" +
	                        "------\t\t------\n" +
	                        "A\t\tAdd a Student\n" +
	                        "B\t\tAdd a Staff\n" +
	                        "C\t\tAdd a Faculty\n"+
	                        "D\t\tDisplay University  Info\n" +
	                        "E\t\tDisplay University People Info\n" +
	                        "F\t\tDisplay University Student Info\n" +
	                        "G\t\tDisplay University Employee Info\n" +
	                        "Q\t\tQuit\n" +
	                        "?\t\tDisplay Menu Again\n\n");
	  }

}