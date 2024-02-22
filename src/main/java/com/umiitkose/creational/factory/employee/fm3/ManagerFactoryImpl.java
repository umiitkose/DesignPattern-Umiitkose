package com.umiitkose.creational.factory.employee.fm3;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class ManagerFactoryImpl implements ManagerFactory{

	@Override
	public Manager create(String name, String workingDepartment) {
		Manager manager = new Manager(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), workingDepartment, workingDepartment);
		return manager;
	}

}
