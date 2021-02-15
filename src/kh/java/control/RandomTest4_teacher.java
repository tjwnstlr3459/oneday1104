package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest4_teacher {
	public void dice() {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		int money = 10000;
		boolean bool = true;
		while (bool) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			switch (sc.nextInt()) {
			case 1:
				if (money == 0) {
					System.out.println("잔액이 없습니다. bye~");
				} else {
					while (true) {
						System.out.println("<< Game Start >>");
						int userTotal = 0;
						for (int i = 0; i < 3; i++) {
							int randNum = r.nextInt(6) + 1;
							System.out.println((i + 1) + "번째 주사위 값 : " + randNum);
							userTotal += randNum;
						}
						System.out.println("내 주사위 총 합 : " + userTotal);
						System.out.print("배팅 하시겠습니까[y/n] : ");
						char sel = sc.next().charAt(0);
						if (sel == 'y') {
							int batMoney = 0;
							while (true) {
								System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + money + "원) : ");
								batMoney = sc.nextInt();
								if (batMoney > money) {
									System.out.println("금액이 부족합니다. 다시 입력해주세요.");
									continue;
								}
								break;
							}
							int comTotal = 0;
							for (int i = 0; i < 3; i++) {
								int randNum = r.nextInt(6) + 1;
								System.out.println("컴퓨터 " + (i + 1) + "번째 주사위 값 : " + randNum);
								comTotal += randNum;
							}
							System.out.println("컴퓨터 주사위 총 합 : " + comTotal);
							System.out.println("<< 결과 >>");
							if (userTotal > comTotal) {
								System.out.println("승리!!!!!");
								System.out.println("+" + batMoney + "원!!");
								money += batMoney;
								win++;
							} else if (userTotal < comTotal) {
								System.out.println("패배!!");
								money -= batMoney;
								System.out.println("-" + batMoney + "원!!");
								lose++;
								if (money == 0) {
									System.out.println("거지 Bye~");
									break;
								}
							} else {
								System.out.println("무승부!!");
								draw++;
							}
							System.out.print("한번 더 하시겠습니까[y/n] : ");
							if (sc.next().charAt(0) == 'n') {
								break;
							}
						} else {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					}
				}

				break;
			case 2:
				System.out.println("<<당신의 전적>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + money + "원");
				break;
			case 3:
				bool=false;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
		












































