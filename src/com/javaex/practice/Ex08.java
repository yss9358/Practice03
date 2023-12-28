package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex08.java]
				
		아래와 같이 구구단을 출력하세요.
		
		*/

		for (int x=1; x<=9; x++) {
			
			
			for (int y=2; y<=9; y++) {
				System.out.print(y+"*"+x+"="+y*x+"      ");
				
			}
			
			System.out.println();
		}
		
	}

}