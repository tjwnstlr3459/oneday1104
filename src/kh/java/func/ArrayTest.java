package kh.java.func;

public class ArrayTest {

	 public void test1() {
		 //정수형변수 5개를 선언하여 순서대로 1,2,3,4,5를 대입
		 int num1 = 1;
		 int num2 = 2;
		 int num3 = 3;
		 int num4 = 4;
		 int num5 = 5;
		 //길이 5인 정수형 배열선언 후 순서대로 1,2,3,4,5를 대입
		 int[]arr = new int[5];		//길이가 5인 정수형 배열 선언
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		//길이 5인 정수형 배열선언 후 순서대로 1,2,3,4,5를 대입
		 int[]arr2 = {1,2,3,4,5};
		//길이 5인 정수형 배열선언 후 순서대로 1,2,3,4,5를 대입
		 int[]arr3 = new int[5];
		 for(int i=0; i<5; i++) {
			 arr3[i] = i+1;
		 }
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(num3);
		 System.out.println(num4);
		 
		 for(int i=0; i<10; i++) {
			 System.out.println(arr3[i]);
		 }
		 //길이 3인 문자열 배열 선언 후 값 대입
		 String[]arr4 = new String[3];
		 arr4[0] = "Hello";
		 arr4[1] = "Hi";
		 arr4[2] = "안녕하세요";
		 
		 String[]arr5 = {"Hello","Hi","안녕하세요"};
		 
		 System.out.println(arr4);
		 System.out.println(arr5);
	 }
}















