package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		
		
		int arr[] = new int[6];
		int arr1[] = new int[6];
		
		boolean bool = true;
		
		while(bool) {
			System.out.print("로또 하시겠습니까?(1.yes/2.no) : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("==로또 프로그램==");
				//로또 번호 입력
				for(int i=0; i<arr.length; i++) {
					System.out.print((i+1)+"번째 번호 입력(1~45) : ");
					int inputNum =sc.nextInt();
					
					if(inputNum<0 || inputNum>45) {
						System.out.println("1~45 숫자를 입력하세요");
						i--;	//오답일시 번째를 다시 적기위해서
					}else {
						//정상적인 숫자 입력시
						boolean boo = true;
						for (int j = 0; j < i; j++) {
							if(inputNum == arr[j]) {
								System.out.println("중복된 번호입니다. 다시 입력하세요.");
								i--;
								boo = false;
								break;
							}
						}
						if(boo) {
							arr[i] = inputNum;
						}
					}
				}
				//버블정렬
				for (int i = 0; i < arr.length-1; i++) {
					for (int j = 0; j < arr.length-i-1; j++) {	//i를 넣나 안넣나 결과는 같지만 데이터를 위해서
						if(arr[j]>arr[j+1]) {
							int tmp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = tmp;
						}
					}
				}
				//나의 번호 출력
				System.out.println("사용자 번호 ");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				
				//컴퓨터 로또 번호 생성
				for(int i=0; i<arr1.length; i++) {
					int ran = r.nextInt(45)+1;
					arr1[i] = ran;
				}
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr1.length; j++) {
						if(arr1[i]==arr1[j]) {
							arr1[j]=r.nextInt(45)+1;
						}
					}
				}
				
				//버블정렬
				for (int i = 0; i < arr1.length-1; i++) {
					for (int j = 0; j < arr1.length-i-1; j++) {	//i를 넣나 안넣나 결과는 같지만 데이터를 위해서
						if(arr1[j]>arr1[j+1]) {
							int tmp = arr1[j];
							arr1[j] = arr1[j+1];
							arr1[j+1] = tmp;
						}
					}
				}
				//컴퓨터 번호 출력
				System.out.println("컴퓨터 번호 ");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				System.out.println();
				
				//번호 맞췄는지
				int count =0;
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						if(arr[i]==arr1[j]) {
							count++;
						}
					}
				}
				System.out.println("맞춘개수 : " + count);
				
				if(count==6) {
					System.out.println("1등입니다.");
				}if(count==5) {
					System.out.println("2등입니다.");
				}if(count==4) {
					System.out.println("3등입니다.");
				}else {
					System.out.println("꽝입니다.");
				}
				//한번 더 할지?
				System.out.print("한번 더 하시겠습니까(1.yes/2.no) ?");
				int sel = sc.nextInt();
				if(sel==1) {
					continue;
				}else if(sel==2) {
					bool =false;
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
			case 2:
				bool =false;
				break;
			}
		
	}
	}
}
