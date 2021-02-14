package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest3 {
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		Random ran = new Random();

		boolean bool = true;
		
		int win = 0;
		int lose = 0;
		while(bool) {
		System.out.println("==Baskin Robbins31 Game==");
		System.out.println("1.Game Start");
		System.out.println("2.Game Score");
		System.out.println("3.End Game");
		System.out.print("입력 > ");
		
		int num = sc.nextInt();
		
		boolean en = true;
		switch(num) {
		
		case 1:
			int count = 1;
			System.out.println("<< Game Start >>");
			
			while(en) {
				
			int random = ran.nextInt(3)+1;
			
			System.out.println(" Your Turn ");
			System.out.print("입력(1~3) : ");
			int put = sc.nextInt();
			if(put<1 || put>3) {
				System.out.println("잘못된 범위 입니다.");
				continue;
			}
			
			if(count<31) {
				if(put == 1) {
				for(int i=0; i<put; i++) {
					System.out.println(count++);
				}
			}else if(put == 2) {
				for(int i=0; i<put; i++) {
					System.out.println(count++);					
				}
			}else if(put == 3) {
				for(int i=0; i<put; i++) {
					System.out.println(count++);					
					}
				}
			}
			if(count>31) {
				System.out.println("패배");
				lose++;
				en=false;
				break;
				}
			
			System.out.println(" Computer Turn ");
			for(int i=1; i<=random; i++) {
				if(count<31) {
				System.out.println(count++);
				}
			}
			if(count>=31){
				System.out.println("31");
				System.out.println("승리");
				win++;
				en=false;
				break;
				}
		}
			break;
			
		case 2:
			System.out.println("  <<당신의 전적 >>  ");
			System.out.println("WIN : " + win);
			System.out.println("LOSE : " + lose);
			break;
			
		case 3:
			bool = false;
			}
		}
	}
}





