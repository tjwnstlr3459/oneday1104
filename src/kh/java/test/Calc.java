package kh.java.test;

public class Calc {

	public void main() {
		int num1 = 10;
		int num2 = 3;
		int result1 = addFunction(num1,num2);
		int result2 = subFunction(num1,num2);
		int result3 = mulFunction(num1,num2);
		double result4 = divFunction(num1,num2);
		
		System.out.println(result1);	//13
		System.out.println(result2);	//7
		System.out.println(result3);	//30
		System.out.printf("%.6f",result4);	//3.3333
		
	}
	public int addFunction(int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	public int subFunction(int num1,int num2) {
		int sum = num1-num2;
		return sum;
	}
	public int mulFunction(int num1,int num2) {
		int sum = num1*num2;
		return sum;
	}
	public double divFunction(double num1,double num2) {
		double sum = num1/num2;
		return sum;
	}
}
