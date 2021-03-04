package pointMgr6;

import java.nio.channels.MembershipKey;
import java.util.ArrayList;
import java.util.Scanner;

import pointMgr6.Gold;
import pointMgr6.Grade;
import pointMgr6.Silver;
import pointMgr6.Vip;

public class View {
	Scanner sc;
	
	public View() {
		super();
		sc = new Scanner(System.in);	
	}
	public String inputName(String str) {
		System.out.print(str+"할 멤버 이름 : ");
		String name = sc.next();
		return name;
	}
	public void printMsg(String str) {
		System.out.println(str);
	}
	
	public int showView() {
		System.out.println("====회원 관리 프로그램v6====");
		System.out.println("1.회원 등록");
		System.out.println("2.전체 회원 출력");
		System.out.println("3.회원 정보 출력(1명)");
		System.out.println("4.회원 정보 수정");
		System.out.println("5.회원 정보 삭제");
		System.out.println("0.프로그램 종료");
		System.out.print("선택==> ");
		int num = sc.nextInt();
		return num;
	}


	public Grade insert() {
		System.out.println("==회원 정보 등록==");
		System.out.print("등급입력[silver/gold/vip/vvip]: ");
		String grade = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("포인트 입력 : ");
		int point = sc.nextInt();
		
		Grade member = null;
		switch (grade) {
		case "silver":	
			member = new Silver(grade, name, point);
			System.out.println("등록완료");
			break;
		case "gold":
			member = new Gold(grade, name, point);
			System.out.println("등록완료");
			break;
		case "vip":	
			member = new Vip(grade, name, point);
			System.out.println("등록완료");
			break;
		default:
			System.out.println("잘못입력하셨습니다");
			break;
		}
		return member;
	}

	public void Allmember(ArrayList<Grade> members) {
		System.out.println("====회원 전체 출력===");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getGrade()+"\t"+members.get(i).getName()
							+"\t"+members.get(i).getPoint()+"\t"+members.get(i).getBonus());
		}
	}
	public void printOneMember(Grade member) {
		System.out.println("====조회된 멤버====");
		System.out.println("멤버 등급 : "+member.getGrade());
		System.out.println("멤버 이름 : "+member.getName());
		System.out.println("멤버 포인트 : "+member.getPoint());
	}
	public Grade modifyMember() {
		System.out.println("====멤버수정====");
		System.out.print("수정할 멤버 등급 : ");
		String mGrade = sc.next();
		System.out.print("수정할 멤버 이름 : ");
		String mName = sc.next();
		System.out.print("수정할 멤버 포인트 : ");
		int mPoint = sc.nextInt();

		Grade m = null;
		switch (mGrade) {
		case "silver":
			m = new Silver(mGrade, mName, mPoint);
			break;
		case "gold":
			m = new Gold(mGrade, mName, mPoint);
			break;
		case "vip":
			m = new Vip(mGrade, mName, mPoint);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

		return m;
		
		
		
	}
	

	

}



























