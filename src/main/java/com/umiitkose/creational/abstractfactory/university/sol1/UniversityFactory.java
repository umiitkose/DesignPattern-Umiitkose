package com.umiitkose.creational.abstractfactory.university.sol1;

public interface UniversityFactory {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();

}
