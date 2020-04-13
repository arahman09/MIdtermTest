package design;

import design.Benefits;
import design.Employee;

public class EmployeeInfo extends Benefits implements Employee {

	/*
	 * This class can be implemented from Employee interface then add additional
	 * methods in EmployeeInfo class. Also, Employee interface can be implemented
	 * into an abstract class.So create an Abstract class then inherit that abstract
	 * class into EmployeeInfo class.Once you done with designing EmployeeInfo
	 * class, go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the OOP(abstraction,Encapsulation, Inheritance and
	 * Polymorphism) concepts in every level possible. Use all kind of
	 * keywords(super,this,static,final........) Implement Nested class. Use
	 * Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */

	int employeeID;
	String name;
	private String department;
	private String jobTitle;
	private String address;
	private int yearsWorked;
	//String address;

	private static String companyName;
	final static int SALARY = 10000;
	double GrossSalary = 0.0;


	/*
	 * You must implement the logic for below 2 methods and following 2 methods are
	 * prototype as well for other methods need to be design, as you will come up
	 * with the new ideas.
	 */

	/*
	 * you must have multiple constructor. Must implement below constructor.
	 */


	public EmployeeInfo() {
	}


	public EmployeeInfo(String companyName) {

		this.companyName = companyName;

		System.out.println("\n\t\t\t\t\t\t\t" + companyName + "\n");
		System.out.println("Name" + "\t" + "ID Number" + "\t\t"
				+ "Department       	Job Title     	Address      Pension      Bonus" + "\t\t"
				+ "Total salary      \n");


	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		this.employeeID = employeeId;
	}



	public EmployeeInfo(int employeeID, String name, String department, String jobTitle, String address) {

		this.employeeID = employeeID;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		//this.address = yearsWorked;
		this.address = address;

	}






	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the
	 * logic. Hints: 10% of the salary for best performance, 8% of the salary for
	 * average performance and so on. You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */

	public double calculateEmployeeBonus() {
		double total = SALARY;

		double salary = SALARY;
		int n = yearsWorked;

		if (n >= 15) {
			total = salary * .30;
		} else if (n >= 10)
			total = salary * .25;
		else
			total = salary * .20;

		return total;
	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of
	 * years with the company. Then it will return the total pension. So you need to
	 * implement the logic. Hints: pension will be 5% of the salary for 1 year, 10%
	 * for 2 years with the company and so on.
	 *
	 */
	public int calculateEmployeePension() {
		int total = 0;
		int n = yearsWorked;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter start date in format (example: May,2015):
		// ");
		// String joiningDate = sc.nextLine();
		// System.out.println("Please enter today's date in format (example:
		// August,2017): ");
		// System.out.println("Please enter how many years you work");
		// int year = Integer.parseInt(sc.nextLine());
		// String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		// String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		// implement numbers of year from above two dates
		// Calculate pension

		if (n <= 5) {
			total = (int) (SALARY * .40);
		} else if (n <= 10) {
			total = (int) (SALARY * .55);

		} else if (n <= 15) {
			total = (int) (SALARY * .50);
		} else
			total = (int) (SALARY * .35);

		return total;
	}




	@Override
	public int employeeId() {
		return employeeID;
	}

	public void setEmployeeId(int n) {
		this.employeeID = n;
	}

	@Override
	public String employeeName() {
		return name;
	}

	public void setEployeeName(String name) {
		this.name = name;
	}

	public void address(String address) {

		this.address = address;
	}

	public void assignDepartment(String department) {

		this.department = department;

	}

	@Override
	public void assignDepartment() {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

//display all value

	public void display() {
		System.out.println("Comapany name:" + companyName);
		System.out.println("Employee name:" + name);
		System.out.println("Employee ID:" + employeeID);
		System.out.println("Position: " + jobTitle);
		System.out.println("Employee Department:" + department);
	}







	@Override
	public int calculateSalary() {

		int total = SALARY + (int) calculateEmployeeBonus() - (calculateEmployeePension());

		return total;

	}

	@Override
	public void benefitLayout() {
		System.out.println("GOOD HEALTH CARE .   Travel Expenses, Free Food Expenses ");
	}






	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}


	@Override
	public String address() {
		return address;

	}

}

