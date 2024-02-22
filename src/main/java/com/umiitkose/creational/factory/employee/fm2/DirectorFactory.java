package com.umiitkose.creational.factory.employee.fm2;

import com.umiitkose.creational.factory.employee.EmployeeRandomizer;

public class DirectorFactory implements Factory {

	@Override
	public Director create(String name) {
		Director director = new Director(EmployeeRandomizer.createId(), name,
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
