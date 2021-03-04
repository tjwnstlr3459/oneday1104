package controller;

public class Student {

	private String name;
	private int age;
	private String addr;
	
	
	//기본생성자
	public Student() {
		
	}
	
	//매개변수 있는 생성자
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	//변수별 getter, setter
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
