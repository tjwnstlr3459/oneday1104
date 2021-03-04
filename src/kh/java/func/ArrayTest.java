package kh.java.func;

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
	 
	 public void arrayCopy() {
		 //���� ����(�ּҰ��� �����ؼ� ���� �迭�� �����ϰ� �ִ� ����)
		 int[]arr1= {5,4,3,2,1};
		 int[]arr2 = arr1;
		 //���� ����(�� �迭�� ����� arr1�� ���� �����ؿ��� ����)
		 int[]arr3 = arr1.clone();
		 int[]arr4 = new int[5];
		 //�κк���
		 System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		 int[]arr5 = new int[5];
		 //for���� �̿��� ����
		 for (int i = 0; i < arr1.length; i++) {
			arr5[i] = arr1[i];
			 System.out.print(arr5[i]+" ");		
		}
		 System.out.println();
		
		 
		 
		 arr1[1] = 10;
		 arr2[2] = 30;
		 for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		 System.out.println();
		 for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
		 System.out.println();
		 
		 for (int i = 0; i < arr3.length; i++) {
				System.out.print(arr3[i]+" ");
			}
		 System.out.println();
	 }
	 public void test2() {
		 int[][]arr = new int[2][3];
		 arr[0][0]=1;
		 arr[0][1]=3;
		 arr[0][2]=5;
		 
		 arr[1][0]=7;
		 arr[1][1]=9;
		 arr[1][2]=11;
		 
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	 }
	 public void exam11() {
		 int[][]arr = new int[5][5];
		 int k = 1;
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
		 
		 for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print((arr[i][j])+" ");
				}
				System.out.println();
			}
		 
	 }
	 
}















