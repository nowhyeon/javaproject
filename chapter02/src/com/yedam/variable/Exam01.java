package com.yedam.variable;

public class Exam01 {
	public static void main(String[]args) {
		int value;
		value = 10;
		System.out.println(value);
		
		int value2 = 20;
		
		//변수 값 복사
		int x = 3;
		int y = 5;
		int temp;
		
		//데이터 변경 전
		System.out.println("x: "+ x +" , "+ "y: "+y);
		
		temp = x;  //임시로 temp에 x 를 넣어서  어쩌구 하는것
		x = y;
		y = temp;
		
		//데이터 변경 후
		System.out.println("x: "+ x +" , "+ "y: "+y);
		
		int v1 = 15;
		
		if(v1 > 10) {
			int v2; 
			v2 = v1 - 10;
		}//v2의 범위는 if 부터 이까지
		//int v3 = v1 + v2 + 5;  //그래서 여기서 v2는 오류
	}
}
