package controller;

public class Student {

	private String name;
	private int age;
	private String addr;
	
	
	//�⺻������
	public Student() {
		
	}
	
	//�Ű����� �ִ� ������
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	//������ getter, setter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}
