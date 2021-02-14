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
		System.out.print("입력 > ");
		
		int num = sc.nextInt();
		
		
		boolean en = true;
		
		int money = 10000;
		switch(num) {
		case 1:
			while(en) {
				if(money == 0) {
					System.out.println("잔액이 없습니다. bye~");
					break;
				}
				int sum1 = 0;
				int sum2 = 0;
				int batt = 0;
				System.out.println("<< Game Start >>");		
				for(int i=0; i<3; i++) {
					int random = ran.nextInt(6)+1;
					System.out.println(+i+1+"번째 주사위값 : "+random);
					sum1 += random;
				}
				System.out.println("내 주사위의 총합 : " + sum1);
				
				System.out.print("배팅하시겠습니까? [y/n]");
				char sel = sc.next().toLowerCase().charAt(0);
				
				if(sel == 'y') {
					boolean mo=true;
					while(mo) {
					System.out.print("얼마를 배팅하시겠습니까?(현재 내 소지금"+money+"원) : ");
					batt = sc.nextInt();
					if(money<batt) {
						System.out.println("돈을 초과했습니다. 다시 입력하세요");
						continue;
						}else {
							mo = false;
						}
					}
					for(int i=0; i<3; i++) {
						int random = ran.nextInt(6)+1;
						System.out.println("컴퓨터 "+i+"번째 주사위값 : "+random);
						sum2 += random;
					}
					System.out.println("컴퓨터 주사위의 총합 : " + sum2);
					if(sum1>sum2) {
						System.out.println("승리");
						System.out.println("+"+batt+"원");
						win++;
						money += batt;
						System.out.print("한번 더 하시겠습니까?[y/n]");
						char ch = sc.next().toLowerCase().charAt(0);
						if(ch=='y') {
							continue;
						}en = false;
						break;
					}else if(sum1<sum2) {
						System.out.println("패배");
						System.out.println("-"+batt+"원");
						lose++;
						money -= batt;
						if(money <= 0) {
							System.out.println("거지ㅠㅠ");
							System.out.println();
							en = false;
							break;
						}
						System.out.println("한번 더 하시겠습니까?[y/n]");
						char ch = sc.next().toLowerCase().charAt(0);
						if(ch=='y') {
							continue;
						}en = false;
						break;
					}else {
						System.out.println("비겼습니다.");
						System.out.println("한번더 하시겠습니까?[y/n]");
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
			System.out.println("<< 당신의 전적 >>");
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
		












































