package com.umiitkose.creational.factory.employee.fm3;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();
		
		EmployeeFactory employeeFactory = new EmployeeFactoryImpl();
		ManagerFactory managerFactory = new ManagerFactoryImpl();
		DirectorFactory directorFactory = new DirectorFactoryImpl();

		// Add more employees
		hr.addNewEmployee(employeeFactory.create("Ali"));
		hr.addNewEmployee(employeeFactory.create("Lale"));
		hr.addNewEmployee(employeeFactory.create("Metin"));
		hr.addNewEmployee(managerFactory.create("Kemal", "Sales"));
		hr.addNewEmployee(managerFactory.create("Betul", "Strategy"));
		hr.addNewEmployee(directorFactory.create("Sami", "Management", 10_000));
		
		hr.listEmployees();

		System.out.println();
		
		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
	}
}
