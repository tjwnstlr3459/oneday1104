package kh.java.control;

import java.util.Scanner;

public class IfTest2 {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("====대/소문자 변환 프로그램====");
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("====결과====");
		
		if(ch >=97 && ch <=122 ){
			
			ch-=32;
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " + ch);
		}else if(ch >=65 && ch <=90) {
			
			ch+=32;
			System.out.println("대문자를 입력 하였습니다.");
			System.out.println("소문자로 변환 : " + ch);
		}else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
	}
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("====결과====");
		
		
		if(num ==0) {
			System.out.println("["+num+"]"+"은(는) 3의 배수도 4의 배수도 아닙니다.");
		}else if(num%3==0 && num%4==0) {
			System.out.println("["+num+"]"+"은(는) 3의 배수이면서 4의 배수입니다.");
		}else if(num%3==0) {
			System.out.println("["+num+"]"+"은(는) 3의 배수입니다.");
		}else if(num%4==0) {
			System.out.println("["+num+"]"+"은(는) 4의 배수입니다.");
		}else {
			System.out.println("["+num+"]"+"은(는) 3의 배수도 4의 배수도 아닙니다.");
		}
	
	}
}
