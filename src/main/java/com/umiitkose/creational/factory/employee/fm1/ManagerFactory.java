package com.umiitkose.creational.factory.employee.fm1;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class ManagerFactory implements Factory {

	@Override
	public Manager create() {
		String department = EmployeeRandomizer.createDepartment();
		Manager manager = new Manager(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), department, department);
		return manager;
	}
}
