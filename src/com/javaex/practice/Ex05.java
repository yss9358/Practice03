package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex05.java]
		
		아래의 출력결과를 예상하여 작성하세요. 
		(코드를 작성해서 예상과 맞는지 확인해 보세요.)
				
	    */
		
		int i=1;
		boolean flag = true;
		
		while (flag) {
			
			if(i>=5) {
				
				flag =false;
				
			}
			
			System.out.println(i);
			
			i=i+1;
		}
		
		/*
		
		예상
		
		1
		2
		3
		4
		5	
		
		*/

	}

}
