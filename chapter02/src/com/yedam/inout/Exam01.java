package com.yedam.inout;

//import java.io.IOException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args){
		int value = 123;
		String name = "상품";
		double price = 1000.10;
		
		System.out.printf("상품의 가격: %d\n",value);
		System.out.printf("%s의 가격: %d\n",name,value);
		System.out.printf("%s의 가격: %d원, %f\n",name,value,price);
		
		//1) 정수사용
		value = 11;
		System.out.printf("%d\n", value);
		System.out.printf("%6d\n", value);
		System.out.printf("%-6d\n", value);
		System.out.printf("%06d\n", value);  //p91
		
		
		//2)실수사용
		price = 123.4567;
		System.out.printf("%f\n", (double)price);
		System.out.printf("%10.2f\n", price); // 오른쪽으로 채우고 두번째까지만 나머진 공백
		System.out.printf("%-10.2f\n", price);  //왼쪽으로 채워놓고 소수2번째만 표현 나머지는 공백
		System.out.printf("%010.2f\n", price);  // 소수 두번째 표현 나머지 영으로 
		
		//3)문자열
		System.out.printf("%s\n","문자열사용");
		System.out.printf("%6s\n","문자열사용");
		System.out.printf("%-6s\n","문자열사용");
		//기본 출력문.
		System.out.printf("아무것도 없는 print\n");
		
//		//입력
//		int keyCode;
//		System.out.println("원하는값입력>");
//		keyCode = System.in.read();
//		System.out.println("keyCode :", keyCode);??
		
		//스캐너 (Scanner)
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 입력>");
		String word = sc.nextLine();  //문자열 입력
		System.out.println(word);
		
		if(word.equals("test")) {  //문자열 비교는 equals 로 해야함
			System.out.println("eq입력한 문자 비교 같음");
		}
		if(word == "test") {
			System.out.println("==문자열이같음");//안될거임
		}
		
	}
}
