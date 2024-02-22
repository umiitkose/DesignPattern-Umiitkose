package com.umiitkose.creational.factory.employee.fm4;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;
import com.umiitkose.creational.factory.employee.fm1.Director;
import com.umiitkose.creational.factory.employee.fm1.Employee;
import com.umiitkose.creational.factory.employee.fm1.Manager;


public class EmployeeFactory {

	public static Employee create(String type) {
		Employee employee = null;
		int id = EmployeeRandomizer.createId();
		String name = EmployeeRandomizer.createName();
		int year = EmployeeRandomizer.createYear();
		
		String department = EmployeeRandomizer.createDepartment();
		switch (type) {
		case "Employee":
			employee = new Employee(id, name, year, department);
			break;
			
		case "Manager":
			employee = new Manager(id, name, year, department, department);
			break;
			
		case "Director":
			employee = new Director(id, name, year, "Management", "Management", 5000);
			break;
		}
		return employee;
	}
}
