package kh.java.test;

import java.util.Scanner;

public class MethodTest {
	
	public void test11() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int result = add(a,b);
		int result2 = add(a,b,c);
		int result3 = add(a,b,c,d);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		//오버로딩, 오버라이딩
		
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));
		System.out.println(add(a,b,c,d));
	}
	public int add(int num1, int num2) {
		return (num1+num2);
	}
	//두 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	public int add(int num1, int num2, int num3) {
		return (num1+num2+num3);
	}
	//세 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	public int add(int num1, int num2, int num3, int num4) {
		return (num1+num2+num3+num4);
	}
	//네 수를 매개변수로 받아서 합친 값을 리턴하는 메소드
	
	
	public void test2() {
		
		
		int[]arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		test3(arr[2]);	//참조변수만 넘긴다
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");	//1 2 3 4 5	출력
		}
		System.out.println();
		
		
		
		test4(arr);		//주소를 넘겨줘서 원본에 영향을 미친다
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void test3(int num) {
		num+=100;
		System.out.println(num);	//103이 출력
	}
	
	public void test4(int[]arr1) {
		arr1[2] +=100;
		System.out.println(arr1[2]);
	}
	
	
	
	
	
	
	
	
	
	Scanner sc = new Scanner(System.in);

	public void main() {
		System.out.println("메인메소드입니다!!");
		test1();
		//today 호출
		String today = today();
		System.out.println(today());
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = sum(num1,num2);
		System.out.println(result);
		/*
		//반복문 설정(타입별 홀짝구하기)
		while(true) {
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		//int메소드
		int ck1 = check1(num);
		
		//boolean 메소드 불러오기
		boolean ck2 = check2(num);
		if(ck2) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
			}
		
		//String 메소드
		String ck3 = check3(num);
		System.out.println(ck3);
		}*/
		
		
	}
	public int sum(int num1, int num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		int sum = num1 + num2;
		return (num1+num2);
	}
	
	
	
	
	
	
	public void test1() {
		System.out.println("첫번째 테스트 메소드 입니다.");
	}
	
	
	public String today() {
		System.out.print("hello");
		return "2021-02-17";	//return은 값을 되돌려주면서 해당 메소드를 종료
	}
	
	
	//정수 1개를 매개변수로 받아서 홀수인지 짝수인지 판단해주는 메소드
	//int형
	public int check1(int num1) {
		return num1%2;
	}
	
	//boolean형
	public boolean check2(int num1) {
		//전달받은 매개변수가 짝수면 true리턴 / 홀수면 false 리턴
		if(num1%2 ==0) {
			return true;
		}else {
			return false;
		}
	}
	//String형
	public String check3(int num1) {
		if(num1%2==0) {
			return "짝수";
		}
		return "홀수";
	}
}





















