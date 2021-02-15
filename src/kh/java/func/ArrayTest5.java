package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		int arr[] = new int[6];
		int arr1[] = new int[6];
		
		boolean bool = true;
		
		int count=0;
		
		while(bool) {
			
			System.out.println("===로또프로그램===");
			//사용자 번호입력
			for (int i = 0; i < arr.length; i++) {
				System.out.print((i+1)+"번째 번호 입력(1~45) :");
				int num1 = sc.nextInt();
				//번호입력 정상시
				if(num1>=0 && num1<=45) {
					//중복된 번호 있을시
					boolean boo = true;
					for (int j = 0; j < i; j++) {
						if(num1==arr[j]) {
							System.out.println("중복된 번호입니다 .다시입력해주세요");
							i--;
							boo = false;
							break;
						}
					}if(boo) {
						arr[i] = num1;
					}
					//번호입력 비정상시
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					i--;
				}
			}
			//컴퓨터 번호 생성
			for (int i = 0; i < arr1.length; i++) {
				int cpu = r.nextInt(45)+1;
				for (int j = 0; j < arr1.length; j++) {
					if(cpu==arr1[j]) {
						cpu=r.nextInt(45)+1;
					}
				}
				arr1[i] = cpu;
			}
			//사용자 번호 버블정렬
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-i-1; j++) {	//i를 넣나 안넣나 결과는 같지만 데이터를 위해서
					if(arr[j]>arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}
			//cpu 번호 버블정렬
			for (int i = 0; i < arr1.length-1; i++) {
				for (int j = 0; j < arr1.length-i-1; j++) {	//i를 넣나 안넣나 결과는 같지만 데이터를 위해서
					if(arr1[j]>arr1[j+1]) {
						int tmp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = tmp;
					}
				}
			}
			//사용자 번호 출력
			System.out.println("사용자 번호");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			//컴퓨터 번호 출력
			System.out.println("컴퓨터 번호");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] +" ");
			}
			System.out.println();
			
			//맞은개수
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr1.length; j++) {
					if(arr[i]==arr1[j]) {
						count++;
					}
				}
			}
			System.out.println("맞은 개수 : " + count);
			switch (count) {
			case 1:
			case 2:
			case 3:
				System.out.println("꽝");
				break;
			case 4:
				System.out.println("3등입니다.");
				break;
			case 5:
				System.out.println("2등입니다.");
				break;
			case 6:
				System.out.println("1등입니다.");
				break;
			}
			//한번더?
			System.out.print("한번 더 하시겠습니까?(1.yes/ 2.no)");
			int sel = sc.nextInt();
			if(sel==1) {
				count=0;
				continue;
			}else {
				bool=false;
				break;
			}
		}
	}
}
		



















