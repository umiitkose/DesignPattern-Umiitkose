package com.umiitkose.creational.factory.employee.problem;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		HR hr = new HR();
		PayrollOffice po = new PayrollOffice();

		// Add more employees
		hr.addNewEmployee(5, "Sami", 2, "Production", "Employee", null, 0);
		hr.addNewEmployee(6, "Ozlem", 4, "Production", "Employee", null, 0);

		// Now pay time!
		List<Employee> employees = hr.getEmployees();

		for (Employee employee : employees)
			po.paySalary(employee);
		
	}
}
