package kh.java.func;

import java.util.Scanner;

public class ArrayTest2 {

	public void test1() {
		
		String[]arr= {"����","������","Ű��","���","�ٳ���"};
		
		//1-1. �迭 �ε����� �̿��ؼ� �ٳ��� ���
		System.out.println(arr[4]);
		//1-2. for���� ���� �ʰ� ��ü ���    
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//1-3. for���� �̿��� ��ü ���
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void test2() {
		int[]arr = new int[100];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[4];
		
		System.out.print("�������� �Է� : ");
		arr[0] = sc.nextInt();
		System.out.print("�������� �Է� : ");
		arr[1] = sc.nextInt();
		System.out.print("�������� �Է� : ");
		arr[2] = sc.nextInt();
		
		arr[3] = arr[0]+arr[1]+arr[2];
		System.out.println("�հ�: "+arr[3]);
		double avg = arr[3]/3;
		System.out.printf("��� :%.2f",avg);
	}
	public void test4() {
		int[]arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"��° ���� �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		//�������� ������ ���� ����
		//��������, ��������, ��������, ������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
	}
	//���� ����
	public void bobble() {
		int[] arr = {5,6,4,2,1,3};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-i-1; j++) {	//i�� �ֳ� �ȳֳ� ����� ������ �����͸� ���ؼ�
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
			/*for (int j = 0; j < arr.length-2; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}*/
		
		
//		if(arr[0]>arr[1]) {
//			int tmp = arr[0];
//			arr[0] = arr[1];
//			arr[1] = tmp;
//		}
//		if(arr[1]>arr[2]) {
//			int tmp = arr[1];
//			arr[1] = arr[2];
//			arr[2] = tmp;
//		}
//		if(arr[2]>arr[3]) {
//			int tmp = arr[2];
//			arr[2] = arr[3];
//			arr[3] = tmp;
//		}
//		if(arr[3]>arr[4]) {
//			int tmp = arr[3];
//			arr[3] = arr[4];
//			arr[4] = tmp;
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}



































