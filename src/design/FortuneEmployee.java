package design;

import design.EmployeeInfo;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create
	 * Object from EmployeeInfo class to use fields and attributes.Demonstrate as
	 * many methods as possible to use with proper business work flow.Think as a
	 * Software Architect, Product Designer and as a Software
	 * Developer.(employee.info.system) package is given as an outline,you need to
	 * elaborate more to design an application that will meet for fortune 500
	 * Employee Information Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws NullPointerException {

		// default constructor
		EmployeeInfo employeeInfo = new EmployeeInfo();
		EmployeeInfo employeeInfo1 = new EmployeeInfo(" FORTUNE COMPANY ");

		EmployeeInfo emp1 = new EmployeeInfo(1, "Abrah Lincoln", "Accounts", "Manager", "Hodgenville, KY");
		EmployeeInfo emp2 = new EmployeeInfo(2, "John F Kenedey", "Marketing", "Executive", "Brookline, MA");
		EmployeeInfo emp3 = new EmployeeInfo(3, "Franklin D Rossevelt", "Customer Realation", "Assistnt Manager",
				"Hyde Park, NY");


		// Printing Employee information in this pattern
		// "ID Name Number Department Position Years Worked Pension Bonus Total salary "

		System.out.println(emp1.employeeId() + "\t" + emp1.employeeName() + "\t\t" + emp1.getDepartment() + "\t\t"
				+ emp1.getJobTitle() + "\t\t\t" + emp1.getYearsWorked() + "\t\t" + emp1.calculateEmployeePension()
				+ "\t" + emp1.calculateEmployeeBonus() + "\t\t" + emp1.calculateSalary());

		System.out.println(emp2.employeeId() + "\t" + emp2.employeeName() + "\t\t" + emp2.getDepartment() + "\t\t"
				+ emp2.getJobTitle() + "\t\t" + emp2.getYearsWorked() + "\t\t" + emp2.calculateEmployeePension() + "\t "
				+ emp2.calculateEmployeeBonus() + "\t\t" + emp2.calculateSalary());

		System.out.println(emp3.employeeId() + "\t" + emp3.employeeName() + "\t" + emp3.getDepartment() + "\t"
				+ emp3.getJobTitle() + "\t" + emp3.getYearsWorked() + "\t\t " + emp3.calculateEmployeePension() + "\t"
				+ emp3.calculateEmployeeBonus() + " \t\t" + emp3.calculateSalary());



	}

}
