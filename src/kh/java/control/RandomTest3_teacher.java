package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest3_teacher {
	public void test2() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int lose = 0;
		
		boolean bool = true;
		
		while (bool) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("���� > ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("<< Game Start >>");
				int k = 0;
				while (true) {
					System.out.println("<< Your Turn >>");
					int userNum = 0;
					while (true) {
						System.out.print("Input Number : ");
						userNum = sc.nextInt();
						if (userNum > 3 || userNum < 1) {
							System.out.println("1~3���� ���� �Է����ּ���.");
						} else {
							break;
						}
					}

					for (int i = 0; i < userNum; i++) {
						k++;
						System.out.println(k + "!");
						if (k == 31) {
							lose++;
							System.out.println("�й�Ф�");
							break;
						}
					}
					if (k == 31) {
						break;
					}
					System.out.println("<< Computer Turn >>");
					for (int i = 0; i < (r.nextInt(3) + 1); i++) {
						k++;
						System.out.println(k + "!");
						if (k == 31) {
							win++;
							System.out.println("�¸�!!!!!");
							break;
						}
					}
					if (k == 31) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("<<����� ����>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3:
				bool = false;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}	
	}
}



