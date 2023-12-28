package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex07.java]
				
		숫자를 입력받아 아래와 같이 출력하세요.
				
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int no = sc.nextInt();
		
		for (int x=1; x<=no; x++) {
			
			if (x>no) {
				
				break;
			}
			
			for(int y=1; y<=x; y++) {
				if (x<=no) {
					System.out.print(x);
			}
			
			}
			
			System.out.println("");
		} 
		
		sc.close();
	}

}
