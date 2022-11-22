package com.yedam.variable;

public class Exam04 {
	public static void main(String[] args) {
		byte bVal = 10;
		byte bVal2 = 20;
		//int 아래 데이터 타입일 경우,  연산하게 되면 
		//int로 결과값이 나옴.
		int iResult = bVal + bVal2;
		System.out.println("Byte간 연산 결과(int):"+ iResult );
		
		char cVal = 'A';
		char cVal2 = 10;
		iResult = cVal + cVal2;
		System.out.println("char간 연산 결과(int):"+ iResult );
		System.out.println("char간 연산 결과(유니코드):"+ (char)iResult );
		
		int iVal2 = 30;
		double dVal3 = iVal2/4.0;
		System.out.println("int/실수 : "+dVal3);
		
		int x = 20;
		int y = 9;
		double result = (double)x/y;
		System.out.println("int 자동 변환 :"+ result );
		
		
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8);   // 괄호 먼저 계산함.
		System.out.println(str4);
		
		//문자열 강제 타입 변환   문자열을 숫자로 변환
		String iNo = "10";
		String bNo = "8";
		String dNo = "3.222";
		
		int sNo = Integer.parseInt(iNo);
		byte sNo2 = Byte.parseByte(bNo);
		double sNo3 = Double.parseDouble(dNo);
		
		System.out.println("int 변환 : "+ sNo + "\n byte 변환 : "+ sNo2 + "\n double 변환 : "+ sNo3);
		
		
		//숫자열을 문자열로 
		String str5 = String.valueOf(sNo);
		String str6 = String.valueOf(sNo2);
		String str7 = String.valueOf(sNo3);
		// 문자 10 더하기 문자 8 이라 108이 나올것.
		System.out.println( String.valueOf(sNo)+String.valueOf(sNo2));
		
		
		
		
		
	}
}
