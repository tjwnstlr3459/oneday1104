package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest10 {

	//실습문제2
	public void test2() {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	boolean bool = true;
	
	int weight=0;
	int height=0;
	
	while(bool) {
	System.out.print("가로행의 개수를 입력하세요(1~10)==>");
	weight = sc.nextInt();
	//오차범위일시
	if(weight<0 || weight>10) {
		System.out.println("1과10사이의 숫자만 입력해주세요");
		}else {
			break;
		}
	}
	while(bool) {
	System.out.print("세로행의 개수를 입력하세요(1~10)==>");
	height = sc.nextInt();
	//오차범위일시
	if(height<0 || height>10) {
		System.out.println("1과10사이의 숫자만 입력해주세요");
		}else {
			break;
		}
	}
	int arr[][] = new int[weight][height];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			int ran = r.nextInt(10)+97;
			char ch= (char)ran;
			//수학함수를 이용한 랜덤
			//int num=(int)(Math.random()*10)+97;
			//char ch = (char)num;
			arr[i][j]= ch;
			System.out.print((char)arr[i][j]+ " ");
		}
		System.out.println();
	
		}
	}
}
