package kh.java.control;

import java.util.Scanner;

public class IfTest2 {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("====��/�ҹ��� ��ȯ ���α׷�====");
		System.out.print("���� �Է� : ");
		char ch = sc.next().charAt(0);
		
		System.out.print("====���====");
		
		if(ch >=97 && ch <=122 ){
			
			ch-=32;
			System.out.println("�ҹ��ڸ� �Է� �Ͽ����ϴ�.");
			System.out.println("�빮�ڷ� ��ȯ : " + ch);
		}else if(ch >=65 && ch <=90) {
			
			ch+=32;
			System.out.println("�빮�ڸ� �Է� �Ͽ����ϴ�.");
			System.out.println("�ҹ��ڷ� ��ȯ : " + ch);
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���.");
		}
	}
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println("====���====");
		
		
		if(num ==0) {
			System.out.println("["+num+"]"+"��(��) 3�� ����� 4�� ����� �ƴմϴ�.");
		}else if(num%3==0 && num%4==0) {
			System.out.println("["+num+"]"+"��(��) 3�� ����̸鼭 4�� ����Դϴ�.");
		}else if(num%3==0) {
			System.out.println("["+num+"]"+"��(��) 3�� ����Դϴ�.");
		}else if(num%4==0) {
			System.out.println("["+num+"]"+"��(��) 4�� ����Դϴ�.");
		}else {
			System.out.println("["+num+"]"+"��(��) 3�� ����� 4�� ����� �ƴմϴ�.");
		}
	
	}
}
