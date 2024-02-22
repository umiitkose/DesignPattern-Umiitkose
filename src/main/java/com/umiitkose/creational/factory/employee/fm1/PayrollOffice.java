package com.umiitkose.creational.factory.employee.fm1;

/**
 * A class that represents the payroll office in a company.
 * @author akin
 *
 */
public class PayrollOffice {

	public void paySalary(Employee employee) {
		String name = employee.getName();
		String department = employee.getDepartment();
		double salary = employee.calculateSalary();
		
		System.out.println("Paying " + salary + " to " + name + " in " + department);
	}
}
