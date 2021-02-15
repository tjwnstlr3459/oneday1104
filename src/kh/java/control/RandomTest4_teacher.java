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
			System.out.print("���� > ");
			switch (sc.nextInt()) {
			case 1:
				if (money == 0) {
					System.out.println("�ܾ��� �����ϴ�. bye~");
				} else {
					while (true) {
						System.out.println("<< Game Start >>");
						int userTotal = 0;
						for (int i = 0; i < 3; i++) {
							int randNum = r.nextInt(6) + 1;
							System.out.println((i + 1) + "��° �ֻ��� �� : " + randNum);
							userTotal += randNum;
						}
						System.out.println("�� �ֻ��� �� �� : " + userTotal);
						System.out.print("���� �Ͻðڽ��ϱ�[y/n] : ");
						char sel = sc.next().charAt(0);
						if (sel == 'y') {
							int batMoney = 0;
							while (true) {
								System.out.print("�󸶸� �����Ͻðڽ��ϱ�(���� �� ������ " + money + "��) : ");
								batMoney = sc.nextInt();
								if (batMoney > money) {
									System.out.println("�ݾ��� �����մϴ�. �ٽ� �Է����ּ���.");
									continue;
								}
								break;
							}
							int comTotal = 0;
							for (int i = 0; i < 3; i++) {
								int randNum = r.nextInt(6) + 1;
								System.out.println("��ǻ�� " + (i + 1) + "��° �ֻ��� �� : " + randNum);
								comTotal += randNum;
							}
							System.out.println("��ǻ�� �ֻ��� �� �� : " + comTotal);
							System.out.println("<< ��� >>");
							if (userTotal > comTotal) {
								System.out.println("�¸�!!!!!");
								System.out.println("+" + batMoney + "��!!");
								money += batMoney;
								win++;
							} else if (userTotal < comTotal) {
								System.out.println("�й�!!");
								money -= batMoney;
								System.out.println("-" + batMoney + "��!!");
								lose++;
								if (money == 0) {
									System.out.println("���� Bye~");
									break;
								}
							} else {
								System.out.println("���º�!!");
								draw++;
							}
							System.out.print("�ѹ� �� �Ͻðڽ��ϱ�[y/n] : ");
							if (sc.next().charAt(0) == 'n') {
								break;
							}
						} else {
							System.out.println("�޴��� ���ư��ϴ�.");
							break;
						}
					}
				}

				break;
			case 2:
				System.out.println("<<����� ����>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("�� ������ : " + money + "��");
				break;
			case 3:
				bool=false;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
		












































