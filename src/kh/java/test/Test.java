package kh.java.test;

public class Test {

	public void main() {
		TV tv = new TV();
		tv.power();
		System.out.println(tv.power); 	//true
		tv.volUp(); //vo =1
		System.out.println(tv.vol); 	
		//���� ��Ű�� ���̶� public ���� ���� ��밡��
	}
}
