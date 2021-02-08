package kh.java.control;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 10을 입력해보세요 : ");
		int number = sc.nextInt();
		
		if(number == 10) {
			System.out.println("잘했어요");
		}
		System.out.println("끝!");
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("======숫자 구별 프로그램======");
//		System.out.print("임의의 정수를 입력 하세요: ");
//		int num1 = sc.nextInt();
//		
//		if(num1>=0) {
//			System.out.println("당신이 입력한 수" + num1 + "은(는) 양수입니다.");
//		}		
//		if(num2>=0) {
//			System.out.println("당신이 입력한 수" + num2 + "은(는) "+num2+"입니다.");
//		}
//		if(num3<=0) {
//			System.out.println("당신이 입력한 수" + num3 + "은(는) 음수입니다.");
//		}
		/////////
		System.out.println("======숫자 구별 프로그램======");
		System.out.print("임의의 정수를 입력 하세요: ");
		int num4 = sc.nextInt();
		
		if(num4>0) {
			System.out.println("당신이 입력한 수" + num4 + "은(는) 양수입니다.");
		}else if(num4<0) {
			System.out.println("당신이 입력한 수" + num4 + "은(는) 음수입니다.");
		}else System.out.println("당신이 입력한 수" + num4 + "은(는)"+num4+"입니다.");
		
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======두수 비교 프로그램======");
		System.out.print("첫번째 정수를 입력 하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요: ");
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println("두번째 수가 더 큽니다.");
		}
		if(num1==num2) {
			System.out.println("두 수가 같습니다.");
		}
		if(num1>num2) {	
			System.out.println("첫번째 수가 더 큽니다.");
		}
	}
	
	public void  test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======계산기 프로그램======");
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("첫번째 정수를 입력 하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요: ");
		int num2 = sc.nextInt();
		
		if(ch == '+') {
			System.out.println(num1 +"+"+ num2+"="+(num1+num2));
		}
		if(ch == '-') {
			System.out.println(num1 +"-"+ num2+"="+(num1-num2));
		}
		if(ch == '*') {
			System.out.println(num1 +"*"+ num2+"="+num1*num2);
		}
		if(ch == '/') {
			System.out.printf(num1 +"/"+ num2+" = %.2f",(double)num1/num2);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		int adPrice = 15000;
		int chPrice = 5000;
		
		System.out.println("====놀이공원 프로그램====");
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int hu = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 "+adPrice+"원) : ");
		int ad = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 "+chPrice+"원) : ");
		int ch = sc.nextInt();
		
		int sum1 = adPrice * ad;
		int sum2 = chPrice * ch;
		
		if(hu == ad + ch) {
			System.out.println("지불하실 총 금액은 " +(sum1+sum2)+"원 입니다.");
		}else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	
	public void test7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====퀴즈 프로그램====");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2.스티브 잡스)? : ");
		char qu = sc.next().charAt(0);
		
		int suc = 0;
		
		if(qu == '1') {
			System.out.println("정답!!!");
			suc++;
		}else {
			System.out.println("땡!!!");
		}
		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는(1.비싸, 2.빨라)? : ");
		char tr = sc.next().charAt(0);
		
		if(tr == '2') {
			System.out.println("정답!!!");
			suc++;
		}else {
			System.out.println("땡!!!");
		}
		
		System.out.println("총"+suc +"문제 맞췄습니다.");
	}
	
	public void test8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====심리 테스트====");
		System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no)? : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes, 2.no)? : ");
			int num1 = sc.nextInt();
			if(num1 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			}else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		}
		if(num == 2) {
			System.out.print("당신은 이성친구가 있습니까?(1.yes, 2.no)? : ");
			int num2 = sc.nextInt();
			if(num2 == 1) {
				System.out.println("잘해라..");
			}else {
				System.out.println("힘내자..");
			}
			
		}
	}
	public void test9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수");
		}
		if(number%2==1) {
			System.out.println("홀수");
		}
		if(number == 0) {
			System.out.println("0입니다.");
		}
	}
}
