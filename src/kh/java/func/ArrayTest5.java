package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int arr[] = new int[6];
		int arr1[] = new int[6];
		
		boolean bool = true;
		
		int count=0;
		
		while(bool) {
			
			System.out.println("===�ζ����α׷�===");
			//����� ��ȣ�Է�
			for (int i = 0; i < arr.length; i++) {
				System.out.print((i+1)+"��° ��ȣ �Է�(1~45) :");
				int num1 = sc.nextInt();
				//��ȣ�Է� �����
				if(num1>=0 && num1<=45) {
					//�ߺ��� ��ȣ ������
					boolean boo = true;
					for (int j = 0; j < i; j++) {
						if(num1==arr[j]) {
							System.out.println("�ߺ��� ��ȣ�Դϴ� .�ٽ��Է����ּ���");
							i--;
							boo = false;
							break;
						}
					}if(boo) {
						arr[i] = num1;
					}
					//��ȣ�Է� �������
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
					i--;
				}
			}
			//��ǻ�� ��ȣ ����
			for (int i = 0; i < arr1.length; i++) {
				int cpu = r.nextInt(45)+1;
				for (int j = 0; j < arr1.length; j++) {
					if(cpu==arr1[j]) {
						cpu=r.nextInt(45)+1;
					}
				}
				arr1[i] = cpu;
			}
			//����� ��ȣ ��������
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-i-1; j++) {	//i�� �ֳ� �ȳֳ� ����� ������ �����͸� ���ؼ�
					if(arr[j]>arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			//cpu ��ȣ ��������
			for (int i = 0; i < arr1.length-1; i++) {
				for (int j = 0; j < arr1.length-i-1; j++) {	//i�� �ֳ� �ȳֳ� ����� ������ �����͸� ���ؼ�
					if(arr1[j]>arr1[j+1]) {
						int tmp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = tmp;
					}
				}
			}
			//����� ��ȣ ���
			System.out.println("����� ��ȣ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			//��ǻ�� ��ȣ ���
			System.out.println("��ǻ�� ��ȣ");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] +" ");
			}
			System.out.println();
			
			//��������
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if(arr[i]==arr1[j]) {
						count++;
					}
				}
			}
			System.out.println("���� ���� : " + count);
			switch (count) {
			case 1:
			case 2:
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("3���Դϴ�.");
				break;
			case 5:
				System.out.println("2���Դϴ�.");
				break;
			case 6:
				System.out.println("1���Դϴ�.");
				break;
			}
			//�ѹ���?
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?(1.yes/ 2.no)");
			int sel = sc.nextInt();
			if(sel==1) {
				count=0;
				continue;
			}else {
				bool=false;
				break;
			}
		}
	}
}
		



















