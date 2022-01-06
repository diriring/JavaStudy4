package com.java.s4;

public class Square {
	
	public static int width;
	final int HEIGHT;
	
	public Square () {
		HEIGHT = 5;
	}
	
	static {
		Square.width = 3;
	}
	
	public static void info() {
	
		System.out.println("Class Method");
		System.out.println(Square.width);
		//System.out.println(this.height);
		//this.info2(); //사용불가능
		
	}
	
	public void info2() {
		
		System.out.println("Instance Method");
		System.out.println(Square.width);
		System.out.println(this.HEIGHT);
		
		Square.info();
	}

}
