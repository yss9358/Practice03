package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex10.java]
				
		정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
		
		------------------------------------------------
		1, 5, 3, 67, 34
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int y = 0;
		
		for (int i=0; i<5;i++) {
			
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if(y<num) {
				y= num;
			}
			}
			
		System.out.println("최대값은 " + y + "입니다.");
		
		
		sc.close();
		
	}

}
