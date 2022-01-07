package com.java.s6.student;

public class StudentDTOFourth extends StudentDTOThird{
	
	int music;
	
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics + this.music;
		System.out.println(this.total);
		
		return this.total;
	}

}
