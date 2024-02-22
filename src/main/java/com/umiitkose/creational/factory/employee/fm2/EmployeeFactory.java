package com.umiitkose.creational.factory.employee.fm2;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class EmployeeFactory implements Factory {

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
