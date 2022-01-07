package com.java.s6.student;

public class StudentDTOThird extends StudentDTO{

	int physics;

	
	//Source -> override implement
	@Override
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.physics;
		System.out.println(this.total);
		
		return this.total;
		
	}
	
//	public void setTotal() {
//		this.total = this.kor + this.eng + this.math + this.physics;
//		System.out.println(this.total);
//	}

}
