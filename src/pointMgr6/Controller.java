package pointMgr6;

import java.util.ArrayList;
import java.util.Scanner;

import pointMgr6.View;
import pointMgr6.Grade;

public class Controller {

	Scanner sc;
	ArrayList<Grade> members;
	View view;
	
	public Controller() {
		super();
		sc = new Scanner(System.in);
		members = new ArrayList<Grade>();
		view = new View();
	}
	
	public void main() {
		while(true) {
			int sel=view.showView();		
			
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
				return;
			}			
		}
	}
	
	public void insertMember() {
		Grade m =view.insert();
		members.add(m);
	}
	
	public void printAllMember() {
		view.Allmember(members);
	}
	public void printOneMember() {
		String name = view.inputName("��ȸ");
		int searchIndex = searchName(name);
		
		if(searchIndex==-1) {
			view.printMsg("��ȸ�� ����� �����ϴ�.");
		}else {
			view.printOneMember(members.get(searchIndex));
		}
		
	}
	
	public int searchName(String name) {
		for (int i = 0; i < members.size(); i++) {
			if(members.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void modifyMember() {
		String name = view.inputName("��ȸ");
		int searchIndex = searchName(name);
		
		if(searchIndex==-1) {
			view.printMsg("��ȸ�� ����� �����ϴ�.");
		}else {
			Grade m =view.modifyMember();
			members.set(searchIndex, m);
		}
	}
	public void deleteMember() {
		String name = view.inputName("����");
		int searchIndex = searchName(name);
		
		if(searchIndex==-1) {
			view.printMsg("��ȸ�� ����� �����ϴ�.");
		}else {
			members.remove(searchIndex);
			view.printMsg("�����Ϸ�");
		}
	}
	
}























