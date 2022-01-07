package com.java.s5;

public class MyGodMain {

	public static void main(String[] args) {
		//MyGod myGod = new MyGod(); //오류 why?
		MyGod myGod = MyGod.makeGod();
		
		System.out.println(myGod);
		
		MyGod my2 = MyGod.makeGod();
		System.out.println(my2);
	}

}

//SingleTon
//프로그램에서 객체를 하나만 만들어서 사용하는 방식
