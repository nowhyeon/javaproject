package com.yedam.variable;

public class Exam02 {
	public static void main(String[] args) {  //main 치고 컨트롤 스페잉스 엔터
		int var1 = 0b1011;  //2진수
		int var2 = 0206;	//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		
		
		//byte -128~127
		byte bVal = -128;
		byte bVal2 = 0;
		byte bVal3 = 127;
		int bVal4 = 500;
		
		//long 
		long lVal = 10;
		long lVal2 = 20L;
		long lVal3 = 10000000000L;  //L을 붙여줘야 인식함  아니면 int로 헷갈려함
		
		//char(유니코드)
		//문자 만 넣을 수 있음
		//문자열과 문자는 다름
		//문자열 =>문자가 모여서 만들어진 것.
		//EX) "apple"
		//문자 =>하나의 알파벳
		//EX) 'A','B'
		char cVar = 'A';  //65
		char cVar2 = '가';
		char cVar3 = 67;// C
		char cVar4 = 0x0041;
		
		System.out.println(cVar);
		System.out.println(cVar2);
		System.out.println(cVar3);
		System.out.println(cVar4);
		
		
		//문자열 ""
		String str = "홍길동";
		//char cVal5 = "홍길동"; 이렇게하면 안 돼. char라서 오류ㅜ
		//String str1 = '홍길동'; ' 가 아니라 "로
		String str2 = "프로그래머";
		System.out.println(str2);
		System.out.println(str);
		
		//탭만큼 띄움
		System.out.println("번호\t이름\t직업");
		//엔터
		System.out.println("행 단위 출력\n");
		//특수문자 존재 여부 확인
		System.out.println("우리는 \"개발자\"입니다");  // \넣으면 출력에 " 쓸 수 있는것.
		//특수문자 존재 여부 확인
		System.out.println("봄\\여름\\가을\\겨울");  // 위와 같은 이유
		
		//실수 타입
		//float
		
		float fVal = 3.14f;//f넣어줘야 자바가 안 헷갈림 
		
		//double 
		
		double dVal = 3.14;//얘는 오류 ㄴ 
		
		//e 사용하기
		double dVal2 = 3e6; //3 * 10의 6 승
		float fVal2 = 3e6f; //3 * 10의 6 승
		double dVal3 = 2e-3; // 2* 10 의 -3 승 => 2/1000
		
		System.out.println(dVal2);
		System.out.println(fVal2);
		System.out.println(dVal3);
		
		//논리 타입. -ture false
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
		
		
		
		
		
		
	}
}
