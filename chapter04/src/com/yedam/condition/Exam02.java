package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//학점 계산하기
		//switch 문으로 변경
		//사용자가 입력한 점수를 토대로 학점을 출력
		//90이상 A , 90~80 B 70~80 C 60~70 D 그외 F
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		int score = Integer.parseInt(sc.nextLine());
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
