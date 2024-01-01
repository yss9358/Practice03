package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex16.java]
				
		아래와 설명에 맞는 프로그램을 작성하세요
		숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
		예를들어 22을 입력한 경우 5의배수 개수: 4, 5의배수 합: 50 이 출력된다.
		- 5의배수 개수 : 5, 10, 15, 20  4개
		- 5의배수 합 : 5+10+15+20  50
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		int y = 0; // 5의배수 개수가 올라감.
		
		int x = 0;
		
		for (int i=1; i<=num; i++) { // i 부터 num 까지 반복
			
			if(i%5==0) { // i가 5로 나누었을때 나머지가0 = 5의배수 면 y가 1올라감;
				
				y = y+1;
				x= x+i;// x의 값은 올라갔을 때의 값을 계산해야함
			}  
			
		}
		
		System.out.println("5의배수의 개수: " + y);
		System.out.println("5의배수의 합: " + x);
		
		sc.close();
	
	}

}
