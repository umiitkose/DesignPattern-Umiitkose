package com.umiitkose.creational.factory.employee.fm1;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();
		
		Factory employeeFactory = new EmployeeFactory();
		Factory managerFactory = new ManagerFactory();
		Factory directorFactory = new DirectorFactory();

		// Add more employees
		hr.addNewEmployee(employeeFactory.create());
		hr.addNewEmployee(employeeFactory.create());
		hr.addNewEmployee(employeeFactory.create());
		hr.addNewEmployee(managerFactory.create());
		hr.addNewEmployee(managerFactory.create());
		hr.addNewEmployee(directorFactory.create());
		
		hr.listEmployees();

		System.out.println();
		
		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
	}
}
