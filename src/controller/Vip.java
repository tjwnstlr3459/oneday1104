package controller;

//실버와 변수구성 같은 보너스 7%
public class Vip {

	//변수 등급, 이름, 포인트 점수
		private String grade;
		private String name;
		private int point;
		
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String grade, String name, int point) {
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
		return point*0.07;
	}
}
