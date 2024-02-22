package com.umiitkose.creational.factory.employee.fm3;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class EmployeeFactoryImpl implements EmployeeFactory{

	@Override
	public Employee create(String name) {
		Employee employee = new Employee(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
