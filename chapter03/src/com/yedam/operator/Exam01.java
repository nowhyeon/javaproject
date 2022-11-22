package com.yedam.operator;

public class Exam01 {
	public static void main(String[] args) {
		//부호 연산자 + , - 
		int x = -100;
		int result1 = -x;
		int result2 = +x;
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result2);
		
		byte b = 100;
//		byte result3 = -b; 이거 오류임.
		int result3 = -b; 
		
		//증감 연산자 ++ --
		//위치에 따라서 연산 타이밍이 다름.
		
		int value = 100;
		
		//출력문이 실행되고 나서 value값 1증가
		System.out.println(value++);  // 100으로 출력되고 1증가된거
		//출력문이 실행되기 전 value갑 1증가
		System.out.println(++value);// 1증가된 상태에서 한번더 1 증가되고 출력
		
		//논리 부정 연산자(not)
		//true + not(!) == false
		//false + not(!) == true
		boolean flag = true;
		
		if(!flag) { // false라 실행 안 됨 true만 들어갈 수 있음
			System.out.println("false");
		}
		if(flag) {
			System.out.println("true");
		}
		
		//이항 연산자(사칙연산)
		int v1 = 10;
		int v2 = 4;
		
		System.out.println(v1+v2);  //+
		System.out.println(v1-v2);  //-
		System.out.println(v1*v2);  //*
		
		//나누기가 두개임. 나누기 / ,나눠서 나머지 구하는거 %
		
		System.out.println("/: "+(v1/v2));
		System.out.println("%: "+(v1%v2));
		
		//문자열 결합 연산자(+)
		System.out.println("자바"+"jdk"+"11버전");
		
		//비교 연산자
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		
		char char1 = 'A';  //65
		char char2 = 'B';  //66
		
		System.out.println(char1 < char2);
		
		//문자열 비교는 ==가 아니라  equals(비교대상)
		
		//논리 연산자 => && 0이 나오면 첫번째 데이터0만 확인하고 종료<->& 미련하게 전부다 해보고 종료       ||<->| => || T하나 나오면 첫번째 T하나만보고 종료 , | 미련하게 다 해보고 종료
		//&& => 단 하나의 조건이 F=>F    F하나 들어가면 여러개라도 0 
		//|| => 단 하나의 조건이 T=>T    T하나 들어가면 여러개라도 1
		//0*1 => 0 
		//1+0 => 1
		
		int charCode = 'A';
		//'A~Z'
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자.");
		}
		//48~57
		//charCode >= 48  &&  charCode <=57
		//!< 의 부정 >=   !>의 부정 <=
		if(!(charCode<48)&&!(charCode>57)) {
			System.out.println("0~9숫자.");
		}
			
		int value2 = 6;
		if(value2%2==0 || value2%3 ==0) {
			System.out.println("2또는 3의 배수");
		}
		
		//대입연산자 = += -= 등등
		int result5 = 0;
		result5 += 1;   //result5 = result5 +1;과 같음
		
		System.out.println(result5);
		
		//삼항 연산자
		
		int score = 85;
                        //1항      2항   3항                      		
		char grade = (score>90) ? 'A' : 'B';
		                //1항 내용이 참이면 2항으로 거짓이면 3항으로  B는 grade로 이동함.
//		char grade2;
//		if(score > 90) {
//			grade2 = 'A';
//		}else {
//			grade2 = 'B';
//		}               삼항연산자와 같은 if문
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
