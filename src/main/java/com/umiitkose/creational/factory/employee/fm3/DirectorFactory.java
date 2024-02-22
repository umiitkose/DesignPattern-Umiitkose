package com.umiitkose.creational.factory.employee.fm3;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public interface DirectorFactory{

	public Director create(String name, String workingDepartment, int bonus);

}
