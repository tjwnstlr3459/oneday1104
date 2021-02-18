package kh.java.run;

import java.util.Scanner;

import kh.java.test.Calc;
import kh.java.test.MethodTest;
import kh.java.test.TV;

public class Strart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//MethodTest me = new MethodTest();
		
		TV tv = new TV();
		
		tv.power();
		System.out.println(tv.power);
		tv.volUp();
		System.out.println(tv.vol);
		
		/*while(true) {
			System.out.println("1. 볼륨 업");
			System.out.println("2. 볼륨 다운");
			System.out.println("3. 채널 업");
			System.out.println("4. 채널 다운");
			System.out.println("5. 채널 변경");
			System.out.println("0. 전원끄기");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				tv.volUp();
				break;
			case 2:
				tv.volDown();
				break;
			case 3:
				tv.chUp();
				break;
			case 4:
				tv.chDown();
				break;
			case 5:
				System.out.print("채널 입력 : ");
				int changeCh = sc.nextInt();
				tv.chChange(changeCh);
				break;
			case 0:
				tv.power();
				break;
			
			}
		}*/

	}
}











