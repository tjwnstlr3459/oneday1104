package kh.java.func;


public class ArrayTest9 {

	public void test1() {
		//���� ����
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
		//���� ������
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
		//���� ���ι���
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
		//���� ������ ���ι���
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
		//���� ��������/��������
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
	
	














