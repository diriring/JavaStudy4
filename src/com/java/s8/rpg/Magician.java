package com.java.s8.rpg;

public class Magician extends Character implements Act{
	
	int mp;
	
	private void spel() {
		System.out.println("마법공격");
	}

	@Override
	public void attack() {
		this.spel();
		
	}

	@Override
	public void move() {
		System.out.println("날아다니기");
		
	}
	


}
