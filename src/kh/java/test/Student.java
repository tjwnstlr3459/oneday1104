package kh.java.test;

public class Student {
	//학생정보 관리용 클래스
	//속성 : 학번/이름/학과/나이/성별
	
	private int stdNo;
	private String name;
	private String dept;
	private int age;
	private char gender;
	
	//생성자
	public Student() {
		//System.out.println("학색 객체 만든다!!");
		//this.age=20;
	}
	//생성자도 오버로딩이 가능함
	public Student(int stdNo, String name, String dept, int age, char gender) {
		this.stdNo = stdNo;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
	}
	
	
	//getter -> 변수값을 가져오는 메소드
	public int getStdNo() {
		return stdNo;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return this.dept;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	
	//setter -> 변수에 값을 저장하는 메소드
	public void setStdNo(int studentNo) {
		stdNo = studentNo;
	}
	public void setName(String studentName) {
		name = studentName;
	}
	public void setDept(String dept) {	//전역변수와 지역변수명을 같게하면
		this.dept = dept;				//지역변수에만 저정하니 
	}									//전역변수 앞에 this.를 붙힌다
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}












