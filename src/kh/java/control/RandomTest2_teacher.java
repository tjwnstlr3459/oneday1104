package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2_teacher {

	public void test1() {
	Scanner sc = new Scanner(System.in);
	
	Random ran = new Random();
	
	boolean bool = true;
	
	int rank = 0;
	
	while(bool) {
		System.out.println("==Up & Down Game==");
		System.out.println("1.Game Start");
		System.out.println("2.Game Score");
		System.out.println("3.End Game");
		System.out.print("�Է� > ");
		
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("<< Game Start >>");
			int count = 0;
			int random = ran.nextInt(99)+1;	//while�� �ȿ� ������ �Ź� ���ο� ���� ����
			
			while(true) {
				System.out.print((++count) + "ȸ�� ��ȣ �Է� : ");
				int put = sc.nextInt();
			
			if(put == random) {
				System.out.println("<< ��   ��  >>");
				if(rank == 0 || rank > count) {
					rank = count;
				}
				
				break;
			}else if(put > random) {
				System.out.println("<< D O W N >>");
				
				continue;
			}else {
				System.out.println("<< U  P >>");
				
				continue;
			}
		}
			break;
		case 2:
			if(rank ==0 ) {
				System.out.println("���� ����� �����ϴ�.");
			}else {
			System.out.println("���� �ְ� �����" + rank +"ȸ �Դϴ�.");
			}
			break;
		case 3:
			bool = false;
			}
		}
	}
}