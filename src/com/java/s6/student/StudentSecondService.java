package com.java.s6.student;

public class StudentSecondService extends StudentService{

	@Override
	public StudentDTO setStudent() {
		
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
	}
	

}
