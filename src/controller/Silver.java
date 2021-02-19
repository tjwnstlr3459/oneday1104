package controller;

public class Silver {
	//변수 등급, 이름, 포인트 점수
	private String grade;
	private String name;
	private int point;
	//기본생성자
		//매개변수 있는 생성자
		//getter/setter
		
	
	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Silver(String grade, String name, int point) {
		super();
		this.grade = grade;
		this.name = name;
		this.point = point;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public double getBonus() {
		return 0.02*point;
	}
	
	
	
}
