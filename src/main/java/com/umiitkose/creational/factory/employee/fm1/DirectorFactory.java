package com.umiitkose.creational.factory.employee.fm1;


import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class DirectorFactory implements Factory {

	@Override
	public Director create() {
		Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
