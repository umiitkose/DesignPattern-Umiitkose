package com.umiitkose.creational.factory.employee.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents Human Resources in a company.
 * 
 * @author akin
 *
 */
public class HR {

	private List<Employee> employees = new ArrayList<Employee>();

	public HR() {
		Employee employee = new Employee(1, "Ahmet", 10, "Production", "Employee");
		employees.add(employee);
		employee = new Employee(2, "Zeynep", 3, "Sales", "Employee");
		employees.add(employee);
		employee = new Employee(3, "Kemal", 7, "Production", "Employee");
		employees.add(employee);

		Employee manager = new Employee(20, "Ahmet", 10, "Marketing", "Manager", "Marketing");
		employees.add(manager);
		manager = new Employee(21, "Mehmet", 14, "Production", "Manager", "Production");
		employees.add(manager);
		
		Employee director = new Employee(30, "Ahmet", 19, "Company", "Director", "Company", 5000);
		employees.add(director);
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public int getNumberOfEmployees() {
		return employees.size();
	}

	public void addNewEmployee(int no, String name, int year, String department, String type, String departmentManaged,
			double bonus) {
		Employee employee = null;
		switch (type) {
		case "Employee":
			employee = new Employee(no, name, year, department, type);
			employees.add(employee);
			break;
			
		case "Manager":
			employee = new Employee(no, name, year, department, type, departmentManaged);
			employees.add(employee);
			break;
			
		case "Director":
			employee = new Employee(no, name, year, department, type, departmentManaged, bonus);
			employees.add(employee);
			break;
		}
	}
}
