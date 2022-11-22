package com.yedam.condition;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//Math.random()란       0 <= Math.random() < 1
		//0*60  <= Math.random() *60 < 1*60
		//0+40 <= Math.random() < 60+40
		//40 <= Math.random() < 100     40~99
		//실수 -> 정수 casting
		//1231441.1231 -> int -> 1231441
		//40~99
//		int score = (int)(Math.random()*60) + 40;
//		
//		if(score >= 60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//		
//		//삼항연산자
//		
//		String pass = (score >= 60) ? "합격" : "불합격";
//		System.out.println(pass);
		
		//if-else 문
		//90이상 : A, 80이상 : B , 70이상 : C , 60이상 : D 
		
		
//		if(score >= 90) {  //90이상
//			pass = "A";
//		}else if(score >=80) {  //80~89
//			pass = "B";
//		}else if(score >=70) {  //70~79
//			pass = "C";
//		}else {  //69이하
//			pass = "D";
//		}
		
		//if 활용한 예제
		//사용자가 입력한 값이 1,2,...9 dlaus "one","two",...."nine"
		//과 같이 출력하는 프로그램 1~9 아니면 other  출력
		
//		Scanner sc = new Scanner(System.in);
//		//사용자가 데이터 입력
//		System.out.println("숫자 입력>");
//		int no = Integer.parseInt(sc.nextLine());
////		
//		if(no == 1) {
//			System.out.println("one");
//		}else if(no == 2) {
//			System.out.println("two");
//		}else if(no == 3) {
//			System.out.println("three");
//		}else if(no == 4) {
//			System.out.println("four");
//		}else if(no == 5) {
//			System.out.println("five");
//		}else if(no == 6) {
//			System.out.println("six");
//		}else if(no == 7) {
//			System.out.println("seven");
//		}else if(no == 8) {
//			System.out.println("eight");
//		}else if(no == 9) {
//			System.out.println("nine");
//		}else{
//			System.out.println("other");
//		}
		
		//switch문  141p
//		switch(no){
//		case 1 : // == no == 1 
//			System.out.println("one");
//			break;
//		case 2 : // no == 2
//			System.out.println("two");
//			break;
//		case 3 : 
//			System.out.println("three");
//			break;
//		case 4 : 
//			System.out.println("four");
//			break;
//		case 5 : 
//			System.out.println("five");
//			break;
//		case 6 : 
//			System.out.println("six");
//			break;
//		case 7 : 
//			System.out.println("seven");
//			break;
//		case 8 : 
//			System.out.println("eight");
//			break;
//		case 9 : 
//			System.out.println("nine");
//			break;
//			
//		default : 
//			System.out.println("other");
//			break;
//		}
		
				
		//break 없는 switch
		
		int time = (int)(Math.random()*4)+8; //8~11 사이의 정수
		System.out.println("현재시각 : "+time+"시");
		
		switch(time) {
		case 8 :
			System.out.println("출근합니다");
		case 9 :
			System.out.println("회의합니다");
		case 10 :
			System.out.println("업무봅니다");
		default :
			System.out.println("외근합니다");
		
		}
		
		
		//성적확인  문자도 되는걸 확인하려고 만든것.
		char grade = 'B';
		
		switch(grade) {
		case 'A':
			System.out.println("훌륭한 학생입니다.");
			break;
		case 'B':
			System.out.println("우수한 학생입니다.");
			break;
		case 'C':
			System.out.println("조금 노력하세요.");
			break;
		case 'D':
			System.out.println("분발하세요.");
			break;
		}
		
		//문자열 활용 switch 
		String pasition = "과장";
		
		switch(pasition) {
		case "부장":
			System.out.println("700만원");
			break;
		case "차장":
			System.out.println("600만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
			break;
		}
		
		
		
		
		
		
		
	}
}
