package kh.java.control;

import java.util.Scanner;

public class SwitchTest {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 ���̿� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
				System.out.println("1�Է�");
				break;
			case 2:
				System.out.println("2�Է�");
				break;
			case 3:
				System.out.println("3�Է�");
				break;
			default :
				System.out.println("1~3������ ���ڰ� �ƴմϴ�.");
				break;	
		}
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���б� ���� �ý����Դϴ�.");
		System.out.print("������ �Է��ϼ���(A,B,C,D,F) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100% �����ص帮�ڽ��ϴ�.");
			break;
		case 'B':
			System.out.println("�ƽ�����. ���б��� 50%�����ص帮�ڽ��ϴ�.");
			break;
		case 'C':
			System.out.println("���б��� �ٶ�ø� ���� ������ ���ּ���");
			break;
		case 'D':
			System.out.println("ũ��...");
			break;
		case 'F':
			System.out.println("�л� ����Դϴ�.");
			break;	
		}
	}
		public void test3() {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.print("�ϼ��� �˰���� ���� �Է��ϼ��� : ");
			int mon = sc.nextInt();
			
			switch (mon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(mon + "������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println(mon + "������ 28�ϱ��� �ֽ��ϴ�.");
				break;
			}
			
			/*switch (mon) {		
			case 1:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 2:
				System.out.println(mon + "������ 28�ϱ��� �ֽ��ϴ�.");
				break;
			case 3:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 4:
				System.out.println(mon + "������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 5:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 6:
				System.out.println(mon + "������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 7:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 8:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 9:
				System.out.println(mon + "������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 10:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			case 11:
				System.out.println(mon + "������ 30�ϱ��� �ֽ��ϴ�.");
				break;
			case 12:
				System.out.println(mon + "������ 31�ϱ��� �ֽ��ϴ�.");
				break;
			}*/
		}
		public void test4() {
			int num1 = 10;			//������ ���� num1�� ���� �� 10���� �ʱ�ȭ
			int num2;				//���� �ʱ�ȭ�� ����� ��������
			
			if(num1 == 10) {
				//int num2 = 100;		//������ ���� num2�� ���� �� 100���� �ʱ�ȭ
			}
			System.out.println(num1);
			//System.out.println(num2);
		}
		
		
	}
