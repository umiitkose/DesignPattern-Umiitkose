package com.umiitkose.creational.factory.employee.fm1;


import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class  EmployeeFactory implements Factory {

	@Override
	public Employee create() {
		Employee employee = new Employee(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), EmployeeRandomizer.createDepartment());
		return employee;
	}
}
