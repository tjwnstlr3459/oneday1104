package kh.java.control;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 10�� �Է��غ����� : ");
		int number = sc.nextInt();
		
		if(number == 10) {
			System.out.println("���߾��");
		}
		System.out.println("��!");
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("======���� ���� ���α׷�======");
//		System.out.print("������ ������ �Է� �ϼ���: ");
//		int num1 = sc.nextInt();
//		
//		if(num1>=0) {
//			System.out.println("����� �Է��� ��" + num1 + "��(��) ����Դϴ�.");
//		}		
//		if(num2>=0) {
//			System.out.println("����� �Է��� ��" + num2 + "��(��) "+num2+"�Դϴ�.");
//		}
//		if(num3<=0) {
//			System.out.println("����� �Է��� ��" + num3 + "��(��) �����Դϴ�.");
//		}
		/////////
		System.out.println("======���� ���� ���α׷�======");
		System.out.print("������ ������ �Է� �ϼ���: ");
		int num4 = sc.nextInt();
		
		if(num4>0) {
			System.out.println("����� �Է��� ��" + num4 + "��(��) ����Դϴ�.");
		}else if(num4<0) {
			System.out.println("����� �Է��� ��" + num4 + "��(��) �����Դϴ�.");
		}else System.out.println("����� �Է��� ��" + num4 + "��(��)"+num4+"�Դϴ�.");
		
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======�μ� �� ���α׷�======");
		System.out.print("ù��° ������ �Է� �ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է� �ϼ���: ");
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println("�ι�° ���� �� Ů�ϴ�.");
		}
		if(num1==num2) {
			System.out.println("�� ���� �����ϴ�.");
		}
		if(num1>num2) {	
			System.out.println("ù��° ���� �� Ů�ϴ�.");
		}
	}
	
	public void  test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======���� ���α׷�======");
		System.out.print("�����ڸ� �Է��ϼ���(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("ù��° ������ �Է� �ϼ���: ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է� �ϼ���: ");
		int num2 = sc.nextInt();
		
		if(ch == '+') {
			System.out.println(num1 +"+"+ num2+"="+(num1+num2));
		}
		if(ch == '-') {
			System.out.println(num1 +"-"+ num2+"="+(num1-num2));
		}
		if(ch == '*') {
			System.out.println(num1 +"*"+ num2+"="+num1*num2);
		}
		if(ch == '/') {
			System.out.printf(num1 +"/"+ num2+" = %.2f",(double)num1/num2);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		int adPrice = 15000;
		int chPrice = 5000;
		
		System.out.println("====���̰��� ���α׷�====");
		System.out.print("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int hu = sc.nextInt();
		System.out.print("��� ����Դϱ�?(1�δ� "+adPrice+"��) : ");
		int ad = sc.nextInt();
		System.out.print("���̴� ����Դϱ�?(1�δ� "+chPrice+"��) : ");
		int ch = sc.nextInt();
		
		int sum1 = adPrice * ad;
		int sum2 = chPrice * ch;
		
		if(hu == ad + ch) {
			System.out.println("�����Ͻ� �� �ݾ��� " +(sum1+sum2)+"�� �Դϴ�.");
		}else {
			System.out.println("�ο����� ���� �ʽ��ϴ�.");
		}
	}
	
	public void test7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====���� ���α׷�====");
		System.out.print("����� ����� �����ϱ��(1.apple, 2.��Ƽ�� �⽺)? : ");
		char qu = sc.next().charAt(0);
		
		int suc = 0;
		
		if(qu == '1') {
			System.out.println("����!!!");
			suc++;
		}else {
			System.out.println("��!!!");
		}
		System.out.println("�ι�° ����");
		System.out.print("�ٳ����� ��� ������ ���� ������(1.���, 2.����)? : ");
		char tr = sc.next().charAt(0);
		
		if(tr == '2') {
			System.out.println("����!!!");
			suc++;
		}else {
			System.out.println("��!!!");
		}
		
		System.out.println("��"+suc +"���� ������ϴ�.");
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====�ɸ� �׽�Ʈ====");
		System.out.print("����� ���� �����Ͻʴϱ�(1.yes, 2.no)? : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�(1.yes, 2.no)? : ");
			int num1 = sc.nextInt();
			if(num1 == 1) {
				System.out.println("���� �ǰ��� ���� �ʽ��ϴ�.");
			}else {
				System.out.println("���� ���� ���� �ʽ��ϴ�.");
			}
		}
		if(num == 2) {
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�?(1.yes, 2.no)? : ");
			int num2 = sc.nextInt();
			if(num2 == 1) {
				System.out.println("���ض�..");
			}else {
				System.out.println("������..");
			}
			
		}
	}
	public void test9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("¦��");
		}
		if(number%2==1) {
			System.out.println("Ȧ��");
		}
		if(number == 0) {
			System.out.println("0�Դϴ�.");
		}
	}
}
