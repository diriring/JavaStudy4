package com.java.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member mem = new Member();
		
		mem.setEmail("chunsigi@kakao");
		mem.setHeight(90.0);
		mem.setAge(3000);
		
		System.out.println(mem.getEmail());
		System.out.println(mem.getHeight());
		System.out.println(mem.getAge());

	}

}
