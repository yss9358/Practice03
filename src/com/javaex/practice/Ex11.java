package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex11.java]
				
		다음과 같은 프로그램을 작성하세요
		a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
		- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
		b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
	    - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		
		-----------------------------------------------------
		7 -> 16 / 10 -> 30 / 11 -> 36
		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int no = sc.nextInt(); // 입력값
		
		int y = 0; //결과
		
		if(no%2==0) {
			for (int i=2; i<=no; i+=2) {
				y = y + i;
				}
			} else {
			for (int i=1;i<=no; i+=2) { 
				y = y + i;
				}		    
			}
		
		System.out.println("결과값: " + y);		

		sc.close();
		}
	}
