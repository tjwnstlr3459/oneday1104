package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest4 {
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();

		boolean bool = true;
		
		int win = 0;
		int lose = 0;
		
		while(bool) {
		System.out.println("==Dise Game==");
		System.out.println("1.Game Start");
		System.out.println("2.Game Score");
		System.out.println("3.End Game");
		System.out.print("�Է� > ");
		
		int num = sc.nextInt();
		
		
		boolean en = true;
		
		int money = 10000;
		switch(num) {
		case 1:
			while(en) {
				if(money == 0) {
					System.out.println("�ܾ��� �����ϴ�. bye~");
					break;
				}
				int sum1 = 0;
				int sum2 = 0;
				int batt = 0;
				System.out.println("<< Game Start >>");		
				for(int i=0; i<3; i++) {
					int random = ran.nextInt(6)+1;
					System.out.println(+i+1+"��° �ֻ����� : "+random);
					sum1 += random;
				}
				System.out.println("�� �ֻ����� ���� : " + sum1);
				
				System.out.print("�����Ͻðڽ��ϱ�? [y/n]");
				char sel = sc.next().toLowerCase().charAt(0);
				
				if(sel == 'y') {
					boolean mo=true;
					while(mo) {
					System.out.print("�󸶸� �����Ͻðڽ��ϱ�?(���� �� ������"+money+"��) : ");
					batt = sc.nextInt();
					if(money<batt) {
						System.out.println("���� �ʰ��߽��ϴ�. �ٽ� �Է��ϼ���");
						continue;
						}else {
							mo = false;
						}
					}
					for(int i=0; i<3; i++) {
						int random = ran.nextInt(6)+1;
						System.out.println("��ǻ�� "+i+"��° �ֻ����� : "+random);
						sum2 += random;
					}
					System.out.println("��ǻ�� �ֻ����� ���� : " + sum2);
					if(sum1>sum2) {
						System.out.println("�¸�");
						System.out.println("+"+batt+"��");
						win++;
						money += batt;
						System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?[y/n]");
						char ch = sc.next().toLowerCase().charAt(0);
						if(ch=='y') {
							continue;
						}en = false;
						break;
					}else if(sum1<sum2) {
						System.out.println("�й�");
						System.out.println("-"+batt+"��");
						lose++;
						money -= batt;
						if(money <= 0) {
							System.out.println("�����Ф�");
							System.out.println();
							en = false;
							break;
						}
						System.out.println("�ѹ� �� �Ͻðڽ��ϱ�?[y/n]");
						char ch = sc.next().toLowerCase().charAt(0);
						if(ch=='y') {
							continue;
						}en = false;
						break;
					}else {
						System.out.println("�����ϴ�.");
						System.out.println("�ѹ��� �Ͻðڽ��ϱ�?[y/n]");
						char ch = sc.next().toLowerCase().charAt(0);
						if(ch=='y') {
							continue;
						}en = false;
						break;
					}	
				}else if(sel =='n'){
					en = false;
					break;
					}
				}
			
			break;
		case 2:
			System.out.println("<< ����� ���� >>");
			System.out.println("W I N : " + win);
			System.out.println("L O S E : " + lose);
			break;
		case 3:
			en = false;
			break;
		
			}
		}
	}
}	
		












































