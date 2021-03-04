package kh.java.func;


public class ArrayTest9 {

	public void test1() {
		//숫자 정렬
		int[][]arr = new int[5][5];
		 int k = 1;
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.print((arr[i][j])+" ");
			}
			System.out.println();
		 } 
	}
	public void test2() {
		//숫자 역방향
		int[][]arr = new int[5][5];
		 int k = 5;
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k--;
				System.out.print((arr[i][j])+" ");
			}
			k+=10;
			System.out.println();
		 } 
	}
	public void test3() {
		//숫자 세로방향
		int[][]arr = new int[5][5];
		 int k = 1;
		 for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
				System.out.print((arr[i][j])+" ");
				arr[i][j] = k+=4;
			}
			System.out.println();
			k-=24;
		 } 
	}
	public void test4() {
		//숫자 역차순 세로방향
		int[][]arr = new int[5][5];
		 int k = 0;
		 for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k+=5;
				System.out.print((arr[i][j])+" ");
				
			}
			System.out.println();
			k-=26;
		 } 
	}
	public void test5() {
		//숫자 내림차순/오름차순
		int[][]arr = new int[5][5];
		 int k = 1;
		 for (int i = 0; i < arr.length; i++) {
			 if(i%2==0) {
				 for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = k++;
						System.out.print((arr[i][j])+" ");
						}
			 	}else {
			 		k+=4;
			 		 for (int j = 0; j < arr[i].length; j++) { 	
						arr[i][j] = k--;
						System.out.print((arr[i][j])+" ");
						}
			 		 k+=6;
			 }
			 System.out.println();
		 }
	}
}
	
	














