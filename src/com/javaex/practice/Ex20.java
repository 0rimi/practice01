package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("500원 개수: ");
			int fiveh = sc.nextInt();
			System.out.print("100원 개수: ");
			int oneh = sc.nextInt();
			System.out.print("50원 개수: ");
			int fif = sc.nextInt();
			System.out.print("10원 개수: ");
			int ten = sc.nextInt();
			
			int amount = fiveh*500 + oneh*100 + fif*50 + ten*10;
			
			System.out.println("동전의 총합은 "+amount+"원 입니다.");
		
		sc.close();
		
	}
	
	
}
