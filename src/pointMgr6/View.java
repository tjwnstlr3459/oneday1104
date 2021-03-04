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
		System.out.print(str+"�� ��� �̸� : ");
		String name = sc.next();
		return name;
	}
	public void printMsg(String str) {
		System.out.println(str);
	}
	
	public int showView() {
		System.out.println("====ȸ�� ���� ���α׷�v6====");
		System.out.println("1.ȸ�� ���");
		System.out.println("2.��ü ȸ�� ���");
		System.out.println("3.ȸ�� ���� ���(1��)");
		System.out.println("4.ȸ�� ���� ����");
		System.out.println("5.ȸ�� ���� ����");
		System.out.println("0.���α׷� ����");
		System.out.print("����==> ");
		int num = sc.nextInt();
		return num;
	}


	public Grade insert() {
		System.out.println("==ȸ�� ���� ���==");
		System.out.print("����Է�[silver/gold/vip/vvip]: ");
		String grade = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("����Ʈ �Է� : ");
		int point = sc.nextInt();
		
		Grade member = null;
		switch (grade) {
		case "silver":	
			member = new Silver(grade, name, point);
			System.out.println("��ϿϷ�");
			break;
		case "gold":
			member = new Gold(grade, name, point);
			System.out.println("��ϿϷ�");
			break;
		case "vip":	
			member = new Vip(grade, name, point);
			System.out.println("��ϿϷ�");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			break;
		}
		return member;
	}

	public void Allmember(ArrayList<Grade> members) {
		System.out.println("====ȸ�� ��ü ���===");
		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getGrade()+"\t"+members.get(i).getName()
							+"\t"+members.get(i).getPoint()+"\t"+members.get(i).getBonus());
		}
	}
	public void printOneMember(Grade member) {
		System.out.println("====��ȸ�� ���====");
		System.out.println("��� ��� : "+member.getGrade());
		System.out.println("��� �̸� : "+member.getName());
		System.out.println("��� ����Ʈ : "+member.getPoint());
	}
	public Grade modifyMember() {
		System.out.println("====�������====");
		System.out.print("������ ��� ��� : ");
		String mGrade = sc.next();
		System.out.print("������ ��� �̸� : ");
		String mName = sc.next();
		System.out.print("������ ��� ����Ʈ : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}

		return m;
		
		
		
	}
	

	

}



























