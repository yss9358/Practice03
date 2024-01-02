package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex17.java]
				
		숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		int x ;
		
		for (int i=0; i<num; i++) { // i 부터 num 까지 반복 i가 num이 안넘어갈때까지
			x=num-i;
						
			System.out.print("*");
						
		}	
		
		sc.close();

	}

}
