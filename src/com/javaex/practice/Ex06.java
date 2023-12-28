package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex06.java]
				
		1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요.
		
		*/
		
		for (int i=1; i<=100; i++) {
			
			if (i%5==0 && i%7==0) {
				
				System.out.println(i);
				
			}
			
		}
				
	}

}
