package com.java.s6.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentDTOSecond stu2 = new StudentDTOSecond();
		
		stu2.kor = 100;
		stu2.eng = 50;
		stu2.math = 90;
		stu2.history = 95;
		stu2.setTotal();
		
	}

}
