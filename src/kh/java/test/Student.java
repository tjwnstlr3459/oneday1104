package kh.java.test;

public class Student {
	//�л����� ������ Ŭ����
	//�Ӽ� : �й�/�̸�/�а�/����/����
	
	private int stdNo;
	private String name;
	private String dept;
	private int age;
	private char gender;
	
	//������
	public Student() {
		//System.out.println("�л� ��ü �����!!");
		//this.age=20;
	}
	//�����ڵ� �����ε��� ������
	public Student(int stdNo, String name, String dept, int age, char gender) {
		this.stdNo = stdNo;
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.gender = gender;
	}
	
	
	//getter -> �������� �������� �޼ҵ�
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
	
	//setter -> ������ ���� �����ϴ� �޼ҵ�
	public void setStdNo(int studentNo) {
		stdNo = studentNo;
	}
	public void setName(String studentName) {
		name = studentName;
	}
	public void setDept(String dept) {	//���������� ������������ �����ϸ�
		this.dept = dept;				//������������ �����ϴ� 
	}									//�������� �տ� this.�� ������
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	
}












