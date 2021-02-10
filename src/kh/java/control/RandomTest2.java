package kh.java.control;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {

	public void test1() {
	Scanner sc = new Scanner(System.in);
	
	Random ran = new Random();
	
	int random = ran.nextInt(99)+1;
	
	boolean bool = true;
	int count = 1;
	while(bool) {
		System.out.println("==Up & Down Game==");
		System.out.println("1.Game Start");
		System.out.println("2.Game Score");
		System.out.println("3.End Game");
		System.out.print("입력 > ");
		
		int num = sc.nextInt();
		
		
		
		switch(num) {
		
		case 1:
			while(true) {
			System.out.println("<< Game Start >>");
			System.out.print(count + "회차 번호 입력 : ");
			int put = sc.nextInt();
			
			if(put == random) {
				System.out.println("<< 정   답  >>");
				count++;
				break;
			}else if(put > random) {
				System.out.println("<< D O W N >>");
				count++;
				continue;
			}else {
				System.out.println("<< U  P >>");
				count++;
				continue;
			}
		}
			break;
		case 2:
			
			System.out.println("현재 최고 기록은" +(count-1)+"회 입니다.");
			
			break;
		case 3:
			bool = false;
			}
		}
	}
}