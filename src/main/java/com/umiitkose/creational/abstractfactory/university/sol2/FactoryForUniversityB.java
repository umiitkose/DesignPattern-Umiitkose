package com.umiitkose.creational.abstractfactory.university.sol2;

public interface FactoryForUniversityB {
	
	Course createCourse();
	Professor createProfessor();
	Schedule createSchedule();
	Syllabus createSyllabus();
	VirtualClassroom createVirtualClassroom();
}
