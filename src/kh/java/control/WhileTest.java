package kh.java.control;

import java.util.Scanner;

public class WhileTest {
	public void test1() {
		int i = 0;
		while(i<5) {
			System.out.println(i+"��° ���");
			i++;
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ����Ͻðڽ��ϱ�? : ");
		int num = sc.nextInt();
		int i=1;
		
		while(i<10) {
			System.out.println(num +" * "+ i +" = "+ num*i);
			i++;
		}
	}
	
}
