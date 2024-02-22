package com.umiitkose.creational.factory.employee.fm2;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create(String name) {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
