package kh.java.control;

import java.util.Scanner;

public class SwitchTest {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이에 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
				System.out.println("1입력");
				break;
			case 2:
				System.out.println("2입력");
				break;
			case 3:
				System.out.println("3입력");
				break;
			default :
				System.out.println("1~3사이의 숫자가 아닙니다.");
				break;	
		}
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("장학금 지불 시스템입니다.");
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다.");
			break;
		case 'B':
			System.out.println("아쉽군요. 장학금을 50%지급해드리겠습니다.");
			break;
		case 'C':
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요");
			break;
		case 'D':
			System.out.println("크흠...");
			break;
		case 'F':
			System.out.println("학사 경고입니다.");
			break;	
		}
	}
		public void test3() {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.print("일수를 알고싶은 달을 입력하세요 : ");
			int mon = sc.nextInt();
			
			switch (mon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(mon + "월달은 30일까지 있습니다.");
				break;
			case 2:
				System.out.println(mon + "월달은 28일까지 있습니다.");
				break;
			}
			
			/*switch (mon) {		
			case 1:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 2:
				System.out.println(mon + "월달은 28일까지 있습니다.");
				break;
			case 3:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 4:
				System.out.println(mon + "월달은 30일까지 있습니다.");
				break;
			case 5:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 6:
				System.out.println(mon + "월달은 30일까지 있습니다.");
				break;
			case 7:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 8:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 9:
				System.out.println(mon + "월달은 30일까지 있습니다.");
				break;
			case 10:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			case 11:
				System.out.println(mon + "월달은 30일까지 있습니다.");
				break;
			case 12:
				System.out.println(mon + "월달은 31일까지 있습니다.");
				break;
			}*/
		}
		public void test4() {
			int num1 = 10;			//정수형 변수 num1을 선언 후 10으로 초기화
			int num2;				//정수 초기화를 해줘야 쓸수있음
			
			if(num1 == 10) {
				//int num2 = 100;		//정수형 변수 num2을 선언 후 100으로 초기화
			}
			System.out.println(num1);
			//System.out.println(num2);
		}
		
		
	}
