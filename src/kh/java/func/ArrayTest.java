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
	 
	 public void arrayCopy() {
		 //얕은 복사(주소값만 복사해서 같은 배열을 참조하고 있는 상태)
		 int[]arr1= {5,4,3,2,1};
		 int[]arr2 = arr1;
		 //깊은 복사(새 배열을 만들고 arr1의 값을 복사해오는 상태)
		 int[]arr3 = arr1.clone();
		 int[]arr4 = new int[5];
		 //부분복사
		 System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		 int[]arr5 = new int[5];
		 //for문을 이용한 복사
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















