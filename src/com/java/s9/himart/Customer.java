package com.java.s9.himart;

public class Customer {
	
	int money;
	int point;
	
	public void buy(Product pro) {
		this.money = this.money - pro.price;
		this.point = this.point + pro.point;
		
		System.out.println("최종 금액 : " + this.money);
		System.out.println("최종 포인트 : " + this.point);
	}

}
