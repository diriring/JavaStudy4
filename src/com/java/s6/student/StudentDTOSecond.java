package com.java.s6.student;

public class StudentDTOSecond extends StudentDTO{
	
//	public StudentDTOSecond() {
//		super(); //부모의 기본생성자를 호출
//				 //부모의 기본생성자가 없고, 매개변수가 있는 생성자를 호출해야할 때 사용
//	}

	int history;
	
	public int setTotal() {
		this.total = this.kor + this.eng + this.math + this.history;
		System.out.println(this.total);
		
		return this.total;
	}

}
