package kh.java.control;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + "��° ���");
		}
	}
	public void test2() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "��° ���");
		}
	}
	
	public void exam1() {
		//�ȳ��ϼ��� 5�����
		
		for(int i=0; i<5;i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	public void exam2() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("��� ����Ͻðڽ��ϱ�? : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	public void exam3() {
		System.out.println("2���Դϴ�.");
		for(int i=1; i<10; i++) {
			System.out.println("2 * " +i+ " = " +i*2);
		}
	}
}
