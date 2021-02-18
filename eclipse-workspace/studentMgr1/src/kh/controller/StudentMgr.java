package kh.controller;
import java.net.Socket;
import java.util.Scanner;

public class StudentMgr {
	//10�� �л������� �Է�/���/����/���� �ϴ� ���α׷�
	
	String[] name;	//�̸� ������ �迭
	int[] age;		//���� ������ �迭
	String[] addr;		//�ּ� ������ �迭
	int index;		//�迭 ������ȣ
	Scanner sc;;	//Ű���� �Է°��� �ޱ����� ��ü
	
	public StudentMgr() {
		name = new String[10];
		age = new int[10];
		addr = new String[10];
		index = 0;
		sc = new Scanner(System.in);
		System.out.println("���α׷� ���� �غ� �Ϸ�!!");
	}
	//��ü ����޴�
	public void main() {
		while(true) {
			System.out.println("\n----�л����� ���α׷�v1----\n");
			System.out.println("1.�л� ���� ���");
			System.out.println("2.�л� ���� ���(��ü)");
			System.out.println("3.�л� ���� �˻�(1�� �̸����� �˻�)");
			System.out.println("4.�л� ���� ����");
			System.out.println("5.�л� ���� ����");
			System.out.println("0.���α׷� ����");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			
			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				modifyStudent();
				break;
			case 5:
				break;
			case 0:
				System.out.println("bye~!");
				return;	//return�� �޼ҵ� ��ü�� ��������
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			
			
		}
		
	}
	//�л� ������ �Է¹޾� �迭�� �־��ִ� �޼ҵ�
	public void insertStudent() {
		System.out.println("\n----�л� ���� ���----\n");
		System.out.print("�̸� �Է� : ");
		String inputName = sc.next();
		
		System.out.print("���� �Է� : ");
		int inputAge = sc.nextInt();		
		
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();					//���ۿ��� ���๮�� ����(���ϸ� ���ͱ��� �Ծ����)
		String inputAddr = sc.nextLine();	//nextLine�� ���� ���� �ֱ�����
		
		//�迭�� �Է¹��� ���� �ְ� �迭������ȣ ���� 
		name[index] = inputName;
		age[index] = inputAge;
		addr[index] = inputAddr;
		index++;				//++���ϸ� �迭0�ε������� ��� ������
		System.out.println("���� ��� �Ϸ�");
	}
	
	public void printAllStudent() {
		System.out.println("\n----��ü �л� ���� ���----\n");
		System.out.println("�̸�\t����\t�ּ�");
		System.out.println("------------------------");
		for (int i = 0; i < index; i++) {
			System.out.println(name[i]+"\t"+age[i]+"\t"+addr[i]);
		}
		
	}
	//�л� �̸��� �Է¹޾� �ش� �л��� ������ ����ϴ� �޼ҵ�
	public void printOneStudent() {
		System.out.println("\n----�л� ���� ���(1��)----\n");
		System.out.print("��ȸ�� �л� �̸� �Է� : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if(searchIndex == -1) {
			System.out.println("�л������� �����ϴ�.");
		}else {
			System.out.println("�̸� : " + name[searchIndex]);
			System.out.println("���� : " + age[searchIndex]);
			System.out.println("�ּ� : " + addr[searchIndex]);
		}
	}
	
	public void modifyStudent() {
		/*
		1.������ �л� �̸��� �Է¹���
		2.�Է¹��� �л��� �����ϴ��� ��ȸ
		3.�������� ������ "�л������� �����ϴ�." ���
		4.�����ϸ� �̸�, ����, �ּ� ���� �Է¹޾Ƽ� �迭�� ���� ����
		*/
		System.out.println("\n----�л� ���� ����----\n");
		System.out.print("������ �л� �̸� �Է� : ");
		String modiStudent = sc.next();
		int mo = searchStudent(modiStudent);
		if(mo == -1) {
			System.out.println("�л������� �����ϴ�.");
		}else {
			System.out.print("�̸� : " );
			name[mo] = sc.next();
			System.out.print("���� : " );
			age[mo] = sc.nextInt();
			sc.nextLine();
			System.out.print("�ּ� : " );
			addr[mo] = sc.nextLine();
		}
	}
	
	//�л��̸��� �Ű������� �޾Ƽ� name�迭�� ���° �ε����� �ִ��� ã�� �޼ҵ�
	public int searchStudent(String searchName) {
		for (int i = 0; i < index; i++) {
			if(name[i].equals(searchName)) {//==�� �ּҰ����� ���ϱ⶧���� false
				return i;					//���ڿ��� ���ϴ� equals�� �����
			}
		}
		return -1;
	}
	
	

}






















