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
			System.out.println("1. ���� ��");
			System.out.println("2. ���� �ٿ�");
			System.out.println("3. ä�� ��");
			System.out.println("4. ä�� �ٿ�");
			System.out.println("5. ä�� ����");
			System.out.println("0. ��������");
			System.out.print("���� > ");
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
				System.out.print("ä�� �Է� : ");
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











