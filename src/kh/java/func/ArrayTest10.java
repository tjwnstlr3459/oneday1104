package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest10 {

	//�ǽ�����2
	public void test2() {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	boolean bool = true;
	
	int weight=0;
	int height=0;
	
	while(bool) {
	System.out.print("�������� ������ �Է��ϼ���(1~10)==>");
	weight = sc.nextInt();
	//���������Ͻ�
	if(weight<0 || weight>10) {
		System.out.println("1��10������ ���ڸ� �Է����ּ���");
		}else {
			break;
		}
	}
	while(bool) {
	System.out.print("�������� ������ �Է��ϼ���(1~10)==>");
	height = sc.nextInt();
	//���������Ͻ�
	if(height<0 || height>10) {
		System.out.println("1��10������ ���ڸ� �Է����ּ���");
		}else {
			break;
		}
	}
	int arr[][] = new int[weight][height];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			int ran = r.nextInt(10)+97;
			char ch= (char)ran;
			//�����Լ��� �̿��� ����
			//int num=(int)(Math.random()*10)+97;
			//char ch = (char)num;
			arr[i][j]= ch;
			System.out.print((char)arr[i][j]+ " ");
		}
		System.out.println();
	
		}
	}
}
