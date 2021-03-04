package controller;

 import java.util.Scanner;

 import controller.Gold;
 import controller.Silver;
 import controller.Vip;

 public class PointMgr {

 	Scanner sc;

 	Silver[] s;
 	Gold[] g;
 	Vip[] v;

 	int index;
 	int gIndex;
 	int vIndex;

	private int count;

 	//alt + shift + s = c
 	public PointMgr() {
 		super();
 		sc = new Scanner(System.in);
 		s = new Silver[10];
 		g = new Gold[10];
 		v = new Vip[10];
 		index = 0;
 	}

 	public void main() {

 		while(true) {
 			System.out.println("\n----����Ʈ ���� ���α׷�v2----\n");
 			System.out.println("1. ȸ�� ���� ���");
 			System.out.println("2. ��ü ȸ�� ��ȸ");
 			System.out.println("3. ȸ�� 1�� ��ȸ");
 			System.out.println("4. ȸ�� ���� ����");
 			System.out.println("5. ȸ��  ����");
 			System.out.println("0. ���α׷� ����");
 			System.out.print("���� ==>");
 			int sel = sc.nextInt();

 			switch (sel) {
 			case 1:
 				insertMember();
 				break;
 			case 2:
 				printAllMember();
 				break;
 			case 3:
 				printOneMember();
 				break;
 			case 4:
 				modifyMember();
 				break;
 			case 5:
 				deleteMember();
 				break;
 			case 0:
 				System.out.println("bye~!");
 				return;
 			default:
 				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
 			}
 		}
 	}

 	public void insertMember() {
 		System.out.println("----ȸ�� ���� �Է�----");
 		System.out.print("����Է�[silver/gold/vip] : ");
 		String grade = sc.next();
 		System.out.print("�̸��Է� : ");
 		String name = sc.next();
 		System.out.print("����Ʈ �Է�  : ");
 		int point = sc.nextInt();

 		switch (grade) {
 		case "silver":
 			s[index++] = new Silver(grade, name, point);
 			break;
 		case "gold":
 			g[gIndex++] = new Gold(grade, name, point);
 			break;
 		case "vip":
 			v[vIndex++] = new Vip(grade, name, point);
 			break;
 		}

 		System.out.println("��� �Ϸ�");
 		/*�Ʒ������� �ٿ��� ��ó�� �Է�
 		 * Silver silver = new Silver(grade, name, point);
 		s[index] = silver;
 		index++;*/
 	}
 	public void printAllMember() {
 		System.out.println("----��ü ȸ�� ���----");
 		System.out.println("���\t�̸�\t����Ʈ\t���ʽ�");
 		for (int i = 0; i < index; i++) {
 			System.out.println(s[i].getGrade()+"\t"+s[i].getName()+"\t"+s[i].getPoint()+"\t"+s[i].getBonus());
 		}
 		for (int i = 0; i < gIndex; i++) {
 			System.out.println(g[i].getGrade()+"\t"+g[i].getName()+"\t"+g[i].getPoint()+"\t"+g[i].getBonus());
 		}
 		for (int i = 0; i < vIndex; i++) {
 			System.out.println(v[i].getGrade()+"\t"+v[i].getName()+"\t"+v[i].getPoint()+"\t"+v[i].getBonus());
 		}
 	}
 	public void printOneMember() {
 		System.out.println("----ȸ�� ���� ���----");
 		System.out.print("��ȸ �� ȸ�� �̸� �Է� : ");
 		String name = sc.next();
 		int searchIndex = searchMember(name);

 		if(searchIndex == -1) {
 			System.out.println("ȸ�� ������ �����ϴ�.");
 		}else if(count==1){
 			System.out.println("��� : "+s[searchIndex].getGrade());
 			System.out.println("�̸� : "+s[searchIndex].getName());
 			System.out.println("����Ʈ : "+s[searchIndex].getPoint());
 			System.out.println("���ʽ� : "+s[searchIndex].getBonus());
 		}else if(count==2){
 			System.out.println("��� : "+g[searchIndex].getGrade());
 			System.out.println("�̸� : "+g[searchIndex].getName());
 			System.out.println("����Ʈ : "+g[searchIndex].getPoint());
 			System.out.println("���ʽ� : "+g[searchIndex].getBonus());
 		}else {
 			System.out.println("��� : "+v[searchIndex].getGrade());
 			System.out.println("�̸� : "+v[searchIndex].getName());
 			System.out.println("����Ʈ : "+v[searchIndex].getPoint());
 			System.out.println("���ʽ� : "+v[searchIndex].getBonus());
 		}
 		
 	}

 	public void modifyMember() {
 		System.out.println("----ȸ�� ���� ����----");
 		System.out.print("���� �� ȸ�� �̸� �Է� : ");
 		String name = sc.next();

 		int searchIndex = searchMember(name);
 		if(searchIndex == -1) {
 			System.out.println("ȸ�������� �����ϴ�.");
 		}else {
 			System.out.print("������ ��� : ");
 			//s[searchIndex].setGrade(sc.next());
 			String mGrade = sc.next();

 			System.out.print("������ �̸� : ");
 			//s[searchIndex].setName(sc.next());
 			String mName = sc.next();

 			System.out.print("������ ����Ʈ : ");
 			//s[searchIndex].setPoint(sc.nextInt());
 			int mPoint = sc.nextInt();
 			
 			if(count==1) {
 			//���ο� silver ��ü�� �����ؼ� �ش� ��ü�� �迭�� ���� ����
 				s[searchIndex] = new Silver(mGrade, mName, mPoint);
 			}else if(count==2) {
 				g[searchIndex] = new Gold(mGrade, mName, mPoint);
 			}else {
 				v[searchIndex] = new Vip(mGrade, mName, mPoint);
 			}
 			System.out.println("�����Ϸ�");
 		}
 	}
 	public void deleteMember() {
 		System.out.println("----ȸ�� ���� ����----");
 		System.out.print("���� �� ȸ�� �̸� �Է� : ");
 		String name = sc.next();

 		int searchIndex = searchMember(name);
 		if(searchIndex == -1) {
 			System.out.println("ȸ�������� �����ϴ�.");
 		}else if(count==1){
 			for (int i = searchIndex; i < index-1; i++) {
 				s[i]=s[i+1];
 			}
 			s[index--] = null;
 		}else if(count==2){
 			for (int i = searchIndex; i < gIndex-1; i++) {
 				g[i]=g[i+1];
 			}
 			g[gIndex--] = null;
 		}else {
 			for (int i = searchIndex; i < vIndex-1; i++) {
 				v[i]=v[i+1];
 			}
 			v[vIndex--] = null;
 		}
 		System.out.println("�����Ϸ�");
 	}

 	public int searchMember(String name) {
 		for (int i = 0; i < index; i++) {
 			if(s[i].getName().equals(name)) {
 				count=1;
 				return i;
 			}
 		}
 		for (int j = 0; j < gIndex; j++) {
 	 		if(g[j].getName().equals(name)) {
 	 			count=2;
 	 			return j;
 	 		}
 		}
 		for (int k = 0; k < vIndex; k++) {
 	 		if(v[k].getName().equals(name)) {
 	 			count=3;
 	 			return k;
 	 		}
 		}
 		return -1;
 	}
 }
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	