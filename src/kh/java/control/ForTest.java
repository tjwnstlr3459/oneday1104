package kh.java.control;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "번째 출력");
		}
	}
	public void test2() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "번째 출력");
		}
	}
	
	public void exam1() {
		//안녕하세요 5번출력
		
		for(int i=0; i<5;i++) {
			System.out.println("안녕하세요");
		}
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("몇번 출력하시겠습니까? : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void exam3() {
		System.out.println("2단입니다.");
		for(int i=1; i<10; i++) {
			System.out.println("2 * " +i+ " = " +i*2);
		}
	}
}
