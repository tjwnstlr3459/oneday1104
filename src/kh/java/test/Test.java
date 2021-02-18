package kh.java.test;

public class Test {

	public void main() {
		TV tv = new TV();
		tv.power();
		System.out.println(tv.power); 	//true
		tv.volUp(); //vo =1
		System.out.println(tv.vol); 	
		//같은 팩키지 안이라서 public 설정 없이 사용가능
	}
}
