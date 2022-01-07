package com.java.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		//Tv, Computer, Phone 정보 입력
		
		Computer com = new Computer();
		Phone ph = new Phone();
		Tv tv = new Tv();
		
		com.company = "Samsung";
		com.brand  = "galaxybook";
		com.cpu = "Intel-i7";
		com.price = 200;
		com.point = 2;
		
		ph.company = "Apple";
		ph.brand = "Iphone12";
		ph.pixel = 100;
		ph.price = 150;
		ph.point = 5;
		
		tv.company = "LG";
		tv.brand = "objet";
		tv.size = 100;
		tv.price = 300;
		tv.point = 10;
		
		Customer jw = new Customer();
		
		jw.money = 1000;
		jw.point = 0;
		
		jw.buy(tv);

	}

}
