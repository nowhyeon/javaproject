package com.yedam.variable;

public class Exam03 {
	public static void main(String[] args) {
		//자동타입 변환
		char cVar = 'A'+1;
		int iVar = cVar;//정수
		System.out.println(iVar); 
		double dVar = iVar;// 실수로 바꿈
		System.out.println(dVar); 
		
		//강제타입 변환
		iVar = (int) dVar;
		System.out.println(iVar); 
		cVar = (char) iVar;
		System.out.println(cVar);
		
		double dVar2 = 3.14444;
		int iVar2 = (int) dVar2;
		System.out.println(iVar2);  //0.14444 날려보냄
		
		byte result = 10 + 20;
		System.out.println(result);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		//강제타입 변환 활용
		//byte result2 = (byte)(x+y);  //둘중 하나 .최대한 위에꺼
		
		//데이터 타입 크기에 따른 연산
		//long + int =long
		//byte + int  = int
		byte bVar = 10;
		int iVar1 = 100;
		long lVar = 1000L;
		int result3 = (int) (bVar+iVar1+lVar);
		System.out.println(result3); 
		
		
	}
}
