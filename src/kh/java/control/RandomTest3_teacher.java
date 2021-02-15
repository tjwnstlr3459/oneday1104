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
			System.out.print("선택 > ");
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
							System.out.println("1~3사이 값을 입력해주세요.");
						} else {
							break;
						}
					}

					for (int i = 0; i < userNum; i++) {
						k++;
						System.out.println(k + "!");
						if (k == 31) {
							lose++;
							System.out.println("패배ㅠㅠ");
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
							System.out.println("승리!!!!!");
							break;
						}
					}
					if (k == 31) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("<<당신의 전적>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				break;
			case 3:
				bool = false;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}	
	}
}



