package kh.java.func.copy;

public class ArrayTest {

	 public void test1() {
		 //���������� 5���� �����Ͽ� ������� 1,2,3,4,5�� ����
		 int num1 = 1;
		 int num2 = 2;
		 int num3 = 3;
		 int num4 = 4;
		 int num5 = 5;
		 //���� 5�� ������ �迭���� �� ������� 1,2,3,4,5�� ����
		 int[]arr = new int[5];		//���̰� 5�� ������ �迭 ����
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		//���� 5�� ������ �迭���� �� ������� 1,2,3,4,5�� ����
		 int[]arr2 = {1,2,3,4,5};
		//���� 5�� ������ �迭���� �� ������� 1,2,3,4,5�� ����
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
		 //���� 3�� ���ڿ� �迭 ���� �� �� ����
		 String[]arr4 = new String[3];
		 arr4[0] = "Hello";
		 arr4[1] = "Hi";
		 arr4[2] = "�ȳ��ϼ���";
		 
		 String[]arr5 = {"Hello","Hi","�ȳ��ϼ���"};
		 
		 System.out.println(arr4);
		 System.out.println(arr5);
	 }
}















