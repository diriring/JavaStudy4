package com.java.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
//		Knight k1 = new Knight();
//		Magician m1 = new Magician();

		//Character를 상속받았기때문에 Magician type은 Character type이다
//		Character c1 = m1;
		//m1 = c1; Character type은 Magician type이 아님
		
//		k1.attack();
//		m1.attack();
		
//		System.out.println(c1.name);
//		System.out.println(c1.hp);
		//System.out.println(c1.mp); //mp 존재하지만 부모 클래스에서 접근하지 못하는 것일 뿐
		
		Knight k1 = new Knight();
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		
		Character [] chr = new Character[3];
		chr[0] = k1;
		chr[1] = m1;
		chr[2] = a1;
		
	}

}
