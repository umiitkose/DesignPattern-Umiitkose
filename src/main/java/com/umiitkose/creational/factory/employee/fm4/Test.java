package com.umiitkose.creational.factory.employee.fm4;

import com.umiitkose.creational.factory.employee.fm1.Employee;
import com.umiitkose.creational.factory.employee.fm1.PayrollOffice;

import java.util.List;


public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();
		
		// Add more employees
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Employee"));
		hr.addNewEmployee(EmployeeFactory.create("Manager"));
		hr.addNewEmployee(EmployeeFactory.create("Manager"));
		hr.addNewEmployee(EmployeeFactory.create("Director"));
		
		hr.listEmployees();

		System.out.println();
		
		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
	}
}
