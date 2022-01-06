package com.java.s1.modifier;

import com.java.s2.Test2; //다른 패키지에 있는 클래스는 import 되어야한다

public class ModifierMain {

	public static void main(String[] args) {
		Test test = new Test();	
		int n = 10;
		test.info(n);
		
		Test2 test2 = new Test2();
		
		//test.num = 10;
		test2.num2 = 10;
		
		

	}

}
