package kh.java.func;

import java.util.Scanner;

public class ArrayTest8 {

	public void test1() {
		
	Scanner sc = new Scanner(System.in);
	
	
	//������ �� ���
	boolean[]rooms = new boolean[10];	//�⺻ �迭�� ���� 0�� ����Ǿ�����
	
	
	boolean bool = true;	//while��
	
	while(bool) {
	System.out.println("���� ���� ���α׷� v1.0");
	System.out.println("1.�Խ�\t2.���\t3.�溸��\t4.����");
	int num = sc.nextInt();
	
	switch (num) {
	case 1://�Խ�
		System.out.print("����濡 �Խ��Ͻðڽ��ϱ�?");
		int room = sc.nextInt();
	
		//�漱��
		if(!rooms[room-1]) {	//����ǥ�� �ٿ��ָ� �������� �ȴ�
			rooms[room-1]=true;	
			System.out.println(room+"���濡 �Խ��ϼ̽��ϴ�.");
		}else {
			System.out.println(room+"���濡 ���� �մ��� �ֽ��ϴ�.");
		}
		break;
		
	case 2://���
		System.out.println("��� �濡�� ����Ͻðڽ��ϱ�?");
		int outNo = sc.nextInt();
		if(rooms[outNo-1]) {	//!�� ������ true
			rooms[outNo-1]=false;
			System.out.println(outNo+"�� �濡�� ����ϼ̽��ϴ�.");
		}
		break;
		
	case 3://�溸��
		for (int i = 0; i < rooms.length; i++) {
			if(!rooms[i]) {
				System.out.println((i+1)+"������ ���� ����ֽ��ϴ�.");
			}else {
				System.out.println((i+1)+"������ ���� �̿����Դϴ�.");
			}
		}
		break;
	case 4://����
		bool = false;
		break;
			}
		}
	}
}














