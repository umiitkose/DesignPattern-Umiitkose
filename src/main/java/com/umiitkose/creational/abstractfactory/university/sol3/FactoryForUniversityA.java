package com.umiitkose.creational.abstractfactory.university.sol3;

public interface FactoryForUniversityA {
	
	Course createCourse(String name);
	Professor createProfessor(String name);
	Schedule createSchedule(String name);
	Syllabus createSyllabus(String name);
}
