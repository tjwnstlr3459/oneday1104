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
		System.out.print("입력 > ");
		
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("<< Game Start >>");
			int count = 0;
			int random = ran.nextInt(99)+1;	//while문 안에 넣으면 매번 새로운 난수 생성
			
			while(true) {
				System.out.print((++count) + "회차 번호 입력 : ");
				int put = sc.nextInt();
			
			if(put == random) {
				System.out.println("<< 정   답  >>");
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
				System.out.println("아직 기록이 없습니다.");
			}else {
			System.out.println("현재 최고 기록은" + rank +"회 입니다.");
			}
			break;
		case 3:
			bool = false;
			}
		}
	}
}