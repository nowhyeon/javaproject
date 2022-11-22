package com.yedam.loop;

public class Exam01 {
	public static void main(String[] args) {
		int sum = 0;
//		//규칙찾기.
//		sum = sum + 1;  //0 = 0+1
//		sum = sum + 2;  //1 = 1+2
//		sum = sum + 3;  //3 = 3+3
//		sum = sum + 4;  //6 = 6+4
//		sum = sum + 5;  //10 = 10+5
//		
		
		//1~5까지의 합을 구하는 반복문
		for(int i=1; i<=5;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		//1~100짝수 구하는 반복문
		//규칙찾기.
		//2 4 6 8 10 ...
		//
//		
//		for(int i=1; i<=100; i++) {
//			if(i%2 == 0) {  //짝수
//				System.out.println(i);
//			}
//		}
		
		//1~100까지 홀수 반복문
		//규칙찾기
		
//		for(int i=1; i<=100; i++) {
//			if(i%2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		//1~100 사이에서 2의 배수 또는(||) 3의 배수 찾기
		//2의 배수 i%2 ==0 2,4,6,8,10,12,14,16 ...
		//3의 배수 i%3 ==0 3,6,9,12,15,18...
		
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 || i%3==0) {
//				System.out.println(i+"는 2의 배수 혹은 3의 배수 입니다.");
//			}
//		}
		
		//1~100 사이에서 2의 배수 이거나(&&) 3의 배수 찾기
		//2,3의 배수 겹치는부분 6,12,18 ... => 6의 배수
//		for(int i=1; i<=100; i++) {
//			if(i%2==0 && i%3==0) {
//				System.out.println(i+"는 2와3의 배수 입니다.");
//			}
//		}
		
		
		//중첩 반복문
		//만약 2단 출력
		//2*1 2*2 2*3... 2*9 
		//2*i 
//		
//		for(int i=1; i<=9; i++) {
//			System.out.println("2*"+i+"="+(2*i));
//		}
		//for문 안에 for문
		//초기화식에 들어가는 변수 두개를 고려
		//구구단 출력(2~9단)
		//변하는 데이터가 두개라 for두번씀
		
//		for(int i=2; i<=9; i++) {
//			//i 가 2 일때 아래의 반복문 9번 반복 , i가 3일때 아래의 반복문 9번 반복 .......
//			for(int j=1; j<=9; j++) {
//				//j가 1일때 아래의 반복문 9번 반복 , j가 3일대 아래의 반복문 9 번 반복.......
//				System.out.println(i+"단: "+i+"*"+j+"="+(i*j));
//			}
//		}
//		
		//공포의 별찍기 
		//*****
		//*****
		//*****
		//*****
		//*****
		
		
		//한칸씩 내려갈때 쓰는 반복문
//		for(int i=0; i<5; i++) {
//			String star = "";
//			//별을 만드는 반복문
//			for(int j=0; j<5; j++) {
//				//+연산자를 활용하여 *****만든것
//				star+="*";
//			}
//			System.out.println(star);
//		}
		
		//*
		//**
		//***
		//****
		//*****
//		for(int i=1; i<=5; i++) {
//			String star = "";
//			//별을 만드는 반복문
//			for(int j=0; i>j; j++) {				
//				star+="*";
//			}
//			System.out.println(star);
//		}
//		
		//*****
		//****
		//***
		//**
		//*
		
//		for(int i=5; i>=1; i--) {
//			String star = "";
//			for(int j=0; i>j; j++) {
//				star+="*";
//			}
//			System.out.println(star);
//		}
		
		
		for(int i=1; i<6; i++) {
			String star = "";	
				for(int j=6; j<1; j--) {
					if(i>=j) {
						star+="*";
					}else if(i<=j) {
						star+=" ";
					}
					
				}
			
				System.out.println(star);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
