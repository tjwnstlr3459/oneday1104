package kh.java.test;

import java.util.Scanner;

public class MethodTest {
	
	public void test11() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int result = add(a,b);
		int result2 = add(a,b,c);
		int result3 = add(a,b,c,d);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		//�����ε�, �������̵�
		
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));
		System.out.println(add(a,b,c,d));
	}
	public int add(int num1, int num2) {
		return (num1+num2);
	}
	//�� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
	public int add(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}
	//�� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
	public int add(int num1, int num2, int num3, int num4) {
		return (num1+num2+num3+num4);
	}
	//�� ���� �Ű������� �޾Ƽ� ��ģ ���� �����ϴ� �޼ҵ�
	
	
	public void test2() {
		
		
		int[]arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		test3(arr[2]);	//���������� �ѱ��
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	//1 2 3 4 5	���
		}
		System.out.println();
		
		
		
		test4(arr);		//�ּҸ� �Ѱ��༭ ������ ������ ��ģ��
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void test3(int num) {
		num+=100;
		System.out.println(num);	//103�� ���
	}
	
	public void test4(int[]arr1) {
		arr1[2] +=100;
		System.out.println(arr1[2]);
	}
	
	
	
	
	
	
	
	
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		System.out.println("���θ޼ҵ��Դϴ�!!");
		test1();
		//today ȣ��
		String today = today();
		System.out.println(today());
		
		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = sum(num1,num2);
		System.out.println(result);
		/*
		//�ݺ��� ����(Ÿ�Ժ� Ȧ¦���ϱ�)
		while(true) {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//int�޼ҵ�
		int ck1 = check1(num);
		
		//boolean �޼ҵ� �ҷ�����
		boolean ck2 = check2(num);
		if(ck2) {
			System.out.println("¦��");
		}else{
			System.out.println("Ȧ��");
			}
		
		//String �޼ҵ�
		String ck3 = check3(num);
		System.out.println(ck3);
		}*/
		
		
	}
	public int sum(int num1, int num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		int sum = num1 + num2;
		return (num1+num2);
	}
	
	
	
	
	
	
	public void test1() {
		System.out.println("ù��° �׽�Ʈ �޼ҵ� �Դϴ�.");
	}
	
	
	public String today() {
		System.out.print("hello");
		return "2021-02-17";	//return�� ���� �ǵ����ָ鼭 �ش� �޼ҵ带 ����
	}
	
	
	//���� 1���� �Ű������� �޾Ƽ� Ȧ������ ¦������ �Ǵ����ִ� �޼ҵ�
	//int��
	public int check1(int num1) {
		return num1%2;
	}
	
	//boolean��
	public boolean check2(int num1) {
		//���޹��� �Ű������� ¦���� true���� / Ȧ���� false ����
		if(num1%2 ==0) {
			return true;
		}else {
			return false;
		}
	}
	//String��
	public String check3(int num1) {
		if(num1%2==0) {
			return "¦��";
		}
		return "Ȧ��";
	}
}





















