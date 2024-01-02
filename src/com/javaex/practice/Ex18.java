package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex18.java]
		
		숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		for (int i=0; i<=num; i++) {
			for (int x=0; x<num-i; x++) {
				System.out.print("*");
			} 
				
			System.out.println();
		}
		
		
		sc.close();
		

	}

}
