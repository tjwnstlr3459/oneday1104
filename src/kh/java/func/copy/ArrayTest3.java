package kh.java.func.copy;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		
		int arr[] = new int[6];
		int arr1[] = new int[6];
		
		boolean bool = true;
		
		while(bool) {
			System.out.print("�ζ� �Ͻðڽ��ϱ�?(1.yes/2.no) : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("==�ζ� ���α׷�==");
				//�ζ� ��ȣ �Է�
				for(int i=0; i<arr.length; i++) {
					System.out.print((i+1)+"��° ��ȣ �Է�(1~45) : ");
					int inputNum =sc.nextInt();
					
					if(inputNum<0 || inputNum>45) {
						System.out.println("1~45 ���ڸ� �Է��ϼ���");
						i--;	//�����Ͻ� ��°�� �ٽ� �������ؼ�
					}else {
						//�������� ���� �Է½�
						boolean boo = true;
						for (int j = 0; j < i; j++) {
							if(inputNum == arr[j]) {
								System.out.println("�ߺ��� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
								i--;
								boo = false;
								break;
							}
						}
						if(boo) {
							arr[i] = inputNum;
						}
					}
				}
				//��������
				for (int i = 0; i < arr.length-1; i++) {
					for (int j = 0; j < arr.length-i-1; j++) {	//i�� �ֳ� �ȳֳ� ����� ������ �����͸� ���ؼ�
						if(arr[j]>arr[j+1]) {
							int tmp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = tmp;
						}
					}
				}
				//���� ��ȣ ���
				System.out.println("����� ��ȣ ");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				
				//��ǻ�� �ζ� ��ȣ ����
				for(int i=0; i<arr1.length; i++) {
					int ran = r.nextInt(45)+1;
					arr1[i] = ran;
				}
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						if(arr1[i]==arr1[j]) {
							arr1[j]=r.nextInt(45)+1;
						}
					}
				}
				
				//��������
				for (int i = 0; i < arr1.length-1; i++) {
					for (int j = 0; j < arr1.length-i-1; j++) {	//i�� �ֳ� �ȳֳ� ����� ������ �����͸� ���ؼ�
						if(arr1[j]>arr1[j+1]) {
							int tmp = arr1[j];
							arr1[j] = arr1[j+1];
							arr1[j+1] = tmp;
						}
					}
				}
				//��ǻ�� ��ȣ ���
				System.out.println("��ǻ�� ��ȣ ");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
				
				//��ȣ �������
				int count =0;
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						if(arr[i]==arr1[j]) {
							count++;
						}
					}
				}
				System.out.println("���ᰳ�� : " + count);
				
				if(count==6) {
					System.out.println("1���Դϴ�.");
				}if(count==5) {
					System.out.println("2���Դϴ�.");
				}if(count==4) {
					System.out.println("3���Դϴ�.");
				}else {
					System.out.println("���Դϴ�.");
				}
				//�ѹ� �� ����?
				System.out.print("�ѹ� �� �Ͻðڽ��ϱ�(1.yes/2.no) ?");
				int sel = sc.nextInt();
				if(sel==1) {
					continue;
				}else if(sel==2) {
					bool =false;
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				
			case 2:
				bool =false;
				break;
			}
		
	}
	}
}
